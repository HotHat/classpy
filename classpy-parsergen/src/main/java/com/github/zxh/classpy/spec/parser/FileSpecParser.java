// Generated from FileSpec.g4 by ANTLR 4.7.2

package com.github.zxh.classpy.spec.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FileSpecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, STR=13, EXPR=14, WS=15, COMMENT=16, LINE_COMMENT=17;
	public static final int
		RULE_spec = 0, RULE_part = 1, RULE_field = 2, RULE_table = 3, RULE_selector = 4, 
		RULE_branch = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"spec", "part", "field", "table", "selector", "branch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'{'", "'}'", "';'", "'['", "'-1'", "']'", "'='", "':'", 
			"'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "STR", "EXPR", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "FileSpec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FileSpecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FileSpecParser.EOF, 0); }
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FileSpecVisitor ) return ((FileSpecVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(14);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(12);
					part();
					}
					break;
				case 2:
					{
					setState(13);
					selector();
					}
					break;
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(18);
			match(EOF);
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

	public static class PartContext extends ParserRuleContext {
		public Token name;
		public Token var;
		public List<TerminalNode> ID() { return getTokens(FileSpecParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FileSpecParser.ID, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FileSpecVisitor ) return ((FileSpecVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((PartContext)_localctx).name = match(ID);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(21);
				match(T__0);
				setState(22);
				((PartContext)_localctx).var = match(ID);
				}
			}

			setState(25);
			match(T__1);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(26);
					field();
					}
					break;
				case 2:
					{
					setState(27);
					table();
					}
					break;
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(32);
			match(T__2);
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

	public static class FieldContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public List<TerminalNode> ID() { return getTokens(FileSpecParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FileSpecParser.ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FileSpecVisitor ) return ((FileSpecVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((FieldContext)_localctx).type = match(ID);
			setState(35);
			((FieldContext)_localctx).name = match(ID);
			setState(36);
			match(T__3);
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

	public static class TableContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public Token count;
		public Token minus1;
		public List<TerminalNode> ID() { return getTokens(FileSpecParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FileSpecParser.ID, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FileSpecVisitor ) return ((FileSpecVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((TableContext)_localctx).type = match(ID);
			setState(39);
			((TableContext)_localctx).name = match(ID);
			setState(40);
			match(T__4);
			setState(41);
			((TableContext)_localctx).count = match(ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(42);
				((TableContext)_localctx).minus1 = match(T__5);
				}
			}

			setState(45);
			match(T__6);
			setState(46);
			match(T__3);
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

	public static class SelectorContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public Token header;
		public List<TerminalNode> ID() { return getTokens(FileSpecParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FileSpecParser.ID, i);
		}
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public TerminalNode EXPR() { return getToken(FileSpecParser.EXPR, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FileSpecVisitor ) return ((FileSpecVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((SelectorContext)_localctx).name = match(ID);
			setState(49);
			match(T__7);
			setState(50);
			((SelectorContext)_localctx).type = match(ID);
			setState(51);
			match(T__8);
			setState(52);
			match(T__1);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPR) {
				{
				setState(53);
				((SelectorContext)_localctx).header = match(EXPR);
				}
			}

			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				branch();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==STR );
			setState(61);
			match(T__2);
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

	public static class BranchContext extends ParserRuleContext {
		public Token val;
		public Token type;
		public TerminalNode ID() { return getToken(FileSpecParser.ID, 0); }
		public TerminalNode INT() { return getToken(FileSpecParser.INT, 0); }
		public TerminalNode STR() { return getToken(FileSpecParser.STR, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FileSpecListener ) ((FileSpecListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FileSpecVisitor ) return ((FileSpecVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((BranchContext)_localctx).val = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STR) ) {
				((BranchContext)_localctx).val = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			match(T__9);
			setState(65);
			((BranchContext)_localctx).type = match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\69\n\6\3\6\6\6<\n\6\r\6\16\6=\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\2\2\b\2\4\6\b\n\f\2\3\3\2\16\17\2G\2\20\3\2\2\2\4\26\3\2\2\2\6$\3\2\2"+
		"\2\b(\3\2\2\2\n\62\3\2\2\2\fA\3\2\2\2\16\21\5\4\3\2\17\21\5\n\6\2\20\16"+
		"\3\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\24"+
		"\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\31\7\r\2\2\27\30\7\3\2\2\30\32"+
		"\7\r\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\36\7\4\2\2\34\37"+
		"\5\6\4\2\35\37\5\b\5\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\5\2\2#\5\3\2\2\2$%\7\r\2\2%&\7\r\2\2&\'"+
		"\7\6\2\2\'\7\3\2\2\2()\7\r\2\2)*\7\r\2\2*+\7\7\2\2+-\7\r\2\2,.\7\b\2\2"+
		"-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\t\2\2\60\61\7\6\2\2\61\t\3\2\2\2"+
		"\62\63\7\r\2\2\63\64\7\n\2\2\64\65\7\r\2\2\65\66\7\13\2\2\668\7\4\2\2"+
		"\679\7\20\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\f\7\2;:\3\2\2\2<=\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\5\2\2@\13\3\2\2\2AB\t\2\2\2B"+
		"C\7\f\2\2CD\7\r\2\2D\r\3\2\2\2\n\20\22\31\36 -8=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}