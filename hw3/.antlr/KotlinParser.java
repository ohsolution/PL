// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/hw3/Kotlin.g4 by ANTLR 4.8
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
		ABSTRACT=60, INTERFACE=61, GET=62, CONSTRUCTOR=63, NULLT=64, FUN=65, RETC=66, 
		TRUE=67, FALSE=68, MAIN=69, DOWN=70, STEP=71, CHR=72, STR=73, ID=74, NUM=75, 
		FN=76, DIGIT=77, WS=78, COMMENT=79, COMMENT2=80;
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
		RULE_prefixexp = 37, RULE_exppostfix = 38, RULE_indexing = 39, RULE_fccall = 40, 
		RULE_argus = 41, RULE_argu = 42, RULE_oprpostfix = 43, RULE_prefixopr = 44, 
		RULE_mulopr = 45, RULE_addopr = 46, RULE_inopr = 47, RULE_isopr = 48, 
		RULE_eqopr = 49, RULE_cmpopr = 50, RULE_variableD = 51, RULE_propertyD = 52, 
		RULE_typef = 53, RULE_value = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "packageR", "importL", "importR", "outerL", "outerR", "classD", 
			"typec", "classinner", "propertyC", "valcD", "funcD", "cargus", "cargu", 
			"mainf", "functionD", "argument", "whichfunction", "assign", "assignopr", 
			"innerblock", "statement", "forloop", "whileloop", "ifthenelse", "elif", 
			"exit", "expression", "expor", "expand", "expeq", "expcmp", "exppre", 
			"exprange", "expR", "expadd", "expmul", "prefixexp", "exppostfix", "indexing", 
			"fccall", "argus", "argu", "oprpostfix", "prefixopr", "mulopr", "addopr", 
			"inopr", "isopr", "eqopr", "cmpopr", "variableD", "propertyD", "typef", 
			"value"
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
			"'fun'", "'return'", "'true'", "'false'", "'main'", "'downTo'", "'step'"
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
			"INTERFACE", "GET", "CONSTRUCTOR", "NULLT", "FUN", "RETC", "TRUE", "FALSE", 
			"MAIN", "DOWN", "STEP", "CHR", "STR", "ID", "NUM", "FN", "DIGIT", "WS", 
			"COMMENT", "COMMENT2"
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(110);
				packageR();
				}
			}

			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(113);
				importL();
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(116);
				outerL();
				}
				break;
			}
			setState(119);
			mainf();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (VAL - 56)) | (1L << (VAR - 56)) | (1L << (CLASS - 56)) | (1L << (ABSTRACT - 56)) | (1L << (INTERFACE - 56)) | (1L << (FUN - 56)))) != 0)) {
				{
				setState(120);
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
			setState(123);
			match(PACKAGE);
			setState(124);
			match(ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(125);
				match(DOT);
				setState(126);
				match(ID);
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
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(135);
				importR();
				}
				}
				setState(140);
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
			setState(141);
			match(IMPORT);
			setState(142);
			match(ID);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(143);
					match(DOT);
					setState(144);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(145);
					match(DOT);
					setState(146);
					match(ID);
					}
					break;
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(152);
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
			setState(156); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(155);
					outerR();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158); 
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
	}

	public final OuterRContext outerR() throws RecognitionException {
		OuterRContext _localctx = new OuterRContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outerR);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				functionD();
				}
				break;
			case CLASS:
			case ABSTRACT:
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				classD();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
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
	}

	public final ClassDContext classD() throws RecognitionException {
		ClassDContext _localctx = new ClassDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(165);
				match(ABSTRACT);
				}
			}

			setState(168);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR || _la==CONSTRUCTOR) {
				{
				setState(170);
				cargus();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(173);
				match(COLON);
				setState(174);
				typec();
				}
			}

			{
			setState(177);
			match(LB);
			setState(178);
			classinner();
			setState(179);
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
	}

	public final TypecContext typec() throws RecognitionException {
		TypecContext _localctx = new TypecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expression();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				expression();
				}
				}
				setState(188);
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
	}

	public final ClassinnerContext classinner() throws RecognitionException {
		ClassinnerContext _localctx = new ClassinnerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classinner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (VAL - 56)) | (1L << (VAR - 56)) | (1L << (OVERRIDE - 56)) | (1L << (ABSTRACT - 56)) | (1L << (FUN - 56)))) != 0)) {
				{
				{
				setState(189);
				propertyC();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(190);
					match(SEMI);
					}
				}

				}
				}
				setState(197);
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
	}

	public final PropertyCContext propertyC() throws RecognitionException {
		PropertyCContext _localctx = new PropertyCContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyC);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				funcD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
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
	}

	public final ValcDContext valcD() throws RecognitionException {
		ValcDContext _localctx = new ValcDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valcD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE || _la==ABSTRACT) {
				{
				setState(202);
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

			setState(205);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			match(ID);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(207);
				match(COLON);
				setState(208);
				typef();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET) {
					{
					setState(209);
					match(GET);
					}
				}

				}
			}

			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASN) {
				{
				setState(214);
				match(ASN);
				setState(215);
				expression();
				}
			}

			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(218);
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
	}

	public final FuncDContext funcD() throws RecognitionException {
		FuncDContext _localctx = new FuncDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE || _la==ABSTRACT) {
				{
				setState(221);
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

			setState(224);
			match(FUN);
			setState(225);
			match(ID);
			setState(226);
			argument();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(227);
				match(COLON);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (BOOL - 42)) | (1L << (BYTE - 42)) | (1L << (SHORT - 42)) | (1L << (LONG - 42)) | (1L << (FLOAT - 42)) | (1L << (DOUBLE - 42)) | (1L << (INT - 42)) | (1L << (STRING - 42)) | (1L << (UNIT - 42)) | (1L << (ANY - 42)) | (1L << (CHAR - 42)) | (1L << (ID - 42)))) != 0)) {
					{
					setState(228);
					typef();
					}
				}

				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(231);
					match(QUERY);
					}
				}

				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PASN) | (1L << MASN) | (1L << MULASN) | (1L << DIVASN) | (1L << MODASN) | (1L << LB) | (1L << ASN))) != 0)) {
				{
				setState(236);
				whichfunction();
				}
			}

			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(239);
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
	}

	public final CargusContext cargus() throws RecognitionException {
		CargusContext _localctx = new CargusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cargus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(242);
				match(CONSTRUCTOR);
				}
			}

			setState(245);
			match(LPAR);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (VAL - 56)) | (1L << (VAR - 56)) | (1L << (ID - 56)))) != 0)) {
				{
				setState(246);
				cargu();
				}
			}

			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				cargu();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
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
	}

	public final CarguContext cargu() throws RecognitionException {
		CarguContext _localctx = new CarguContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cargu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(258);
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

			setState(261);
			match(ID);
			setState(262);
			match(COLON);
			setState(263);
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
	}

	public final MainfContext mainf() throws RecognitionException {
		MainfContext _localctx = new MainfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FUN);
			setState(266);
			match(MAIN);
			setState(267);
			match(LPAR);
			setState(268);
			match(RPAR);
			setState(269);
			match(LB);
			setState(270);
			innerblock();
			setState(271);
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
	}

	public final FunctionDContext functionD() throws RecognitionException {
		FunctionDContext _localctx = new FunctionDContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FUN);
			setState(274);
			match(ID);
			setState(275);
			argument();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(276);
				match(COLON);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (BOOL - 42)) | (1L << (BYTE - 42)) | (1L << (SHORT - 42)) | (1L << (LONG - 42)) | (1L << (FLOAT - 42)) | (1L << (DOUBLE - 42)) | (1L << (INT - 42)) | (1L << (STRING - 42)) | (1L << (UNIT - 42)) | (1L << (ANY - 42)) | (1L << (CHAR - 42)) | (1L << (ID - 42)))) != 0)) {
					{
					setState(277);
					typef();
					}
				}

				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(280);
					match(QUERY);
					}
				}

				}
			}

			setState(285);
			whichfunction();
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(286);
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
		enterRule(_localctx, 32, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LPAR);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(290);
				match(ID);
				setState(291);
				match(COLON);
				setState(292);
				typef();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(293);
					match(COMMA);
					}
				}

				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
	}

	public final WhichfunctionContext whichfunction() throws RecognitionException {
		WhichfunctionContext _localctx = new WhichfunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whichfunction);
		try {
			setState(308);
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
				setState(303);
				assign();
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(LB);
				setState(305);
				innerblock();
				setState(306);
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
		enterRule(_localctx, 36, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			assignopr();
			setState(311);
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
		enterRule(_localctx, 38, RULE_assignopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 40, RULE_innerblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (DPULS - 14)) | (1L << (DMINUS - 14)) | (1L << (LPAR - 14)) | (1L << (LSQ - 14)) | (1L << (PULS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (FOR - 14)) | (1L << (WHILE - 14)) | (1L << (SUPERANY - 14)) | (1L << (VAL - 14)) | (1L << (VAR - 14)) | (1L << (CLASS - 14)) | (1L << (ABSTRACT - 14)) | (1L << (INTERFACE - 14)) | (1L << (NULLT - 14)) | (1L << (FUN - 14)) | (1L << (RETC - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (CHR - 14)) | (1L << (STR - 14)) | (1L << (ID - 14)) | (1L << (NUM - 14)))) != 0)) {
				{
				{
				setState(315);
				statement();
				}
				}
				setState(320);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				variableD();
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(322);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				functionD();
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(326);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				expression();
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(330);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				exit();
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(334);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(ID);
				setState(338);
				assign();
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(339);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				forloop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				whileloop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
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
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(FOR);
			setState(348);
			match(LPAR);
			setState(349);
			match(ID);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(350);
				match(COLON);
				setState(351);
				typef();
				}
			}

			setState(354);
			match(IN);
			setState(355);
			expression();
			setState(356);
			match(RPAR);
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(357);
				match(LB);
				setState(358);
				innerblock();
				setState(359);
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
			case NULLT:
			case FUN:
			case RETC:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				{
				setState(361);
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
		enterRule(_localctx, 46, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(WHILE);
			setState(365);
			match(LPAR);
			setState(366);
			expression();
			setState(367);
			match(RPAR);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(368);
				match(LB);
				setState(369);
				innerblock();
				setState(370);
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
			case NULLT:
			case FUN:
			case RETC:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				{
				setState(372);
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
		enterRule(_localctx, 48, RULE_ifthenelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(IF);
			setState(376);
			match(LPAR);
			setState(377);
			expression();
			setState(378);
			match(RPAR);
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				{
				{
				setState(379);
				match(LB);
				setState(380);
				innerblock();
				setState(381);
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
			case NULLT:
			case FUN:
			case RETC:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				{
				setState(383);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(386);
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
		enterRule(_localctx, 50, RULE_elif);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(ELSE);
				setState(390);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(ELSE);
				setState(392);
				match(LB);
				setState(393);
				innerblock();
				setState(394);
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
		enterRule(_localctx, 52, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(RETC);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(399);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DPULS:
			case DMINUS:
			case LPAR:
			case LSQ:
			case PULS:
			case MINUS:
			case SUPERANY:
			case NULLT:
			case TRUE:
			case FALSE:
			case CHR:
			case STR:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				expor();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
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
		enterRule(_localctx, 56, RULE_expor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			expand();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(407);
				match(LOGICOR);
				setState(408);
				expand();
				}
				}
				setState(413);
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
		enterRule(_localctx, 58, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			expeq();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(415);
				match(LOGICAND);
				setState(416);
				expeq();
				}
				}
				setState(421);
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
		enterRule(_localctx, 60, RULE_expeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			expcmp();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(423);
				eqopr();
				setState(424);
				expcmp();
				}
				}
				setState(430);
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
		enterRule(_localctx, 62, RULE_expcmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			exppre();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(432);
				cmpopr();
				setState(433);
				exppre();
				}
				}
				setState(439);
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
	}

	public final ExppreContext exppre() throws RecognitionException {
		ExppreContext _localctx = new ExppreContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exppre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			exprange();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NIN) | (1L << IS) | (1L << NIS))) != 0)) {
				{
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
				case NIN:
					{
					{
					setState(441);
					inopr();
					setState(442);
					exprange();
					}
					}
					break;
				case IS:
				case NIS:
					{
					{
					setState(444);
					isopr();
					setState(445);
					typef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(451);
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
		public List<TerminalNode> DOWN() { return getTokens(KotlinParser.DOWN); }
		public TerminalNode DOWN(int i) {
			return getToken(KotlinParser.DOWN, i);
		}
		public List<TerminalNode> STEP() { return getTokens(KotlinParser.STEP); }
		public TerminalNode STEP(int i) {
			return getToken(KotlinParser.STEP, i);
		}
		public ExprangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprange; }
	}

	public final ExprangeContext exprange() throws RecognitionException {
		ExprangeContext _localctx = new ExprangeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			expR();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOWN || _la==STEP) {
				{
				{
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==DOWN || _la==STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(454);
				expR();
				}
				}
				setState(459);
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
		enterRule(_localctx, 68, RULE_expR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			expadd();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWODOT) {
				{
				{
				setState(461);
				match(TWODOT);
				setState(462);
				expadd();
				}
				}
				setState(467);
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
		enterRule(_localctx, 70, RULE_expadd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			expmul();
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					addopr();
					setState(470);
					expmul();
					}
					} 
				}
				setState(476);
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
	}

	public final ExpmulContext expmul() throws RecognitionException {
		ExpmulContext _localctx = new ExpmulContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			prefixexp();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(478);
				mulopr();
				setState(479);
				prefixexp();
				}
				}
				setState(485);
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
		enterRule(_localctx, 74, RULE_prefixexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << PULS) | (1L << MINUS))) != 0)) {
				{
				setState(486);
				prefixopr();
				}
			}

			setState(489);
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
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
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
		enterRule(_localctx, 76, RULE_exppostfix);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				fccall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				indexing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(ID);
				setState(494);
				oprpostfix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				match(LPAR);
				setState(496);
				expression();
				setState(497);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				match(LSQ);
				setState(500);
				expression();
				setState(501);
				match(RSQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
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

	public static class IndexingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode LSQ() { return getToken(KotlinParser.LSQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(KotlinParser.RSQ, 0); }
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(ID);
			setState(507);
			match(LSQ);
			setState(508);
			expression();
			setState(509);
			match(RSQ);
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
		public TerminalNode LB() { return getToken(KotlinParser.LB, 0); }
		public TerminalNode RB() { return getToken(KotlinParser.RB, 0); }
		public FccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fccall; }
	}

	public final FccallContext fccall() throws RecognitionException {
		FccallContext _localctx = new FccallContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fccall);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(ID);
				setState(512);
				match(LPAR);
				setState(513);
				argus();
				setState(514);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(ID);
				setState(517);
				match(LB);
				setState(518);
				argus();
				setState(519);
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
		enterRule(_localctx, 82, RULE_argus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (DPULS - 14)) | (1L << (DMINUS - 14)) | (1L << (LPAR - 14)) | (1L << (LSQ - 14)) | (1L << (PULS - 14)) | (1L << (MINUS - 14)) | (1L << (IF - 14)) | (1L << (SUPERANY - 14)) | (1L << (NULLT - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (CHR - 14)) | (1L << (STR - 14)) | (1L << (ID - 14)) | (1L << (NUM - 14)))) != 0)) {
				{
				setState(523);
				argu();
				}
			}

			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(526);
				match(COMMA);
				setState(527);
				argu();
				}
				}
				setState(532);
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
		enterRule(_localctx, 84, RULE_argu);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
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
		enterRule(_localctx, 86, RULE_oprpostfix);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(DPULS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(DMINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(540);
					match(DOT);
					setState(543);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(541);
						match(ID);
						}
						break;
					case 2:
						{
						setState(542);
						fccall();
						}
						break;
					}
					}
					}
					setState(549);
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
		enterRule(_localctx, 88, RULE_prefixopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
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
		enterRule(_localctx, 90, RULE_mulopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
		enterRule(_localctx, 92, RULE_addopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		enterRule(_localctx, 94, RULE_inopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		enterRule(_localctx, 96, RULE_isopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 98, RULE_eqopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 100, RULE_cmpopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 102, RULE_variableD);
		int _la;
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				propertyD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(568);
				match(ID);
				setState(569);
				match(COLON);
				setState(570);
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
		enterRule(_localctx, 104, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(574);
			match(ID);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(575);
				match(COLON);
				setState(576);
				typef();
				}
			}

			setState(579);
			match(ASN);
			setState(580);
			expression();
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(581);
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
	}

	public final TypefContext typef() throws RecognitionException {
		TypefContext _localctx = new TypefContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typef);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				match(STRING);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(588);
				match(UNIT);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(589);
				match(ANY);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(590);
				match(SHORT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 8);
				{
				setState(591);
				match(LONG);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 9);
				{
				setState(592);
				match(BOOL);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 10);
				{
				setState(593);
				match(BYTE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(594);
				match(CHAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 12);
				{
				setState(595);
				match(ID);
				setState(596);
				match(LT);
				setState(597);
				typef();
				setState(598);
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
		public TerminalNode NULLT() { return getToken(KotlinParser.NULLT, 0); }
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
		enterRule(_localctx, 108, RULE_value);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(STR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(NUM);
				}
				break;
			case NULLT:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				match(NULLT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
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
				setState(606);
				match(CHR);
				}
				break;
			case SUPERANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(607);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u0265\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\5\2r\n\2\3\2\5\2u\n\2\3\2"+
		"\5\2x\n\2\3\2\3\2\5\2|\n\2\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085"+
		"\13\3\3\3\5\3\u0088\n\3\3\4\7\4\u008b\n\4\f\4\16\4\u008e\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u0096\n\5\f\5\16\5\u0099\13\5\3\5\5\5\u009c\n\5\3"+
		"\6\6\6\u009f\n\6\r\6\16\6\u00a0\3\7\3\7\3\7\5\7\u00a6\n\7\3\b\5\b\u00a9"+
		"\n\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\b\3\b\5\b\u00b2\n\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\n\3\n\5\n\u00c2\n\n\7\n"+
		"\u00c4\n\n\f\n\16\n\u00c7\13\n\3\13\3\13\5\13\u00cb\n\13\3\f\5\f\u00ce"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d5\n\f\5\f\u00d7\n\f\3\f\3\f\5\f\u00db"+
		"\n\f\3\f\5\f\u00de\n\f\3\r\5\r\u00e1\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e8"+
		"\n\r\3\r\5\r\u00eb\n\r\5\r\u00ed\n\r\3\r\5\r\u00f0\n\r\3\r\5\r\u00f3\n"+
		"\r\3\16\5\16\u00f6\n\16\3\16\3\16\5\16\u00fa\n\16\3\16\3\16\7\16\u00fe"+
		"\n\16\f\16\16\16\u0101\13\16\3\16\3\16\3\17\5\17\u0106\n\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0119\n\21\3\21\5\21\u011c\n\21\5\21\u011e\n\21\3\21\3\21\5"+
		"\21\u0122\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0129\n\22\7\22\u012b\n\22"+
		"\f\22\16\22\u012e\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0137"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\3\26\7\26\u013f\n\26\f\26\16\26\u0142\13"+
		"\26\3\27\3\27\5\27\u0146\n\27\3\27\3\27\5\27\u014a\n\27\3\27\3\27\5\27"+
		"\u014e\n\27\3\27\3\27\5\27\u0152\n\27\3\27\3\27\3\27\5\27\u0157\n\27\3"+
		"\27\3\27\3\27\5\27\u015c\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0163\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u016d\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0178\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0183\n\32\3\32\5\32\u0186\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u018f\n\33\3\34\3\34\5\34\u0193\n\34\3\35"+
		"\3\35\5\35\u0197\n\35\3\36\3\36\3\36\7\36\u019c\n\36\f\36\16\36\u019f"+
		"\13\36\3\37\3\37\3\37\7\37\u01a4\n\37\f\37\16\37\u01a7\13\37\3 \3 \3 "+
		"\3 \7 \u01ad\n \f \16 \u01b0\13 \3!\3!\3!\3!\7!\u01b6\n!\f!\16!\u01b9"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01c2\n\"\f\"\16\"\u01c5\13\"\3#"+
		"\3#\3#\7#\u01ca\n#\f#\16#\u01cd\13#\3$\3$\3$\7$\u01d2\n$\f$\16$\u01d5"+
		"\13$\3%\3%\3%\3%\7%\u01db\n%\f%\16%\u01de\13%\3&\3&\3&\3&\7&\u01e4\n&"+
		"\f&\16&\u01e7\13&\3\'\5\'\u01ea\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u01fb\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u020c\n*\3+\5+\u020f\n+\3+\3+\7+\u0213\n+\f+\16+\u0216\13+\3,\3,"+
		"\3,\5,\u021b\n,\3-\3-\3-\3-\3-\5-\u0222\n-\7-\u0224\n-\f-\16-\u0227\13"+
		"-\5-\u0229\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u023e\n\65\3\66\3\66\3\66\3\66\5\66"+
		"\u0244\n\66\3\66\3\66\3\66\5\66\u0249\n\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u025b\n\67"+
		"\38\38\38\38\38\38\58\u0263\n8\38\2\29\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\17\4\2==??"+
		"\4\2<<>>\3\2:;\4\2\13\17!!\3\2HI\4\2\20\21\"#\3\2\36 \3\2\"#\3\2$%\3\2"+
		"&\'\3\2\5\6\3\2\7\n\3\2EF\2\u0298\2q\3\2\2\2\4}\3\2\2\2\6\u008c\3\2\2"+
		"\2\b\u008f\3\2\2\2\n\u009e\3\2\2\2\f\u00a5\3\2\2\2\16\u00a8\3\2\2\2\20"+
		"\u00b7\3\2\2\2\22\u00c5\3\2\2\2\24\u00ca\3\2\2\2\26\u00cd\3\2\2\2\30\u00e0"+
		"\3\2\2\2\32\u00f5\3\2\2\2\34\u0105\3\2\2\2\36\u010b\3\2\2\2 \u0113\3\2"+
		"\2\2\"\u0123\3\2\2\2$\u0136\3\2\2\2&\u0138\3\2\2\2(\u013b\3\2\2\2*\u0140"+
		"\3\2\2\2,\u015b\3\2\2\2.\u015d\3\2\2\2\60\u016e\3\2\2\2\62\u0179\3\2\2"+
		"\2\64\u018e\3\2\2\2\66\u0190\3\2\2\28\u0196\3\2\2\2:\u0198\3\2\2\2<\u01a0"+
		"\3\2\2\2>\u01a8\3\2\2\2@\u01b1\3\2\2\2B\u01ba\3\2\2\2D\u01c6\3\2\2\2F"+
		"\u01ce\3\2\2\2H\u01d6\3\2\2\2J\u01df\3\2\2\2L\u01e9\3\2\2\2N\u01fa\3\2"+
		"\2\2P\u01fc\3\2\2\2R\u020b\3\2\2\2T\u020e\3\2\2\2V\u021a\3\2\2\2X\u0228"+
		"\3\2\2\2Z\u022a\3\2\2\2\\\u022c\3\2\2\2^\u022e\3\2\2\2`\u0230\3\2\2\2"+
		"b\u0232\3\2\2\2d\u0234\3\2\2\2f\u0236\3\2\2\2h\u023d\3\2\2\2j\u023f\3"+
		"\2\2\2l\u025a\3\2\2\2n\u0262\3\2\2\2pr\5\4\3\2qp\3\2\2\2qr\3\2\2\2rt\3"+
		"\2\2\2su\5\6\4\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\5\n\6\2wv\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2y{\5\36\20\2z|\5\n\6\2{z\3\2\2\2{|\3\2\2\2|\3\3\2\2\2"+
		"}~\78\2\2~\u0083\7L\2\2\177\u0080\7\24\2\2\u0080\u0082\7L\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\3\2\2\u0087\u0086\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\5\3\2\2\2\u0089\u008b\5\b\5\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\7\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\79\2\2\u0090\u0097\7L\2\2\u0091"+
		"\u0092\7\24\2\2\u0092\u0096\7\36\2\2\u0093\u0094\7\24\2\2\u0094\u0096"+
		"\7L\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009c\7\3\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\t\3\2\2\2\u009d\u009f\5\f\7\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\13\3\2\2\2\u00a2\u00a6"+
		"\5 \21\2\u00a3\u00a6\5\16\b\2\u00a4\u00a6\5j\66\2\u00a5\u00a2\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00a9\7"+
		">\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\t\2\2\2\u00ab\u00ad\7L\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00ac\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b0\7\34\2\2\u00b0"+
		"\u00b2\5\20\t\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b4\7\30\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7\31\2\2"+
		"\u00b6\17\3\2\2\2\u00b7\u00bc\58\35\2\u00b8\u00b9\7\25\2\2\u00b9\u00bb"+
		"\58\35\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\5\24\13"+
		"\2\u00c0\u00c2\7\3\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\5\30\r"+
		"\2\u00c9\u00cb\5\26\f\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\25\3\2\2\2\u00cc\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\t\4\2\2\u00d0\u00d6\7L\2\2\u00d1\u00d2"+
		"\7\34\2\2\u00d2\u00d4\5l\67\2\u00d3\u00d5\7@\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\7!\2\2\u00d9\u00db\58\35\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\7\3"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e1"+
		"\t\3\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7C\2\2\u00e3\u00e4\7L\2\2\u00e4\u00ec\5\"\22\2\u00e5\u00e7\7\34"+
		"\2\2\u00e6\u00e8\5l\67\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00eb\7\35\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00f0\5$\23\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\7\3\2\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f6\7A\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\7\26\2\2\u00f8\u00fa"+
		"\5\34\17\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00ff\3\2\2\2"+
		"\u00fb\u00fc\7\25\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\27\2\2\u0103\33\3\2\2\2\u0104\u0106"+
		"\t\4\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7L\2\2\u0108\u0109\7\34\2\2\u0109\u010a\5l\67\2\u010a\35\3\2\2"+
		"\2\u010b\u010c\7C\2\2\u010c\u010d\7G\2\2\u010d\u010e\7\26\2\2\u010e\u010f"+
		"\7\27\2\2\u010f\u0110\7\30\2\2\u0110\u0111\5*\26\2\u0111\u0112\7\31\2"+
		"\2\u0112\37\3\2\2\2\u0113\u0114\7C\2\2\u0114\u0115\7L\2\2\u0115\u011d"+
		"\5\"\22\2\u0116\u0118\7\34\2\2\u0117\u0119\5l\67\2\u0118\u0117\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\7\35\2\2\u011b\u011a"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0116\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\5$\23\2\u0120\u0122\7\3"+
		"\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122!\3\2\2\2\u0123\u012c"+
		"\7\26\2\2\u0124\u0125\7L\2\2\u0125\u0126\7\34\2\2\u0126\u0128\5l\67\2"+
		"\u0127\u0129\7\25\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0124\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\27"+
		"\2\2\u0130#\3\2\2\2\u0131\u0137\5&\24\2\u0132\u0133\7\30\2\2\u0133\u0134"+
		"\5*\26\2\u0134\u0135\7\31\2\2\u0135\u0137\3\2\2\2\u0136\u0131\3\2\2\2"+
		"\u0136\u0132\3\2\2\2\u0137%\3\2\2\2\u0138\u0139\5(\25\2\u0139\u013a\5"+
		"8\35\2\u013a\'\3\2\2\2\u013b\u013c\t\5\2\2\u013c)\3\2\2\2\u013d\u013f"+
		"\5,\27\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141+\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\5h\65\2"+
		"\u0144\u0146\7\3\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u015c"+
		"\3\2\2\2\u0147\u0149\5 \21\2\u0148\u014a\7\3\2\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u015c\3\2\2\2\u014b\u014d\58\35\2\u014c\u014e\7\3"+
		"\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u015c\3\2\2\2\u014f"+
		"\u0151\5\66\34\2\u0150\u0152\7\3\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u015c\3\2\2\2\u0153\u0154\7L\2\2\u0154\u0156\5&\24\2\u0155"+
		"\u0157\7\3\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015c\3\2"+
		"\2\2\u0158\u015c\5.\30\2\u0159\u015c\5\60\31\2\u015a\u015c\5\16\b\2\u015b"+
		"\u0143\3\2\2\2\u015b\u0147\3\2\2\2\u015b\u014b\3\2\2\2\u015b\u014f\3\2"+
		"\2\2\u015b\u0153\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015c-\3\2\2\2\u015d\u015e\7*\2\2\u015e\u015f\7\26\2\2"+
		"\u015f\u0162\7L\2\2\u0160\u0161\7\34\2\2\u0161\u0163\5l\67\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7$\2\2\u0165"+
		"\u0166\58\35\2\u0166\u016c\7\27\2\2\u0167\u0168\7\30\2\2\u0168\u0169\5"+
		"*\26\2\u0169\u016a\7\31\2\2\u016a\u016d\3\2\2\2\u016b\u016d\5,\27\2\u016c"+
		"\u0167\3\2\2\2\u016c\u016b\3\2\2\2\u016d/\3\2\2\2\u016e\u016f\7+\2\2\u016f"+
		"\u0170\7\26\2\2\u0170\u0171\58\35\2\u0171\u0177\7\27\2\2\u0172\u0173\7"+
		"\30\2\2\u0173\u0174\5*\26\2\u0174\u0175\7\31\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0178\5,\27\2\u0177\u0172\3\2\2\2\u0177\u0176\3\2\2\2\u0178\61\3\2\2"+
		"\2\u0179\u017a\7(\2\2\u017a\u017b\7\26\2\2\u017b\u017c\58\35\2\u017c\u0182"+
		"\7\27\2\2\u017d\u017e\7\30\2\2\u017e\u017f\5*\26\2\u017f\u0180\7\31\2"+
		"\2\u0180\u0183\3\2\2\2\u0181\u0183\5,\27\2\u0182\u017d\3\2\2\2\u0182\u0181"+
		"\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\5\64\33\2\u0185\u0184\3\2\2\2"+
		"\u0185\u0186\3\2\2\2\u0186\63\3\2\2\2\u0187\u0188\7)\2\2\u0188\u018f\5"+
		",\27\2\u0189\u018a\7)\2\2\u018a\u018b\7\30\2\2\u018b\u018c\5*\26\2\u018c"+
		"\u018d\7\31\2\2\u018d\u018f\3\2\2\2\u018e\u0187\3\2\2\2\u018e\u0189\3"+
		"\2\2\2\u018f\65\3\2\2\2\u0190\u0192\7D\2\2\u0191\u0193\58\35\2\u0192\u0191"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\67\3\2\2\2\u0194\u0197\5:\36\2\u0195"+
		"\u0197\5\62\32\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u01979\3\2\2"+
		"\2\u0198\u019d\5<\37\2\u0199\u019a\7\23\2\2\u019a\u019c\5<\37\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e;\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a5\5> \2\u01a1\u01a2"+
		"\7\22\2\2\u01a2\u01a4\5> \2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6=\3\2\2\2\u01a7\u01a5\3\2\2\2"+
		"\u01a8\u01ae\5@!\2\u01a9\u01aa\5d\63\2\u01aa\u01ab\5@!\2\u01ab\u01ad\3"+
		"\2\2\2\u01ac\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af?\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b7\5B\"\2\u01b2"+
		"\u01b3\5f\64\2\u01b3\u01b4\5B\"\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2"+
		"\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"A\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01c3\5D#\2\u01bb\u01bc\5`\61\2\u01bc"+
		"\u01bd\5D#\2\u01bd\u01c2\3\2\2\2\u01be\u01bf\5b\62\2\u01bf\u01c0\5l\67"+
		"\2\u01c0\u01c2\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2\u01c5"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4C\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01cb\5F$\2\u01c7\u01c8\t\6\2\2\u01c8\u01ca\5F$\2"+
		"\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01ccE\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d3\5H%\2\u01cf\u01d0"+
		"\7\4\2\2\u01d0\u01d2\5H%\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4G\3\2\2\2\u01d5\u01d3\3\2\2\2"+
		"\u01d6\u01dc\5J&\2\u01d7\u01d8\5^\60\2\u01d8\u01d9\5J&\2\u01d9\u01db\3"+
		"\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01ddI\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e5\5L\'\2\u01e0"+
		"\u01e1\5\\/\2\u01e1\u01e2\5L\'\2\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3\2\2"+
		"\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6K"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\5Z.\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5N(\2\u01ecM\3\2\2\2\u01ed"+
		"\u01fb\5R*\2\u01ee\u01fb\5P)\2\u01ef\u01f0\7L\2\2\u01f0\u01fb\5X-\2\u01f1"+
		"\u01f2\7\26\2\2\u01f2\u01f3\58\35\2\u01f3\u01f4\7\27\2\2\u01f4\u01fb\3"+
		"\2\2\2\u01f5\u01f6\7\32\2\2\u01f6\u01f7\58\35\2\u01f7\u01f8\7\33\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01fb\5n8\2\u01fa\u01ed\3\2\2\2\u01fa\u01ee\3\2\2"+
		"\2\u01fa\u01ef\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f9"+
		"\3\2\2\2\u01fbO\3\2\2\2\u01fc\u01fd\7L\2\2\u01fd\u01fe\7\32\2\2\u01fe"+
		"\u01ff\58\35\2\u01ff\u0200\7\33\2\2\u0200Q\3\2\2\2\u0201\u0202\7L\2\2"+
		"\u0202\u0203\7\26\2\2\u0203\u0204\5T+\2\u0204\u0205\7\27\2\2\u0205\u020c"+
		"\3\2\2\2\u0206\u0207\7L\2\2\u0207\u0208\7\30\2\2\u0208\u0209\5T+\2\u0209"+
		"\u020a\7\31\2\2\u020a\u020c\3\2\2\2\u020b\u0201\3\2\2\2\u020b\u0206\3"+
		"\2\2\2\u020cS\3\2\2\2\u020d\u020f\5V,\2\u020e\u020d\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0214\3\2\2\2\u0210\u0211\7\25\2\2\u0211\u0213\5V,\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215U\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u021b\7L\2\2\u0218\u021b"+
		"\5n8\2\u0219\u021b\58\35\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u0219\3\2\2\2\u021bW\3\2\2\2\u021c\u0229\7\20\2\2\u021d\u0229\7\21\2"+
		"\2\u021e\u0221\7\24\2\2\u021f\u0222\7L\2\2\u0220\u0222\5R*\2\u0221\u021f"+
		"\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u021e\3\2\2\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0228\u021c\3\2\2\2\u0228\u021d\3\2\2\2\u0228"+
		"\u0225\3\2\2\2\u0229Y\3\2\2\2\u022a\u022b\t\7\2\2\u022b[\3\2\2\2\u022c"+
		"\u022d\t\b\2\2\u022d]\3\2\2\2\u022e\u022f\t\t\2\2\u022f_\3\2\2\2\u0230"+
		"\u0231\t\n\2\2\u0231a\3\2\2\2\u0232\u0233\t\13\2\2\u0233c\3\2\2\2\u0234"+
		"\u0235\t\f\2\2\u0235e\3\2\2\2\u0236\u0237\t\r\2\2\u0237g\3\2\2\2\u0238"+
		"\u023e\5j\66\2\u0239\u023a\t\4\2\2\u023a\u023b\7L\2\2\u023b\u023c\7\34"+
		"\2\2\u023c\u023e\5l\67\2\u023d\u0238\3\2\2\2\u023d\u0239\3\2\2\2\u023e"+
		"i\3\2\2\2\u023f\u0240\t\4\2\2\u0240\u0243\7L\2\2\u0241\u0242\7\34\2\2"+
		"\u0242\u0244\5l\67\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0246\7!\2\2\u0246\u0248\58\35\2\u0247\u0249\7\3\2\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249k\3\2\2\2\u024a\u025b\7\62\2\2"+
		"\u024b\u025b\7\60\2\2\u024c\u025b\7\61\2\2\u024d\u025b\7\63\2\2\u024e"+
		"\u025b\7\64\2\2\u024f\u025b\7\66\2\2\u0250\u025b\7.\2\2\u0251\u025b\7"+
		"/\2\2\u0252\u025b\7,\2\2\u0253\u025b\7-\2\2\u0254\u025b\7\67\2\2\u0255"+
		"\u0256\7L\2\2\u0256\u0257\7\n\2\2\u0257\u0258\5l\67\2\u0258\u0259\7\t"+
		"\2\2\u0259\u025b\3\2\2\2\u025a\u024a\3\2\2\2\u025a\u024b\3\2\2\2\u025a"+
		"\u024c\3\2\2\2\u025a\u024d\3\2\2\2\u025a\u024e\3\2\2\2\u025a\u024f\3\2"+
		"\2\2\u025a\u0250\3\2\2\2\u025a\u0251\3\2\2\2\u025a\u0252\3\2\2\2\u025a"+
		"\u0253\3\2\2\2\u025a\u0254\3\2\2\2\u025a\u0255\3\2\2\2\u025bm\3\2\2\2"+
		"\u025c\u0263\7K\2\2\u025d\u0263\7M\2\2\u025e\u0263\7B\2\2\u025f\u0263"+
		"\t\16\2\2\u0260\u0263\7J\2\2\u0261\u0263\7\65\2\2\u0262\u025c\3\2\2\2"+
		"\u0262\u025d\3\2\2\2\u0262\u025e\3\2\2\2\u0262\u025f\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0261\3\2\2\2\u0263o\3\2\2\2Rqtw{\u0083\u0087\u008c\u0095"+
		"\u0097\u009b\u00a0\u00a5\u00a8\u00ad\u00b1\u00bc\u00c1\u00c5\u00ca\u00cd"+
		"\u00d4\u00d6\u00da\u00dd\u00e0\u00e7\u00ea\u00ec\u00ef\u00f2\u00f5\u00f9"+
		"\u00ff\u0105\u0118\u011b\u011d\u0121\u0128\u012c\u0136\u0140\u0145\u0149"+
		"\u014d\u0151\u0156\u015b\u0162\u016c\u0177\u0182\u0185\u018e\u0192\u0196"+
		"\u019d\u01a5\u01ae\u01b7\u01c1\u01c3\u01cb\u01d3\u01dc\u01e5\u01e9\u01fa"+
		"\u020b\u020e\u0214\u021a\u0221\u0225\u0228\u023d\u0243\u0248\u025a\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}