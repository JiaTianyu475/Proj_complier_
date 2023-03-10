// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		FLOAT=46, INT=47, STRING=48, WS=49, WS2=50;
	public static final int
		RULE_selectStatement = 0, RULE_selectElements = 1, RULE_selectElement = 2, 
		RULE_tableColumn = 3, RULE_aggFunction = 4, RULE_aggFunctionArg = 5, RULE_tableColumnAlias = 6, 
		RULE_aggFunctionResAlias = 7, RULE_tables = 8, RULE_table = 9, RULE_tableName = 10, 
		RULE_tabelAlias = 11, RULE_joinOperator = 12, RULE_selectClause = 13, 
		RULE_whereClause = 14, RULE_groupByCaluse = 15, RULE_orderByClause = 16, 
		RULE_havingCaluse = 17, RULE_limitClause = 18, RULE_logicExpression = 19, 
		RULE_tableColumn_ = 20, RULE_logicalOperator = 21, RULE_compareOperator = 22, 
		RULE_value = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"selectStatement", "selectElements", "selectElement", "tableColumn", 
			"aggFunction", "aggFunctionArg", "tableColumnAlias", "aggFunctionResAlias", 
			"tables", "table", "tableName", "tabelAlias", "joinOperator", "selectClause", 
			"whereClause", "groupByCaluse", "orderByClause", "havingCaluse", "limitClause", 
			"logicExpression", "tableColumn_", "logicalOperator", "compareOperator", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'DISTINCT'", "'*'", "','", "'.'", "'AS'", 
			"'AVG'", "'SUM'", "'MAX'", "'MIN'", "'('", "')'", "'COUNT'", "'ON'", 
			"'='", "'INNER JOIN'", "'NATURAL JOIN'", "'CROSS JOIN'", "'LEFT'", "'OUTER'", 
			"' JOIN'", "'RIGHT'", "'WHERE'", "'GROUP BY'", "'ASC'", "'DESC'", "'ORDER BY'", 
			"'HAVING'", "'LIMIT'", "'OFFSET'", "'NOT'", "'IN'", "'BETWEEN'", "'AND'", 
			"'IS'", "'NULL'", "'OR'", "'>'", "'>='", "'<'", "'<='", "'!='", "'<>'", 
			"'\"'", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "FLOAT", 
			"INT", "STRING", "WS", "WS2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectStatement(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			selectElements();
			setState(50);
			match(T__1);
			setState(51);
			tables();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1929379840L) != 0) {
				{
				setState(52);
				selectClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementsContext extends ParserRuleContext {
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectElements(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectElements);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(55);
					match(T__2);
					}
				}

				setState(58);
				match(T__3);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__13:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(59);
				selectElement();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(60);
					match(T__4);
					setState(61);
					selectElement();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementContext extends ParserRuleContext {
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	 
		public SelectElementContext() { }
		public void copyFrom(SelectElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends SelectElementContext {
		public TableColumnContext tableColumn() {
			return getRuleContext(TableColumnContext.class,0);
		}
		public TableColumnAliasContext tableColumnAlias() {
			return getRuleContext(TableColumnAliasContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TabelAliasContext tabelAlias() {
			return getRuleContext(TabelAliasContext.class,0);
		}
		public ColumnContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitColumn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AggfuncContext extends SelectElementContext {
		public AggFunctionContext aggFunction() {
			return getRuleContext(AggFunctionContext.class,0);
		}
		public AggFunctionResAliasContext aggFunctionResAlias() {
			return getRuleContext(AggFunctionResAliasContext.class,0);
		}
		public AggfuncContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAggfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAggfunc(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectElement);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new ColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(69);
						tableName();
						}
						break;
					case 2:
						{
						setState(70);
						tabelAlias();
						}
						break;
					}
					setState(73);
					match(T__5);
					}
					break;
				}
				setState(77);
				tableColumn();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==STRING) {
					{
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(78);
						match(T__6);
						}
					}

					setState(81);
					tableColumnAlias();
					}
				}

				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__13:
				_localctx = new AggfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				aggFunction();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==STRING) {
					{
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(85);
						match(T__6);
						}
					}

					setState(88);
					aggFunctionResAlias();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableColumnContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public TableColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTableColumn(this);
		}
	}

	public final TableColumnContext tableColumn() throws RecognitionException {
		TableColumnContext _localctx = new TableColumnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggFunctionContext extends ParserRuleContext {
		public AggFunctionArgContext aggFunctionArg() {
			return getRuleContext(AggFunctionArgContext.class,0);
		}
		public AggFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAggFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAggFunction(this);
		}
	}

	public final AggFunctionContext aggFunction() throws RecognitionException {
		AggFunctionContext _localctx = new AggFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aggFunction);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				match(T__11);
				setState(97);
				aggFunctionArg();
				setState(98);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__13);
				setState(101);
				match(T__11);
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(102);
					match(T__3);
					}
					break;
				case STRING:
					{
					setState(103);
					aggFunctionArg();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggFunctionArgContext extends ParserRuleContext {
		public TableColumnContext tableColumn() {
			return getRuleContext(TableColumnContext.class,0);
		}
		public TableColumnAliasContext tableColumnAlias() {
			return getRuleContext(TableColumnAliasContext.class,0);
		}
		public AggFunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggFunctionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAggFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAggFunctionArg(this);
		}
	}

	public final AggFunctionArgContext aggFunctionArg() throws RecognitionException {
		AggFunctionArgContext _localctx = new AggFunctionArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aggFunctionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(109);
				tableColumn();
				}
				break;
			case 2:
				{
				setState(110);
				tableColumnAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableColumnAliasContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public TableColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTableColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTableColumnAlias(this);
		}
	}

	public final TableColumnAliasContext tableColumnAlias() throws RecognitionException {
		TableColumnAliasContext _localctx = new TableColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableColumnAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggFunctionResAliasContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public AggFunctionResAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggFunctionResAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterAggFunctionResAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitAggFunctionResAlias(this);
		}
	}

	public final AggFunctionResAliasContext aggFunctionResAlias() throws RecognitionException {
		AggFunctionResAliasContext _localctx = new AggFunctionResAliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggFunctionResAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablesContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public JoinOperatorContext joinOperator() {
			return getRuleContext(JoinOperatorContext.class,0);
		}
		public List<TableColumn_Context> tableColumn_() {
			return getRuleContexts(TableColumn_Context.class);
		}
		public TableColumn_Context tableColumn_(int i) {
			return getRuleContext(TableColumn_Context.class,i);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTables(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tables);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				table();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(118);
					match(T__4);
					setState(119);
					table();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				table();
				setState(126);
				joinOperator();
				setState(127);
				table();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(128);
					match(T__14);
					setState(129);
					tableColumn_();
					setState(130);
					match(T__15);
					setState(131);
					tableColumn_();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TabelAliasContext tabelAlias() {
			return getRuleContext(TabelAliasContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(137);
				tableName();
				}
				break;
			case T__11:
				{
				setState(138);
				match(T__11);
				setState(139);
				selectStatement();
				setState(140);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==STRING) {
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(144);
					match(T__6);
					}
				}

				setState(147);
				tabelAlias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TabelAliasContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public TabelAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabelAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTabelAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTabelAlias(this);
		}
	}

	public final TabelAliasContext tabelAlias() throws RecognitionException {
		TabelAliasContext _localctx = new TabelAliasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tabelAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinOperatorContext extends ParserRuleContext {
		public JoinOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterJoinOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitJoinOperator(this);
		}
	}

	public final JoinOperatorContext joinOperator() throws RecognitionException {
		JoinOperatorContext _localctx = new JoinOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_joinOperator);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(T__19);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(158);
					match(T__20);
					}
				}

				setState(161);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(T__22);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(163);
					match(T__20);
					}
				}

				setState(166);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByCaluseContext groupByCaluse() {
			return getRuleContext(GroupByCaluseContext.class,0);
		}
		public HavingCaluseContext havingCaluse() {
			return getRuleContext(HavingCaluseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitSelectClause(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectClause);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				whereClause();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				groupByCaluse();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				havingCaluse();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				orderByClause();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				limitClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__23);
			setState(177);
			logicExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByCaluseContext extends ParserRuleContext {
		public TableColumn_Context tableColumn_() {
			return getRuleContext(TableColumn_Context.class,0);
		}
		public GroupByCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterGroupByCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitGroupByCaluse(this);
		}
	}

	public final GroupByCaluseContext groupByCaluse() throws RecognitionException {
		GroupByCaluseContext _localctx = new GroupByCaluseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_groupByCaluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__24);
			setState(180);
			tableColumn_();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==T__26) {
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public List<TableColumn_Context> tableColumn_() {
			return getRuleContexts(TableColumn_Context.class);
		}
		public TableColumn_Context tableColumn_(int i) {
			return getRuleContext(TableColumn_Context.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__27);
			{
			setState(185);
			tableColumn_();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(186);
				match(T__4);
				setState(187);
				tableColumn_();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==T__26) {
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingCaluseContext extends ParserRuleContext {
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public HavingCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterHavingCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitHavingCaluse(this);
		}
	}

	public final HavingCaluseContext havingCaluse() throws RecognitionException {
		HavingCaluseContext _localctx = new HavingCaluseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_havingCaluse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__28);
			setState(197);
			logicExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(sqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(sqlParser.INT, i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitLimitClause(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__29);
			setState(200);
			match(INT);
			setState(201);
			match(T__30);
			setState(202);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpressionContext extends ParserRuleContext {
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public List<TableColumn_Context> tableColumn_() {
			return getRuleContexts(TableColumn_Context.class);
		}
		public TableColumn_Context tableColumn_(int i) {
			return getRuleContext(TableColumn_Context.class,i);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitLogicExpression(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(205);
				match(T__31);
				setState(206);
				logicExpression(6);
				}
				break;
			case 2:
				{
				setState(207);
				match(T__11);
				setState(208);
				logicExpression(0);
				setState(209);
				match(T__12);
				}
				break;
			case 3:
				{
				setState(211);
				tableColumn_();
				setState(212);
				compareOperator();
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					{
					setState(213);
					tableColumn_();
					}
					}
					break;
				case T__44:
				case FLOAT:
				case INT:
					{
					setState(214);
					value();
					}
					break;
				case T__11:
					{
					setState(215);
					match(T__11);
					setState(216);
					selectStatement();
					setState(217);
					match(T__12);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(221);
				tableColumn_();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(222);
					match(T__31);
					}
				}

				setState(225);
				match(T__32);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(226);
					match(T__11);
					{
					setState(227);
					value();
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(228);
						match(T__4);
						setState(229);
						value();
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(235);
					match(T__12);
					}
					break;
				case 2:
					{
					setState(237);
					match(T__11);
					setState(238);
					selectStatement();
					setState(239);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(243);
				tableColumn_();
				setState(244);
				match(T__33);
				setState(245);
				value();
				setState(246);
				match(T__34);
				setState(247);
				value();
				}
				break;
			case 6:
				{
				setState(249);
				tableColumn_();
				setState(250);
				match(T__35);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(251);
					match(T__31);
					}
				}

				setState(254);
				match(T__36);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
					setState(258);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(259);
					logicalOperator();
					setState(260);
					logicExpression(8);
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableColumn_Context extends ParserRuleContext {
		public TableColumnContext tableColumn() {
			return getRuleContext(TableColumnContext.class,0);
		}
		public TableColumnAliasContext tableColumnAlias() {
			return getRuleContext(TableColumnAliasContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TabelAliasContext tabelAlias() {
			return getRuleContext(TabelAliasContext.class,0);
		}
		public TableColumn_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumn_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterTableColumn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitTableColumn_(this);
		}
	}

	public final TableColumn_Context tableColumn_() throws RecognitionException {
		TableColumn_Context _localctx = new TableColumn_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableColumn_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(267);
					tableName();
					}
					break;
				case 2:
					{
					setState(268);
					tabelAlias();
					}
					break;
				}
				setState(271);
				match(T__5);
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(275);
				tableColumn();
				}
				break;
			case 2:
				{
				setState(276);
				tableColumnAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareOperatorContext extends ParserRuleContext {
		public CompareOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterCompareOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitCompareOperator(this);
		}
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616340480L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(sqlParser.STRING, 0); }
		public StringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ValueContext {
		public TerminalNode FLOAT() { return getToken(sqlParser.FLOAT, 0); }
		public FloatContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitFloat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ValueContext {
		public TerminalNode INT() { return getToken(sqlParser.INT, 0); }
		public IntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlListener ) ((sqlListener)listener).exitInt(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(INT);
				}
				break;
			case T__44:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__44);
				setState(285);
				match(STRING);
				setState(286);
				match(T__44);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00006\b\u0000\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001?\b\u0001\n\u0001\f\u0001B\t\u0001\u0003\u0001D\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001\u0002"+
		"\u0003\u0002S\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002\u0001"+
		"\u0002\u0003\u0002Z\b\u0002\u0003\u0002\\\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001\u0004"+
		"\u0003\u0004l\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005p\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\by\b\b\n\b\f\b|\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0086\b\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\t\u0003\t\u0092\b\t\u0001\t\u0003"+
		"\t\u0095\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00a0\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a5"+
		"\b\f\u0001\f\u0003\f\u00a8\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00b7\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00bd\b\u0010\n\u0010\f\u0010\u00c0\t\u0010"+
		"\u0001\u0010\u0003\u0010\u00c3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00dc\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00e0\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00e7\b\u0013\n\u0013\f\u0013\u00ea\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f2\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00fd"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0101\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0107\b\u0013\n\u0013"+
		"\f\u0013\u010a\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u010e\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0112\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0116\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0121\b\u0017\u0001\u0017\u0000\u0001&\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0004\u0001\u0000\b\u000b\u0001\u0000\u001a\u001b\u0002\u0000#"+
		"#&&\u0002\u0000\u0010\u0010\',\u013c\u00000\u0001\u0000\u0000\u0000\u0002"+
		"C\u0001\u0000\u0000\u0000\u0004[\u0001\u0000\u0000\u0000\u0006]\u0001"+
		"\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000"+
		"\fq\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010\u0087"+
		"\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014\u0096"+
		"\u0001\u0000\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u00a7"+
		"\u0001\u0000\u0000\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00b0"+
		"\u0001\u0000\u0000\u0000\u001e\u00b3\u0001\u0000\u0000\u0000 \u00b8\u0001"+
		"\u0000\u0000\u0000\"\u00c4\u0001\u0000\u0000\u0000$\u00c7\u0001\u0000"+
		"\u0000\u0000&\u0100\u0001\u0000\u0000\u0000(\u0111\u0001\u0000\u0000\u0000"+
		"*\u0117\u0001\u0000\u0000\u0000,\u0119\u0001\u0000\u0000\u0000.\u0120"+
		"\u0001\u0000\u0000\u000001\u0005\u0001\u0000\u000012\u0003\u0002\u0001"+
		"\u000023\u0005\u0002\u0000\u000035\u0003\u0010\b\u000046\u0003\u001a\r"+
		"\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0001\u0001"+
		"\u0000\u0000\u000079\u0005\u0003\u0000\u000087\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:D\u0005\u0004\u0000"+
		"\u0000;@\u0003\u0004\u0002\u0000<=\u0005\u0005\u0000\u0000=?\u0003\u0004"+
		"\u0002\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000C8\u0001\u0000\u0000\u0000C;\u0001\u0000\u0000"+
		"\u0000D\u0003\u0001\u0000\u0000\u0000EH\u0003\u0014\n\u0000FH\u0003\u0016"+
		"\u000b\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u0006\u0000\u0000JL\u0001\u0000\u0000\u0000"+
		"KG\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MR\u0003\u0006\u0003\u0000NP\u0005\u0007\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0003"+
		"\f\u0006\u0000RO\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\\"+
		"\u0001\u0000\u0000\u0000TY\u0003\b\u0004\u0000UW\u0005\u0007\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XZ\u0003\u000e\u0007\u0000YV\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z\\\u0001\u0000\u0000\u0000[K\u0001\u0000\u0000\u0000[T\u0001"+
		"\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u00050\u0000\u0000"+
		"^\u0007\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000\u0000`a\u0005\f\u0000"+
		"\u0000ab\u0003\n\u0005\u0000bc\u0005\r\u0000\u0000cl\u0001\u0000\u0000"+
		"\u0000de\u0005\u000e\u0000\u0000eh\u0005\f\u0000\u0000fi\u0005\u0004\u0000"+
		"\u0000gi\u0003\n\u0005\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jl\u0005\r\u0000\u0000k_\u0001\u0000\u0000"+
		"\u0000kd\u0001\u0000\u0000\u0000l\t\u0001\u0000\u0000\u0000mp\u0003\u0006"+
		"\u0003\u0000np\u0003\f\u0006\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u00050\u0000\u0000r\r\u0001"+
		"\u0000\u0000\u0000st\u00050\u0000\u0000t\u000f\u0001\u0000\u0000\u0000"+
		"uz\u0003\u0012\t\u0000vw\u0005\u0005\u0000\u0000wy\u0003\u0012\t\u0000"+
		"xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{\u0088\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0003\u0012\t\u0000~\u007f\u0003\u0018\f\u0000\u007f"+
		"\u0085\u0003\u0012\t\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0082"+
		"\u0003(\u0014\u0000\u0082\u0083\u0005\u0010\u0000\u0000\u0083\u0084\u0003"+
		"(\u0014\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087u\u0001\u0000\u0000\u0000\u0087}\u0001\u0000\u0000\u0000"+
		"\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008f\u0003\u0014\n\u0000\u008a"+
		"\u008b\u0005\f\u0000\u0000\u008b\u008c\u0003\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\r\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0089\u0001"+
		"\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0094\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0005\u0007\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0003\u0016\u000b\u0000\u0094\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0013\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u00050\u0000\u0000\u0097\u0015\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u00050\u0000\u0000\u0099\u0017\u0001\u0000\u0000"+
		"\u0000\u009a\u00a8\u0005\u0011\u0000\u0000\u009b\u00a8\u0005\u0012\u0000"+
		"\u0000\u009c\u00a8\u0005\u0013\u0000\u0000\u009d\u009f\u0005\u0014\u0000"+
		"\u0000\u009e\u00a0\u0005\u0015\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a8\u0005\u0016\u0000\u0000\u00a2\u00a4\u0005\u0017\u0000"+
		"\u0000\u00a3\u00a5\u0005\u0015\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0005\u0016\u0000\u0000\u00a7\u009a\u0001\u0000\u0000"+
		"\u0000\u00a7\u009b\u0001\u0000\u0000\u0000\u00a7\u009c\u0001\u0000\u0000"+
		"\u0000\u00a7\u009d\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00af\u0003\u001c\u000e"+
		"\u0000\u00aa\u00af\u0003\u001e\u000f\u0000\u00ab\u00af\u0003\"\u0011\u0000"+
		"\u00ac\u00af\u0003 \u0010\u0000\u00ad\u00af\u0003$\u0012\u0000\u00ae\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0018\u0000\u0000\u00b1\u00b2\u0003&\u0013\u0000\u00b2\u001d\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0019\u0000\u0000\u00b4\u00b6\u0003"+
		"(\u0014\u0000\u00b5\u00b7\u0007\u0001\u0000\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u001f\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9\u00be\u0003(\u0014"+
		"\u0000\u00ba\u00bb\u0005\u0005\u0000\u0000\u00bb\u00bd\u0003(\u0014\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0007\u0001\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u001d\u0000\u0000\u00c5\u00c6\u0003&\u0013\u0000\u00c6#\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u001e\u0000\u0000\u00c8\u00c9\u0005"+
		"/\u0000\u0000\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca\u00cb\u0005/\u0000"+
		"\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc\u00cd\u0006\u0013\uffff\uffff"+
		"\u0000\u00cd\u00ce\u0005 \u0000\u0000\u00ce\u0101\u0003&\u0013\u0006\u00cf"+
		"\u00d0\u0005\f\u0000\u0000\u00d0\u00d1\u0003&\u0013\u0000\u00d1\u00d2"+
		"\u0005\r\u0000\u0000\u00d2\u0101\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003"+
		"(\u0014\u0000\u00d4\u00db\u0003,\u0016\u0000\u00d5\u00dc\u0003(\u0014"+
		"\u0000\u00d6\u00dc\u0003.\u0017\u0000\u00d7\u00d8\u0005\f\u0000\u0000"+
		"\u00d8\u00d9\u0003\u0000\u0000\u0000\u00d9\u00da\u0005\r\u0000\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db"+
		"\u00d6\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00dc"+
		"\u0101\u0001\u0000\u0000\u0000\u00dd\u00df\u0003(\u0014\u0000\u00de\u00e0"+
		"\u0005 \u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00f1\u0005"+
		"!\u0000\u0000\u00e2\u00e3\u0005\f\u0000\u0000\u00e3\u00e8\u0003.\u0017"+
		"\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00e7\u0003.\u0017\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\r\u0000\u0000\u00ec\u00f2\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\f\u0000\u0000\u00ee\u00ef\u0003\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\r\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f2\u0101\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0003(\u0014\u0000\u00f4\u00f5\u0005\""+
		"\u0000\u0000\u00f5\u00f6\u0003.\u0017\u0000\u00f6\u00f7\u0005#\u0000\u0000"+
		"\u00f7\u00f8\u0003.\u0017\u0000\u00f8\u0101\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0003(\u0014\u0000\u00fa\u00fc\u0005$\u0000\u0000\u00fb\u00fd\u0005"+
		" \u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005%\u0000"+
		"\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00cc\u0001\u0000\u0000"+
		"\u0000\u0100\u00cf\u0001\u0000\u0000\u0000\u0100\u00d3\u0001\u0000\u0000"+
		"\u0000\u0100\u00dd\u0001\u0000\u0000\u0000\u0100\u00f3\u0001\u0000\u0000"+
		"\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0101\u0108\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\n\u0007\u0000\u0000\u0103\u0104\u0003*\u0015\u0000"+
		"\u0104\u0105\u0003&\u0013\b\u0105\u0107\u0001\u0000\u0000\u0000\u0106"+
		"\u0102\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\'\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0003\u0014\n\u0000\u010c\u010e\u0003\u0016\u000b\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\u0006\u0000\u0000\u0110\u0112\u0001"+
		"\u0000\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0116\u0003"+
		"\u0006\u0003\u0000\u0114\u0116\u0003\f\u0006\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116)\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0007\u0002\u0000\u0000\u0118+\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0007\u0003\u0000\u0000\u011a-\u0001\u0000\u0000\u0000\u011b"+
		"\u0121\u0005/\u0000\u0000\u011c\u011d\u0005-\u0000\u0000\u011d\u011e\u0005"+
		"0\u0000\u0000\u011e\u0121\u0005-\u0000\u0000\u011f\u0121\u0005.\u0000"+
		"\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121/\u0001\u0000\u0000\u0000"+
		"&58@CGKORVY[hkoz\u0085\u0087\u008e\u0091\u0094\u009f\u00a4\u00a7\u00ae"+
		"\u00b6\u00be\u00c2\u00db\u00df\u00e8\u00f1\u00fc\u0100\u0108\u010d\u0111"+
		"\u0115\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}