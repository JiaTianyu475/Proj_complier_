// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParser}.
 */
public interface sqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(sqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(sqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(sqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(sqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Column}
	 * labeled alternative in {@link sqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterColumn(sqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Column}
	 * labeled alternative in {@link sqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitColumn(sqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Aggfunc}
	 * labeled alternative in {@link sqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterAggfunc(sqlParser.AggfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Aggfunc}
	 * labeled alternative in {@link sqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitAggfunc(sqlParser.AggfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tableColumn}.
	 * @param ctx the parse tree
	 */
	void enterTableColumn(sqlParser.TableColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tableColumn}.
	 * @param ctx the parse tree
	 */
	void exitTableColumn(sqlParser.TableColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#aggFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggFunction(sqlParser.AggFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#aggFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggFunction(sqlParser.AggFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#aggFunctionArg}.
	 * @param ctx the parse tree
	 */
	void enterAggFunctionArg(sqlParser.AggFunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#aggFunctionArg}.
	 * @param ctx the parse tree
	 */
	void exitAggFunctionArg(sqlParser.AggFunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tableColumnAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnAlias(sqlParser.TableColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tableColumnAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnAlias(sqlParser.TableColumnAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#aggFunctionResAlias}.
	 * @param ctx the parse tree
	 */
	void enterAggFunctionResAlias(sqlParser.AggFunctionResAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#aggFunctionResAlias}.
	 * @param ctx the parse tree
	 */
	void exitAggFunctionResAlias(sqlParser.AggFunctionResAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(sqlParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(sqlParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(sqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(sqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(sqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(sqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tabelAlias}.
	 * @param ctx the parse tree
	 */
	void enterTabelAlias(sqlParser.TabelAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tabelAlias}.
	 * @param ctx the parse tree
	 */
	void exitTabelAlias(sqlParser.TabelAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#joinOperator}.
	 * @param ctx the parse tree
	 */
	void enterJoinOperator(sqlParser.JoinOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#joinOperator}.
	 * @param ctx the parse tree
	 */
	void exitJoinOperator(sqlParser.JoinOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(sqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(sqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(sqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(sqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterGroupByCaluse(sqlParser.GroupByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitGroupByCaluse(sqlParser.GroupByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(sqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(sqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void enterHavingCaluse(sqlParser.HavingCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void exitHavingCaluse(sqlParser.HavingCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(sqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(sqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(sqlParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(sqlParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tableColumn_}.
	 * @param ctx the parse tree
	 */
	void enterTableColumn_(sqlParser.TableColumn_Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tableColumn_}.
	 * @param ctx the parse tree
	 */
	void exitTableColumn_(sqlParser.TableColumn_Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(sqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(sqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperator(sqlParser.CompareOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperator(sqlParser.CompareOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInt(sqlParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInt(sqlParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(sqlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(sqlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFloat(sqlParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFloat(sqlParser.FloatContext ctx);
}