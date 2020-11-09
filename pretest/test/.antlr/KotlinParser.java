// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/pretest/test/Kotlin.g4 by ANTLR 4.8
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
		IS=36, NIS=37, IF=38, ELSE=39, BOOL=40, BYTE=41, SHORT=42, LONG=43, FLOAT=44, 
		DOUBLE=45, INT=46, STRING=47, UNIT=48, ANY=49, CHAR=50, PACKAGE=51, IMPORT=52, 
		VAL=53, VAR=54, NULL=55, FUN=56, RETC=57, TRUE=58, FALSE=59, CHR=60, STR=61, 
		ID=62, NUM=63, FN=64, DIGIT=65, WS=66, COMMENT=67, COMMENT2=68;
	public static final int
		RULE_prog = 0, RULE_packageR = 1, RULE_importL = 2, RULE_importR = 3, 
		RULE_outerL = 4, RULE_outerR = 5, RULE_functionD = 6, RULE_argument = 7, 
		RULE_whichfunction = 8, RULE_assign = 9, RULE_assignopr = 10, RULE_innerblock = 11, 
		RULE_statement = 12, RULE_ifthenelse = 13, RULE_elif = 14, RULE_exit = 15, 
		RULE_expression = 16, RULE_expor = 17, RULE_expand = 18, RULE_expeq = 19, 
		RULE_expcmp = 20, RULE_exppre = 21, RULE_expR = 22, RULE_expadd = 23, 
		RULE_expmul = 24, RULE_prefixexp = 25, RULE_exppostfix = 26, RULE_fccall = 27, 
		RULE_argu = 28, RULE_oprpostfix = 29, RULE_prefixopr = 30, RULE_mulopr = 31, 
		RULE_addopr = 32, RULE_inopr = 33, RULE_isopr = 34, RULE_eqopr = 35, RULE_cmpopr = 36, 
		RULE_variableD = 37, RULE_propertyD = 38, RULE_typef = 39, RULE_value = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "packageR", "importL", "importR", "outerL", "outerR", "functionD", 
			"argument", "whichfunction", "assign", "assignopr", "innerblock", "statement", 
			"ifthenelse", "elif", "exit", "expression", "expor", "expand", "expeq", 
			"expcmp", "exppre", "expR", "expadd", "expmul", "prefixexp", "exppostfix", 
			"fccall", "argu", "oprpostfix", "prefixopr", "mulopr", "addopr", "inopr", 
			"isopr", "eqopr", "cmpopr", "variableD", "propertyD", "typef", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'..'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'&&'", "'||'", "'.'", 
			"','", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'?'", "'*'", 
			"'/'", "'%'", "'='", "'+'", "'-'", "'in'", "'!in'", "'is'", "'!is'", 
			"'if'", "'else'", "'Boolean'", "'Byte'", "'Short'", "'Long'", "'Float'", 
			"'Double'", "'Int'", "'String'", "'Unit'", "'Any'", "'Char'", "'package'", 
			"'import'", "'val'", "'var'", "'null'", "'fun'", "'return'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "TWODOT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "PASN", 
			"MASN", "MULASN", "DIVASN", "MODASN", "DPULS", "DMINUS", "LOGICAND", 
			"LOGICOR", "DOT", "COMMA", "LPAR", "RPAR", "LB", "RB", "LSQ", "RSQ", 
			"COLON", "QUERY", "MUL", "DIV", "MOD", "ASN", "PULS", "MINUS", "IN", 
			"NIN", "IS", "NIS", "IF", "ELSE", "BOOL", "BYTE", "SHORT", "LONG", "FLOAT", 
			"DOUBLE", "INT", "STRING", "UNIT", "ANY", "CHAR", "PACKAGE", "IMPORT", 
			"VAL", "VAR", "NULL", "FUN", "RETC", "TRUE", "FALSE", "CHR", "STR", "ID", 
			"NUM", "FN", "DIGIT", "WS", "COMMENT", "COMMENT2"
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
		public PackageRContext packageR() {
			return getRuleContext(PackageRContext.class,0);
		}
		public ImportLContext importL() {
			return getRuleContext(ImportLContext.class,0);
		}
		public OuterLContext outerL() {
			return getRuleContext(OuterLContext.class,0);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(82);
				packageR();
				}
			}

			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(85);
				importL();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << FUN))) != 0)) {
				{
				setState(88);
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
			setState(91);
			match(PACKAGE);
			setState(92);
			match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(93);
				match(DOT);
				setState(94);
				match(ID);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(100);
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(103);
				importR();
				}
				}
				setState(108);
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
			setState(109);
			match(IMPORT);
			setState(110);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(111);
					match(DOT);
					setState(112);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(113);
					match(DOT);
					setState(114);
					match(ID);
					}
					break;
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(120);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				outerR();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << FUN))) != 0) );
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				functionD();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
		enterRule(_localctx, 12, RULE_functionD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FUN);
			setState(133);
			match(ID);
			setState(134);
			argument();
			setState(135);
			whichfunction();
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(136);
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
		enterRule(_localctx, 14, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LPAR);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(140);
				match(ID);
				setState(141);
				match(COLON);
				setState(142);
				typef();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(143);
					match(COMMA);
					}
				}

				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
		enterRule(_localctx, 16, RULE_whichfunction);
		int _la;
		try {
			setState(167);
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
				setState(153);
				assign();
				}
				break;
			case LB:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(154);
					match(COLON);
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << INT) | (1L << STRING) | (1L << UNIT) | (1L << ANY) | (1L << CHAR))) != 0)) {
						{
						setState(155);
						typef();
						}
					}

					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==QUERY) {
						{
						setState(158);
						match(QUERY);
						}
					}

					}
				}

				setState(163);
				match(LB);
				setState(164);
				innerblock();
				setState(165);
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
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			assignopr();
			setState(170);
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
		enterRule(_localctx, 20, RULE_assignopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		enterRule(_localctx, 22, RULE_innerblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << LPAR) | (1L << LSQ) | (1L << PULS) | (1L << MINUS) | (1L << IF) | (1L << VAL) | (1L << VAR) | (1L << NULL) | (1L << FUN) | (1L << RETC) | (1L << TRUE) | (1L << FALSE) | (1L << CHR) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(174);
				statement();
				}
				}
				setState(179);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				variableD();
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(181);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				functionD();
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(185);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				expression();
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(189);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				exit();
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(193);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(ID);
				setState(197);
				assign();
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(198);
					match(SEMI);
					}
					break;
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
		enterRule(_localctx, 26, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IF);
			setState(204);
			match(LPAR);
			setState(205);
			expression();
			setState(206);
			match(RPAR);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(207);
				match(LB);
				setState(208);
				innerblock();
				setState(209);
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
				setState(211);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(214);
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
		enterRule(_localctx, 28, RULE_elif);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ELSE);
				setState(218);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ELSE);
				setState(220);
				match(LB);
				setState(221);
				innerblock();
				setState(222);
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
		enterRule(_localctx, 30, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(RETC);
			setState(227);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DPULS:
			case DMINUS:
			case LPAR:
			case LSQ:
			case PULS:
			case MINUS:
			case NULL:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				expor();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
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
		enterRule(_localctx, 34, RULE_expor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			expand();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(234);
				match(LOGICOR);
				setState(235);
				expand();
				}
				}
				setState(240);
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
		enterRule(_localctx, 36, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expeq();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(242);
				match(LOGICAND);
				setState(243);
				expeq();
				}
				}
				setState(248);
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
		enterRule(_localctx, 38, RULE_expeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expcmp();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(250);
				eqopr();
				setState(251);
				expcmp();
				}
				}
				setState(257);
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
		enterRule(_localctx, 40, RULE_expcmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			exppre();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(259);
				cmpopr();
				setState(260);
				exppre();
				}
				}
				setState(266);
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
		enterRule(_localctx, 42, RULE_exppre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expR();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NIN) | (1L << IS) | (1L << NIS))) != 0)) {
				{
				setState(274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
				case NIN:
					{
					{
					setState(268);
					inopr();
					setState(269);
					expR();
					}
					}
					break;
				case IS:
				case NIS:
					{
					{
					setState(271);
					isopr();
					setState(272);
					typef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(278);
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
		enterRule(_localctx, 44, RULE_expR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expadd();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWODOT) {
				{
				{
				setState(280);
				match(TWODOT);
				setState(281);
				expadd();
				}
				}
				setState(286);
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
		enterRule(_localctx, 46, RULE_expadd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expmul();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					addopr();
					setState(289);
					expmul();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 48, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			prefixexp();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(297);
				mulopr();
				setState(298);
				prefixexp();
				}
				}
				setState(304);
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
		enterRule(_localctx, 50, RULE_prefixexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << PULS) | (1L << MINUS))) != 0)) {
				{
				setState(305);
				prefixopr();
				}
			}

			setState(308);
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
		enterRule(_localctx, 52, RULE_exppostfix);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				fccall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(ID);
				setState(312);
				oprpostfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(LPAR);
				setState(314);
				expression();
				setState(315);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(LSQ);
				setState(318);
				expression();
				setState(319);
				match(RSQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
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
		public ArguContext argu() {
			return getRuleContext(ArguContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public FccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fccall; }
	}

	public final FccallContext fccall() throws RecognitionException {
		FccallContext _localctx = new FccallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
			setState(325);
			match(LPAR);
			setState(326);
			argu();
			setState(327);
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

	public static class ArguContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ArguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argu; }
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << LPAR) | (1L << LSQ) | (1L << PULS) | (1L << MINUS) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << CHR) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(329);
					match(ID);
					}
					break;
				case 2:
					{
					setState(330);
					value();
					}
					break;
				case 3:
					{
					setState(331);
					expression();
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(334);
					match(COMMA);
					}
				}

				}
				}
				setState(341);
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
		public OprpostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprpostfix; }
	}

	public final OprpostfixContext oprpostfix() throws RecognitionException {
		OprpostfixContext _localctx = new OprpostfixContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_oprpostfix);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(DPULS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(DMINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(344);
					match(DOT);
					setState(345);
					match(ID);
					}
					}
					setState(350);
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
		enterRule(_localctx, 60, RULE_prefixopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 62, RULE_mulopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		enterRule(_localctx, 64, RULE_addopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 66, RULE_inopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 68, RULE_isopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 70, RULE_eqopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 72, RULE_cmpopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 74, RULE_variableD);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				propertyD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				match(ID);
				setState(370);
				match(COLON);
				setState(371);
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
		enterRule(_localctx, 76, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(375);
			match(ID);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(376);
				match(COLON);
				setState(377);
				typef();
				}
			}

			setState(380);
			match(ASN);
			setState(381);
			expression();
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(382);
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
		enterRule(_localctx, 78, RULE_typef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_value);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(STR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(NUM);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(NULL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
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
				setState(391);
				match(CHR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\5\2Y\n\2\3\2\5\2\\\n\2\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3e\13"+
		"\3\3\3\5\3h\n\3\3\4\7\4k\n\4\f\4\16\4n\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5v\n\5\f\5\16\5y\13\5\3\5\5\5|\n\5\3\6\6\6\177\n\6\r\6\16\6\u0080\3\7"+
		"\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0093\n\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\5\n\u009f\n\n\3\n\5\n\u00a2\n\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\n\5\n\u00aa"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\r\7\r\u00b2\n\r\f\r\16\r\u00b5\13\r\3\16"+
		"\3\16\5\16\u00b9\n\16\3\16\3\16\5\16\u00bd\n\16\3\16\3\16\5\16\u00c1\n"+
		"\16\3\16\3\16\5\16\u00c5\n\16\3\16\3\16\3\16\5\16\u00ca\n\16\5\16\u00cc"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d7\n\17\3\17"+
		"\5\17\u00da\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e3\n\20\3"+
		"\21\3\21\3\21\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\7\23\u00ef\n\23"+
		"\f\23\16\23\u00f2\13\23\3\24\3\24\3\24\7\24\u00f7\n\24\f\24\16\24\u00fa"+
		"\13\24\3\25\3\25\3\25\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25\3\26"+
		"\3\26\3\26\3\26\7\26\u0109\n\26\f\26\16\26\u010c\13\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0115\n\27\f\27\16\27\u0118\13\27\3\30\3\30"+
		"\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30\3\31\3\31\3\31\3\31\7\31"+
		"\u0126\n\31\f\31\16\31\u0129\13\31\3\32\3\32\3\32\3\32\7\32\u012f\n\32"+
		"\f\32\16\32\u0132\13\32\3\33\5\33\u0135\n\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0145\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u014f\n\36\3\36\5\36\u0152\n\36\7"+
		"\36\u0154\n\36\f\36\16\36\u0157\13\36\3\37\3\37\3\37\3\37\7\37\u015d\n"+
		"\37\f\37\16\37\u0160\13\37\5\37\u0162\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u0177\n\'\3(\3(\3(\3(\5(\u017d"+
		"\n(\3(\3(\3(\5(\u0182\n(\3)\3)\3*\3*\3*\3*\3*\5*\u018b\n*\3*\2\2+\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"R\2\r\4\2\13\17!!\4\2\20\21\"#\3\2\36 \3\2\"#\3\2$%\3\2&\'\3\2\5\6\3\2"+
		"\7\n\3\2\678\3\2*\64\3\2<=\2\u019f\2U\3\2\2\2\4]\3\2\2\2\6l\3\2\2\2\b"+
		"o\3\2\2\2\n~\3\2\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u008d\3\2\2\2"+
		"\22\u00a9\3\2\2\2\24\u00ab\3\2\2\2\26\u00ae\3\2\2\2\30\u00b3\3\2\2\2\32"+
		"\u00cb\3\2\2\2\34\u00cd\3\2\2\2\36\u00e2\3\2\2\2 \u00e4\3\2\2\2\"\u00e9"+
		"\3\2\2\2$\u00eb\3\2\2\2&\u00f3\3\2\2\2(\u00fb\3\2\2\2*\u0104\3\2\2\2,"+
		"\u010d\3\2\2\2.\u0119\3\2\2\2\60\u0121\3\2\2\2\62\u012a\3\2\2\2\64\u0134"+
		"\3\2\2\2\66\u0144\3\2\2\28\u0146\3\2\2\2:\u0155\3\2\2\2<\u0161\3\2\2\2"+
		">\u0163\3\2\2\2@\u0165\3\2\2\2B\u0167\3\2\2\2D\u0169\3\2\2\2F\u016b\3"+
		"\2\2\2H\u016d\3\2\2\2J\u016f\3\2\2\2L\u0176\3\2\2\2N\u0178\3\2\2\2P\u0183"+
		"\3\2\2\2R\u018a\3\2\2\2TV\5\4\3\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY\5\6"+
		"\4\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5\n\6\2[Z\3\2\2\2[\\\3\2\2\2\\\3"+
		"\3\2\2\2]^\7\65\2\2^c\7@\2\2_`\7\24\2\2`b\7@\2\2a_\3\2\2\2be\3\2\2\2c"+
		"a\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fh\7\3\2\2gf\3\2\2\2gh\3\2\2\2"+
		"h\5\3\2\2\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\7\3\2\2"+
		"\2nl\3\2\2\2op\7\66\2\2pw\7@\2\2qr\7\24\2\2rv\7\36\2\2st\7\24\2\2tv\7"+
		"@\2\2uq\3\2\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3"+
		"\2\2\2z|\7\3\2\2{z\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}\177\5\f\7\2~}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2\2"+
		"\u0082\u0085\5\16\b\2\u0083\u0085\5N(\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7:\2\2\u0087\u0088\7@\2\2\u0088\u0089"+
		"\5\20\t\2\u0089\u008b\5\22\n\2\u008a\u008c\7\3\2\2\u008b\u008a\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u0096\7\26\2\2\u008e\u008f"+
		"\7@\2\2\u008f\u0090\7\34\2\2\u0090\u0092\5P)\2\u0091\u0093\7\25\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\27\2\2\u009a\21\3\2\2"+
		"\2\u009b\u00aa\5\24\13\2\u009c\u009e\7\34\2\2\u009d\u009f\5P)\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\7\35"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\30"+
		"\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\31\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u009b\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00ac\5\26\f"+
		"\2\u00ac\u00ad\5\"\22\2\u00ad\25\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\27"+
		"\3\2\2\2\u00b0\u00b2\5\32\16\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b8\5L\'\2\u00b7\u00b9\7\3\2\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00cc\3\2\2\2\u00ba\u00bc\5\16\b\2\u00bb\u00bd\7"+
		"\3\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00cc\3\2\2\2\u00be"+
		"\u00c0\5\"\22\2\u00bf\u00c1\7\3\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00cc\3\2\2\2\u00c2\u00c4\5 \21\2\u00c3\u00c5\7\3\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\7@"+
		"\2\2\u00c7\u00c9\5\24\13\2\u00c8\u00ca\7\3\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00b6\3\2\2\2\u00cb\u00ba\3\2"+
		"\2\2\u00cb\u00be\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc"+
		"\33\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\5\"\22"+
		"\2\u00d0\u00d6\7\27\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3\5\30\r\2\u00d3"+
		"\u00d4\7\31\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d1"+
		"\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\5\36\20\2"+
		"\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\35\3\2\2\2\u00db\u00dc"+
		"\7)\2\2\u00dc\u00e3\5\32\16\2\u00dd\u00de\7)\2\2\u00de\u00df\7\30\2\2"+
		"\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\31\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00db"+
		"\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e5\7;\2\2\u00e5"+
		"\u00e6\5\"\22\2\u00e6!\3\2\2\2\u00e7\u00ea\5$\23\2\u00e8\u00ea\5\34\17"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00f0"+
		"\5&\24\2\u00ec\u00ed\7\23\2\2\u00ed\u00ef\5&\24\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1%\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f8\5(\25\2\u00f4\u00f5\7\22\2\2\u00f5"+
		"\u00f7\5(\25\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\'\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0101"+
		"\5*\26\2\u00fc\u00fd\5H%\2\u00fd\u00fe\5*\26\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102)\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010a\5,\27\2\u0105\u0106"+
		"\5J&\2\u0106\u0107\5,\27\2\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b+\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u0116\5.\30\2\u010e\u010f\5D#\2\u010f\u0110"+
		"\5.\30\2\u0110\u0115\3\2\2\2\u0111\u0112\5F$\2\u0112\u0113\5P)\2\u0113"+
		"\u0115\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117-\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011e\5\60\31\2\u011a\u011b\7\4\2\2\u011b\u011d\5\60\31"+
		"\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f/\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0127\5\62\32\2\u0122"+
		"\u0123\5B\"\2\u0123\u0124\5\62\32\2\u0124\u0126\3\2\2\2\u0125\u0122\3"+
		"\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\61\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0130\5\64\33\2\u012b\u012c\5@!"+
		"\2\u012c\u012d\5\64\33\2\u012d\u012f\3\2\2\2\u012e\u012b\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\63\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0133\u0135\5> \2\u0134\u0133\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5\66\34\2\u0137\65\3\2\2\2\u0138"+
		"\u0145\58\35\2\u0139\u013a\7@\2\2\u013a\u0145\5<\37\2\u013b\u013c\7\26"+
		"\2\2\u013c\u013d\5\"\22\2\u013d\u013e\7\27\2\2\u013e\u0145\3\2\2\2\u013f"+
		"\u0140\7\32\2\2\u0140\u0141\5\"\22\2\u0141\u0142\7\33\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0145\5R*\2\u0144\u0138\3\2\2\2\u0144\u0139\3\2\2\2\u0144"+
		"\u013b\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0143\3\2\2\2\u0145\67\3\2\2"+
		"\2\u0146\u0147\7@\2\2\u0147\u0148\7\26\2\2\u0148\u0149\5:\36\2\u0149\u014a"+
		"\7\27\2\2\u014a9\3\2\2\2\u014b\u014f\7@\2\2\u014c\u014f\5R*\2\u014d\u014f"+
		"\5\"\22\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0151\3\2\2\2\u0150\u0152\7\25\2\2\u0151\u0150\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u014e\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156;\3\2\2\2\u0157\u0155\3\2\2\2"+
		"\u0158\u0162\7\20\2\2\u0159\u0162\7\21\2\2\u015a\u015b\7\24\2\2\u015b"+
		"\u015d\7@\2\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0158\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015e\3\2\2\2\u0162=\3\2\2\2"+
		"\u0163\u0164\t\3\2\2\u0164?\3\2\2\2\u0165\u0166\t\4\2\2\u0166A\3\2\2\2"+
		"\u0167\u0168\t\5\2\2\u0168C\3\2\2\2\u0169\u016a\t\6\2\2\u016aE\3\2\2\2"+
		"\u016b\u016c\t\7\2\2\u016cG\3\2\2\2\u016d\u016e\t\b\2\2\u016eI\3\2\2\2"+
		"\u016f\u0170\t\t\2\2\u0170K\3\2\2\2\u0171\u0177\5N(\2\u0172\u0173\t\n"+
		"\2\2\u0173\u0174\7@\2\2\u0174\u0175\7\34\2\2\u0175\u0177\5P)\2\u0176\u0171"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0177M\3\2\2\2\u0178\u0179\t\n\2\2\u0179"+
		"\u017c\7@\2\2\u017a\u017b\7\34\2\2\u017b\u017d\5P)\2\u017c\u017a\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7!\2\2\u017f\u0181"+
		"\5\"\22\2\u0180\u0182\7\3\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2"+
		"\u0182O\3\2\2\2\u0183\u0184\t\13\2\2\u0184Q\3\2\2\2\u0185\u018b\7?\2\2"+
		"\u0186\u018b\7A\2\2\u0187\u018b\79\2\2\u0188\u018b\t\f\2\2\u0189\u018b"+
		"\7>\2\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018bS\3\2\2\2\63UX[cgluw{\u0080\u0084"+
		"\u008b\u0092\u0096\u009e\u00a1\u00a3\u00a9\u00b3\u00b8\u00bc\u00c0\u00c4"+
		"\u00c9\u00cb\u00d6\u00d9\u00e2\u00e9\u00f0\u00f8\u0101\u010a\u0114\u0116"+
		"\u011e\u0127\u0130\u0134\u0144\u014e\u0151\u0155\u015e\u0161\u0176\u017c"+
		"\u0181\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}