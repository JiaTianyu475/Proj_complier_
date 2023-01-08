import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;

class Ir extends goBaseListener {
    private ArrayList<HashMap<String, String>> IrFile = new ArrayList<HashMap<String, String>>();
    ParseTreeProperty<String> IrFileTree = new ParseTreeProperty<String>();
    ParseTreeProperty<String> TreeWithChildIndex = new ParseTreeProperty<String>();
    Integer i = 0;
    Integer j = 0;
    Integer k = 0;
    Integer h = 0;
    private ArrayList<Integer> IfConditionIndex = new ArrayList<Integer>();
    private ArrayList<Integer> SwitchConditionIndex = new ArrayList<Integer>();
    String getIrFileTree(ParseTree ctx) { return IrFileTree.get(ctx); }
    void setIrFileTree(ParseTree ctx, String s) { IrFileTree.put(ctx, s); }
    String getTreeWithChildIndex(ParseTree ctx) { return TreeWithChildIndex.get(ctx); }
    void setTreeWithChildIndex(ParseTree ctx, String s) { TreeWithChildIndex.put(ctx, s); }
    public ArrayList<HashMap<String, String>> getIrFile(){
        return IrFile;
    }

    public void exitAtom(goParser.AtomContext ctx) {
        setIrFileTree(ctx, ctx.getText());
    }
    public void exitName(goParser.NameContext ctx) {
        setIrFileTree(ctx, ctx.getText());
    }
    public void exitString(goParser.StringContext ctx) {
        setIrFileTree(ctx, ctx.getText().strip());
    }
    public void enterIfConditionalStatement(goParser.IfConditionalStatementContext ctx) {
        setTreeWithChildIndex(ctx, String.valueOf(j));
        IfConditionIndex.add(0);
        j++;
        for(int i = 0; i < ctx.getChildCount(); i++){
            setTreeWithChildIndex(ctx.getChild(i), String.valueOf(i));
        }
    }
    public void enterSwitchConditionalStatement(goParser.SwitchConditionalStatementContext ctx) {
        setTreeWithChildIndex(ctx, String.valueOf(k));
        SwitchConditionIndex.add(0);
        k++;
        for(int i = 0; i < ctx.getChildCount(); i++){
            setTreeWithChildIndex(ctx.getChild(i), String.valueOf(i));
        }
    }
    public void enterLoopStatement(goParser.LoopStatementContext ctx){
        setTreeWithChildIndex(ctx, String.valueOf(h));
        h++;
    }
    // 计算
    public void exitBinaryOperator(goParser.BinaryOperatorContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", ctx.getChild(1).getText());
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(0)));
        ta.put("arg2", getIrFileTree(ctx.getChild(2)));
        IrFile.add(ta);
        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }

    public void exitArrayValue(goParser.ArrayValueContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", "[]");
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(2)));
        IrFile.add(ta);
        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }
    public void exitStructValue(goParser.StructValueContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", ".");
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(0)));
        ta.put("arg2", getIrFileTree(ctx.getChild(2)));
        IrFile.add(ta);
        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }

    public void exitUnaryOperator(goParser.UnaryOperatorContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", ctx.getChild(0).getText());
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(1)));
        IrFile.add(ta);

        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }
    public void exitUnaryOperatorRight(goParser.UnaryOperatorRightContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", ctx.getChild(1).getText());
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(0)));
        IrFile.add(ta);
        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }

    // 调用函数
    public void exitCallFunctionparameters(goParser.CallFunctionparametersContext ctx) {
        String s = "";
        for(int i = 0; i < ctx.getChildCount(); i++){
            s = s + ctx.getChild(i).getText();
        }
        setIrFileTree(ctx, s);
    }

    public void exitCallFunc(goParser.CallFuncContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("tag", "callee");
        ta.put("op", ctx.getChild(0).getText());
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(2)));
        IrFile.add(ta);
        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }
    public void exitCallFunctionStatement(goParser.CallFunctionStatementContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("tag", "callee");
        ta.put("op", ctx.getChild(0).getText());
        ta.put("result", "(" + i + ")");
        ta.put("arg1", getIrFileTree(ctx.getChild(2)));
        IrFile.add(ta);
        setIrFileTree(ctx, "(" + i + ")");
        i++;
    }
    //赋值语句
    @Override
    public void exitAssignmentStatement(goParser.AssignmentStatementContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", ctx.getChild(1).getText());
        ta.put("result", getIrFileTree(ctx.getChild(0)));
        ta.put("arg1", getIrFileTree(ctx.getChild(2)));
        IrFile.add(ta);
    }
    //return语句
    @Override
    public void exitReturnStatement(goParser.ReturnStatementContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("op", ctx.getChild(0).getText());
        ta.put("arg1", getIrFileTree(ctx.getChild(1)));
        IrFile.add(ta);
    }
    //条件语句
    //1.if语句
    public void exitIfCondition(goParser.IfConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        int t2 = IfConditionIndex.get(t1);
        ta.put("op", "if");
        ta.put("arg1", getIrFileTree(ctx.getChild(0)));
        ta.put("result", "goto "+"I"+t2+"_"+t1);
        IrFile.add(ta);

        int t3 = Integer.valueOf(getTreeWithChildIndex(ctx));
        if(ctx.getParent().getChildCount() - 4 >= t3){
            HashMap<String, String> ta2 = new HashMap<String, String>();
            ta2.put("result", "goto "+"I"+(t2+1)+"_"+t1);
            ta2.put("op", "goto");
            IrFile.add(ta2);
        }

        if(ctx.getParent().getChild(t3-1).getText().compareTo("if") == 0 || ctx.getParent().getChild(t3-1).getText().compareTo("else if") == 0){
            HashMap<String, String> ta3 = new HashMap<String, String>();
            ta3.put("result", "I"+t2+"_"+t1+":");
            ta3.put("tag","label");
            IrFile.add(ta3);
        }

    }
    public void exitIfConditionBody(goParser.IfConditionBodyContext ctx){
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        int t3 = Integer.valueOf(getTreeWithChildIndex(ctx));
        if(ctx.getParent().getChild(t3-2).getText().compareTo("else") != 0){
            HashMap<String, String> ta2 = new HashMap<String, String>();
            ta2.put("result", "goto "+"Iend"+"_"+t1);
            ta2.put("op", "goto");
            IrFile.add(ta2);
            HashMap<String, String> ta = new HashMap<String, String>();

            int t2 = IfConditionIndex.get(t1);
            IfConditionIndex.set(t1, t2+1);
            ta.put("result", "I"+IfConditionIndex.get(t1)+"_"+t1+":");
            ta.put("tag","label");
            IfConditionIndex.set(t1, t2+2);
            IrFile.add(ta);
        }
        else{
            HashMap<String, String> ta3 = new HashMap<String, String>();
            ta3.put("result", "Iend"+"_"+t1+":");
            ta3.put("tag","label");
            IrFile.add(ta3);
        }
    }
    //2.switch语句

    public void exitCaseCondition(goParser.CaseConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent().getParent()));
        int t2 = SwitchConditionIndex.get(t1);
        ta.put("op", "switch arg1!=arg2");
        ta.put("arg1", getIrFileTree(ctx.getParent().getParent().getChild(1).getChild(0)));
        ta.put("arg2", getIrFileTree(ctx));
        ta.put("result", "goto "+"S"+t2+"_"+t1);
        IrFile.add(ta);
    }
    public void exitCaseConditionBody(goParser.CaseConditionBodyContext ctx){
//        System.out.println(ctx.getParent().getChild(0).getText());
        int t3 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        if(ctx.getParent().getParent().getChildCount() - 2 > t3){
            HashMap<String, String> ta = new HashMap<String, String>();
            int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent().getParent()));
            int t2 = SwitchConditionIndex.get(t1);
            ta.put("result", "S"+t2+"_"+t1+":");
            IrFile.add(ta);
            SwitchConditionIndex.set(t1, t2+1);
        }
    }
    //循环语句
    //1. for condition{}

    public void enterSingleCondition(goParser.SingleConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        ta.put("result", "L"+"_"+t1+":");
        ta.put("tag","label");
        IrFile.add(ta);
    }

    public void exitSingleCondition(goParser.SingleConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        ta.put("op", "if !arg1");
        ta.put("arg1", getIrFileTree(ctx.getChild(0)));
        ta.put("result", "goto " + "Lend" + "_" + t1);
        IrFile.add(ta);
    }
    //for {}
    public void enterEmptyCondition(goParser.EmptyConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        ta.put("result", "L"+"_"+t1+":");
        ta.put("tag","label");
        IrFile.add(ta);
    }
    // for init; condition; post
    public void enterForCondition(goParser.ForConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent().getParent()));
        ta.put("result", "L0"+"_"+t1+":");
        ta.put("tag","label");
        IrFile.add(ta);
    }
    public void exitForCondition(goParser.ForConditionContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent().getParent()));
        ta.put("op", "if !arg1");
        ta.put("arg1", getIrFileTree(ctx.getChild(0)));
        ta.put("result", "goto " + "Lend" + "_" + t1 );
        IrFile.add(ta);

        HashMap<String, String> ta2 = new HashMap<String, String>();
        ta2.put("result", "goto " + "L2"+ "_" + t1 );
        ta2.put("op", "goto");
        IrFile.add(ta2);
    }
    public void enterPost(goParser.PostContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent().getParent()));
        ta.put("result", "L1"+"_"+t1+":");
        ta.put("tag","label");
        IrFile.add(ta);
    }
    public void exitPost(goParser.PostContext ctx){
        HashMap<String, String> ta = new HashMap<String, String>();
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent().getParent()));
        ta.put("result", "goto " + "L0"+"_"+t1);
        ta.put("op", "goto");
        IrFile.add(ta);
    }
    public void enterLoopBody(goParser.LoopBodyContext ctx) {
        if(ctx.getParent().getChild(1).getChildCount() == 5){
            HashMap<String, String> ta = new HashMap<String, String>();
            int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
            ta.put("result", "L2"+"_"+t1+":");
            ta.put("tag","label");
            IrFile.add(ta);
        }
    }
    public void exitLoopBody(goParser.LoopBodyContext ctx) {
        int t1 = Integer.valueOf(getTreeWithChildIndex(ctx.getParent()));
        if(ctx.getParent().getChild(1).getChildCount() != 5) {
            HashMap<String, String> ta = new HashMap<String, String>();
            ta.put("result", "goto " + "L" + "_" + t1);
            ta.put("op", "goto");
            IrFile.add(ta);
        }
        if(ctx.getParent().getChild(1).getChildCount() == 5) {
            HashMap<String, String> ta1 = new HashMap<String, String>();
            ta1.put("result", "goto " + "L1" + "_" + t1);
            ta1.put("op", "goto");
            IrFile.add(ta1);
        }
        //emptyCondition
        if(ctx.getParent().getChild(1).getText().compareTo("") != 0){
            HashMap<String, String> ta2 = new HashMap<String, String>();
            ta2.put("result", "Lend" + "_" + t1 + ":");
            ta2.put("tag","label");
            IrFile.add(ta2);
        }

    }
    public void enterFunc(goParser.FuncContext ctx) {

        HashMap<String, String> ta = new HashMap<String, String>();
        ta.put("funcName", ctx.getChild(2).getText());
        int j = 0;
        for(int i = 0; i < ctx.getChild(4).getChildCount(); i++){
            if(ctx.getChild(4).getChild(i).getText().compareTo(",") != 0){
                int count = ctx.getChild(4).getChild(i).getChildCount();
                ta.put("argsType"+j, ctx.getChild(4).getChild(i).getChild(count-1).getText());
                ta.put("argsNumber"+j, String.valueOf(count/2));

                int n = 0;
                for(int m = 0; m < count-1; m++){
                    if(ctx.getChild(4).getChild(i).getChild(m).getText().compareTo(",") != 0){
                        ta.put("argsName"+j+"-"+n, ctx.getChild(4).getChild(i).getChild(m).getText());
                        n++;
                    }
                }
                j++;
            }
        }
        int k = 0;
        for(int i = 0; i < ctx.getChild(6).getChildCount(); i++){
            if(ctx.getChild(6).getChild(i).getText().compareTo(",") != 0){
                ta.put("returnType"+k, ctx.getChild(6).getChild(i).getText());
                k++;
            }
        }
        IrFile.add(ta);
    }
    //全局变量声明
    public void exitGlobalBasicVarDeclaration(goParser.GlobalBasicVarDeclarationContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        int count = ctx.getChild(1).getChildCount();
        ta.put("globalVarType", ctx.getChild(1).getChild(count-1).getText());
        ta.put("globalVarNumber", String.valueOf(count/2));
        int j = 0;
        for(int i = 0; i < count -1; i++){
            if(ctx.getChild(1).getChild(i).getText().compareTo(",") != 0){
                ta.put("globalVarName"+j, ctx.getChild(1).getChild(i).getText());
                j++;
            }
        }
        int count2 = ctx.getParent().getChildCount();
        int k = 0;
        if(count2 > 1){
            for(int i = 2; i < count2; i++){
                if(ctx.getParent().getChild(i).getText().compareTo(",") != 0){
                    ta.put("globalVarValue"+k, ctx.getParent().getChild(i).getText());
                    k++;
                }
            }
        }
        IrFile.add(ta);
    }
    //局部变量声明
    public void exitLocalVarsDeclaration(goParser.LocalVarsDeclarationContext ctx) {
        HashMap<String, String> ta = new HashMap<String, String>();
        int count = ctx.getChild(1).getChildCount();
        ta.put("localVarType", ctx.getChild(1).getChild(count-1).getText());
        ta.put("localVarNumber", String.valueOf(count/2));
        int j = 0;
        for(int i = 0; i < count - 1; i++){
            if(ctx.getChild(1).getChild(i).getText().compareTo(",") != 0) {
                ta.put("localVarName" + j, ctx.getChild(1).getChild(i).getText());
                j++;
            }

        }

        IrFile.add(ta);
    }
}
class GoIr {

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
    }
}
