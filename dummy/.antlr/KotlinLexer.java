// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/pretest/Kotlin.g4 by ANTLR 4.8
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
		ANY=52, CHAR=53, PACKAGE=54, IMPORT=55, VAL=56, VAR=57, OVERRIDE=58, CLASS=59, 
		ABSTRACT=60, INTERFACE=61, GET=62, CONSTRUCTOR=63, NULL=64, FUN=65, RETC=66, 
		TRUE=67, FALSE=68, MAIN=69, CHR=70, STR=71, ID=72, NUM=73, FN=74, DIGIT=75, 
		WS=76, COMMENT=77, COMMENT2=78;
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
			"IMPORT", "VAL", "VAR", "OVERRIDE", "CLASS", "ABSTRACT", "INTERFACE", 
			"GET", "CONSTRUCTOR", "NULL", "FUN", "RETC", "TRUE", "FALSE", "MAIN", 
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
			"'Any'", "'Char'", "'package'", "'import'", "'val'", "'var'", "'override'", 
			"'class'", "'abstract'", "'interface'", "'get()'", "'constructor'", "'null'", 
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
			"CHAR", "PACKAGE", "IMPORT", "VAL", "VAR", "OVERRIDE", "CLASS", "ABSTRACT", 
			"INTERFACE", "GET", "CONSTRUCTOR", "NULL", "FUN", "RETC", "TRUE", "FALSE", 
			"MAIN", "CHR", "STR", "ID", "NUM", "FN", "DIGIT", "WS", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0207\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\3"+
		"8\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3"+
		"B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3H\3H\7H\u01c5\nH\fH\16H\u01c8\13H\3H\3H\3I\3I\3I\7I\u01cf"+
		"\nI\fI\16I\u01d2\13I\3J\5J\u01d5\nJ\3J\6J\u01d8\nJ\rJ\16J\u01d9\3J\3J"+
		"\6J\u01de\nJ\rJ\16J\u01df\5J\u01e2\nJ\3K\3K\3L\3L\3M\6M\u01e9\nM\rM\16"+
		"M\u01ea\3M\3M\3N\3N\3N\3N\7N\u01f3\nN\fN\16N\u01f6\13N\3N\3N\3O\3O\3O"+
		"\3O\7O\u01fe\nO\fO\16O\u0201\13O\3O\3O\3O\3O\3O\3\u01ff\2P\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\3\2\7\4\2\f\f\17\17\5\2\f"+
		"\f\17\17$$\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0210\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2\2\5\u00a1"+
		"\3\2\2\2\7\u00a4\3\2\2\2\t\u00a7\3\2\2\2\13\u00aa\3\2\2\2\r\u00ad\3\2"+
		"\2\2\17\u00b0\3\2\2\2\21\u00b2\3\2\2\2\23\u00b4\3\2\2\2\25\u00b7\3\2\2"+
		"\2\27\u00ba\3\2\2\2\31\u00bd\3\2\2\2\33\u00c0\3\2\2\2\35\u00c3\3\2\2\2"+
		"\37\u00c6\3\2\2\2!\u00c9\3\2\2\2#\u00cc\3\2\2\2%\u00cf\3\2\2\2\'\u00d1"+
		"\3\2\2\2)\u00d3\3\2\2\2+\u00d5\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61"+
		"\u00db\3\2\2\2\63\u00dd\3\2\2\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3"+
		"\3\2\2\2;\u00e5\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00eb\3\2\2\2C"+
		"\u00ed\3\2\2\2E\u00ef\3\2\2\2G\u00f2\3\2\2\2I\u00f6\3\2\2\2K\u00f9\3\2"+
		"\2\2M\u00fd\3\2\2\2O\u0100\3\2\2\2Q\u0105\3\2\2\2S\u0109\3\2\2\2U\u010f"+
		"\3\2\2\2W\u0117\3\2\2\2Y\u011c\3\2\2\2[\u0122\3\2\2\2]\u0127\3\2\2\2_"+
		"\u012d\3\2\2\2a\u0134\3\2\2\2c\u0138\3\2\2\2e\u013f\3\2\2\2g\u0144\3\2"+
		"\2\2i\u014a\3\2\2\2k\u014e\3\2\2\2m\u0153\3\2\2\2o\u015b\3\2\2\2q\u0162"+
		"\3\2\2\2s\u0166\3\2\2\2u\u016a\3\2\2\2w\u0173\3\2\2\2y\u0179\3\2\2\2{"+
		"\u0182\3\2\2\2}\u018c\3\2\2\2\177\u0192\3\2\2\2\u0081\u019e\3\2\2\2\u0083"+
		"\u01a3\3\2\2\2\u0085\u01a7\3\2\2\2\u0087\u01ae\3\2\2\2\u0089\u01b3\3\2"+
		"\2\2\u008b\u01b9\3\2\2\2\u008d\u01be\3\2\2\2\u008f\u01c2\3\2\2\2\u0091"+
		"\u01cb\3\2\2\2\u0093\u01d4\3\2\2\2\u0095\u01e3\3\2\2\2\u0097\u01e5\3\2"+
		"\2\2\u0099\u01e8\3\2\2\2\u009b\u01ee\3\2\2\2\u009d\u01f9\3\2\2\2\u009f"+
		"\u00a0\7=\2\2\u00a0\4\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\7\60\2"+
		"\2\u00a3\6\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7?\2\2\u00a6\b\3\2\2"+
		"\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\7?\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7"+
		"@\2\2\u00ab\u00ac\7?\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af"+
		"\7?\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\20\3\2\2\2\u00b2\u00b3"+
		"\7>\2\2\u00b3\22\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\u00b6\7?\2\2\u00b6\24"+
		"\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7?\2\2\u00b9\26\3\2\2\2\u00ba"+
		"\u00bb\7,\2\2\u00bb\u00bc\7?\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7\61\2\2"+
		"\u00be\u00bf\7?\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7"+
		"?\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4\u00c5\7-\2\2\u00c5\36"+
		"\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\7/\2\2\u00c8 \3\2\2\2\u00c9\u00ca"+
		"\7(\2\2\u00ca\u00cb\7(\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7~\2\2\u00cd\u00ce"+
		"\7~\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0&\3\2\2\2\u00d1\u00d2"+
		"\7.\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4*\3\2\2\2\u00d5\u00d6\7"+
		"+\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8.\3\2\2\2\u00d9\u00da\7\177"+
		"\2\2\u00da\60\3\2\2\2\u00db\u00dc\7]\2\2\u00dc\62\3\2\2\2\u00dd\u00de"+
		"\7_\2\2\u00de\64\3\2\2\2\u00df\u00e0\7<\2\2\u00e0\66\3\2\2\2\u00e1\u00e2"+
		"\7A\2\2\u00e28\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7"+
		"\61\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7\'\2\2\u00e8>\3\2\2\2\u00e9\u00ea"+
		"\7?\2\2\u00ea@\3\2\2\2\u00eb\u00ec\7-\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7"+
		"/\2\2\u00eeD\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1F\3\2"+
		"\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5H\3"+
		"\2\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7u\2\2\u00f8J\3\2\2\2\u00f9\u00fa"+
		"\7#\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7u\2\2\u00fcL\3\2\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7h\2\2\u00ffN\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104P\3\2\2\2\u0105\u0106"+
		"\7h\2\2\u0106\u0107\7q\2\2\u0107\u0108\7t\2\2\u0108R\3\2\2\2\u0109\u010a"+
		"\7y\2\2\u010a\u010b\7j\2\2\u010b\u010c\7k\2\2\u010c\u010d\7n\2\2\u010d"+
		"\u010e\7g\2\2\u010eT\3\2\2\2\u010f\u0110\7D\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7q\2\2\u0112\u0113\7n\2\2\u0113\u0114\7g\2\2\u0114\u0115\7c\2\2"+
		"\u0115\u0116\7p\2\2\u0116V\3\2\2\2\u0117\u0118\7D\2\2\u0118\u0119\7{\2"+
		"\2\u0119\u011a\7v\2\2\u011a\u011b\7g\2\2\u011bX\3\2\2\2\u011c\u011d\7"+
		"U\2\2\u011d\u011e\7j\2\2\u011e\u011f\7q\2\2\u011f\u0120\7t\2\2\u0120\u0121"+
		"\7v\2\2\u0121Z\3\2\2\2\u0122\u0123\7N\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7p\2\2\u0125\u0126\7i\2\2\u0126\\\3\2\2\2\u0127\u0128\7H\2\2\u0128\u0129"+
		"\7n\2\2\u0129\u012a\7q\2\2\u012a\u012b\7c\2\2\u012b\u012c\7v\2\2\u012c"+
		"^\3\2\2\2\u012d\u012e\7F\2\2\u012e\u012f\7q\2\2\u012f\u0130\7w\2\2\u0130"+
		"\u0131\7d\2\2\u0131\u0132\7n\2\2\u0132\u0133\7g\2\2\u0133`\3\2\2\2\u0134"+
		"\u0135\7K\2\2\u0135\u0136\7p\2\2\u0136\u0137\7v\2\2\u0137b\3\2\2\2\u0138"+
		"\u0139\7U\2\2\u0139\u013a\7v\2\2\u013a\u013b\7t\2\2\u013b\u013c\7k\2\2"+
		"\u013c\u013d\7p\2\2\u013d\u013e\7i\2\2\u013ed\3\2\2\2\u013f\u0140\7W\2"+
		"\2\u0140\u0141\7p\2\2\u0141\u0142\7k\2\2\u0142\u0143\7v\2\2\u0143f\3\2"+
		"\2\2\u0144\u0145\7C\2\2\u0145\u0146\7p\2\2\u0146\u0147\7{\2\2\u0147\u0148"+
		"\7*\2\2\u0148\u0149\7+\2\2\u0149h\3\2\2\2\u014a\u014b\7C\2\2\u014b\u014c"+
		"\7p\2\2\u014c\u014d\7{\2\2\u014dj\3\2\2\2\u014e\u014f\7E\2\2\u014f\u0150"+
		"\7j\2\2\u0150\u0151\7c\2\2\u0151\u0152\7t\2\2\u0152l\3\2\2\2\u0153\u0154"+
		"\7r\2\2\u0154\u0155\7c\2\2\u0155\u0156\7e\2\2\u0156\u0157\7m\2\2\u0157"+
		"\u0158\7c\2\2\u0158\u0159\7i\2\2\u0159\u015a\7g\2\2\u015an\3\2\2\2\u015b"+
		"\u015c\7k\2\2\u015c\u015d\7o\2\2\u015d\u015e\7r\2\2\u015e\u015f\7q\2\2"+
		"\u015f\u0160\7t\2\2\u0160\u0161\7v\2\2\u0161p\3\2\2\2\u0162\u0163\7x\2"+
		"\2\u0163\u0164\7c\2\2\u0164\u0165\7n\2\2\u0165r\3\2\2\2\u0166\u0167\7"+
		"x\2\2\u0167\u0168\7c\2\2\u0168\u0169\7t\2\2\u0169t\3\2\2\2\u016a\u016b"+
		"\7q\2\2\u016b\u016c\7x\2\2\u016c\u016d\7g\2\2\u016d\u016e\7t\2\2\u016e"+
		"\u016f\7t\2\2\u016f\u0170\7k\2\2\u0170\u0171\7f\2\2\u0171\u0172\7g\2\2"+
		"\u0172v\3\2\2\2\u0173\u0174\7e\2\2\u0174\u0175\7n\2\2\u0175\u0176\7c\2"+
		"\2\u0176\u0177\7u\2\2\u0177\u0178\7u\2\2\u0178x\3\2\2\2\u0179\u017a\7"+
		"c\2\2\u017a\u017b\7d\2\2\u017b\u017c\7u\2\2\u017c\u017d\7v\2\2\u017d\u017e"+
		"\7t\2\2\u017e\u017f\7c\2\2\u017f\u0180\7e\2\2\u0180\u0181\7v\2\2\u0181"+
		"z\3\2\2\2\u0182\u0183\7k\2\2\u0183\u0184\7p\2\2\u0184\u0185\7v\2\2\u0185"+
		"\u0186\7g\2\2\u0186\u0187\7t\2\2\u0187\u0188\7h\2\2\u0188\u0189\7c\2\2"+
		"\u0189\u018a\7e\2\2\u018a\u018b\7g\2\2\u018b|\3\2\2\2\u018c\u018d\7i\2"+
		"\2\u018d\u018e\7g\2\2\u018e\u018f\7v\2\2\u018f\u0190\7*\2\2\u0190\u0191"+
		"\7+\2\2\u0191~\3\2\2\2\u0192\u0193\7e\2\2\u0193\u0194\7q\2\2\u0194\u0195"+
		"\7p\2\2\u0195\u0196\7u\2\2\u0196\u0197\7v\2\2\u0197\u0198\7t\2\2\u0198"+
		"\u0199\7w\2\2\u0199\u019a\7e\2\2\u019a\u019b\7v\2\2\u019b\u019c\7q\2\2"+
		"\u019c\u019d\7t\2\2\u019d\u0080\3\2\2\2\u019e\u019f\7p\2\2\u019f\u01a0"+
		"\7w\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7n\2\2\u01a2\u0082\3\2\2\2\u01a3"+
		"\u01a4\7h\2\2\u01a4\u01a5\7w\2\2\u01a5\u01a6\7p\2\2\u01a6\u0084\3\2\2"+
		"\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab"+
		"\7w\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7p\2\2\u01ad\u0086\3\2\2\2\u01ae"+
		"\u01af\7v\2\2\u01af\u01b0\7t\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7g\2\2"+
		"\u01b2\u0088\3\2\2\2\u01b3\u01b4\7h\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6"+
		"\7n\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8\7g\2\2\u01b8\u008a\3\2\2\2\u01b9"+
		"\u01ba\7o\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7p\2\2"+
		"\u01bd\u008c\3\2\2\2\u01be\u01bf\7)\2\2\u01bf\u01c0\n\2\2\2\u01c0\u01c1"+
		"\7)\2\2\u01c1\u008e\3\2\2\2\u01c2\u01c6\7$\2\2\u01c3\u01c5\n\3\2\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7$\2\2\u01ca"+
		"\u0090\3\2\2\2\u01cb\u01d0\5\u0095K\2\u01cc\u01cf\5\u0095K\2\u01cd\u01cf"+
		"\5\u0097L\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2"+
		"\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u0092\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d3\u01d5\7/\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01d8\5\u0097L\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01e1\3\2\2\2\u01db"+
		"\u01dd\5%\23\2\u01dc\u01de\5\u0097L\2\u01dd\u01dc\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1"+
		"\u01db\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u0094\3\2\2\2\u01e3\u01e4\t\4"+
		"\2\2\u01e4\u0096\3\2\2\2\u01e5\u01e6\t\5\2\2\u01e6\u0098\3\2\2\2\u01e7"+
		"\u01e9\t\6\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\bM\2\2\u01ed"+
		"\u009a\3\2\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f4\3"+
		"\2\2\2\u01f1\u01f3\n\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f7\u01f8\bN\2\2\u01f8\u009c\3\2\2\2\u01f9\u01fa\7\61\2\2\u01fa"+
		"\u01fb\7,\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fe\13\2\2\2\u01fd\u01fc\3\2"+
		"\2\2\u01fe\u0201\3\2\2\2\u01ff\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200"+
		"\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7,\2\2\u0203\u0204\7\61"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0206\bO\2\2\u0206\u009e\3\2\2\2\r\2\u01c6"+
		"\u01ce\u01d0\u01d4\u01d9\u01df\u01e1\u01ea\u01f4\u01ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}