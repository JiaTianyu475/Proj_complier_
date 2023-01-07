import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
class Assemble {
    public BufferedWriter AssembleFile = null;
    ArrayList<HashMap<String, String>> IrFile = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> unaryOp = new HashMap<String, String>();
    HashMap<String, String> binaryOp = new HashMap<String, String>();
    HashMap<String, String> compareOp = new HashMap<String, String>();
    HashMap<String, String> reverseCompareOp = new HashMap<String, String>();

    HashMap<String, String> otherOp = new HashMap<String, String>();
    ArrayList<String> localVarList = new ArrayList<String>();
    HashMap<String, String> localVarOffset = new HashMap<String, String>();
    ArrayList<String> globalVarList = new ArrayList<String>();
    String[] register = {"AX", "BX", "CX", "DX", "SI", "DI", "BP", "SP"};
    int[] regState ={0,0,0,0,0,0,0,0};
    HashMap<String, String> regValue = new HashMap<String, String>();
    public void initFile(ArrayList<HashMap<String, String>> IrFile, String filepath){
        createIrFile(IrFile);
        try {
            File file = new File(filepath);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
//             System.out.printf("file.getname: %s\n", file.getPath());
            FileWriter fileWriter = new FileWriter(file.getPath(), true);
            AssembleFile = new BufferedWriter(fileWriter);
            writeFile("#include \"textflag.h\"\n\n");
            createOp();
            readIrFile();
            AssembleFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public BufferedWriter getFrame(){
        return AssembleFile;
    }
    public void writeFile(String str){
        if(str == null) return;
        try {
            AssembleFile.write(str);
//            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createIrFile(ArrayList<HashMap<String, String>> irFile){
        IrFile = (ArrayList<HashMap<String, String>>)irFile.clone();
    }
    public ArrayList<HashMap<String, String>> getIrFile(){
        return IrFile;
    }

    public void createOp(){
        //
        unaryOp.put("&", "LEAQ");
        unaryOp.put("-", "NEGQ");
        unaryOp.put("~", "NOTQ");
        unaryOp.put("++", "INCQ");
        unaryOp.put("--", "DECQ");

        binaryOp.put("+", "ADDQ");
        binaryOp.put("-", "SUBQ");
        binaryOp.put("*", "IMULQ");
        binaryOp.put("/", "DIVQ");

        binaryOp.put("^", "XORQ");
        binaryOp.put("|", "ORQ");
        binaryOp.put("&", "ANDQ");
        binaryOp.put("<<", "SALQ");
        binaryOp.put("<<", "SHLQ");
        binaryOp.put(">>", "SARQ");
        binaryOp.put(">>", "SHRQ");


        compareOp.put(">", "JG");
        compareOp.put(">=", "JGE");
        compareOp.put("<", "JL");
        compareOp.put("<=", "JLE");
        compareOp.put("==", "JE");
        compareOp.put("!=", "JNE");

        compareOp.put("goto", "JMP");
        compareOp.put("if !arg1", "JNE");
        compareOp.put("if arg1", "JE");


        reverseCompareOp.put(">", "JLE");
        reverseCompareOp.put(">=", "JL");
        reverseCompareOp.put("<", "JGE");
        reverseCompareOp.put("<=", "JG");
        reverseCompareOp.put("==", "JNE");
        reverseCompareOp.put("!=", "JE");

        otherOp.put("callee", "CALL");

        otherOp.put("return", "RET");

    }

    public int getRegister(){
        for(int i = 0; i < regState.length; i++){
            if(regState[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public void freeRegister(String reg){
        for(int i = 0; i < regState.length; i++){
            if(register[i].compareTo(reg) == 0){
                regState[i] = 0;
            }
        }
    }
    public void readIrFile(){
        getVarList();
        int m = 0;//fp
        int n = 0;//sp
        for(int i = 0; i < IrFile.size(); i++){
            // TEXT .mul(SB), NOSPLIT, $24-8
            if(IrFile.get(i).containsKey("funcName")){
                String funcName = IrFile.get(i).get("funcName");
                int framSize = getFramSize(i);
                int argSize = getArgSize(i);
                writeFile(String.format("TEXT ·%s(SB), NOSPLIT, $%d-%d\n", funcName, framSize, argSize));

                // MOVQ a+0(FP), AX
                // MOVQ b+8(FP), BX
                int j = 0;
                m = 0;
                while(IrFile.get(i).containsKey("argsType"+j)){
                    for(int k =0; k < Integer.valueOf(IrFile.get(i).get("argsNumber"+j)); k++){
                        String argName = IrFile.get(i).get("argsName"+j+"-"+k);
                        //有问题
                        int size = 8*m;
                        writeFile(String.format("   MOVQ %s+%d(FP), %s\n", argName, size, register[m]));
                        regValue.put(argName,register[m]);
                        regState[m]=1;
                        m++;
                    }
                    j++;
                }
            }
            //GLOBL .name(SB), $size
            //DATA .name(SB)/size, $value
            if(IrFile.get(i).containsKey("globalVarType")){
                int globalVarSize = getSize(IrFile.get(i).get("globalVarType"));
                int  j = 0;
                while(IrFile.get(i).containsKey("globalVarName"+j)){
                    String globalVarName = IrFile.get(i).get("globalVarName"+j);
                    writeFile(String.format("GLOBL ·%s(SB), NOPTR, $%d\n", globalVarName, globalVarSize));
                    if(IrFile.get(i).containsKey("globalVarValue")){
                        String globalVarValue = IrFile.get(i).get("globalVarValue"+j);
                        if(IrFile.get(i).get("globalVarType").compareTo("string") == 0){
                            writeFile(String.format("DATA ·%s(SB)/%d, $%s\n", globalVarName, globalVarSize, globalVarValue));
                        }
                        else{
                            String globalVarValue_ = Integer.toHexString(Integer.valueOf(globalVarValue));
                            writeFile(String.format("DATA ·%s(SB)/%d, $0x%s\n", globalVarName, globalVarSize, globalVarValue_));
                        }
                    }
                    j++;
                }
            }
            //MOVQ    $0, .w+24(SP) -- local
            //MOVQ    $3, .w(SB) -- global
            if(IrFile.get(i).containsKey("localVarType")){
                int j = 0;
                while (IrFile.get(i).containsKey("localVarName"+j)){
                    String localVarName = IrFile.get(i).get("localVarName"+j);
                    int size = n*8;
                    writeFile(String.format("   MOVQ $0, %s-%d(SP)\n", localVarName, size));
                    localVarOffset.put(localVarName, String.valueOf(size));
                    n++;
                    j++;
                }
            }

            if(IrFile.get(i).containsKey("tag")){
                String tag = IrFile.get(i).get("tag");
                if(tag.compareTo("label") == 0) {
                    String result = IrFile.get(i).get("result");
                    writeFile(String.format("%s\n", result));
                }
            }

            if(IrFile.get(i).containsKey("op")){
                String op = IrFile.get(i).get("op");
                //ADDQ BX, AX
                //ADDQ $1, AX
                if(IrFile.get(i).containsKey("arg2")){
                    if(op.compareTo("switch arg1!=arg2") != 0 && op.compareTo("<") != 0 && op.compareTo("<=") != 0 && op.compareTo(">") != 0 && op.compareTo(">=") != 0 && op.compareTo("==") != 0 && op.compareTo("!=") != 0){
                        String inst = binaryOp.get(op);
                        String arg1 = IrFile.get(i).get("arg1");
                        String arg2 = IrFile.get(i).get("arg2");
                        String result = IrFile.get(i).get("result");
                        String src, dst;

                        if (!isNumeric(arg1) && isNumeric(arg2)) {
                            dst = getRepresentation(arg1);
                            src = getRepresentation(arg2);
                            writeFile(String.format("   %s %s, %s\n", inst, src, dst));
                            if(isLocalVar(arg1) == 2){
                                regValue.remove(arg1, dst);
                                regValue.put(result, dst);
                            }
                        } else if (isNumeric(arg1) && !isNumeric(arg2)) {
                            dst = getRepresentation(arg2);
                            src = getRepresentation(arg1);
                            writeFile(String.format("   %s %s, %s\n", inst, src, dst));
                            if(isLocalVar(arg2) == 2){
                                regValue.remove(arg2, dst);
                                regValue.put(result, dst);
                            }
                        } else if (!isNumeric(arg1) && !isNumeric(arg2)) {
                            dst = getRepresentation(arg1);
                            src = getRepresentation(arg2);
                            if(isLocalVar(arg1) == 1 && isLocalVar(arg2) == 1){
                                String dstReg = register[getRegister()];
                                writeFile(String.format("   MOVQ %s, %s\n", src, dstReg));
                                regValue.put(src, dstReg);
                                regState[getRegister()] = 1;
                                src = dstReg;
                            }

                            writeFile(String.format("   %s %s, %s\n", inst, src, dst));
                            if(isLocalVar(arg1) == 2) {
                                regValue.remove(arg1, dst);
                                regValue.put(result, dst);
                            }
                        } else {
                            int arg1_ = Integer.valueOf(arg1);
                            int arg2_ = Integer.valueOf(arg2);
                            int src_ = arg1_ + arg2_;
                            src = "$" + String.valueOf(src_);
                            dst = register[getRegister()];
                            writeFile(String.format("   MOVQ %s, %s\n", src, dst));
                            regValue.put(result, dst);
                            regState[getRegister()] = 1;
                        }
                    }
                    //CMPQ AX, BX
                    //CMPQ $20, AX
                    else if(op.compareTo("<") == 0 || op.compareTo("<=") == 0 || op.compareTo(">") == 0 || op.compareTo(">=") == 0 || op.compareTo("==") == 0 || op.compareTo("!=") == 0){
                        String arg1 = IrFile.get(i).get("arg1");
                        String arg2 = IrFile.get(i).get("arg2");
                        String src, dst;
                        src = getRepresentation(arg1);
                        dst = getRepresentation(arg2);
                        writeFile(String.format("   CMPQ %s, %s\n", src, dst));
                    }
                }
                else if(op.compareTo("-") == 0 || op.compareTo("~") == 0 || op.compareTo("--") == 0 || op.compareTo("++") == 0){
                    String inst = unaryOp.get(op);
                    String arg1 = IrFile.get(i).get("arg1");
                    String result = IrFile.get(i).get("result");
                    String src, dst;
                    if (!isNumeric(arg1)) {
                        dst = getRepresentation(arg1);
                        writeFile(String.format("   %s %s\n", inst, dst));
                        if(isLocalVar(arg1) == 2) {
                            regValue.remove(arg1, dst);
                            regValue.put(result, dst);
                        }
                    }
                    else{
                        int arg1_ = Integer.valueOf(arg1);
                        int src_ = 0;
                        switch (op){
                            case "-": src_ = -arg1_;break;
                            case "~": src_ = ~arg1_;break;
                            case "++": src_ = arg1_++;break;
                            case "--": src_ = arg1_--;break;
                        }

                        src = "$" + String.valueOf(src_);
                        dst = register[getRegister()];
                        writeFile(String.format("MOVQ %s, %s\n", src, dst));
                        regValue.put(result, dst);
                        regState[getRegister()] = 1;
                    }
                }
                // MOVQ AX, ret+16(FP)
                //	RET
                else if(op.compareTo("return") == 0){
                    String arg1 = IrFile.get(i).get("arg1");
                    String src;
                    src = getRepresentation(arg1);

                    if(isLocalVar(arg1) == 1){
                        String dstReg = register[getRegister()];
                        writeFile(String.format("   MOVQ %s, %s\n", src, dstReg));
                        regValue.put(src, dstReg);
                        regState[getRegister()] = 1;
                        src = dstReg;
                    }

                    if (!isNumeric(arg1)) {
                        writeFile(String.format("   MOVQ %s, ret+%d(FP)\n", src, m*8));
                        writeFile("   RET\n");
                        if(isLocalVar(arg1) == 2) {
                            regValue.remove(arg1, src);
                            freeRegister(src);
                        }
                    }
                    else {
                        writeFile(String.format("   MOVQ %s, ret+%d(FP)\n", src, m*8));
                        writeFile("   RET\n");
                    }
                }
                //CALL    main.add(SB)
                else if(IrFile.get(i).containsKey("tag")){
                    String tag = IrFile.get(i).get("tag");
                    if(tag.compareTo("callee") == 0) {
                        String calleeName = IrFile.get(i).get("op");
                        writeFile(String.format("   CALL .%s(SB)\n", calleeName));
                        String result = IrFile.get(i).get("result");
                        String dst = register[getRegister()];
                        regValue.put(result, dst);
                        regState[getRegister()] = 1;
                    }

                }
                //赋值语句
                //MOVQ    $0, .w+24(SP) -- local
                //MOVQ    $3, .w(SB) -- global
                else if(op.compareTo("=") == 0){
                    String arg1 = IrFile.get(i).get("arg1");
                    String result = IrFile.get(i).get("result");

                    if(IrFile.get(i-1).containsKey("op")){
                        String preArg1 = IrFile.get(i-1).get("arg1");
                        String preResult = IrFile.get(i-1).get("result");
                        if(preArg1.compareTo(result) == 0 && preResult.compareTo(arg1) == 0){
                            continue;
                        }
                    }

                    String src, dst;
                    src = getRepresentation(arg1);
                    dst = getRepresentation(result);
                    writeFile(String.format("   MOVQ %s, %s\n", src, dst));
                }

                else if(op.compareTo("if") == 0){
                    String arg1 = IrFile.get(i).get("arg1");
//                    if(isNumeric(arg1)){
//                        String label =
//                        writeFile(String.format("JMP %s\n", label));
//                    }
                    if(!isNumeric(arg1)){
                        String cmp = IrFile.get(i-1).get("op");
                        String inst = compareOp.get(cmp);
                        String[] result = IrFile.get(i).get("result").split(" ");
                        String label = result[1];
                        writeFile(String.format("   %s %s\n", inst, label));
                    }
                }
                else if(op.compareTo("goto") == 0){
                    String[] result = IrFile.get(i).get("result").split(" ");
                    String label = result[1];
                    writeFile(String.format("   JMP %s\n", label));
                }
                else if(op.compareTo("if !arg1") == 0){
                    String cmp = IrFile.get(i-1).get("op");
                    String inst = reverseCompareOp.get(cmp);
                    String[] result = IrFile.get(i).get("result").split(" ");
                    String label = result[1];
                    writeFile(String.format("   %s %s\n", inst, label));
                }
            }
        }
    }
    //参数类型大小
    public int getSize(String type){
        switch (type){
            case "complex128":
            case "String":return 16;
            case "byte":
            case "bool":
            case "int8":
            case "uint8":return 1;
            case "uint16":
            case "int16":return 2;
            case "rune":
            case "int32":
            case "uint32":
            case "float32":return 4;
            case "int":
            case "uint":
            case "int64":
            case "uint64":
            case "float64":
            case "complex64": return 8;
        }
        return -1;
    }
    //局部变量、callee参数、返回值
    public int getFramSize(int i){
        int calleeSize = 0;
        int localVarSize = 0;

        if(i+1 < IrFile.size()) {
            while (!IrFile.get(i + 1).containsKey("funcName")) {
                //callee参数、返回值
                if (IrFile.get(i + 1).containsKey("tag")) {
                    String tag = IrFile.get(i + 1).get("tag");
                    if(tag.compareTo("callee") == 0) {
                        String calleeName = IrFile.get(i + 1).get("funcName");
                        for (int j = 0; j < IrFile.size(); j++) {
                            if (IrFile.get(j).containsValue(calleeName)) {
                                calleeSize = getArgSize(j);
                            }
                        }
                    }
                }
                //局部变量
                if (IrFile.get(i + 1).containsKey("localVarType")) {
                    int size = getSize(IrFile.get(i + 1).get("localVarType"));
                    localVarSize += size * Integer.valueOf(IrFile.get(i + 1).get("localVarNumber"));
                }
                i++;
                if(i+1 >= IrFile.size()){
                    break;
                }
            }
        }
        if(localVarSize%8 != 0){
            localVarSize = (localVarSize/8 + 1) * 8;
        }

        return calleeSize+localVarSize;
    }
    //caller参数、返回值
    public int getArgSize(int i){
        int callerSize = 0;
        int count = IrFile.get(i).size() - 1;
        int k = 0;
        while(IrFile.get(i).containsKey("argsType"+k)){
            int size = getSize(IrFile.get(i).get("argsType"+k));
            callerSize += size * Integer.valueOf(IrFile.get(i).get("argsNumber"+k));
            k++;
        }
        int j = 0;
        while(IrFile.get(i).containsKey("returnType"+j)){
            int size2 = getSize(IrFile.get(i).get("returnType"+j));
            callerSize += size2;
            j++;
        }
        if(callerSize%8 != 0){
            callerSize = (callerSize/8 + 1) * 8;
        }
        return callerSize;
    }
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    //localVarList and globalVarList
    public void getVarList(){
        for(int i = 0; i < IrFile.size(); i++){
            if(IrFile.get(i).containsKey("localVarType")){
                int  j = 0;
                while(IrFile.get(i).containsKey("localVarName"+j)){
                    localVarList.add(IrFile.get(i).get("localVarName"+j));
                    j++;
                }

            }
            if(IrFile.get(i).containsKey("globalVarType")){
                int  k = 0;
                while(IrFile.get(i).containsKey("globalVarName"+k)){
                    globalVarList.add(IrFile.get(i).get("globalVarName"+k));
                    k++;
                }
            }
        }
    }

    public int isLocalVar(String varName){
        if(localVarList.contains(varName)){
            return 1;
        }
        if(globalVarList.contains(varName)){
            return 0;
        }
        if(regValue.containsKey(varName)){
            return 2;
        }
        return -1;
    }

    public String getRepresentation(String arg){
        //立即数
        if(isNumeric(arg)){
            return "$"+arg;
        }
        //寄存器
        else if(isLocalVar(arg) == 2){
            return regValue.get(arg);
        }
        //global
        else if(isLocalVar(arg) == 0){
            return arg+"(SB)";
        }
        //local
        else if(isLocalVar(arg) == 1){
            String offset = localVarOffset.get(arg);
            return arg+"-"+offset+"(SP)";
        }
        return " ";
    }
}

class GoAssemble {

    public static void main(String[] args) throws IOException {
        File goFile = new File("D:\\编译原理实践\\Proj_complier\\go.txt");
        InputStream fi = new FileInputStream(goFile);
        ANTLRInputStream inputStream = new ANTLRInputStream(fi);
        goLexer lexer = new goLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        goParser parser = new goParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        Ir ir = new Ir();
        walker.walk(ir, parser.golang());
        ArrayList<HashMap<String, String>> IrFile = ir.getIrFile();
        System.out.println(IrFile);
        Assemble ass = new Assemble();
        ass.initFile(IrFile, "D:\\编译原理实践\\Proj_complier\\go2.txt");
        BufferedWriter assResult= ass.getFrame();


//        ArrayList<String> list = new ArrayList<String>();
//
//        try {
//            File file = new File("D:\\编译原理实践\\Proj_complier\\go2.txt");
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()));
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                list.add(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list);
    }
}