// Generated from FileSpec.g4 by ANTLR 4.7.2

package com.github.zxh.classpy.spec.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FileSpecLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, STR=13, EXPR=14, WS=15, COMMENT=16, LINE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ID", "INT", "STR", "EXPR", "WS", "COMMENT", "LINE_COMMENT"
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


	public FileSpecLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FileSpec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\7\f>\n\f\f\f\16\fA\13\f\3\r\3\r\3\r\7\r"+
		"F\n\r\f\r\16\rI\13\r\5\rK\n\r\3\16\3\16\6\16O\n\16\r\16\16\16P\3\16\3"+
		"\16\3\17\3\17\3\17\6\17X\n\17\r\17\16\17Y\3\17\3\17\3\20\6\20_\n\20\r"+
		"\20\16\20`\3\20\3\20\3\21\3\21\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22w\n\22\f\22\16\22z\13"+
		"\22\3\22\3\22\3j\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2"+
		"\63;\3\2\62;\3\2$$\3\2**\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0084\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17"+
		"\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\258\3\2\2\2\27;\3\2\2\2\31J\3"+
		"\2\2\2\33L\3\2\2\2\35T\3\2\2\2\37^\3\2\2\2!d\3\2\2\2#r\3\2\2\2%&\7%\2"+
		"\2&\4\3\2\2\2\'(\7}\2\2(\6\3\2\2\2)*\7\177\2\2*\b\3\2\2\2+,\7=\2\2,\n"+
		"\3\2\2\2-.\7]\2\2.\f\3\2\2\2/\60\7/\2\2\60\61\7\63\2\2\61\16\3\2\2\2\62"+
		"\63\7_\2\2\63\20\3\2\2\2\64\65\7?\2\2\65\22\3\2\2\2\66\67\7<\2\2\67\24"+
		"\3\2\2\289\7/\2\29:\7@\2\2:\26\3\2\2\2;?\t\2\2\2<>\t\3\2\2=<\3\2\2\2>"+
		"A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\30\3\2\2\2A?\3\2\2\2BK\7\62\2\2CG\t\4\2"+
		"\2DF\t\5\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2JB\3\2\2\2JC\3\2\2\2K\32\3\2\2\2LN\7$\2\2MO\n\6\2\2NM\3\2\2\2OP\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7$\2\2S\34\3\2\2\2TU\7&\2\2UW\7*"+
		"\2\2VX\n\7\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7"+
		"+\2\2\\\36\3\2\2\2]_\t\b\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a"+
		"b\3\2\2\2bc\b\20\2\2c \3\2\2\2de\7\61\2\2ef\7,\2\2fj\3\2\2\2gi\13\2\2"+
		"\2hg\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7,\2"+
		"\2no\7\61\2\2op\3\2\2\2pq\b\21\2\2q\"\3\2\2\2rs\7\61\2\2st\7\61\2\2tx"+
		"\3\2\2\2uw\n\t\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2z"+
		"x\3\2\2\2{|\b\22\2\2|$\3\2\2\2\13\2?GJPY`jx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}