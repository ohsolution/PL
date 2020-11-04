// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/pretest/work/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, SEMI=2, STR=3, PACKAGE=4, IMPORT=5, DOT=6, MUL=7, VAL=8, VAR=9, 
		DIGIT=10, FN=11, ID=12, COLON=13, INT=14, EQ=15, WS=16, COMMENT=17, COMMENT2=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "SEMI", "STR", "PACKAGE", "IMPORT", "DOT", "MUL", "VAL", "VAR", 
			"DIGIT", "FN", "ID", "COLON", "INT", "EQ", "WS", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", null, "'package '", "'import '", "'.'", "'*'", "'val '", 
			"'var '", null, null, null, "': '", "'Int '", "'= '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "SEMI", "STR", "PACKAGE", "IMPORT", "DOT", "MUL", "VAL", 
			"VAR", "DIGIT", "FN", "ID", "COLON", "INT", "EQ", "WS", "COMMENT", "COMMENT2"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\4\6\4\60\n\4\r\4\16\4"+
		"\61\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\7\rZ\n\r\f\r\16\r]\13\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21k\n\21\r\21\16\21l\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\7\22u\n\22\f\22\16\22x\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23\u0080\n\23\f\23\16\23\u0083\13\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\u0081\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\3\2\7\4\2\f\f\17\17\7\2\f\f\17\17\"\"\60"+
		"\60==\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u008f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3(\3"+
		"\2\2\2\5,\3\2\2\2\7/\3\2\2\2\t\63\3\2\2\2\13<\3\2\2\2\rD\3\2\2\2\17F\3"+
		"\2\2\2\21H\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33"+
		"^\3\2\2\2\35a\3\2\2\2\37f\3\2\2\2!j\3\2\2\2#p\3\2\2\2%{\3\2\2\2\')\t\2"+
		"\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\4\3\2\2\2,-\7=\2\2-\6\3"+
		"\2\2\2.\60\n\3\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\b\3\2\2\2\63\64\7r\2\2\64\65\7c\2\2\65\66\7e\2\2\66\67\7m\2\2\678\7c"+
		"\2\289\7i\2\29:\7g\2\2:;\7\"\2\2;\n\3\2\2\2<=\7k\2\2=>\7o\2\2>?\7r\2\2"+
		"?@\7q\2\2@A\7t\2\2AB\7v\2\2BC\7\"\2\2C\f\3\2\2\2DE\7\60\2\2E\16\3\2\2"+
		"\2FG\7,\2\2G\20\3\2\2\2HI\7x\2\2IJ\7c\2\2JK\7n\2\2KL\7\"\2\2L\22\3\2\2"+
		"\2MN\7x\2\2NO\7c\2\2OP\7t\2\2PQ\7\"\2\2Q\24\3\2\2\2RS\t\4\2\2S\26\3\2"+
		"\2\2TU\t\5\2\2U\30\3\2\2\2V[\5\27\f\2WZ\5\27\f\2XZ\5\25\13\2YW\3\2\2\2"+
		"YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\32\3\2\2\2][\3\2\2\2^_\7<"+
		"\2\2_`\7\"\2\2`\34\3\2\2\2ab\7K\2\2bc\7p\2\2cd\7v\2\2de\7\"\2\2e\36\3"+
		"\2\2\2fg\7?\2\2gh\7\"\2\2h \3\2\2\2ik\t\6\2\2ji\3\2\2\2kl\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\21\2\2o\"\3\2\2\2pq\7\61\2\2qr\7\61\2\2"+
		"rv\3\2\2\2su\n\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2"+
		"xv\3\2\2\2yz\b\22\2\2z$\3\2\2\2{|\7\61\2\2|}\7,\2\2}\u0081\3\2\2\2~\u0080"+
		"\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7,\2\2\u0085"+
		"\u0086\7\61\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\23\2\2\u0088&\3\2\2"+
		"\2\n\2*\61Y[lv\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}