import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
class Ui {

    public static void main(String[] args) {
        ArrayList<String> goPath = new ArrayList<String>();

        JFrame jf = new JFrame("go编译器");          // 创建窗口
        jf.setSize(500, 500);                       // 设置窗口大小
        jf.setLocationRelativeTo(null);             // 把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）

        Box vBox0 = Box.createVerticalBox();
        Box vBox1 = Box.createVerticalBox();
        // 创建一个 5 行 10 列的文本区域
        final JTextArea textArea = new JTextArea(5, 10);
        JScrollPane jsp = new JScrollPane(textArea);
        //设置矩形大小.参数依次为(矩形左上角横坐标x,矩形左上角纵坐标y，矩形长度，矩形宽度)
        jsp.setBounds(13, 10, 350, 340);
        //默认的设置是超过文本框才会显示滚动条，以下设置让滚动条一直显示
        jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // 设置自动换行
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        vBox0.add(jsp);
        JButton loadGoBtn = new JButton("上传go程序代码");
        loadGoBtn.addActionListener(e -> loadGo(jf, textArea, goPath));

//        JButton createParseTreeBtn = new JButton("生成语法分析树");
        JButton createIrBtn = new JButton("生成中间代码");
        createIrBtn.addActionListener(e -> createIr(jf, textArea, goPath.get(0)));
        JButton createAssBtn = new JButton("生成汇编语言");
        createAssBtn.addActionListener(e -> createAss(jf, textArea, goPath));
        JButton createExeBtn = new JButton("生成可执行文件");
        createExeBtn.addActionListener(e -> createExe(jf, textArea, goPath));

        vBox1.add(loadGoBtn);
//        vBox1.add(createParseTreeBtn);
        vBox1.add(createIrBtn);
        vBox1.add(createAssBtn);
        vBox1.add(createExeBtn);

        Box hBox = Box.createHorizontalBox();
        hBox.add(vBox0);
        hBox.add(vBox1);

        jf.setContentPane(hBox);

        jf.setVisible(true);
    }
    private static void loadGo(Component parent, JTextArea textArea, ArrayList<String> goPath) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("..\\test"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = fileChooser.showOpenDialog(parent);
        if (result == JFileChooser.APPROVE_OPTION) {
            // 如果点击了"确定", 则获取选择的文件路径
            File file = fileChooser.getSelectedFile();

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()));
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    textArea.append(line+"\n");
                }
                goPath.add(file.getAbsolutePath());
                goPath.add(file.getParent());
                goPath.add(file.getName());
                System.out.println(goPath);
//                goPath =  file.getAbsolutePath();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void createIr(Component parent, JTextArea textArea, String goPath) {

        File goFile = new File(goPath);
        try {
            InputStream fi = new FileInputStream(goFile);
            ANTLRInputStream inputStream = new ANTLRInputStream(fi);
            goLexer lexer = new goLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            goParser parser = new goParser(tokenStream);
            ParseTreeWalker walker = new ParseTreeWalker();
            Ir ir = new Ir();
            walker.walk(ir, parser.golang());
            ArrayList<HashMap<String, String>> IrFile = ir.getIrFile();
            String text = "";
            textArea.setText(text);
            textArea.append(" result\top\targ1\targ2\n\n");
            for(int i = 0; i < IrFile.size(); i++){
                int size = IrFile.get(i).size();
                if(!IrFile.get(i).containsKey("result") && !IrFile.get(i).containsKey("op") ){
                    continue;
                }
                if(IrFile.get(i).containsKey("result")){
                    textArea.append(" "+IrFile.get(i).get("result")+"\t");
                }
                if(size == 1){
                    textArea.append("\n");
                    continue;
                }
                if(IrFile.get(i).containsKey("op")){
                    textArea.append(" "+IrFile.get(i).get("op")+"\t");
                }
                if(size == 2){
                    textArea.append("\n");
                    continue;
                }
                if(IrFile.get(i).containsKey("arg1")){
                    textArea.append(" "+IrFile.get(i).get("arg1")+"\t");
                }
                if(size == 3){
                    textArea.append("\n");
                    continue;
                }
                if(IrFile.get(i).containsKey("arg2")){
                    textArea.append(" "+IrFile.get(i).get("arg2")+"\t");
                }
                if(size == 4){
                    textArea.append("\n");
                    continue;
                }
            }

            System.out.println(IrFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void createAss(Component parent, JTextArea textArea, ArrayList<String> goPath){
        String assPath = "";
        File goFile = new File(goPath.get(0));
        try {
            InputStream fi = new FileInputStream(goFile);
            ANTLRInputStream inputStream = new ANTLRInputStream(fi);
            goLexer lexer = new goLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            goParser parser = new goParser(tokenStream);
            ParseTreeWalker walker = new ParseTreeWalker();
            Ir ir = new Ir();
            walker.walk(ir, parser.golang());
            ArrayList<HashMap<String, String>> IrFile = ir.getIrFile();

            Assemble ass = new Assemble();
            String[] name_ = goPath.get(2).split("\\.");
            String name = name_[0];
            goPath.add(name);
            String[] path_ = goPath.get(1).split("\\\\");
            String path = "";
            for(int i = 0; i < path_.length-1; i++){
                path = path+"\\"+path_[i];
            }
            System.out.println(path+"\\"+name+"\\"+name+".s");
            assPath = path+"\\"+name+"\\"+name+".s";
            ass.initFile(IrFile, assPath);
            BufferedWriter assResult= ass.getFrame();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = "";
        textArea.setText(text);
        try {
            File file = new File(assPath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                textArea.append(" "+line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createExe(Component parent, JTextArea textArea, ArrayList<String> goPath){
        try {
            String path = goPath.get(3);
//            String cmd = "cmd /c ls && cd ..\\test\\"+path+" && ls && go build && ./"+path+".exe";
            String cmd ="cmd /c  D: && cd .. && cd test\\"+path+ "&& go build"+"&&" +path+".exe";
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec(cmd);

            String text = "";
            textArea.setText(text);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                textArea.append(" "+line+"\n");
//                System.out.println(line);
            }
//            pr.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

