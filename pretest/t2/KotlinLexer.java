// Generated from Kotlin.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, TWODOT=2, EQ=3, NEQ=4, GE=5, LE=6, GT=7, LT=8, PASN=9, MASN=10, 
		MULASN=11, DIVASN=12, MODASN=13, DPULS=14, DMINUS=15, LOGICAND=16, LOGICOR=17, 
		DOT=18, COMMA=19, LPAR=20, RPAR=21, LB=22, RB=23, LSQ=24, RSQ=25, COLON=26, 
		QUERY=27, MUL=28, DIV=29, MOD=30, ASN=31, PULS=32, MINUS=33, IN=34, NIN=35, 
		IS=36, NIS=37, IF=38, ELSE=39, FOR=40, WHILE=41, BOOL=42, BYTE=43, SHORT=44, 
		LONG=45, FLOAT=46, DOUBLE=47, INT=48, STRING=49, UNIT=50, SUPERANY=51, 
		ANY=52, CHAR=53, PACKAGE=54, IMPORT=55, VAL=56, VAR=57, NULL=58, FUN=59, 
		RETC=60, TRUE=61, FALSE=62, MAIN=63, CHR=64, STR=65, ID=66, NUM=67, FN=68, 
		DIGIT=69, WS=70, COMMENT=71, COMMENT2=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMI", "TWODOT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "PASN", "MASN", 
			"MULASN", "DIVASN", "MODASN", "DPULS", "DMINUS", "LOGICAND", "LOGICOR", 
			"DOT", "COMMA", "LPAR", "RPAR", "LB", "RB", "LSQ", "RSQ", "COLON", "QUERY", 
			"MUL", "DIV", "MOD", "ASN", "PULS", "MINUS", "IN", "NIN", "IS", "NIS", 
			"IF", "ELSE", "FOR", "WHILE", "BOOL", "BYTE", "SHORT", "LONG", "FLOAT", 
			"DOUBLE", "INT", "STRING", "UNIT", "SUPERANY", "ANY", "CHAR", "PACKAGE", 
			"IMPORT", "VAL", "VAR", "NULL", "FUN", "RETC", "TRUE", "FALSE", "MAIN", 
			"CHR", "STR", "ID", "NUM", "FN", "DIGIT", "WS", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'..'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'&&'", "'||'", "'.'", 
			"','", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'?'", "'*'", 
			"'/'", "'%'", "'='", "'+'", "'-'", "'in'", "'!in'", "'is'", "'!is'", 
			"'if'", "'else'", "'for'", "'while'", "'Boolean'", "'Byte'", "'Short'", 
			"'Long'", "'Float'", "'Double'", "'Int'", "'String'", "'Unit'", "'Any()'", 
			"'Any'", "'Char'", "'package'", "'import'", "'val'", "'var'", "'null'", 
			"'fun'", "'return'", "'true'", "'false'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "TWODOT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "PASN", 
			"MASN", "MULASN", "DIVASN", "MODASN", "DPULS", "DMINUS", "LOGICAND", 
			"LOGICOR", "DOT", "COMMA", "LPAR", "RPAR", "LB", "RB", "LSQ", "RSQ", 
			"COLON", "QUERY", "MUL", "DIV", "MOD", "ASN", "PULS", "MINUS", "IN", 
			"NIN", "IS", "NIS", "IF", "ELSE", "FOR", "WHILE", "BOOL", "BYTE", "SHORT", 
			"LONG", "FLOAT", "DOUBLE", "INT", "STRING", "UNIT", "SUPERANY", "ANY", 
			"CHAR", "PACKAGE", "IMPORT", "VAL", "VAR", "NULL", "FUN", "RETC", "TRUE", 
			"FALSE", "MAIN", "CHR", "STR", "ID", "NUM", "FN", "DIGIT", "WS", "COMMENT", 
			"COMMENT2"
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


	public KotlinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kotlin.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3;"+
		"\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?"+
		"\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\7B\u0185\nB\fB\16B\u0188\13B\3B\3"+
		"B\3C\3C\3C\7C\u018f\nC\fC\16C\u0192\13C\3D\5D\u0195\nD\3D\6D\u0198\nD"+
		"\rD\16D\u0199\3D\3D\6D\u019e\nD\rD\16D\u019f\5D\u01a2\nD\3E\3E\3F\3F\3"+
		"G\6G\u01a9\nG\rG\16G\u01aa\3G\3G\3H\3H\3H\3H\7H\u01b3\nH\fH\16H\u01b6"+
		"\13H\3H\3H\3I\3I\3I\3I\7I\u01be\nI\fI\16I\u01c1\13I\3I\3I\3I\3I\3I\3\u01bf"+
		"\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\3\2\7\4\2\f\f\17\17\5\2\f\f\17\17$$\5\2C\\aac|\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u01d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093"+
		"\3\2\2\2\5\u0095\3\2\2\2\7\u0098\3\2\2\2\t\u009b\3\2\2\2\13\u009e\3\2"+
		"\2\2\r\u00a1\3\2\2\2\17\u00a4\3\2\2\2\21\u00a6\3\2\2\2\23\u00a8\3\2\2"+
		"\2\25\u00ab\3\2\2\2\27\u00ae\3\2\2\2\31\u00b1\3\2\2\2\33\u00b4\3\2\2\2"+
		"\35\u00b7\3\2\2\2\37\u00ba\3\2\2\2!\u00bd\3\2\2\2#\u00c0\3\2\2\2%\u00c3"+
		"\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00cb\3\2\2\2"+
		"/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67"+
		"\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2?\u00dd\3\2"+
		"\2\2A\u00df\3\2\2\2C\u00e1\3\2\2\2E\u00e3\3\2\2\2G\u00e6\3\2\2\2I\u00ea"+
		"\3\2\2\2K\u00ed\3\2\2\2M\u00f1\3\2\2\2O\u00f4\3\2\2\2Q\u00f9\3\2\2\2S"+
		"\u00fd\3\2\2\2U\u0103\3\2\2\2W\u010b\3\2\2\2Y\u0110\3\2\2\2[\u0116\3\2"+
		"\2\2]\u011b\3\2\2\2_\u0121\3\2\2\2a\u0128\3\2\2\2c\u012c\3\2\2\2e\u0133"+
		"\3\2\2\2g\u0138\3\2\2\2i\u013e\3\2\2\2k\u0142\3\2\2\2m\u0147\3\2\2\2o"+
		"\u014f\3\2\2\2q\u0156\3\2\2\2s\u015a\3\2\2\2u\u015e\3\2\2\2w\u0163\3\2"+
		"\2\2y\u0167\3\2\2\2{\u016e\3\2\2\2}\u0173\3\2\2\2\177\u0179\3\2\2\2\u0081"+
		"\u017e\3\2\2\2\u0083\u0182\3\2\2\2\u0085\u018b\3\2\2\2\u0087\u0194\3\2"+
		"\2\2\u0089\u01a3\3\2\2\2\u008b\u01a5\3\2\2\2\u008d\u01a8\3\2\2\2\u008f"+
		"\u01ae\3\2\2\2\u0091\u01b9\3\2\2\2\u0093\u0094\7=\2\2\u0094\4\3\2\2\2"+
		"\u0095\u0096\7\60\2\2\u0096\u0097\7\60\2\2\u0097\6\3\2\2\2\u0098\u0099"+
		"\7?\2\2\u0099\u009a\7?\2\2\u009a\b\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d"+
		"\7?\2\2\u009d\n\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0\f"+
		"\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3\16\3\2\2\2\u00a4"+
		"\u00a5\7@\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\22\3\2\2\2\u00a8"+
		"\u00a9\7-\2\2\u00a9\u00aa\7?\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\30\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7?\2\2\u00b3\32\3\2\2\2\u00b4"+
		"\u00b5\7\'\2\2\u00b5\u00b6\7?\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7-\2\2"+
		"\u00b8\u00b9\7-\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bc\7"+
		"/\2\2\u00bc \3\2\2\2\u00bd\u00be\7(\2\2\u00be\u00bf\7(\2\2\u00bf\"\3\2"+
		"\2\2\u00c0\u00c1\7~\2\2\u00c1\u00c2\7~\2\2\u00c2$\3\2\2\2\u00c3\u00c4"+
		"\7\60\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6(\3\2\2\2\u00c7\u00c8"+
		"\7*\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7"+
		"}\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7\177\2\2\u00ce\60\3\2\2\2\u00cf\u00d0"+
		"\7]\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7_\2\2\u00d2\64\3\2\2\2\u00d3\u00d4"+
		"\7<\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7A\2\2\u00d68\3\2\2\2\u00d7\u00d8"+
		"\7,\2\2\u00d8:\3\2\2\2\u00d9\u00da\7\61\2\2\u00da<\3\2\2\2\u00db\u00dc"+
		"\7\'\2\2\u00dc>\3\2\2\2\u00dd\u00de\7?\2\2\u00de@\3\2\2\2\u00df\u00e0"+
		"\7-\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2D\3\2\2\2\u00e3\u00e4\7"+
		"k\2\2\u00e4\u00e5\7p\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7p\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec"+
		"\7u\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7u\2\2\u00f0L\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3N\3"+
		"\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7q\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff\7j\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102T\3\2\2\2\u0103"+
		"\u0104\7D\2\2\u0104\u0105\7q\2\2\u0105\u0106\7q\2\2\u0106\u0107\7n\2\2"+
		"\u0107\u0108\7g\2\2\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2\u010aV\3\2\2"+
		"\2\u010b\u010c\7D\2\2\u010c\u010d\7{\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7g\2\2\u010fX\3\2\2\2\u0110\u0111\7U\2\2\u0111\u0112\7j\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7t\2\2\u0114\u0115\7v\2\2\u0115Z\3\2\2\2\u0116\u0117"+
		"\7N\2\2\u0117\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7i\2\2\u011a"+
		"\\\3\2\2\2\u011b\u011c\7H\2\2\u011c\u011d\7n\2\2\u011d\u011e\7q\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7v\2\2\u0120^\3\2\2\2\u0121\u0122\7F\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7w\2\2\u0124\u0125\7d\2\2\u0125\u0126\7n\2\2"+
		"\u0126\u0127\7g\2\2\u0127`\3\2\2\2\u0128\u0129\7K\2\2\u0129\u012a\7p\2"+
		"\2\u012a\u012b\7v\2\2\u012bb\3\2\2\2\u012c\u012d\7U\2\2\u012d\u012e\7"+
		"v\2\2\u012e\u012f\7t\2\2\u012f\u0130\7k\2\2\u0130\u0131\7p\2\2\u0131\u0132"+
		"\7i\2\2\u0132d\3\2\2\2\u0133\u0134\7W\2\2\u0134\u0135\7p\2\2\u0135\u0136"+
		"\7k\2\2\u0136\u0137\7v\2\2\u0137f\3\2\2\2\u0138\u0139\7C\2\2\u0139\u013a"+
		"\7p\2\2\u013a\u013b\7{\2\2\u013b\u013c\7*\2\2\u013c\u013d\7+\2\2\u013d"+
		"h\3\2\2\2\u013e\u013f\7C\2\2\u013f\u0140\7p\2\2\u0140\u0141\7{\2\2\u0141"+
		"j\3\2\2\2\u0142\u0143\7E\2\2\u0143\u0144\7j\2\2\u0144\u0145\7c\2\2\u0145"+
		"\u0146\7t\2\2\u0146l\3\2\2\2\u0147\u0148\7r\2\2\u0148\u0149\7c\2\2\u0149"+
		"\u014a\7e\2\2\u014a\u014b\7m\2\2\u014b\u014c\7c\2\2\u014c\u014d\7i\2\2"+
		"\u014d\u014e\7g\2\2\u014en\3\2\2\2\u014f\u0150\7k\2\2\u0150\u0151\7o\2"+
		"\2\u0151\u0152\7r\2\2\u0152\u0153\7q\2\2\u0153\u0154\7t\2\2\u0154\u0155"+
		"\7v\2\2\u0155p\3\2\2\2\u0156\u0157\7x\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7n\2\2\u0159r\3\2\2\2\u015a\u015b\7x\2\2\u015b\u015c\7c\2\2\u015c\u015d"+
		"\7t\2\2\u015dt\3\2\2\2\u015e\u015f\7p\2\2\u015f\u0160\7w\2\2\u0160\u0161"+
		"\7n\2\2\u0161\u0162\7n\2\2\u0162v\3\2\2\2\u0163\u0164\7h\2\2\u0164\u0165"+
		"\7w\2\2\u0165\u0166\7p\2\2\u0166x\3\2\2\2\u0167\u0168\7t\2\2\u0168\u0169"+
		"\7g\2\2\u0169\u016a\7v\2\2\u016a\u016b\7w\2\2\u016b\u016c\7t\2\2\u016c"+
		"\u016d\7p\2\2\u016dz\3\2\2\2\u016e\u016f\7v\2\2\u016f\u0170\7t\2\2\u0170"+
		"\u0171\7w\2\2\u0171\u0172\7g\2\2\u0172|\3\2\2\2\u0173\u0174\7h\2\2\u0174"+
		"\u0175\7c\2\2\u0175\u0176\7n\2\2\u0176\u0177\7u\2\2\u0177\u0178\7g\2\2"+
		"\u0178~\3\2\2\2\u0179\u017a\7o\2\2\u017a\u017b\7c\2\2\u017b\u017c\7k\2"+
		"\2\u017c\u017d\7p\2\2\u017d\u0080\3\2\2\2\u017e\u017f\7)\2\2\u017f\u0180"+
		"\n\2\2\2\u0180\u0181\7)\2\2\u0181\u0082\3\2\2\2\u0182\u0186\7$\2\2\u0183"+
		"\u0185\n\3\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018a\7$\2\2\u018a\u0084\3\2\2\2\u018b\u0190\5\u0089E\2\u018c\u018f\5"+
		"\u0089E\2\u018d\u018f\5\u008bF\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2"+
		"\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0086"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\7/\2\2\u0194\u0193\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5\u008bF\2\u0197\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u01a1\3\2\2\2\u019b\u019d\5%\23\2\u019c\u019e\5\u008bF\2\u019d\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u019b\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u0088\3\2"+
		"\2\2\u01a3\u01a4\t\4\2\2\u01a4\u008a\3\2\2\2\u01a5\u01a6\t\5\2\2\u01a6"+
		"\u008c\3\2\2\2\u01a7\u01a9\t\6\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\bG\2\2\u01ad\u008e\3\2\2\2\u01ae\u01af\7\61\2\2\u01af\u01b0\7\61"+
		"\2\2\u01b0\u01b4\3\2\2\2\u01b1\u01b3\n\2\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\bH\2\2\u01b8\u0090\3\2\2\2\u01b9"+
		"\u01ba\7\61\2\2\u01ba\u01bb\7,\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01be\13"+
		"\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7,"+
		"\2\2\u01c3\u01c4\7\61\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\bI\2\2\u01c6"+
		"\u0092\3\2\2\2\r\2\u0186\u018e\u0190\u0194\u0199\u019f\u01a1\u01aa\u01b4"+
		"\u01bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}