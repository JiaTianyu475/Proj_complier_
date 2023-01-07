import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class Infer extends sqlBaseListener {
    private ArrayList<String> tableNames = new ArrayList<String>();
    private HashMap<String, String> tableAliass = new HashMap<String, String>();
    private HashMap<String, ArrayList> tableColumns = new HashMap<String, ArrayList>();
    private HashMap<String, ArrayList<String>> tmpCol = new HashMap<String, ArrayList<String>>();
    private final String EMPTY = "";
    public HashMap<String, String> getTableAliass(){
        return tableAliass;
    }
    public  HashMap<String, ArrayList> getTableColumns(){
        return tableColumns;
    }
    @Override
    public void exitTableName(sqlParser.TableNameContext ctx) {
        // 获取表名
        if(ctx.getParent().getRuleIndex() != sqlParser.RULE_table){
            return;
        }
        if(!tableNames.contains(ctx.STRING().getText())) {
            tableNames.add(ctx.STRING().getText());
        }
    }
    public void enterTable(sqlParser.TableContext ctx){
        if(!tableColumns.containsKey(ctx.getChild(0).getText())){
            ArrayList<String> columns = new ArrayList<String>();
            tableColumns.put(ctx.getChild(0).getText(), columns);
        }
    }
    public void exitTable(sqlParser.TableContext ctx){
        if(ctx.getChildCount() == 2){
            tableAliass.put(ctx.getChild(1).getText(), ctx.getChild(0).getText());
        }
    }
    public void exitTableColumn_(sqlParser.TableColumn_Context ctx) {
        if(ctx.getChildCount() == 3){
            String tableName_ = EMPTY;
            if(tableAliass.containsKey(ctx.getChild(0).getText())){
                tableName_ = tableAliass.get(ctx.getChild(0).getText());
            }
            else{
                tableName_ = ctx.getChild(0).getText();
            }
            ArrayList<String> tmpColumns = tableColumns.get(tableName_);
            if(!tmpColumns.contains(ctx.getChild(2).getText())){
                tmpColumns.add(ctx.getChild(2).getText());
                tableColumns.replace(tableName_, tmpColumns);
            }
        }
        else{
            for(int i = 0; i < tableNames.size(); i++){
                ArrayList<String> tmpColumns = tableColumns.get(tableNames.get(i));
                String tmpColumn;
//                System.out.print(tableNames.size());
                if(tableNames.size() != 1) {
                    tmpColumn = (ctx.getChild(0).getText()).concat("?");
                }
                else {
                    tmpColumn = ctx.getChild(0).getText();
                }
                if(!tmpColumns.contains(tmpColumn)){
                    tmpColumns.add(tmpColumn);
                    tableColumns.replace(tableNames.get(i), tmpColumns);
                }
            }
        }
    }

    public void exitColumn(sqlParser.ColumnContext ctx){
        if(ctx.getChildCount() == 3){
            String tableName_ = ctx.getChild(0).getText();
            if(!tmpCol.containsKey(tableName_)){
                ArrayList<String> columns = new ArrayList<String>();
                tmpCol.put(tableName_, columns);
            }
            ArrayList<String> tmpColumns = tmpCol.get(tableName_);
            if(!tmpColumns.contains(ctx.getChild(2).getText())){
                tmpColumns.add(ctx.getChild(2).getText());
                tmpCol.replace(tableName_, tmpColumns);
            }
        }
        else {
            if(!tmpCol.containsKey("%tmp")){
                ArrayList<String> columns = new ArrayList<String>();
                tmpCol.put("%tmp", columns);
            }
            ArrayList<String> tmpColumns = tmpCol.get("%tmp");
            String tmpColumn = ctx.getChild(0).getText();
            if (!tmpColumns.contains(tmpColumn)) {
                tmpColumns.add(tmpColumn);
                tmpCol.replace("%tmp", tmpColumns);
            }
        }
    }
    public void exitTables(sqlParser.TablesContext ctx){
        tmpCol.forEach((key, value) -> {
//            System.out.print(key + "=" + value + " \n");
            if(key == "%tmp"){
                for(int j = 0; j < value.size(); j++) {
                    for (int i = 0; i < tableNames.size(); i++) {
                        ArrayList<String> tmpColumns = tableColumns.get(tableNames.get(i));
                        String tmpColumn;
                        if(tableNames.size() != 1) {
                            tmpColumn = (value.get(j)).concat("?");
                        }
                        else {
                            tmpColumn = value.get(j);
                        }

                        if (!tmpColumns.contains(tmpColumn)) {
                            tmpColumns.add(tmpColumn);
                            tableColumns.replace(tableNames.get(i), tmpColumns);
                        }
                    }
                }
            }
            else {
                String tableName_ = EMPTY;
                if(tableAliass.containsKey(key)){
                    tableName_ = tableAliass.get(key);
                }
                else{
                    tableName_ = key;
                }
                ArrayList<String> tmpColumns = tableColumns.get(tableName_);
                for(int j = 0; j < value.size(); j++) {
                    if (!tmpColumns.contains(value.get(j))) {
                        tmpColumns.add(value.get(j));
                        tableColumns.replace(tableName_, tmpColumns);
                    }
                }
            }
        });
    }
}

class InferTable {

    public static void main(String[] args) throws IOException {
        File sqlFile = new File("D:\\sql.txt");
        InputStream fi = new FileInputStream(sqlFile);
        ANTLRInputStream inputStream = new ANTLRInputStream(fi);
        sqlLexer lexer = new sqlLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        sqlParser parser = new sqlParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        Infer infer = new Infer();
        walker.walk(infer, parser.selectStatement());
        HashMap<String, ArrayList> tableColumns = infer.getTableColumns();
        System.out.println(tableColumns);
    }
}