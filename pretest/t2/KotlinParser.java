// Generated from Kotlin.g4 by ANTLR 4.8
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
		ANY=52, CHAR=53, PACKAGE=54, IMPORT=55, VAL=56, VAR=57, OVERRIDE=58, CLASS=59, 
		ABSTRACT=60, INTERFACE=61, GET=62, CONSTRUCTOR=63, NULL=64, FUN=65, RETC=66, 
		TRUE=67, FALSE=68, MAIN=69, CHR=70, STR=71, ID=72, NUM=73, FN=74, DIGIT=75, 
		WS=76, COMMENT=77, COMMENT2=78;
	public static final int
		RULE_prog = 0, RULE_packageR = 1, RULE_importL = 2, RULE_importR = 3, 
		RULE_outerL = 4, RULE_outerR = 5, RULE_classD = 6, RULE_typec = 7, RULE_classinner = 8, 
		RULE_propertyC = 9, RULE_valcD = 10, RULE_funcD = 11, RULE_cargus = 12, 
		RULE_cargu = 13, RULE_mainf = 14, RULE_functionD = 15, RULE_argument = 16, 
		RULE_whichfunction = 17, RULE_assign = 18, RULE_assignopr = 19, RULE_innerblock = 20, 
		RULE_statement = 21, RULE_forloop = 22, RULE_whileloop = 23, RULE_ifthenelse = 24, 
		RULE_elif = 25, RULE_exit = 26, RULE_expression = 27, RULE_expor = 28, 
		RULE_expand = 29, RULE_expeq = 30, RULE_expcmp = 31, RULE_exppre = 32, 
		RULE_exprange = 33, RULE_expR = 34, RULE_expadd = 35, RULE_expmul = 36, 
		RULE_prefixexp = 37, RULE_exppostfix = 38, RULE_fccall = 39, RULE_argus = 40, 
		RULE_argu = 41, RULE_oprpostfix = 42, RULE_prefixopr = 43, RULE_mulopr = 44, 
		RULE_addopr = 45, RULE_inopr = 46, RULE_isopr = 47, RULE_eqopr = 48, RULE_cmpopr = 49, 
		RULE_variableD = 50, RULE_propertyD = 51, RULE_typef = 52, RULE_value = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "packageR", "importL", "importR", "outerL", "outerR", "classD", 
			"typec", "classinner", "propertyC", "valcD", "funcD", "cargus", "cargu", 
			"mainf", "functionD", "argument", "whichfunction", "assign", "assignopr", 
			"innerblock", "statement", "forloop", "whileloop", "ifthenelse", "elif", 
			"exit", "expression", "expor", "expand", "expeq", "expcmp", "exppre", 
			"exprange", "expR", "expadd", "expmul", "prefixexp", "exppostfix", "fccall", 
			"argus", "argu", "oprpostfix", "prefixopr", "mulopr", "addopr", "inopr", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(108);
				packageR();
				}
			}

			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(111);
				importL();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(114);
				outerL();
				}
				break;
			}
			setState(117);
			mainf();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (VAL - 56)) | (1L << (VAR - 56)) | (1L << (CLASS - 56)) | (1L << (ABSTRACT - 56)) | (1L << (INTERFACE - 56)) | (1L << (FUN - 56)))) != 0)) {
				{
				setState(118);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPackageR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPackageR(this);
		}
	}

	public final PackageRContext packageR() throws RecognitionException {
		PackageRContext _localctx = new PackageRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PACKAGE);
			setState(122);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(123);
				match(DOT);
				setState(124);
				match(ID);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(130);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterImportL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitImportL(this);
		}
	}

	public final ImportLContext importL() throws RecognitionException {
		ImportLContext _localctx = new ImportLContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(133);
				importR();
				}
				}
				setState(138);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitImportR(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IMPORT);
			setState(140);
			match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(141);
					match(DOT);
					setState(142);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(143);
					match(DOT);
					setState(144);
					match(ID);
					}
					break;
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(150);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterOuterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitOuterL(this);
		}
	}

	public final OuterLContext outerL() throws RecognitionException {
		OuterLContext _localctx = new OuterLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outerL);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					outerR();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
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
		public ClassDContext classD() {
			return getRuleContext(ClassDContext.class,0);
		}
		public PropertyDContext propertyD() {
			return getRuleContext(PropertyDContext.class,0);
		}
		public OuterRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterOuterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitOuterR(this);
		}
	}

	public final OuterRContext outerR() throws RecognitionException {
		OuterRContext _localctx = new OuterRContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outerR);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				functionD();
				}
				break;
			case CLASS:
			case ABSTRACT:
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				classD();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
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

	public static class ClassDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(KotlinParser.INTERFACE, 0); }
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public ClassinnerContext classinner() {
			return getRuleContext(ClassinnerContext.class,0);
		}
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public CargusContext cargus() {
			return getRuleContext(CargusContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypecContext typec() {
			return getRuleContext(TypecContext.class,0);
		}
		public ClassDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterClassD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitClassD(this);
		}
	}

	public final ClassDContext classD() throws RecognitionException {
		ClassDContext _localctx = new ClassDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(163);
				match(ABSTRACT);
				}
			}

			setState(166);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR || _la==CONSTRUCTOR) {
				{
				setState(168);
				cargus();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(171);
				match(COLON);
				setState(172);
				typec();
				}
			}

			{
			setState(175);
			match(LB);
			setState(176);
			classinner();
			setState(177);
			match(RB);
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

	public static class TypecContext extends ParserRuleContext {
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
		public TypecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterTypec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitTypec(this);
		}
	}

	public final TypecContext typec() throws RecognitionException {
		TypecContext _localctx = new TypecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expression();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				expression();
				}
				}
				setState(186);
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

	public static class ClassinnerContext extends ParserRuleContext {
		public List<PropertyCContext> propertyC() {
			return getRuleContexts(PropertyCContext.class);
		}
		public PropertyCContext propertyC(int i) {
			return getRuleContext(PropertyCContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ClassinnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classinner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterClassinner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitClassinner(this);
		}
	}

	public final ClassinnerContext classinner() throws RecognitionException {
		ClassinnerContext _localctx = new ClassinnerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classinner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (VAL - 56)) | (1L << (VAR - 56)) | (1L << (OVERRIDE - 56)) | (1L << (ABSTRACT - 56)) | (1L << (FUN - 56)))) != 0)) {
				{
				{
				setState(187);
				propertyC();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(188);
					match(SEMI);
					}
				}

				}
				}
				setState(195);
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

	public static class PropertyCContext extends ParserRuleContext {
		public FuncDContext funcD() {
			return getRuleContext(FuncDContext.class,0);
		}
		public ValcDContext valcD() {
			return getRuleContext(ValcDContext.class,0);
		}
		public PropertyCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPropertyC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPropertyC(this);
		}
	}

	public final PropertyCContext propertyC() throws RecognitionException {
		PropertyCContext _localctx = new PropertyCContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyC);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				funcD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				valcD();
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

	public static class ValcDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode ASN() { return getToken(KotlinParser.ASN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode GET() { return getToken(KotlinParser.GET, 0); }
		public ValcDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valcD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterValcD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitValcD(this);
		}
	}

	public final ValcDContext valcD() throws RecognitionException {
		ValcDContext _localctx = new ValcDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valcD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE || _la==ABSTRACT) {
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==ABSTRACT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(203);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(205);
				match(COLON);
				setState(206);
				typef();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET) {
					{
					setState(207);
					match(GET);
					}
				}

				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASN) {
				{
				setState(212);
				match(ASN);
				setState(213);
				expression();
				}
			}

			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(216);
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

	public static class FuncDContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public WhichfunctionContext whichfunction() {
			return getRuleContext(WhichfunctionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(KotlinParser.QUERY, 0); }
		public FuncDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFuncD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFuncD(this);
		}
	}

	public final FuncDContext funcD() throws RecognitionException {
		FuncDContext _localctx = new FuncDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE || _la==ABSTRACT) {
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==ABSTRACT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(222);
			match(FUN);
			setState(223);
			match(ID);
			setState(224);
			argument();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(225);
				match(COLON);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (BOOL - 42)) | (1L << (BYTE - 42)) | (1L << (SHORT - 42)) | (1L << (LONG - 42)) | (1L << (FLOAT - 42)) | (1L << (DOUBLE - 42)) | (1L << (INT - 42)) | (1L << (STRING - 42)) | (1L << (UNIT - 42)) | (1L << (ANY - 42)) | (1L << (CHAR - 42)) | (1L << (ID - 42)))) != 0)) {
					{
					setState(226);
					typef();
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(229);
					match(QUERY);
					}
				}

				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PASN) | (1L << MASN) | (1L << MULASN) | (1L << DIVASN) | (1L << MODASN) | (1L << LB) | (1L << ASN))) != 0)) {
				{
				setState(234);
				whichfunction();
				}
			}

			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(237);
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

	public static class CargusContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public List<CarguContext> cargu() {
			return getRuleContexts(CarguContext.class);
		}
		public CarguContext cargu(int i) {
			return getRuleContext(CarguContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public CargusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cargus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterCargus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitCargus(this);
		}
	}

	public final CargusContext cargus() throws RecognitionException {
		CargusContext _localctx = new CargusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cargus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(240);
				match(CONSTRUCTOR);
				}
			}

			setState(243);
			match(LPAR);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (VAL - 56)) | (1L << (VAR - 56)) | (1L << (ID - 56)))) != 0)) {
				{
				setState(244);
				cargu();
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				cargu();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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

	public static class CarguContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public CarguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cargu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterCargu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitCargu(this);
		}
	}

	public final CarguContext cargu() throws RecognitionException {
		CarguContext _localctx = new CarguContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cargu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(259);
			match(ID);
			setState(260);
			match(COLON);
			setState(261);
			typef();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterMainf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitMainf(this);
		}
	}

	public final MainfContext mainf() throws RecognitionException {
		MainfContext _localctx = new MainfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FUN);
			setState(264);
			match(MAIN);
			setState(265);
			match(LPAR);
			setState(266);
			match(RPAR);
			setState(267);
			match(LB);
			setState(268);
			innerblock();
			setState(269);
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
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(KotlinParser.SEMI, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(KotlinParser.QUERY, 0); }
		public FunctionDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunctionD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunctionD(this);
		}
	}

	public final FunctionDContext functionD() throws RecognitionException {
		FunctionDContext _localctx = new FunctionDContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(FUN);
			setState(272);
			match(ID);
			setState(273);
			argument();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(274);
				match(COLON);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (BOOL - 42)) | (1L << (BYTE - 42)) | (1L << (SHORT - 42)) | (1L << (LONG - 42)) | (1L << (FLOAT - 42)) | (1L << (DOUBLE - 42)) | (1L << (INT - 42)) | (1L << (STRING - 42)) | (1L << (UNIT - 42)) | (1L << (ANY - 42)) | (1L << (CHAR - 42)) | (1L << (ID - 42)))) != 0)) {
					{
					setState(275);
					typef();
					}
				}

				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(278);
					match(QUERY);
					}
				}

				}
			}

			setState(283);
			whichfunction();
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(284);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(LPAR);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(288);
				match(ID);
				setState(289);
				match(COLON);
				setState(290);
				typef();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(291);
					match(COMMA);
					}
				}

				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
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
		public WhichfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whichfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterWhichfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitWhichfunction(this);
		}
	}

	public final WhichfunctionContext whichfunction() throws RecognitionException {
		WhichfunctionContext _localctx = new WhichfunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whichfunction);
		try {
			setState(306);
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
				setState(301);
				assign();
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(LB);
				setState(303);
				innerblock();
				setState(304);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			assignopr();
			setState(309);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAssignopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAssignopr(this);
		}
	}

	public final AssignoprContext assignopr() throws RecognitionException {
		AssignoprContext _localctx = new AssignoprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterInnerblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitInnerblock(this);
		}
	}

	public final InnerblockContext innerblock() throws RecognitionException {
		InnerblockContext _localctx = new InnerblockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_innerblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (DPULS - 14)) | (1L << (DMINUS - 14)) | (1L << (LPAR - 14)) | (1L << (LSQ - 14)) | (1L << (PULS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (FOR - 14)) | (1L << (WHILE - 14)) | (1L << (SUPERANY - 14)) | (1L << (VAL - 14)) | (1L << (VAR - 14)) | (1L << (CLASS - 14)) | (1L << (ABSTRACT - 14)) | (1L << (INTERFACE - 14)) | (1L << (NULL - 14)) | (1L << (FUN - 14)) | (1L << (RETC - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (CHR - 14)) | (1L << (STR - 14)) | (1L << (ID - 14)) | (1L << (NUM - 14)))) != 0)) {
				{
				{
				setState(313);
				statement();
				}
				}
				setState(318);
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
		public ClassDContext classD() {
			return getRuleContext(ClassDContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				variableD();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(320);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				functionD();
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(324);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				expression();
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(328);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				exit();
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(332);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(ID);
				setState(336);
				assign();
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(337);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				forloop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				whileloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(342);
				classD();
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
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(FOR);
			setState(346);
			match(LPAR);
			setState(347);
			match(ID);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(348);
				match(COLON);
				setState(349);
				typef();
				}
			}

			setState(352);
			match(IN);
			setState(353);
			expression();
			setState(354);
			match(RPAR);
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(355);
				match(LB);
				setState(356);
				innerblock();
				setState(357);
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
			case CLASS:
			case ABSTRACT:
			case INTERFACE:
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
				setState(359);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(WHILE);
			setState(363);
			match(LPAR);
			setState(364);
			expression();
			setState(365);
			match(RPAR);
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(366);
				match(LB);
				setState(367);
				innerblock();
				setState(368);
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
			case CLASS:
			case ABSTRACT:
			case INTERFACE:
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
				setState(370);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIfthenelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIfthenelse(this);
		}
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IF);
			setState(374);
			match(LPAR);
			setState(375);
			expression();
			setState(376);
			match(RPAR);
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(377);
				match(LB);
				setState(378);
				innerblock();
				setState(379);
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
			case CLASS:
			case ABSTRACT:
			case INTERFACE:
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
				setState(381);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(384);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitElif(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elif);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(ELSE);
				setState(388);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(ELSE);
				setState(390);
				match(LB);
				setState(391);
				innerblock();
				setState(392);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(RETC);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(397);
				expression();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			setState(402);
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
				setState(400);
				expor();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpor(this);
		}
	}

	public final ExporContext expor() throws RecognitionException {
		ExporContext _localctx = new ExporContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			expand();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(405);
				match(LOGICOR);
				setState(406);
				expand();
				}
				}
				setState(411);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpand(this);
		}
	}

	public final ExpandContext expand() throws RecognitionException {
		ExpandContext _localctx = new ExpandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			expeq();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(413);
				match(LOGICAND);
				setState(414);
				expeq();
				}
				}
				setState(419);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpeq(this);
		}
	}

	public final ExpeqContext expeq() throws RecognitionException {
		ExpeqContext _localctx = new ExpeqContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			expcmp();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(421);
				eqopr();
				setState(422);
				expcmp();
				}
				}
				setState(428);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpcmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpcmp(this);
		}
	}

	public final ExpcmpContext expcmp() throws RecognitionException {
		ExpcmpContext _localctx = new ExpcmpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expcmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			exppre();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(430);
				cmpopr();
				setState(431);
				exppre();
				}
				}
				setState(437);
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
		public List<ExprangeContext> exprange() {
			return getRuleContexts(ExprangeContext.class);
		}
		public ExprangeContext exprange(int i) {
			return getRuleContext(ExprangeContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExppre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExppre(this);
		}
	}

	public final ExppreContext exppre() throws RecognitionException {
		ExppreContext _localctx = new ExppreContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exppre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			exprange();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NIN) | (1L << IS) | (1L << NIS))) != 0)) {
				{
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
				case NIN:
					{
					{
					setState(439);
					inopr();
					setState(440);
					exprange();
					}
					}
					break;
				case IS:
				case NIS:
					{
					{
					setState(442);
					isopr();
					setState(443);
					typef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(449);
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

	public static class ExprangeContext extends ParserRuleContext {
		public List<ExpRContext> expR() {
			return getRuleContexts(ExpRContext.class);
		}
		public ExpRContext expR(int i) {
			return getRuleContext(ExpRContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public ExprangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExprange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExprange(this);
		}
	}

	public final ExprangeContext exprange() throws RecognitionException {
		ExprangeContext _localctx = new ExprangeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprange);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			expR();
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					match(ID);
					setState(452);
					expR();
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpR(this);
		}
	}

	public final ExpRContext expR() throws RecognitionException {
		ExpRContext _localctx = new ExpRContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			expadd();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWODOT) {
				{
				{
				setState(459);
				match(TWODOT);
				setState(460);
				expadd();
				}
				}
				setState(465);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpadd(this);
		}
	}

	public final ExpaddContext expadd() throws RecognitionException {
		ExpaddContext _localctx = new ExpaddContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expadd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			expmul();
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					addopr();
					setState(468);
					expmul();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExpmul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExpmul(this);
		}
	}

	public final ExpmulContext expmul() throws RecognitionException {
		ExpmulContext _localctx = new ExpmulContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			prefixexp();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(476);
				mulopr();
				setState(477);
				prefixexp();
				}
				}
				setState(483);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPrefixexp(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_prefixexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << PULS) | (1L << MINUS))) != 0)) {
				{
				setState(484);
				prefixopr();
				}
			}

			setState(487);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterExppostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitExppostfix(this);
		}
	}

	public final ExppostfixContext exppostfix() throws RecognitionException {
		ExppostfixContext _localctx = new ExppostfixContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exppostfix);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				fccall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(ID);
				setState(491);
				oprpostfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(LPAR);
				setState(493);
				expression();
				setState(494);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				match(LSQ);
				setState(497);
				expression();
				setState(498);
				match(RSQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFccall(this);
		}
	}

	public final FccallContext fccall() throws RecognitionException {
		FccallContext _localctx = new FccallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(ID);
			setState(504);
			match(LPAR);
			setState(505);
			argus();
			setState(506);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterArgus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitArgus(this);
		}
	}

	public final ArgusContext argus() throws RecognitionException {
		ArgusContext _localctx = new ArgusContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (DPULS - 14)) | (1L << (DMINUS - 14)) | (1L << (LPAR - 14)) | (1L << (LSQ - 14)) | (1L << (PULS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (SUPERANY - 14)) | (1L << (NULL - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (CHR - 14)) | (1L << (STR - 14)) | (1L << (ID - 14)) | (1L << (NUM - 14)))) != 0)) {
				{
				setState(508);
				argu();
				}
			}

			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				argu();
				}
				}
				setState(517);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterArgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitArgu(this);
		}
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argu);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterOprpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitOprpostfix(this);
		}
	}

	public final OprpostfixContext oprpostfix() throws RecognitionException {
		OprpostfixContext _localctx = new OprpostfixContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_oprpostfix);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(DPULS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(DMINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(525);
					match(DOT);
					setState(528);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(526);
						match(ID);
						}
						break;
					case 2:
						{
						setState(527);
						fccall();
						}
						break;
					}
					}
					}
					setState(534);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPrefixopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPrefixopr(this);
		}
	}

	public final PrefixoprContext prefixopr() throws RecognitionException {
		PrefixoprContext _localctx = new PrefixoprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_prefixopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterMulopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitMulopr(this);
		}
	}

	public final MuloprContext mulopr() throws RecognitionException {
		MuloprContext _localctx = new MuloprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mulopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAddopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAddopr(this);
		}
	}

	public final AddoprContext addopr() throws RecognitionException {
		AddoprContext _localctx = new AddoprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_addopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterInopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitInopr(this);
		}
	}

	public final InoprContext inopr() throws RecognitionException {
		InoprContext _localctx = new InoprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_inopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIsopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIsopr(this);
		}
	}

	public final IsoprContext isopr() throws RecognitionException {
		IsoprContext _localctx = new IsoprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_isopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterEqopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitEqopr(this);
		}
	}

	public final EqoprContext eqopr() throws RecognitionException {
		EqoprContext _localctx = new EqoprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_eqopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterCmpopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitCmpopr(this);
		}
	}

	public final CmpoprContext cmpopr() throws RecognitionException {
		CmpoprContext _localctx = new CmpoprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cmpopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterVariableD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitVariableD(this);
		}
	}

	public final VariableDContext variableD() throws RecognitionException {
		VariableDContext _localctx = new VariableDContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableD);
		int _la;
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				propertyD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(553);
				match(ID);
				setState(554);
				match(COLON);
				setState(555);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPropertyD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPropertyD(this);
		}
	}

	public final PropertyDContext propertyD() throws RecognitionException {
		PropertyDContext _localctx = new PropertyDContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(559);
			match(ID);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(560);
				match(COLON);
				setState(561);
				typef();
				}
			}

			setState(564);
			match(ASN);
			setState(565);
			expression();
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(566);
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
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode LT() { return getToken(KotlinParser.LT, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode GT() { return getToken(KotlinParser.GT, 0); }
		public TypefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterTypef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitTypef(this);
		}
	}

	public final TypefContext typef() throws RecognitionException {
		TypefContext _localctx = new TypefContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typef);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(STRING);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				match(UNIT);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(574);
				match(ANY);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(575);
				match(SHORT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 8);
				{
				setState(576);
				match(LONG);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 9);
				{
				setState(577);
				match(BOOL);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 10);
				{
				setState(578);
				match(BYTE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(579);
				match(CHAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 12);
				{
				setState(580);
				match(ID);
				setState(581);
				match(LT);
				setState(582);
				typef();
				setState(583);
				match(GT);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_value);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(STR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(NUM);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(NULL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
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
				setState(591);
				match(CHR);
				}
				break;
			case SUPERANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(592);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0256\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\5\2p\n\2\3\2\5\2s\n\2\3\2\5\2v\n"+
		"\2\3\2\3\2\5\2z\n\2\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3"+
		"\3\3\5\3\u0086\n\3\3\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u0094\n\5\f\5\16\5\u0097\13\5\3\5\5\5\u009a\n\5\3\6\6\6"+
		"\u009d\n\6\r\6\16\6\u009e\3\7\3\7\3\7\5\7\u00a4\n\7\3\b\5\b\u00a7\n\b"+
		"\3\b\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\3\n\3\n\5\n\u00c0\n\n\7\n\u00c2"+
		"\n\n\f\n\16\n\u00c5\13\n\3\13\3\13\5\13\u00c9\n\13\3\f\5\f\u00cc\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\5\f\u00d5\n\f\3\f\3\f\5\f\u00d9\n\f\3"+
		"\f\5\f\u00dc\n\f\3\r\5\r\u00df\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3"+
		"\r\5\r\u00e9\n\r\5\r\u00eb\n\r\3\r\5\r\u00ee\n\r\3\r\5\r\u00f1\n\r\3\16"+
		"\5\16\u00f4\n\16\3\16\3\16\5\16\u00f8\n\16\3\16\3\16\7\16\u00fc\n\16\f"+
		"\16\16\16\u00ff\13\16\3\16\3\16\3\17\5\17\u0104\n\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0117\n\21\3\21\5\21\u011a\n\21\5\21\u011c\n\21\3\21\3\21\5\21\u0120"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0127\n\22\7\22\u0129\n\22\f\22\16"+
		"\22\u012c\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0135\n\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\7\26\u013d\n\26\f\26\16\26\u0140\13\26\3\27"+
		"\3\27\5\27\u0144\n\27\3\27\3\27\5\27\u0148\n\27\3\27\3\27\5\27\u014c\n"+
		"\27\3\27\3\27\5\27\u0150\n\27\3\27\3\27\3\27\5\27\u0155\n\27\3\27\3\27"+
		"\3\27\5\27\u015a\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0161\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u016b\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0176\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0181\n\32\3\32\5\32\u0184\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u018d\n\33\3\34\3\34\5\34\u0191\n\34\3\35\3\35"+
		"\5\35\u0195\n\35\3\36\3\36\3\36\7\36\u019a\n\36\f\36\16\36\u019d\13\36"+
		"\3\37\3\37\3\37\7\37\u01a2\n\37\f\37\16\37\u01a5\13\37\3 \3 \3 \3 \7 "+
		"\u01ab\n \f \16 \u01ae\13 \3!\3!\3!\3!\7!\u01b4\n!\f!\16!\u01b7\13!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01c0\n\"\f\"\16\"\u01c3\13\"\3#\3#\3#"+
		"\7#\u01c8\n#\f#\16#\u01cb\13#\3$\3$\3$\7$\u01d0\n$\f$\16$\u01d3\13$\3"+
		"%\3%\3%\3%\7%\u01d9\n%\f%\16%\u01dc\13%\3&\3&\3&\3&\7&\u01e2\n&\f&\16"+
		"&\u01e5\13&\3\'\5\'\u01e8\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u01f8\n(\3)\3)\3)\3)\3)\3*\5*\u0200\n*\3*\3*\7*\u0204\n*\f*\16"+
		"*\u0207\13*\3+\3+\3+\5+\u020c\n+\3,\3,\3,\3,\3,\5,\u0213\n,\7,\u0215\n"+
		",\f,\16,\u0218\13,\5,\u021a\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u022f\n\64\3\65\3\65"+
		"\3\65\3\65\5\65\u0235\n\65\3\65\3\65\3\65\5\65\u023a\n\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5"+
		"\66\u024c\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0254\n\67\3\67\2\2"+
		"8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjl\2\16\4\2==??\4\2<<>>\3\2:;\4\2\13\17!!\4\2\20\21"+
		"\"#\3\2\36 \3\2\"#\3\2$%\3\2&\'\3\2\5\6\3\2\7\n\3\2EF\2\u0288\2o\3\2\2"+
		"\2\4{\3\2\2\2\6\u008a\3\2\2\2\b\u008d\3\2\2\2\n\u009c\3\2\2\2\f\u00a3"+
		"\3\2\2\2\16\u00a6\3\2\2\2\20\u00b5\3\2\2\2\22\u00c3\3\2\2\2\24\u00c8\3"+
		"\2\2\2\26\u00cb\3\2\2\2\30\u00de\3\2\2\2\32\u00f3\3\2\2\2\34\u0103\3\2"+
		"\2\2\36\u0109\3\2\2\2 \u0111\3\2\2\2\"\u0121\3\2\2\2$\u0134\3\2\2\2&\u0136"+
		"\3\2\2\2(\u0139\3\2\2\2*\u013e\3\2\2\2,\u0159\3\2\2\2.\u015b\3\2\2\2\60"+
		"\u016c\3\2\2\2\62\u0177\3\2\2\2\64\u018c\3\2\2\2\66\u018e\3\2\2\28\u0194"+
		"\3\2\2\2:\u0196\3\2\2\2<\u019e\3\2\2\2>\u01a6\3\2\2\2@\u01af\3\2\2\2B"+
		"\u01b8\3\2\2\2D\u01c4\3\2\2\2F\u01cc\3\2\2\2H\u01d4\3\2\2\2J\u01dd\3\2"+
		"\2\2L\u01e7\3\2\2\2N\u01f7\3\2\2\2P\u01f9\3\2\2\2R\u01ff\3\2\2\2T\u020b"+
		"\3\2\2\2V\u0219\3\2\2\2X\u021b\3\2\2\2Z\u021d\3\2\2\2\\\u021f\3\2\2\2"+
		"^\u0221\3\2\2\2`\u0223\3\2\2\2b\u0225\3\2\2\2d\u0227\3\2\2\2f\u022e\3"+
		"\2\2\2h\u0230\3\2\2\2j\u024b\3\2\2\2l\u0253\3\2\2\2np\5\4\3\2on\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qs\5\6\4\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\5\n\6"+
		"\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\36\20\2xz\5\n\6\2yx\3\2\2\2yz\3\2"+
		"\2\2z\3\3\2\2\2{|\78\2\2|\u0081\7J\2\2}~\7\24\2\2~\u0080\7J\2\2\177}\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\7\3\2\2\u0085\u0084\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\5\3\2\2\2\u0087\u0089\5\b\5\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\7\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\79\2\2\u008e\u0095\7J\2\2\u008f"+
		"\u0090\7\24\2\2\u0090\u0094\7\36\2\2\u0091\u0092\7\24\2\2\u0092\u0094"+
		"\7J\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009a\7\3\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\t\3\2\2\2\u009b\u009d\5\f\7\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a4"+
		"\5 \21\2\u00a1\u00a4\5\16\b\2\u00a2\u00a4\5h\65\2\u00a3\u00a0\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a7\7"+
		">\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\t\2\2\2\u00a9\u00ab\7J\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00aa\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae"+
		"\u00b0\5\20\t\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\7\31\2\2"+
		"\u00b4\17\3\2\2\2\u00b5\u00ba\58\35\2\u00b6\u00b7\7\25\2\2\u00b7\u00b9"+
		"\58\35\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5\24\13"+
		"\2\u00be\u00c0\7\3\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\5\30\r"+
		"\2\u00c7\u00c9\5\26\f\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\25\3\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00d4\7J\2\2\u00cf\u00d0"+
		"\7\34\2\2\u00d0\u00d2\5j\66\2\u00d1\u00d3\7@\2\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\7!\2\2\u00d7\u00d9\58\35\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\7\3"+
		"\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\27\3\2\2\2\u00dd\u00df"+
		"\t\3\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7C\2\2\u00e1\u00e2\7J\2\2\u00e2\u00ea\5\"\22\2\u00e3\u00e5\7\34"+
		"\2\2\u00e4\u00e6\5j\66\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e9\7\35\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ee\5$\23\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\7\3\2\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\31\3\2\2\2\u00f2\u00f4\7A\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\26\2\2\u00f6\u00f8"+
		"\5\34\17\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2"+
		"\u00f9\u00fa\7\25\2\2\u00fa\u00fc\5\34\17\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\27\2\2\u0101\33\3\2\2\2\u0102\u0104"+
		"\t\4\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7J\2\2\u0106\u0107\7\34\2\2\u0107\u0108\5j\66\2\u0108\35\3\2\2"+
		"\2\u0109\u010a\7C\2\2\u010a\u010b\7G\2\2\u010b\u010c\7\26\2\2\u010c\u010d"+
		"\7\27\2\2\u010d\u010e\7\30\2\2\u010e\u010f\5*\26\2\u010f\u0110\7\31\2"+
		"\2\u0110\37\3\2\2\2\u0111\u0112\7C\2\2\u0112\u0113\7J\2\2\u0113\u011b"+
		"\5\"\22\2\u0114\u0116\7\34\2\2\u0115\u0117\5j\66\2\u0116\u0115\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\7\35\2\2\u0119\u0118"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0114\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\5$\23\2\u011e\u0120\7\3"+
		"\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120!\3\2\2\2\u0121\u012a"+
		"\7\26\2\2\u0122\u0123\7J\2\2\u0123\u0124\7\34\2\2\u0124\u0126\5j\66\2"+
		"\u0125\u0127\7\25\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0122\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\27"+
		"\2\2\u012e#\3\2\2\2\u012f\u0135\5&\24\2\u0130\u0131\7\30\2\2\u0131\u0132"+
		"\5*\26\2\u0132\u0133\7\31\2\2\u0133\u0135\3\2\2\2\u0134\u012f\3\2\2\2"+
		"\u0134\u0130\3\2\2\2\u0135%\3\2\2\2\u0136\u0137\5(\25\2\u0137\u0138\5"+
		"8\35\2\u0138\'\3\2\2\2\u0139\u013a\t\5\2\2\u013a)\3\2\2\2\u013b\u013d"+
		"\5,\27\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f+\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5f\64\2"+
		"\u0142\u0144\7\3\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u015a"+
		"\3\2\2\2\u0145\u0147\5 \21\2\u0146\u0148\7\3\2\2\u0147\u0146\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u015a\3\2\2\2\u0149\u014b\58\35\2\u014a\u014c\7\3"+
		"\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u015a\3\2\2\2\u014d"+
		"\u014f\5\66\34\2\u014e\u0150\7\3\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u015a\3\2\2\2\u0151\u0152\7J\2\2\u0152\u0154\5&\24\2\u0153"+
		"\u0155\7\3\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015a\3\2"+
		"\2\2\u0156\u015a\5.\30\2\u0157\u015a\5\60\31\2\u0158\u015a\5\16\b\2\u0159"+
		"\u0141\3\2\2\2\u0159\u0145\3\2\2\2\u0159\u0149\3\2\2\2\u0159\u014d\3\2"+
		"\2\2\u0159\u0151\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a-\3\2\2\2\u015b\u015c\7*\2\2\u015c\u015d\7\26\2\2"+
		"\u015d\u0160\7J\2\2\u015e\u015f\7\34\2\2\u015f\u0161\5j\66\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7$\2\2\u0163"+
		"\u0164\58\35\2\u0164\u016a\7\27\2\2\u0165\u0166\7\30\2\2\u0166\u0167\5"+
		"*\26\2\u0167\u0168\7\31\2\2\u0168\u016b\3\2\2\2\u0169\u016b\5,\27\2\u016a"+
		"\u0165\3\2\2\2\u016a\u0169\3\2\2\2\u016b/\3\2\2\2\u016c\u016d\7+\2\2\u016d"+
		"\u016e\7\26\2\2\u016e\u016f\58\35\2\u016f\u0175\7\27\2\2\u0170\u0171\7"+
		"\30\2\2\u0171\u0172\5*\26\2\u0172\u0173\7\31\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0176\5,\27\2\u0175\u0170\3\2\2\2\u0175\u0174\3\2\2\2\u0176\61\3\2\2"+
		"\2\u0177\u0178\7(\2\2\u0178\u0179\7\26\2\2\u0179\u017a\58\35\2\u017a\u0180"+
		"\7\27\2\2\u017b\u017c\7\30\2\2\u017c\u017d\5*\26\2\u017d\u017e\7\31\2"+
		"\2\u017e\u0181\3\2\2\2\u017f\u0181\5,\27\2\u0180\u017b\3\2\2\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\5\64\33\2\u0183\u0182\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\63\3\2\2\2\u0185\u0186\7)\2\2\u0186\u018d\5"+
		",\27\2\u0187\u0188\7)\2\2\u0188\u0189\7\30\2\2\u0189\u018a\5*\26\2\u018a"+
		"\u018b\7\31\2\2\u018b\u018d\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0187\3"+
		"\2\2\2\u018d\65\3\2\2\2\u018e\u0190\7D\2\2\u018f\u0191\58\35\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\67\3\2\2\2\u0192\u0195\5:\36\2\u0193"+
		"\u0195\5\62\32\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u01959\3\2\2"+
		"\2\u0196\u019b\5<\37\2\u0197\u0198\7\23\2\2\u0198\u019a\5<\37\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c;\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a3\5> \2\u019f\u01a0"+
		"\7\22\2\2\u01a0\u01a2\5> \2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4=\3\2\2\2\u01a5\u01a3\3\2\2\2"+
		"\u01a6\u01ac\5@!\2\u01a7\u01a8\5b\62\2\u01a8\u01a9\5@!\2\u01a9\u01ab\3"+
		"\2\2\2\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad?\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b5\5B\"\2\u01b0"+
		"\u01b1\5d\63\2\u01b1\u01b2\5B\"\2\u01b2\u01b4\3\2\2\2\u01b3\u01b0\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"A\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01c1\5D#\2\u01b9\u01ba\5^\60\2\u01ba"+
		"\u01bb\5D#\2\u01bb\u01c0\3\2\2\2\u01bc\u01bd\5`\61\2\u01bd\u01be\5j\66"+
		"\2\u01be\u01c0\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0\u01c3"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2C\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c9\5F$\2\u01c5\u01c6\7J\2\2\u01c6\u01c8\5F$\2"+
		"\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01caE\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d1\5H%\2\u01cd\u01ce"+
		"\7\4\2\2\u01ce\u01d0\5H%\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2G\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01da\5J&\2\u01d5\u01d6\5\\/\2\u01d6\u01d7\5J&\2\u01d7\u01d9\3"+
		"\2\2\2\u01d8\u01d5\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01dbI\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e3\5L\'\2\u01de"+
		"\u01df\5Z.\2\u01df\u01e0\5L\'\2\u01e0\u01e2\3\2\2\2\u01e1\u01de\3\2\2"+
		"\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4K"+
		"\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\5X-\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5N(\2\u01eaM\3\2\2\2\u01eb"+
		"\u01f8\5P)\2\u01ec\u01ed\7J\2\2\u01ed\u01f8\5V,\2\u01ee\u01ef\7\26\2\2"+
		"\u01ef\u01f0\58\35\2\u01f0\u01f1\7\27\2\2\u01f1\u01f8\3\2\2\2\u01f2\u01f3"+
		"\7\32\2\2\u01f3\u01f4\58\35\2\u01f4\u01f5\7\33\2\2\u01f5\u01f8\3\2\2\2"+
		"\u01f6\u01f8\5l\67\2\u01f7\u01eb\3\2\2\2\u01f7\u01ec\3\2\2\2\u01f7\u01ee"+
		"\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8O\3\2\2\2\u01f9"+
		"\u01fa\7J\2\2\u01fa\u01fb\7\26\2\2\u01fb\u01fc\5R*\2\u01fc\u01fd\7\27"+
		"\2\2\u01fdQ\3\2\2\2\u01fe\u0200\5T+\2\u01ff\u01fe\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0205\3\2\2\2\u0201\u0202\7\25\2\2\u0202\u0204\5T+\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206S\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020c\7J\2\2\u0209\u020c"+
		"\5l\67\2\u020a\u020c\58\35\2\u020b\u0208\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020a\3\2\2\2\u020cU\3\2\2\2\u020d\u021a\7\20\2\2\u020e\u021a\7\21\2"+
		"\2\u020f\u0212\7\24\2\2\u0210\u0213\7J\2\2\u0211\u0213\5P)\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u020f\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\3\2"+
		"\2\2\u0218\u0216\3\2\2\2\u0219\u020d\3\2\2\2\u0219\u020e\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u021aW\3\2\2\2\u021b\u021c\t\6\2\2\u021cY\3\2\2\2\u021d"+
		"\u021e\t\7\2\2\u021e[\3\2\2\2\u021f\u0220\t\b\2\2\u0220]\3\2\2\2\u0221"+
		"\u0222\t\t\2\2\u0222_\3\2\2\2\u0223\u0224\t\n\2\2\u0224a\3\2\2\2\u0225"+
		"\u0226\t\13\2\2\u0226c\3\2\2\2\u0227\u0228\t\f\2\2\u0228e\3\2\2\2\u0229"+
		"\u022f\5h\65\2\u022a\u022b\t\4\2\2\u022b\u022c\7J\2\2\u022c\u022d\7\34"+
		"\2\2\u022d\u022f\5j\66\2\u022e\u0229\3\2\2\2\u022e\u022a\3\2\2\2\u022f"+
		"g\3\2\2\2\u0230\u0231\t\4\2\2\u0231\u0234\7J\2\2\u0232\u0233\7\34\2\2"+
		"\u0233\u0235\5j\66\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\7!\2\2\u0237\u0239\58\35\2\u0238\u023a\7\3\2\2\u0239"+
		"\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023ai\3\2\2\2\u023b\u024c\7\62\2\2"+
		"\u023c\u024c\7\60\2\2\u023d\u024c\7\61\2\2\u023e\u024c\7\63\2\2\u023f"+
		"\u024c\7\64\2\2\u0240\u024c\7\66\2\2\u0241\u024c\7.\2\2\u0242\u024c\7"+
		"/\2\2\u0243\u024c\7,\2\2\u0244\u024c\7-\2\2\u0245\u024c\7\67\2\2\u0246"+
		"\u0247\7J\2\2\u0247\u0248\7\n\2\2\u0248\u0249\5j\66\2\u0249\u024a\7\t"+
		"\2\2\u024a\u024c\3\2\2\2\u024b\u023b\3\2\2\2\u024b\u023c\3\2\2\2\u024b"+
		"\u023d\3\2\2\2\u024b\u023e\3\2\2\2\u024b\u023f\3\2\2\2\u024b\u0240\3\2"+
		"\2\2\u024b\u0241\3\2\2\2\u024b\u0242\3\2\2\2\u024b\u0243\3\2\2\2\u024b"+
		"\u0244\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0246\3\2\2\2\u024ck\3\2\2\2"+
		"\u024d\u0254\7I\2\2\u024e\u0254\7K\2\2\u024f\u0254\7B\2\2\u0250\u0254"+
		"\t\r\2\2\u0251\u0254\7H\2\2\u0252\u0254\7\65\2\2\u0253\u024d\3\2\2\2\u0253"+
		"\u024e\3\2\2\2\u0253\u024f\3\2\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0252\3\2\2\2\u0254m\3\2\2\2Qoruy\u0081\u0085\u008a\u0093\u0095"+
		"\u0099\u009e\u00a3\u00a6\u00ab\u00af\u00ba\u00bf\u00c3\u00c8\u00cb\u00d2"+
		"\u00d4\u00d8\u00db\u00de\u00e5\u00e8\u00ea\u00ed\u00f0\u00f3\u00f7\u00fd"+
		"\u0103\u0116\u0119\u011b\u011f\u0126\u012a\u0134\u013e\u0143\u0147\u014b"+
		"\u014f\u0154\u0159\u0160\u016a\u0175\u0180\u0183\u018c\u0190\u0194\u019b"+
		"\u01a3\u01ac\u01b5\u01bf\u01c1\u01c9\u01d1\u01da\u01e3\u01e7\u01f7\u01ff"+
		"\u0205\u020b\u0212\u0216\u0219\u022e\u0234\u0239\u024b\u0253";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}