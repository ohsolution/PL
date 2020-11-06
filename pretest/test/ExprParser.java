// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, TWODOT=2, EQ=3, NEQ=4, GE=5, LE=6, GT=7, LT=8, PASN=9, MASN=10, 
		MULASN=11, DIVASN=12, MODASN=13, DPULS=14, DMINUS=15, LOGICAND=16, LOGICOR=17, 
		DOT=18, COMMA=19, LPAR=20, RPAR=21, LB=22, RB=23, LSQ=24, RSQ=25, COLON=26, 
		QUERY=27, MUL=28, DIV=29, MOD=30, ASN=31, PULS=32, MINUS=33, IN=34, NIN=35, 
		IS=36, NIS=37, PACKAGE=38, IMPORT=39, INT=40, REAL=41, STRING=42, UNIT=43, 
		VAL=44, VAR=45, ANY=46, FUN=47, RETC=48, STR=49, ID=50, NUM=51, FN=52, 
		DIGIT=53, WS=54, COMMENT=55, COMMENT2=56;
	public static final int
		RULE_file = 0, RULE_packageR = 1, RULE_importL = 2, RULE_importR = 3, 
		RULE_outerL = 4, RULE_outerR = 5, RULE_functionD = 6, RULE_argument = 7, 
		RULE_whichfunction = 8, RULE_assign = 9, RULE_assignopr = 10, RULE_innerblock = 11, 
		RULE_statement = 12, RULE_exit = 13, RULE_expression = 14, RULE_expor = 15, 
		RULE_expand = 16, RULE_expeq = 17, RULE_expcmp = 18, RULE_exppre = 19, 
		RULE_expR = 20, RULE_expadd = 21, RULE_expmul = 22, RULE_prefixexp = 23, 
		RULE_exppostfix = 24, RULE_functioncall = 25, RULE_argu = 26, RULE_oprpostfix = 27, 
		RULE_prefixopr = 28, RULE_mulopr = 29, RULE_addopr = 30, RULE_inopr = 31, 
		RULE_isopr = 32, RULE_eqopr = 33, RULE_cmpopr = 34, RULE_variableD = 35, 
		RULE_propertyD = 36, RULE_typef = 37, RULE_value = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "packageR", "importL", "importR", "outerL", "outerR", "functionD", 
			"argument", "whichfunction", "assign", "assignopr", "innerblock", "statement", 
			"exit", "expression", "expor", "expand", "expeq", "expcmp", "exppre", 
			"expR", "expadd", "expmul", "prefixexp", "exppostfix", "functioncall", 
			"argu", "oprpostfix", "prefixopr", "mulopr", "addopr", "inopr", "isopr", 
			"eqopr", "cmpopr", "variableD", "propertyD", "typef", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'..'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'&&'", "'||'", "'.'", 
			"','", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'?'", "'*'", 
			"'/'", "'%'", "'='", "'+'", "'-'", "'in'", "'!in'", "'is'", "'!is'", 
			"'package'", "'import'", "'Int'", "'Double'", "'String'", "'Unit'", "'val'", 
			"'var'", "'Any'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "TWODOT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "PASN", 
			"MASN", "MULASN", "DIVASN", "MODASN", "DPULS", "DMINUS", "LOGICAND", 
			"LOGICOR", "DOT", "COMMA", "LPAR", "RPAR", "LB", "RB", "LSQ", "RSQ", 
			"COLON", "QUERY", "MUL", "DIV", "MOD", "ASN", "PULS", "MINUS", "IN", 
			"NIN", "IS", "NIS", "PACKAGE", "IMPORT", "INT", "REAL", "STRING", "UNIT", 
			"VAL", "VAR", "ANY", "FUN", "RETC", "STR", "ID", "NUM", "FN", "DIGIT", 
			"WS", "COMMENT", "COMMENT2"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public PackageRContext packageR() {
			return getRuleContext(PackageRContext.class,0);
		}
		public ImportLContext importL() {
			return getRuleContext(ImportLContext.class,0);
		}
		public OuterLContext outerL() {
			return getRuleContext(OuterLContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(78);
				packageR();
				}
			}

			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(81);
				importL();
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << FUN))) != 0)) {
				{
				setState(84);
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
		public TerminalNode PACKAGE() { return getToken(ExprParser.PACKAGE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ExprParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ExprParser.DOT, i);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public PackageRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPackageR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPackageR(this);
		}
	}

	public final PackageRContext packageR() throws RecognitionException {
		PackageRContext _localctx = new PackageRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(PACKAGE);
			setState(88);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(89);
				match(DOT);
				setState(90);
				match(ID);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(96);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterImportL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitImportL(this);
		}
	}

	public final ImportLContext importL() throws RecognitionException {
		ImportLContext _localctx = new ImportLContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(99);
				importR();
				}
				}
				setState(104);
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
		public TerminalNode IMPORT() { return getToken(ExprParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ExprParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ExprParser.DOT, i);
		}
		public List<TerminalNode> MUL() { return getTokens(ExprParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ExprParser.MUL, i);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitImportR(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IMPORT);
			setState(106);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(107);
					match(DOT);
					setState(108);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(109);
					match(DOT);
					setState(110);
					match(ID);
					}
					break;
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(116);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOuterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOuterL(this);
		}
	}

	public final OuterLContext outerL() throws RecognitionException {
		OuterLContext _localctx = new OuterLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outerL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				outerR();
				}
				}
				setState(122); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOuterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOuterR(this);
		}
	}

	public final OuterRContext outerR() throws RecognitionException {
		OuterRContext _localctx = new OuterRContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outerR);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				functionD();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
		public TerminalNode FUN() { return getToken(ExprParser.FUN, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public WhichfunctionContext whichfunction() {
			return getRuleContext(WhichfunctionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public FunctionDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctionD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunctionD(this);
		}
	}

	public final FunctionDContext functionD() throws RecognitionException {
		FunctionDContext _localctx = new FunctionDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FUN);
			setState(129);
			match(ID);
			setState(130);
			argument();
			setState(131);
			whichfunction();
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(132);
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
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ExprParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ExprParser.COLON, i);
		}
		public List<TypefContext> typef() {
			return getRuleContexts(TypefContext.class);
		}
		public TypefContext typef(int i) {
			return getRuleContext(TypefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LPAR);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(136);
				match(ID);
				setState(137);
				match(COLON);
				setState(138);
				typef();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(139);
					match(COMMA);
					}
				}

				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
		public TerminalNode LB() { return getToken(ExprParser.LB, 0); }
		public InnerblockContext innerblock() {
			return getRuleContext(InnerblockContext.class,0);
		}
		public TerminalNode RB() { return getToken(ExprParser.RB, 0); }
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(ExprParser.QUERY, 0); }
		public WhichfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whichfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhichfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhichfunction(this);
		}
	}

	public final WhichfunctionContext whichfunction() throws RecognitionException {
		WhichfunctionContext _localctx = new WhichfunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whichfunction);
		int _la;
		try {
			setState(163);
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
				setState(149);
				assign();
				}
				break;
			case LB:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(150);
					match(COLON);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << STRING) | (1L << UNIT) | (1L << ANY))) != 0)) {
						{
						setState(151);
						typef();
						}
					}

					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==QUERY) {
						{
						setState(154);
						match(QUERY);
						}
					}

					}
				}

				setState(159);
				match(LB);
				setState(160);
				innerblock();
				setState(161);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			assignopr();
			setState(166);
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
		public TerminalNode ASN() { return getToken(ExprParser.ASN, 0); }
		public TerminalNode PASN() { return getToken(ExprParser.PASN, 0); }
		public TerminalNode MASN() { return getToken(ExprParser.MASN, 0); }
		public TerminalNode MULASN() { return getToken(ExprParser.MULASN, 0); }
		public TerminalNode DIVASN() { return getToken(ExprParser.DIVASN, 0); }
		public TerminalNode MODASN() { return getToken(ExprParser.MODASN, 0); }
		public AssignoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignopr(this);
		}
	}

	public final AssignoprContext assignopr() throws RecognitionException {
		AssignoprContext _localctx = new AssignoprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInnerblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInnerblock(this);
		}
	}

	public final InnerblockContext innerblock() throws RecognitionException {
		InnerblockContext _localctx = new InnerblockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_innerblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << LPAR) | (1L << LSQ) | (1L << PULS) | (1L << MINUS) | (1L << VAL) | (1L << VAR) | (1L << FUN) | (1L << RETC) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
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
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public FunctionDContext functionD() {
			return getRuleContext(FunctionDContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				variableD();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(177);
					match(SEMI);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				functionD();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(181);
					match(SEMI);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				expression();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(185);
					match(SEMI);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				exit();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(189);
					match(SEMI);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(ID);
				setState(193);
				assign();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(194);
					match(SEMI);
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

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode RETC() { return getToken(ExprParser.RETC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RETC);
			setState(200);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expor();
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
		public List<TerminalNode> LOGICOR() { return getTokens(ExprParser.LOGICOR); }
		public TerminalNode LOGICOR(int i) {
			return getToken(ExprParser.LOGICOR, i);
		}
		public ExporContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpor(this);
		}
	}

	public final ExporContext expor() throws RecognitionException {
		ExporContext _localctx = new ExporContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expand();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(205);
				match(LOGICOR);
				setState(206);
				expand();
				}
				}
				setState(211);
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
		public List<TerminalNode> LOGICAND() { return getTokens(ExprParser.LOGICAND); }
		public TerminalNode LOGICAND(int i) {
			return getToken(ExprParser.LOGICAND, i);
		}
		public ExpandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpand(this);
		}
	}

	public final ExpandContext expand() throws RecognitionException {
		ExpandContext _localctx = new ExpandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			expeq();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(213);
				match(LOGICAND);
				setState(214);
				expeq();
				}
				}
				setState(219);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpeq(this);
		}
	}

	public final ExpeqContext expeq() throws RecognitionException {
		ExpeqContext _localctx = new ExpeqContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expcmp();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(221);
				eqopr();
				setState(222);
				expcmp();
				}
				}
				setState(228);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpcmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpcmp(this);
		}
	}

	public final ExpcmpContext expcmp() throws RecognitionException {
		ExpcmpContext _localctx = new ExpcmpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expcmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			exppre();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(230);
				cmpopr();
				setState(231);
				exppre();
				}
				}
				setState(237);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExppre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExppre(this);
		}
	}

	public final ExppreContext exppre() throws RecognitionException {
		ExppreContext _localctx = new ExppreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exppre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			expR();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NIN) | (1L << IS) | (1L << NIS))) != 0)) {
				{
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
				case NIN:
					{
					{
					setState(239);
					inopr();
					setState(240);
					expR();
					}
					}
					break;
				case IS:
				case NIS:
					{
					{
					setState(242);
					isopr();
					setState(243);
					typef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(249);
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
		public List<TerminalNode> TWODOT() { return getTokens(ExprParser.TWODOT); }
		public TerminalNode TWODOT(int i) {
			return getToken(ExprParser.TWODOT, i);
		}
		public ExpRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpR(this);
		}
	}

	public final ExpRContext expR() throws RecognitionException {
		ExpRContext _localctx = new ExpRContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expadd();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWODOT) {
				{
				{
				setState(251);
				match(TWODOT);
				setState(252);
				expadd();
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpadd(this);
		}
	}

	public final ExpaddContext expadd() throws RecognitionException {
		ExpaddContext _localctx = new ExpaddContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expadd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expmul();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259);
					addopr();
					setState(260);
					expmul();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpmul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpmul(this);
		}
	}

	public final ExpmulContext expmul() throws RecognitionException {
		ExpmulContext _localctx = new ExpmulContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			prefixexp();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(268);
				mulopr();
				setState(269);
				prefixexp();
				}
				}
				setState(275);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrefixexp(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prefixexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << PULS) | (1L << MINUS))) != 0)) {
				{
				setState(276);
				prefixopr();
				}
			}

			setState(279);
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
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public OprpostfixContext oprpostfix() {
			return getRuleContext(OprpostfixContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode LSQ() { return getToken(ExprParser.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(ExprParser.RSQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExppostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exppostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExppostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExppostfix(this);
		}
	}

	public final ExppostfixContext exppostfix() throws RecognitionException {
		ExppostfixContext _localctx = new ExppostfixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exppostfix);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				functioncall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(ID);
				setState(283);
				oprpostfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(LPAR);
				setState(285);
				expression();
				setState(286);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(LSQ);
				setState(289);
				expression();
				setState(290);
				match(RSQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ArguContext argu() {
			return getRuleContext(ArguContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(296);
			match(LPAR);
			setState(297);
			argu();
			setState(298);
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
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
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
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public ArguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArgu(this);
		}
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << LPAR) | (1L << LSQ) | (1L << PULS) | (1L << MINUS) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(300);
					match(ID);
					}
					break;
				case 2:
					{
					setState(301);
					value();
					}
					break;
				case 3:
					{
					setState(302);
					expression();
					}
					break;
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(305);
					match(COMMA);
					}
				}

				}
				}
				setState(312);
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
		public TerminalNode DPULS() { return getToken(ExprParser.DPULS, 0); }
		public TerminalNode DMINUS() { return getToken(ExprParser.DMINUS, 0); }
		public List<TerminalNode> DOT() { return getTokens(ExprParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ExprParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public OprpostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprpostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOprpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOprpostfix(this);
		}
	}

	public final OprpostfixContext oprpostfix() throws RecognitionException {
		OprpostfixContext _localctx = new OprpostfixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oprpostfix);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(DPULS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(DMINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(315);
					match(DOT);
					setState(316);
					match(ID);
					}
					}
					setState(321);
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
		public TerminalNode DPULS() { return getToken(ExprParser.DPULS, 0); }
		public TerminalNode DMINUS() { return getToken(ExprParser.DMINUS, 0); }
		public TerminalNode MINUS() { return getToken(ExprParser.MINUS, 0); }
		public TerminalNode PULS() { return getToken(ExprParser.PULS, 0); }
		public PrefixoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrefixopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrefixopr(this);
		}
	}

	public final PrefixoprContext prefixopr() throws RecognitionException {
		PrefixoprContext _localctx = new PrefixoprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_prefixopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ExprParser.MOD, 0); }
		public MuloprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMulopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMulopr(this);
		}
	}

	public final MuloprContext mulopr() throws RecognitionException {
		MuloprContext _localctx = new MuloprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mulopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		public TerminalNode PULS() { return getToken(ExprParser.PULS, 0); }
		public TerminalNode MINUS() { return getToken(ExprParser.MINUS, 0); }
		public AddoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAddopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAddopr(this);
		}
	}

	public final AddoprContext addopr() throws RecognitionException {
		AddoprContext _localctx = new AddoprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_addopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		public TerminalNode IN() { return getToken(ExprParser.IN, 0); }
		public TerminalNode NIN() { return getToken(ExprParser.NIN, 0); }
		public InoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInopr(this);
		}
	}

	public final InoprContext inopr() throws RecognitionException {
		InoprContext _localctx = new InoprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		public TerminalNode IS() { return getToken(ExprParser.IS, 0); }
		public TerminalNode NIS() { return getToken(ExprParser.NIS, 0); }
		public IsoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIsopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIsopr(this);
		}
	}

	public final IsoprContext isopr() throws RecognitionException {
		IsoprContext _localctx = new IsoprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_isopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ExprParser.NEQ, 0); }
		public EqoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEqopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEqopr(this);
		}
	}

	public final EqoprContext eqopr() throws RecognitionException {
		EqoprContext _localctx = new EqoprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eqopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		public TerminalNode GT() { return getToken(ExprParser.GT, 0); }
		public TerminalNode LT() { return getToken(ExprParser.LT, 0); }
		public TerminalNode GE() { return getToken(ExprParser.GE, 0); }
		public TerminalNode LE() { return getToken(ExprParser.LE, 0); }
		public CmpoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCmpopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCmpopr(this);
		}
	}

	public final CmpoprContext cmpopr() throws RecognitionException {
		CmpoprContext _localctx = new CmpoprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cmpopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode VAL() { return getToken(ExprParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public VariableDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableD(this);
		}
	}

	public final VariableDContext variableD() throws RecognitionException {
		VariableDContext _localctx = new VariableDContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableD);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				propertyD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				match(ID);
				setState(341);
				match(COLON);
				setState(342);
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
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ASN() { return getToken(ExprParser.ASN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VAL() { return getToken(ExprParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public PropertyDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPropertyD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPropertyD(this);
		}
	}

	public final PropertyDContext propertyD() throws RecognitionException {
		PropertyDContext _localctx = new PropertyDContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(346);
			match(ID);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(347);
				match(COLON);
				setState(348);
				typef();
				}
			}

			setState(351);
			match(ASN);
			setState(352);
			value();
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(353);
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
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ExprParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode UNIT() { return getToken(ExprParser.UNIT, 0); }
		public TerminalNode ANY() { return getToken(ExprParser.ANY, 0); }
		public TypefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypef(this);
		}
	}

	public final TypefContext typef() throws RecognitionException {
		TypefContext _localctx = new TypefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << STRING) | (1L << UNIT) | (1L << ANY))) != 0)) ) {
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
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==STR || _la==NUM) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\5\2"+
		"U\n\2\3\2\5\2X\n\2\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\5\3d\n"+
		"\3\3\4\7\4g\n\4\f\4\16\4j\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16"+
		"\5u\13\5\3\5\5\5x\n\5\3\6\6\6{\n\6\r\6\16\6|\3\7\3\7\5\7\u0081\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0088\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\7\t\u0091"+
		"\n\t\f\t\16\t\u0094\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u009b\n\n\3\n\5\n\u009e"+
		"\n\n\5\n\u00a0\n\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3\16\3\16\5\16\u00b5\n\16\3\16"+
		"\3\16\5\16\u00b9\n\16\3\16\3\16\5\16\u00bd\n\16\3\16\3\16\5\16\u00c1\n"+
		"\16\3\16\3\16\3\16\5\16\u00c6\n\16\5\16\u00c8\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u00d2\n\21\f\21\16\21\u00d5\13\21\3\22\3\22"+
		"\3\22\7\22\u00da\n\22\f\22\16\22\u00dd\13\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00e3\n\23\f\23\16\23\u00e6\13\23\3\24\3\24\3\24\3\24\7\24\u00ec\n\24"+
		"\f\24\16\24\u00ef\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f8"+
		"\n\25\f\25\16\25\u00fb\13\25\3\26\3\26\3\26\7\26\u0100\n\26\f\26\16\26"+
		"\u0103\13\26\3\27\3\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27"+
		"\3\30\3\30\3\30\3\30\7\30\u0112\n\30\f\30\16\30\u0115\13\30\3\31\5\31"+
		"\u0118\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0128\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34"+
		"\u0132\n\34\3\34\5\34\u0135\n\34\7\34\u0137\n\34\f\34\16\34\u013a\13\34"+
		"\3\35\3\35\3\35\3\35\7\35\u0140\n\35\f\35\16\35\u0143\13\35\5\35\u0145"+
		"\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%"+
		"\3%\5%\u015a\n%\3&\3&\3&\3&\5&\u0160\n&\3&\3&\3&\5&\u0165\n&\3\'\3\'\3"+
		"(\3(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\r\4\2\13\17!!\4\2\20\21\"#\3\2\36 \3\2\"#\3\2$%\3\2"+
		"&\'\3\2\5\6\3\2\7\n\3\2./\4\2*-\60\60\4\2\63\63\65\65\2\u0177\2Q\3\2\2"+
		"\2\4Y\3\2\2\2\6h\3\2\2\2\bk\3\2\2\2\nz\3\2\2\2\f\u0080\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u0089\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2\2\26\u00aa\3"+
		"\2\2\2\30\u00af\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00cc\3\2"+
		"\2\2 \u00ce\3\2\2\2\"\u00d6\3\2\2\2$\u00de\3\2\2\2&\u00e7\3\2\2\2(\u00f0"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u0104\3\2\2\2.\u010d\3\2\2\2\60\u0117\3\2\2\2"+
		"\62\u0127\3\2\2\2\64\u0129\3\2\2\2\66\u0138\3\2\2\28\u0144\3\2\2\2:\u0146"+
		"\3\2\2\2<\u0148\3\2\2\2>\u014a\3\2\2\2@\u014c\3\2\2\2B\u014e\3\2\2\2D"+
		"\u0150\3\2\2\2F\u0152\3\2\2\2H\u0159\3\2\2\2J\u015b\3\2\2\2L\u0166\3\2"+
		"\2\2N\u0168\3\2\2\2PR\5\4\3\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\5\6\4\2"+
		"TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5\n\6\2WV\3\2\2\2WX\3\2\2\2X\3\3\2\2"+
		"\2YZ\7(\2\2Z_\7\64\2\2[\\\7\24\2\2\\^\7\64\2\2][\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\7\3\2\2cb\3\2\2\2cd\3\2\2\2d\5"+
		"\3\2\2\2eg\5\b\5\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\7\3\2\2\2"+
		"jh\3\2\2\2kl\7)\2\2ls\7\64\2\2mn\7\24\2\2nr\7\36\2\2op\7\24\2\2pr\7\64"+
		"\2\2qm\3\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2vx\7\3\2\2wv\3\2\2\2wx\3\2\2\2x\t\3\2\2\2y{\5\f\7\2zy\3\2\2\2{|\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2\2\2~\u0081\5\16\b\2\177\u0081\5J&\2"+
		"\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\7\61\2\2"+
		"\u0083\u0084\7\64\2\2\u0084\u0085\5\20\t\2\u0085\u0087\5\22\n\2\u0086"+
		"\u0088\7\3\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\17\3\2\2"+
		"\2\u0089\u0092\7\26\2\2\u008a\u008b\7\64\2\2\u008b\u008c\7\34\2\2\u008c"+
		"\u008e\5L\'\2\u008d\u008f\7\25\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0096\7\27\2\2\u0096\21\3\2\2\2\u0097\u00a6\5\24\13\2\u0098"+
		"\u009a\7\34\2\2\u0099\u009b\5L\'\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7\35\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\5\30\r\2\u00a3"+
		"\u00a4\7\31\2\2\u00a4\u00a6\3\2\2\2\u00a5\u0097\3\2\2\2\u00a5\u009f\3"+
		"\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5\36\20\2\u00a9"+
		"\25\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab\27\3\2\2\2\u00ac\u00ae\5\32\16\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5H%\2\u00b3"+
		"\u00b5\7\3\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c8\3\2"+
		"\2\2\u00b6\u00b8\5\16\b\2\u00b7\u00b9\7\3\2\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00c8\3\2\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00bd\7"+
		"\3\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c8\3\2\2\2\u00be"+
		"\u00c0\5\34\17\2\u00bf\u00c1\7\3\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3\7\64\2\2\u00c3\u00c5\5\24\13\2"+
		"\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00b2\3\2\2\2\u00c7\u00b6\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7"+
		"\u00be\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00ca\7\62\2"+
		"\2\u00ca\u00cb\5\36\20\2\u00cb\35\3\2\2\2\u00cc\u00cd\5 \21\2\u00cd\37"+
		"\3\2\2\2\u00ce\u00d3\5\"\22\2\u00cf\u00d0\7\23\2\2\u00d0\u00d2\5\"\22"+
		"\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4!\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5$\23\2\u00d7"+
		"\u00d8\7\22\2\2\u00d8\u00da\5$\23\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e4\5&\24\2\u00df\u00e0\5D#\2\u00e0\u00e1\5&\24\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5%\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ed"+
		"\5(\25\2\u00e8\u00e9\5F$\2\u00e9\u00ea\5(\25\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\'\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f9\5*\26\2\u00f1\u00f2"+
		"\5@!\2\u00f2\u00f3\5*\26\2\u00f3\u00f8\3\2\2\2\u00f4\u00f5\5B\"\2\u00f5"+
		"\u00f6\5L\'\2\u00f6\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0101\5,\27\2\u00fd\u00fe\7\4\2\2"+
		"\u00fe\u0100\5,\27\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102+\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u010a\5.\30\2\u0105\u0106\5> \2\u0106\u0107\5.\30\2\u0107\u0109\3\2\2"+
		"\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b-\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0113\5\60\31\2\u010e"+
		"\u010f\5<\37\2\u010f\u0110\5\60\31\2\u0110\u0112\3\2\2\2\u0111\u010e\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"/\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5:\36\2\u0117\u0116\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5\62\32\2\u011a\61"+
		"\3\2\2\2\u011b\u0128\5\64\33\2\u011c\u011d\7\64\2\2\u011d\u0128\58\35"+
		"\2\u011e\u011f\7\26\2\2\u011f\u0120\5\36\20\2\u0120\u0121\7\27\2\2\u0121"+
		"\u0128\3\2\2\2\u0122\u0123\7\32\2\2\u0123\u0124\5\36\20\2\u0124\u0125"+
		"\7\33\2\2\u0125\u0128\3\2\2\2\u0126\u0128\5N(\2\u0127\u011b\3\2\2\2\u0127"+
		"\u011c\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0122\3\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128\63\3\2\2\2\u0129\u012a\7\64\2\2\u012a\u012b\7\26\2\2\u012b"+
		"\u012c\5\66\34\2\u012c\u012d\7\27\2\2\u012d\65\3\2\2\2\u012e\u0132\7\64"+
		"\2\2\u012f\u0132\5N(\2\u0130\u0132\5\36\20\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\7\25"+
		"\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0131\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\67\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0145\7\20\2\2\u013c\u0145"+
		"\7\21\2\2\u013d\u013e\7\24\2\2\u013e\u0140\7\64\2\2\u013f\u013d\3\2\2"+
		"\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u013b\3\2\2\2\u0144\u013c\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u01459\3\2\2\2\u0146\u0147\t\3\2\2\u0147;\3\2\2\2\u0148"+
		"\u0149\t\4\2\2\u0149=\3\2\2\2\u014a\u014b\t\5\2\2\u014b?\3\2\2\2\u014c"+
		"\u014d\t\6\2\2\u014dA\3\2\2\2\u014e\u014f\t\7\2\2\u014fC\3\2\2\2\u0150"+
		"\u0151\t\b\2\2\u0151E\3\2\2\2\u0152\u0153\t\t\2\2\u0153G\3\2\2\2\u0154"+
		"\u015a\5J&\2\u0155\u0156\t\n\2\2\u0156\u0157\7\64\2\2\u0157\u0158\7\34"+
		"\2\2\u0158\u015a\5L\'\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u015a"+
		"I\3\2\2\2\u015b\u015c\t\n\2\2\u015c\u015f\7\64\2\2\u015d\u015e\7\34\2"+
		"\2\u015e\u0160\5L\'\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\7!\2\2\u0162\u0164\5N(\2\u0163\u0165\7\3\2\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165K\3\2\2\2\u0166\u0167\t\13\2\2"+
		"\u0167M\3\2\2\2\u0168\u0169\t\f\2\2\u0169O\3\2\2\2.QTW_chqsw|\u0080\u0087"+
		"\u008e\u0092\u009a\u009d\u009f\u00a5\u00af\u00b4\u00b8\u00bc\u00c0\u00c5"+
		"\u00c7\u00d3\u00db\u00e4\u00ed\u00f7\u00f9\u0101\u010a\u0113\u0117\u0127"+
		"\u0131\u0134\u0138\u0141\u0144\u0159\u015f\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}