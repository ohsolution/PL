// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/pretest/t2/Kotlin.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_packageR = 1, RULE_importL = 2, RULE_importR = 3, 
		RULE_outerL = 4, RULE_outerR = 5, RULE_mainf = 6, RULE_functionD = 7, 
		RULE_argument = 8, RULE_whichfunction = 9, RULE_assign = 10, RULE_assignopr = 11, 
		RULE_innerblock = 12, RULE_statement = 13, RULE_forloop = 14, RULE_whileloop = 15, 
		RULE_ifthenelse = 16, RULE_elif = 17, RULE_exit = 18, RULE_expression = 19, 
		RULE_expor = 20, RULE_expand = 21, RULE_expeq = 22, RULE_expcmp = 23, 
		RULE_exppre = 24, RULE_expR = 25, RULE_expadd = 26, RULE_expmul = 27, 
		RULE_prefixexp = 28, RULE_exppostfix = 29, RULE_fccall = 30, RULE_argus = 31, 
		RULE_argu = 32, RULE_oprpostfix = 33, RULE_prefixopr = 34, RULE_mulopr = 35, 
		RULE_addopr = 36, RULE_inopr = 37, RULE_isopr = 38, RULE_eqopr = 39, RULE_cmpopr = 40, 
		RULE_variableD = 41, RULE_propertyD = 42, RULE_typef = 43, RULE_value = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "packageR", "importL", "importR", "outerL", "outerR", "mainf", 
			"functionD", "argument", "whichfunction", "assign", "assignopr", "innerblock", 
			"statement", "forloop", "whileloop", "ifthenelse", "elif", "exit", "expression", 
			"expor", "expand", "expeq", "expcmp", "exppre", "expR", "expadd", "expmul", 
			"prefixexp", "exppostfix", "fccall", "argus", "argu", "oprpostfix", "prefixopr", 
			"mulopr", "addopr", "inopr", "isopr", "eqopr", "cmpopr", "variableD", 
			"propertyD", "typef", "value"
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

	@Override
	public String getGrammarFileName() { return "Kotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainfContext mainf() {
			return getRuleContext(MainfContext.class,0);
		}
		public PackageRContext packageR() {
			return getRuleContext(PackageRContext.class,0);
		}
		public ImportLContext importL() {
			return getRuleContext(ImportLContext.class,0);
		}
		public List<OuterLContext> outerL() {
			return getRuleContexts(OuterLContext.class);
		}
		public OuterLContext outerL(int i) {
			return getRuleContext(OuterLContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(90);
				packageR();
				}
			}

			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(93);
				importL();
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(96);
				outerL();
				}
				break;
			}
			setState(99);
			mainf();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << FUN))) != 0)) {
				{
				setState(100);
				outerL();
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

	public static class PackageRContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KotlinParser.PACKAGE, 0); }
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public PackageRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageR; }
	}

	public final PackageRContext packageR() throws RecognitionException {
		PackageRContext _localctx = new PackageRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PACKAGE);
			setState(104);
			match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(105);
				match(DOT);
				setState(106);
				match(ID);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(112);
				match(SEMI);
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

	public static class ImportLContext extends ParserRuleContext {
		public List<ImportRContext> importR() {
			return getRuleContexts(ImportRContext.class);
		}
		public ImportRContext importR(int i) {
			return getRuleContext(ImportRContext.class,i);
		}
		public ImportLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importL; }
	}

	public final ImportLContext importL() throws RecognitionException {
		ImportLContext _localctx = new ImportLContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(115);
				importR();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ImportRContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public List<TerminalNode> MUL() { return getTokens(KotlinParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(KotlinParser.MUL, i);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IMPORT);
			setState(122);
			match(ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(123);
					match(DOT);
					setState(124);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(125);
					match(DOT);
					setState(126);
					match(ID);
					}
					break;
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(132);
				match(SEMI);
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

	public static class OuterLContext extends ParserRuleContext {
		public List<OuterRContext> outerR() {
			return getRuleContexts(OuterRContext.class);
		}
		public OuterRContext outerR(int i) {
			return getRuleContext(OuterRContext.class,i);
		}
		public OuterLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerL; }
	}

	public final OuterLContext outerL() throws RecognitionException {
		OuterLContext _localctx = new OuterLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outerL);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(135);
					outerR();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class OuterRContext extends ParserRuleContext {
		public FunctionDContext functionD() {
			return getRuleContext(FunctionDContext.class,0);
		}
		public PropertyDContext propertyD() {
			return getRuleContext(PropertyDContext.class,0);
		}
		public OuterRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerR; }
	}

	public final OuterRContext outerR() throws RecognitionException {
		OuterRContext _localctx = new OuterRContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outerR);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				functionD();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				propertyD();
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

	public static class MainfContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public TerminalNode MAIN() { return getToken(KotlinParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public MainfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainf; }
	}

	public final MainfContext mainf() throws RecognitionException {
		MainfContext _localctx = new MainfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FUN);
			setState(145);
			match(MAIN);
			setState(146);
			match(LPAR);
			setState(147);
			match(RPAR);
			setState(148);
			match(LB);
			setState(149);
			innerblock();
			setState(150);
			match(RB);
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

	public static class FunctionDContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public WhichfunctionContext whichfunction() {
			return getRuleContext(WhichfunctionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public FunctionDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionD; }
	}

	public final FunctionDContext functionD() throws RecognitionException {
		FunctionDContext _localctx = new FunctionDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FUN);
			setState(153);
			match(ID);
			setState(154);
			argument();
			setState(155);
			whichfunction();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(156);
				match(SEMI);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(KotlinParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KotlinParser.COLON, i);
		}
		public List<TypefContext> typef() {
			return getRuleContexts(TypefContext.class);
		}
		public TypefContext typef(int i) {
			return getRuleContext(TypefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LPAR);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(160);
				match(ID);
				setState(161);
				match(COLON);
				setState(162);
				typef();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(163);
					match(COMMA);
					}
				}

				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RPAR);
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

	public static class WhichfunctionContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(KotlinParser.QUERY, 0); }
		public WhichfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whichfunction; }
	}

	public final WhichfunctionContext whichfunction() throws RecognitionException {
		WhichfunctionContext _localctx = new WhichfunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whichfunction);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASN:
			case MASN:
			case MULASN:
			case DIVASN:
			case MODASN:
			case ASN:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				assign();
				}
				break;
			case LB:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(174);
					match(COLON);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << STRING) | (1L << UNIT) | (1L << ANY) | (1L << CHAR))) != 0)) {
						{
						setState(175);
						typef();
						}
					}

					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==QUERY) {
						{
						setState(178);
						match(QUERY);
						}
					}

					}
				}

				setState(183);
				match(LB);
				setState(184);
				innerblock();
				setState(185);
				match(RB);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignoprContext assignopr() {
			return getRuleContext(AssignoprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			assignopr();
			setState(190);
			expression();
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

	public static class AssignoprContext extends ParserRuleContext {
		public TerminalNode ASN() { return getToken(KotlinParser.ASN, 0); }
		public TerminalNode PASN() { return getToken(KotlinParser.PASN, 0); }
		public TerminalNode MASN() { return getToken(KotlinParser.MASN, 0); }
		public TerminalNode MULASN() { return getToken(KotlinParser.MULASN, 0); }
		public TerminalNode DIVASN() { return getToken(KotlinParser.DIVASN, 0); }
		public TerminalNode MODASN() { return getToken(KotlinParser.MODASN, 0); }
		public AssignoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignopr; }
	}

	public final AssignoprContext assignopr() throws RecognitionException {
		AssignoprContext _localctx = new AssignoprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PASN) | (1L << MASN) | (1L << MULASN) | (1L << DIVASN) | (1L << MODASN) | (1L << ASN))) != 0)) ) {
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

	public static class InnerblockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InnerblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerblock; }
	}

	public final InnerblockContext innerblock() throws RecognitionException {
		InnerblockContext _localctx = new InnerblockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_innerblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (DPULS - 14)) | (1L << (DMINUS - 14)) | (1L << (LPAR - 14)) | (1L << (LSQ - 14)) | (1L << (PULS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (FOR - 14)) | (1L << (WHILE - 14)) | (1L << (SUPERANY - 14)) | (1L << (VAL - 14)) | (1L << (VAR - 14)) | (1L << (NULL - 14)) | (1L << (FUN - 14)) | (1L << (RETC - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (CHR - 14)) | (1L << (STR - 14)) | (1L << (ID - 14)) | (1L << (NUM - 14)))) != 0)) {
				{
				{
				setState(194);
				statement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDContext variableD() {
			return getRuleContext(VariableDContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public FunctionDContext functionD() {
			return getRuleContext(FunctionDContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				variableD();
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(201);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				functionD();
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(205);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				expression();
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(209);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				exit();
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(213);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(ID);
				setState(217);
				assign();
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(218);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				forloop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				whileloop();
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KotlinParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FOR);
			setState(226);
			match(LPAR);
			setState(227);
			expression();
			setState(228);
			match(RPAR);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(229);
				match(LB);
				setState(230);
				innerblock();
				setState(231);
				match(RB);
				}
				}
				break;
			case DPULS:
			case DMINUS:
			case LPAR:
			case LSQ:
			case PULS:
			case MINUS:
			case IF:
			case FOR:
			case WHILE:
			case SUPERANY:
			case VAL:
			case VAR:
			case NULL:
			case FUN:
			case RETC:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				{
				setState(233);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(WHILE);
			setState(237);
			match(LPAR);
			setState(238);
			expression();
			setState(239);
			match(RPAR);
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(240);
				match(LB);
				setState(241);
				innerblock();
				setState(242);
				match(RB);
				}
				}
				break;
			case DPULS:
			case DMINUS:
			case LPAR:
			case LSQ:
			case PULS:
			case MINUS:
			case IF:
			case FOR:
			case WHILE:
			case SUPERANY:
			case VAL:
			case VAR:
			case NULL:
			case FUN:
			case RETC:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				{
				setState(244);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IfthenelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KotlinParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public IfthenelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelse; }
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IF);
			setState(248);
			match(LPAR);
			setState(249);
			expression();
			setState(250);
			match(RPAR);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(251);
				match(LB);
				setState(252);
				innerblock();
				setState(253);
				match(RB);
				}
				}
				break;
			case DPULS:
			case DMINUS:
			case LPAR:
			case LSQ:
			case PULS:
			case MINUS:
			case IF:
			case FOR:
			case WHILE:
			case SUPERANY:
			case VAL:
			case VAR:
			case NULL:
			case FUN:
			case RETC:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				{
				setState(255);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(258);
				elif();
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

	public static class ElifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elif);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(ELSE);
				setState(262);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ELSE);
				setState(264);
				match(LB);
				setState(265);
				innerblock();
				setState(266);
				match(RB);
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

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode RETC() { return getToken(KotlinParser.RETC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(RETC);
			setState(271);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExporContext expor() {
			return getRuleContext(ExporContext.class,0);
		}
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DPULS:
			case DMINUS:
			case LPAR:
			case LSQ:
			case PULS:
			case MINUS:
			case SUPERANY:
			case NULL:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				expor();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				ifthenelse();
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

	public static class ExporContext extends ParserRuleContext {
		public List<ExpandContext> expand() {
			return getRuleContexts(ExpandContext.class);
		}
		public ExpandContext expand(int i) {
			return getRuleContext(ExpandContext.class,i);
		}
		public List<TerminalNode> LOGICOR() { return getTokens(KotlinParser.LOGICOR); }
		public TerminalNode LOGICOR(int i) {
			return getToken(KotlinParser.LOGICOR, i);
		}
		public ExporContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expor; }
	}

	public final ExporContext expor() throws RecognitionException {
		ExporContext _localctx = new ExporContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expand();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(278);
				match(LOGICOR);
				setState(279);
				expand();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpandContext extends ParserRuleContext {
		public List<ExpeqContext> expeq() {
			return getRuleContexts(ExpeqContext.class);
		}
		public ExpeqContext expeq(int i) {
			return getRuleContext(ExpeqContext.class,i);
		}
		public List<TerminalNode> LOGICAND() { return getTokens(KotlinParser.LOGICAND); }
		public TerminalNode LOGICAND(int i) {
			return getToken(KotlinParser.LOGICAND, i);
		}
		public ExpandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expand; }
	}

	public final ExpandContext expand() throws RecognitionException {
		ExpandContext _localctx = new ExpandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expeq();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(286);
				match(LOGICAND);
				setState(287);
				expeq();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpeqContext extends ParserRuleContext {
		public List<ExpcmpContext> expcmp() {
			return getRuleContexts(ExpcmpContext.class);
		}
		public ExpcmpContext expcmp(int i) {
			return getRuleContext(ExpcmpContext.class,i);
		}
		public List<EqoprContext> eqopr() {
			return getRuleContexts(EqoprContext.class);
		}
		public EqoprContext eqopr(int i) {
			return getRuleContext(EqoprContext.class,i);
		}
		public ExpeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expeq; }
	}

	public final ExpeqContext expeq() throws RecognitionException {
		ExpeqContext _localctx = new ExpeqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expcmp();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(294);
				eqopr();
				setState(295);
				expcmp();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpcmpContext extends ParserRuleContext {
		public List<ExppreContext> exppre() {
			return getRuleContexts(ExppreContext.class);
		}
		public ExppreContext exppre(int i) {
			return getRuleContext(ExppreContext.class,i);
		}
		public List<CmpoprContext> cmpopr() {
			return getRuleContexts(CmpoprContext.class);
		}
		public CmpoprContext cmpopr(int i) {
			return getRuleContext(CmpoprContext.class,i);
		}
		public ExpcmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcmp; }
	}

	public final ExpcmpContext expcmp() throws RecognitionException {
		ExpcmpContext _localctx = new ExpcmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expcmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			exppre();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(303);
				cmpopr();
				setState(304);
				exppre();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExppreContext extends ParserRuleContext {
		public List<ExpRContext> expR() {
			return getRuleContexts(ExpRContext.class);
		}
		public ExpRContext expR(int i) {
			return getRuleContext(ExpRContext.class,i);
		}
		public List<InoprContext> inopr() {
			return getRuleContexts(InoprContext.class);
		}
		public InoprContext inopr(int i) {
			return getRuleContext(InoprContext.class,i);
		}
		public List<IsoprContext> isopr() {
			return getRuleContexts(IsoprContext.class);
		}
		public IsoprContext isopr(int i) {
			return getRuleContext(IsoprContext.class,i);
		}
		public List<TypefContext> typef() {
			return getRuleContexts(TypefContext.class);
		}
		public TypefContext typef(int i) {
			return getRuleContext(TypefContext.class,i);
		}
		public ExppreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exppre; }
	}

	public final ExppreContext exppre() throws RecognitionException {
		ExppreContext _localctx = new ExppreContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exppre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			expR();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NIN) | (1L << IS) | (1L << NIS))) != 0)) {
				{
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
				case NIN:
					{
					{
					setState(312);
					inopr();
					setState(313);
					expR();
					}
					}
					break;
				case IS:
				case NIS:
					{
					{
					setState(315);
					isopr();
					setState(316);
					typef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpRContext extends ParserRuleContext {
		public List<ExpaddContext> expadd() {
			return getRuleContexts(ExpaddContext.class);
		}
		public ExpaddContext expadd(int i) {
			return getRuleContext(ExpaddContext.class,i);
		}
		public List<TerminalNode> TWODOT() { return getTokens(KotlinParser.TWODOT); }
		public TerminalNode TWODOT(int i) {
			return getToken(KotlinParser.TWODOT, i);
		}
		public ExpRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expR; }
	}

	public final ExpRContext expR() throws RecognitionException {
		ExpRContext _localctx = new ExpRContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			expadd();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWODOT) {
				{
				{
				setState(324);
				match(TWODOT);
				setState(325);
				expadd();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpaddContext extends ParserRuleContext {
		public List<ExpmulContext> expmul() {
			return getRuleContexts(ExpmulContext.class);
		}
		public ExpmulContext expmul(int i) {
			return getRuleContext(ExpmulContext.class,i);
		}
		public List<AddoprContext> addopr() {
			return getRuleContexts(AddoprContext.class);
		}
		public AddoprContext addopr(int i) {
			return getRuleContext(AddoprContext.class,i);
		}
		public ExpaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expadd; }
	}

	public final ExpaddContext expadd() throws RecognitionException {
		ExpaddContext _localctx = new ExpaddContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expadd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			expmul();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					addopr();
					setState(333);
					expmul();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class ExpmulContext extends ParserRuleContext {
		public List<PrefixexpContext> prefixexp() {
			return getRuleContexts(PrefixexpContext.class);
		}
		public PrefixexpContext prefixexp(int i) {
			return getRuleContext(PrefixexpContext.class,i);
		}
		public List<MuloprContext> mulopr() {
			return getRuleContexts(MuloprContext.class);
		}
		public MuloprContext mulopr(int i) {
			return getRuleContext(MuloprContext.class,i);
		}
		public ExpmulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expmul; }
	}

	public final ExpmulContext expmul() throws RecognitionException {
		ExpmulContext _localctx = new ExpmulContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			prefixexp();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(341);
				mulopr();
				setState(342);
				prefixexp();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PrefixexpContext extends ParserRuleContext {
		public ExppostfixContext exppostfix() {
			return getRuleContext(ExppostfixContext.class,0);
		}
		public PrefixoprContext prefixopr() {
			return getRuleContext(PrefixoprContext.class,0);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_prefixexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << PULS) | (1L << MINUS))) != 0)) {
				{
				setState(349);
				prefixopr();
				}
			}

			setState(352);
			exppostfix();
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

	public static class ExppostfixContext extends ParserRuleContext {
		public FccallContext fccall() {
			return getRuleContext(FccallContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public OprpostfixContext oprpostfix() {
			return getRuleContext(OprpostfixContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public TerminalNode LSQ() { return getToken(KotlinParser.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(KotlinParser.RSQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExppostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exppostfix; }
	}

	public final ExppostfixContext exppostfix() throws RecognitionException {
		ExppostfixContext _localctx = new ExppostfixContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exppostfix);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				fccall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(ID);
				setState(356);
				oprpostfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(LPAR);
				setState(358);
				expression();
				setState(359);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(LSQ);
				setState(362);
				expression();
				setState(363);
				match(RSQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				value();
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

	public static class FccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public ArgusContext argus() {
			return getRuleContext(ArgusContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public FccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fccall; }
	}

	public final FccallContext fccall() throws RecognitionException {
		FccallContext _localctx = new FccallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ID);
			setState(369);
			match(LPAR);
			setState(370);
			argus();
			setState(371);
			match(RPAR);
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

	public static class ArgusContext extends ParserRuleContext {
		public List<ArguContext> argu() {
			return getRuleContexts(ArguContext.class);
		}
		public ArguContext argu(int i) {
			return getRuleContext(ArguContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ArgusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argus; }
	}

	public final ArgusContext argus() throws RecognitionException {
		ArgusContext _localctx = new ArgusContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (DPULS - 14)) | (1L << (DMINUS - 14)) | (1L << (LPAR - 14)) | (1L << (LSQ - 14)) | (1L << (PULS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (SUPERANY - 14)) | (1L << (NULL - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (CHR - 14)) | (1L << (STR - 14)) | (1L << (ID - 14)) | (1L << (NUM - 14)))) != 0)) {
				{
				setState(373);
				argu();
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376);
				match(COMMA);
				setState(377);
				argu();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArguContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argu; }
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argu);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				expression();
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

	public static class OprpostfixContext extends ParserRuleContext {
		public TerminalNode DPULS() { return getToken(KotlinParser.DPULS, 0); }
		public TerminalNode DMINUS() { return getToken(KotlinParser.DMINUS, 0); }
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<FccallContext> fccall() {
			return getRuleContexts(FccallContext.class);
		}
		public FccallContext fccall(int i) {
			return getRuleContext(FccallContext.class,i);
		}
		public OprpostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprpostfix; }
	}

	public final OprpostfixContext oprpostfix() throws RecognitionException {
		OprpostfixContext _localctx = new OprpostfixContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oprpostfix);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(DPULS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(DMINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(390);
					match(DOT);
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(391);
						match(ID);
						}
						break;
					case 2:
						{
						setState(392);
						fccall();
						}
						break;
					}
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class PrefixoprContext extends ParserRuleContext {
		public TerminalNode DPULS() { return getToken(KotlinParser.DPULS, 0); }
		public TerminalNode DMINUS() { return getToken(KotlinParser.DMINUS, 0); }
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public TerminalNode PULS() { return getToken(KotlinParser.PULS, 0); }
		public PrefixoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixopr; }
	}

	public final PrefixoprContext prefixopr() throws RecognitionException {
		PrefixoprContext _localctx = new PrefixoprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_prefixopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << PULS) | (1L << MINUS))) != 0)) ) {
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

	public static class MuloprContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(KotlinParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KotlinParser.MOD, 0); }
		public MuloprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulopr; }
	}

	public final MuloprContext mulopr() throws RecognitionException {
		MuloprContext _localctx = new MuloprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mulopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class AddoprContext extends ParserRuleContext {
		public TerminalNode PULS() { return getToken(KotlinParser.PULS, 0); }
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public AddoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addopr; }
	}

	public final AddoprContext addopr() throws RecognitionException {
		AddoprContext _localctx = new AddoprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_addopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==PULS || _la==MINUS) ) {
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

	public static class InoprContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public TerminalNode NIN() { return getToken(KotlinParser.NIN, 0); }
		public InoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inopr; }
	}

	public final InoprContext inopr() throws RecognitionException {
		InoprContext _localctx = new InoprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_inopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NIN) ) {
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

	public static class IsoprContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(KotlinParser.IS, 0); }
		public TerminalNode NIS() { return getToken(KotlinParser.NIS, 0); }
		public IsoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isopr; }
	}

	public final IsoprContext isopr() throws RecognitionException {
		IsoprContext _localctx = new IsoprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_isopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NIS) ) {
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

	public static class EqoprContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(KotlinParser.NEQ, 0); }
		public EqoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqopr; }
	}

	public final EqoprContext eqopr() throws RecognitionException {
		EqoprContext _localctx = new EqoprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_eqopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
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

	public static class CmpoprContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(KotlinParser.GT, 0); }
		public TerminalNode LT() { return getToken(KotlinParser.LT, 0); }
		public TerminalNode GE() { return getToken(KotlinParser.GE, 0); }
		public TerminalNode LE() { return getToken(KotlinParser.LE, 0); }
		public CmpoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpopr; }
	}

	public final CmpoprContext cmpopr() throws RecognitionException {
		CmpoprContext _localctx = new CmpoprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cmpopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) ) {
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

	public static class VariableDContext extends ParserRuleContext {
		public PropertyDContext propertyD() {
			return getRuleContext(PropertyDContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public VariableDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableD; }
	}

	public final VariableDContext variableD() throws RecognitionException {
		VariableDContext _localctx = new VariableDContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableD);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				propertyD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(418);
				match(ID);
				setState(419);
				match(COLON);
				setState(420);
				typef();
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

	public static class PropertyDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode ASN() { return getToken(KotlinParser.ASN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public PropertyDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyD; }
	}

	public final PropertyDContext propertyD() throws RecognitionException {
		PropertyDContext _localctx = new PropertyDContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(424);
			match(ID);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(425);
				match(COLON);
				setState(426);
				typef();
				}
			}

			setState(429);
			match(ASN);
			setState(430);
			expression();
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(431);
				match(SEMI);
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

	public static class TypefContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KotlinParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(KotlinParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(KotlinParser.STRING, 0); }
		public TerminalNode UNIT() { return getToken(KotlinParser.UNIT, 0); }
		public TerminalNode ANY() { return getToken(KotlinParser.ANY, 0); }
		public TerminalNode SHORT() { return getToken(KotlinParser.SHORT, 0); }
		public TerminalNode LONG() { return getToken(KotlinParser.LONG, 0); }
		public TerminalNode BOOL() { return getToken(KotlinParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(KotlinParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(KotlinParser.CHAR, 0); }
		public TypefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typef; }
	}

	public final TypefContext typef() throws RecognitionException {
		TypefContext _localctx = new TypefContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << STRING) | (1L << UNIT) | (1L << ANY) | (1L << CHAR))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(KotlinParser.STR, 0); }
		public TerminalNode NUM() { return getToken(KotlinParser.NUM, 0); }
		public TerminalNode NULL() { return getToken(KotlinParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(KotlinParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KotlinParser.FALSE, 0); }
		public TerminalNode CHR() { return getToken(KotlinParser.CHR, 0); }
		public TerminalNode SUPERANY() { return getToken(KotlinParser.SUPERANY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_value);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(STR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(NUM);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(NULL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(CHR);
				}
				break;
			case SUPERANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				match(SUPERANY);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\5\2^\n\2\3\2\5\2a\n\2\3\2\5\2d\n\2\3\2\3\2\5\2h\n"+
		"\2\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\5\3t\n\3\3\4\7\4w\n\4\f"+
		"\4\16\4z\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13"+
		"\5\3\5\5\5\u0088\n\5\3\6\6\6\u008b\n\6\r\6\16\6\u008c\3\7\3\7\5\7\u0091"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\7\n\u00a9\n\n\f\n\16\n\u00ac\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\5\13\u00b3\n\13\3\13\5\13\u00b6\n\13\5\13\u00b8"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\r\3\r\3\16\7\16"+
		"\u00c6\n\16\f\16\16\16\u00c9\13\16\3\17\3\17\5\17\u00cd\n\17\3\17\3\17"+
		"\5\17\u00d1\n\17\3\17\3\17\5\17\u00d5\n\17\3\17\3\17\5\17\u00d9\n\17\3"+
		"\17\3\17\3\17\5\17\u00de\n\17\3\17\3\17\5\17\u00e2\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ed\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0103\n\22\3\22\5\22\u0106\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u010f\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u0116\n\25"+
		"\3\26\3\26\3\26\7\26\u011b\n\26\f\26\16\26\u011e\13\26\3\27\3\27\3\27"+
		"\7\27\u0123\n\27\f\27\16\27\u0126\13\27\3\30\3\30\3\30\3\30\7\30\u012c"+
		"\n\30\f\30\16\30\u012f\13\30\3\31\3\31\3\31\3\31\7\31\u0135\n\31\f\31"+
		"\16\31\u0138\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0141\n\32"+
		"\f\32\16\32\u0144\13\32\3\33\3\33\3\33\7\33\u0149\n\33\f\33\16\33\u014c"+
		"\13\33\3\34\3\34\3\34\3\34\7\34\u0152\n\34\f\34\16\34\u0155\13\34\3\35"+
		"\3\35\3\35\3\35\7\35\u015b\n\35\f\35\16\35\u015e\13\35\3\36\5\36\u0161"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0171\n\37\3 \3 \3 \3 \3 \3!\5!\u0179\n!\3!\3!\7!\u017d\n!"+
		"\f!\16!\u0180\13!\3\"\3\"\3\"\5\"\u0185\n\"\3#\3#\3#\3#\3#\5#\u018c\n"+
		"#\7#\u018e\n#\f#\16#\u0191\13#\5#\u0193\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u01a8\n+\3,\3,\3,\3,\5,\u01ae\n,\3"+
		",\3,\3,\5,\u01b3\n,\3-\3-\3.\3.\3.\3.\3.\3.\5.\u01bd\n.\3.\2\2/\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\2\r\4\2\13\17!!\4\2\20\21\"#\3\2\36 \3\2\"#\3\2$%\3\2&\'\3\2\5\6\3"+
		"\2\7\n\3\2:;\4\2,\64\66\67\3\2?@\2\u01d4\2]\3\2\2\2\4i\3\2\2\2\6x\3\2"+
		"\2\2\b{\3\2\2\2\n\u008a\3\2\2\2\f\u0090\3\2\2\2\16\u0092\3\2\2\2\20\u009a"+
		"\3\2\2\2\22\u00a1\3\2\2\2\24\u00bd\3\2\2\2\26\u00bf\3\2\2\2\30\u00c2\3"+
		"\2\2\2\32\u00c7\3\2\2\2\34\u00e1\3\2\2\2\36\u00e3\3\2\2\2 \u00ee\3\2\2"+
		"\2\"\u00f9\3\2\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2(\u0115\3\2\2\2*\u0117"+
		"\3\2\2\2,\u011f\3\2\2\2.\u0127\3\2\2\2\60\u0130\3\2\2\2\62\u0139\3\2\2"+
		"\2\64\u0145\3\2\2\2\66\u014d\3\2\2\28\u0156\3\2\2\2:\u0160\3\2\2\2<\u0170"+
		"\3\2\2\2>\u0172\3\2\2\2@\u0178\3\2\2\2B\u0184\3\2\2\2D\u0192\3\2\2\2F"+
		"\u0194\3\2\2\2H\u0196\3\2\2\2J\u0198\3\2\2\2L\u019a\3\2\2\2N\u019c\3\2"+
		"\2\2P\u019e\3\2\2\2R\u01a0\3\2\2\2T\u01a7\3\2\2\2V\u01a9\3\2\2\2X\u01b4"+
		"\3\2\2\2Z\u01bc\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5"+
		"\6\4\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5\n\6\2cb\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2eg\5\16\b\2fh\5\n\6\2gf\3\2\2\2gh\3\2\2\2h\3\3\2\2\2ij\78\2\2jo"+
		"\7D\2\2kl\7\24\2\2ln\7D\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps"+
		"\3\2\2\2qo\3\2\2\2rt\7\3\2\2sr\3\2\2\2st\3\2\2\2t\5\3\2\2\2uw\5\b\5\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2zx\3\2\2\2{|\79\2\2"+
		"|\u0083\7D\2\2}~\7\24\2\2~\u0082\7\36\2\2\177\u0080\7\24\2\2\u0080\u0082"+
		"\7D\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\7\3\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\t\3\2\2\2"+
		"\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\13\3\2\2\2\u008e\u0091\5\20\t\2\u008f"+
		"\u0091\5V,\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\r\3\2\2\2\u0092"+
		"\u0093\7=\2\2\u0093\u0094\7A\2\2\u0094\u0095\7\26\2\2\u0095\u0096\7\27"+
		"\2\2\u0096\u0097\7\30\2\2\u0097\u0098\5\32\16\2\u0098\u0099\7\31\2\2\u0099"+
		"\17\3\2\2\2\u009a\u009b\7=\2\2\u009b\u009c\7D\2\2\u009c\u009d\5\22\n\2"+
		"\u009d\u009f\5\24\13\2\u009e\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00aa\7\26\2\2\u00a2\u00a3\7D\2\2\u00a3"+
		"\u00a4\7\34\2\2\u00a4\u00a6\5X-\2\u00a5\u00a7\7\25\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\27\2\2\u00ae\23\3\2\2\2\u00af\u00be"+
		"\5\26\f\2\u00b0\u00b2\7\34\2\2\u00b1\u00b3\5X-\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\7\35\2\2\u00b5\u00b4\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00bb\5"+
		"\32\16\2\u00bb\u00bc\7\31\2\2\u00bc\u00be\3\2\2\2\u00bd\u00af\3\2\2\2"+
		"\u00bd\u00b7\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1"+
		"\5(\25\2\u00c1\27\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c6"+
		"\5\34\17\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc"+
		"\5T+\2\u00cb\u00cd\7\3\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00e2\3\2\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00d1\7\3\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00e2\3\2\2\2\u00d2\u00d4\5(\25\2\u00d3"+
		"\u00d5\7\3\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00e2\3\2"+
		"\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d9\7\3\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00e2\3\2\2\2\u00da\u00db\7D\2\2\u00db\u00dd\5\26"+
		"\f\2\u00dc\u00de\7\3\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e2\3\2\2\2\u00df\u00e2\5\36\20\2\u00e0\u00e2\5 \21\2\u00e1\u00ca\3"+
		"\2\2\2\u00e1\u00ce\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00da\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\35\3\2\2"+
		"\2\u00e3\u00e4\7*\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\5(\25\2\u00e6\u00ec"+
		"\7\27\2\2\u00e7\u00e8\7\30\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\7\31"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00e7\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\37\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef\u00f0\7\26\2"+
		"\2\u00f0\u00f1\5(\25\2\u00f1\u00f7\7\27\2\2\u00f2\u00f3\7\30\2\2\u00f3"+
		"\u00f4\5\32\16\2\u00f4\u00f5\7\31\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8"+
		"\5\34\17\2\u00f7\u00f2\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8!\3\2\2\2\u00f9"+
		"\u00fa\7(\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\5(\25\2\u00fc\u0102\7\27"+
		"\2\2\u00fd\u00fe\7\30\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\7\31\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u0103\5\34\17\2\u0102\u00fd\3\2\2\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5$\23\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106#\3\2\2\2\u0107\u0108\7)\2\2\u0108\u010f\5\34\17\2"+
		"\u0109\u010a\7)\2\2\u010a\u010b\7\30\2\2\u010b\u010c\5\32\16\2\u010c\u010d"+
		"\7\31\2\2\u010d\u010f\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0109\3\2\2\2"+
		"\u010f%\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\5(\25\2\u0112\'\3\2\2\2"+
		"\u0113\u0116\5*\26\2\u0114\u0116\5\"\22\2\u0115\u0113\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116)\3\2\2\2\u0117\u011c\5,\27\2\u0118\u0119\7\23\2\2\u0119"+
		"\u011b\5,\27\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0124"+
		"\5.\30\2\u0120\u0121\7\22\2\2\u0121\u0123\5.\30\2\u0122\u0120\3\2\2\2"+
		"\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125-\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0127\u012d\5\60\31\2\u0128\u0129\5P)\2\u0129"+
		"\u012a\5\60\31\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e/\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0136\5\62\32\2\u0131\u0132\5R*\2\u0132\u0133\5\62\32\2"+
		"\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\61\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u0142\5\64\33\2\u013a\u013b\5L\'\2\u013b\u013c\5\64\33\2\u013c\u0141"+
		"\3\2\2\2\u013d\u013e\5N(\2\u013e\u013f\5X-\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013a\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\63\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u014a"+
		"\5\66\34\2\u0146\u0147\7\4\2\2\u0147\u0149\5\66\34\2\u0148\u0146\3\2\2"+
		"\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\65"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0153\58\35\2\u014e\u014f\5J&\2\u014f"+
		"\u0150\58\35\2\u0150\u0152\3\2\2\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\67\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u015c\5:\36\2\u0157\u0158\5H%\2\u0158\u0159\5:\36\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d9\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161"+
		"\5F$\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\5<\37\2\u0163;\3\2\2\2\u0164\u0171\5> \2\u0165\u0166\7D\2\2\u0166"+
		"\u0171\5D#\2\u0167\u0168\7\26\2\2\u0168\u0169\5(\25\2\u0169\u016a\7\27"+
		"\2\2\u016a\u0171\3\2\2\2\u016b\u016c\7\32\2\2\u016c\u016d\5(\25\2\u016d"+
		"\u016e\7\33\2\2\u016e\u0171\3\2\2\2\u016f\u0171\5Z.\2\u0170\u0164\3\2"+
		"\2\2\u0170\u0165\3\2\2\2\u0170\u0167\3\2\2\2\u0170\u016b\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171=\3\2\2\2\u0172\u0173\7D\2\2\u0173\u0174\7\26\2\2"+
		"\u0174\u0175\5@!\2\u0175\u0176\7\27\2\2\u0176?\3\2\2\2\u0177\u0179\5B"+
		"\"\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017e\3\2\2\2\u017a"+
		"\u017b\7\25\2\2\u017b\u017d\5B\"\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017fA\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0185\7D\2\2\u0182\u0185\5Z.\2\u0183\u0185\5(\25\2\u0184"+
		"\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185C\3\2\2\2"+
		"\u0186\u0193\7\20\2\2\u0187\u0193\7\21\2\2\u0188\u018b\7\24\2\2\u0189"+
		"\u018c\7D\2\2\u018a\u018c\5> \2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2"+
		"\2\u018c\u018e\3\2\2\2\u018d\u0188\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0186\3\2\2\2\u0192\u0187\3\2\2\2\u0192\u018f\3\2\2\2\u0193E\3\2\2\2"+
		"\u0194\u0195\t\3\2\2\u0195G\3\2\2\2\u0196\u0197\t\4\2\2\u0197I\3\2\2\2"+
		"\u0198\u0199\t\5\2\2\u0199K\3\2\2\2\u019a\u019b\t\6\2\2\u019bM\3\2\2\2"+
		"\u019c\u019d\t\7\2\2\u019dO\3\2\2\2\u019e\u019f\t\b\2\2\u019fQ\3\2\2\2"+
		"\u01a0\u01a1\t\t\2\2\u01a1S\3\2\2\2\u01a2\u01a8\5V,\2\u01a3\u01a4\t\n"+
		"\2\2\u01a4\u01a5\7D\2\2\u01a5\u01a6\7\34\2\2\u01a6\u01a8\5X-\2\u01a7\u01a2"+
		"\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8U\3\2\2\2\u01a9\u01aa\t\n\2\2\u01aa"+
		"\u01ad\7D\2\2\u01ab\u01ac\7\34\2\2\u01ac\u01ae\5X-\2\u01ad\u01ab\3\2\2"+
		"\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7!\2\2\u01b0\u01b2"+
		"\5(\25\2\u01b1\u01b3\7\3\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"W\3\2\2\2\u01b4\u01b5\t\13\2\2\u01b5Y\3\2\2\2\u01b6\u01bd\7C\2\2\u01b7"+
		"\u01bd\7E\2\2\u01b8\u01bd\7<\2\2\u01b9\u01bd\t\f\2\2\u01ba\u01bd\7B\2"+
		"\2\u01bb\u01bd\7\65\2\2\u01bc\u01b6\3\2\2\2\u01bc\u01b7\3\2\2\2\u01bc"+
		"\u01b8\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2"+
		"\2\2\u01bd[\3\2\2\2\67]`cgosx\u0081\u0083\u0087\u008c\u0090\u009f\u00a6"+
		"\u00aa\u00b2\u00b5\u00b7\u00bd\u00c7\u00cc\u00d0\u00d4\u00d8\u00dd\u00e1"+
		"\u00ec\u00f7\u0102\u0105\u010e\u0115\u011c\u0124\u012d\u0136\u0140\u0142"+
		"\u014a\u0153\u015c\u0160\u0170\u0178\u017e\u0184\u018b\u018f\u0192\u01a7"+
		"\u01ad\u01b2\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}