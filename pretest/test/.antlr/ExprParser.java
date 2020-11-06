// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/pretest/test/Expr.g4 by ANTLR 4.8
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
		VAL=44, VAR=45, ANY=46, FUN=47, RET=48, STR=49, ID=50, NUM=51, FN=52, 
		DIGIT=53, WS=54, COMMENT=55, COMMENT2=56;
	public static final int
		RULE_file = 0, RULE_packageR = 1, RULE_importL = 2, RULE_importR = 3, 
		RULE_outerL = 4, RULE_outerR = 5, RULE_functionD = 6, RULE_argument = 7, 
		RULE_whichfunction = 8, RULE_assign = 9, RULE_assignopr = 10, RULE_innerblock = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_expor = 14, RULE_expand = 15, 
		RULE_expeq = 16, RULE_expcmp = 17, RULE_exppre = 18, RULE_expR = 19, RULE_expadd = 20, 
		RULE_expmul = 21, RULE_prefixexp = 22, RULE_exppostfix = 23, RULE_functioncall = 24, 
		RULE_argu = 25, RULE_oprpostfix = 26, RULE_prefixopr = 27, RULE_mulopr = 28, 
		RULE_addopr = 29, RULE_inopr = 30, RULE_isopr = 31, RULE_eqopr = 32, RULE_cmpopr = 33, 
		RULE_variableD = 34, RULE_propertyD = 35, RULE_typef = 36, RULE_value = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "packageR", "importL", "importR", "outerL", "outerR", "functionD", 
			"argument", "whichfunction", "assign", "assignopr", "innerblock", "statement", 
			"expression", "expor", "expand", "expeq", "expcmp", "exppre", "expR", 
			"expadd", "expmul", "prefixexp", "exppostfix", "functioncall", "argu", 
			"oprpostfix", "prefixopr", "mulopr", "addopr", "inopr", "isopr", "eqopr", 
			"cmpopr", "variableD", "propertyD", "typef", "value"
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
			"VAL", "VAR", "ANY", "FUN", "RET", "STR", "ID", "NUM", "FN", "DIGIT", 
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
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(76);
				packageR();
				}
			}

			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(79);
				importL();
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << VAR) | (1L << FUN))) != 0)) {
				{
				setState(82);
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
	}

	public final PackageRContext packageR() throws RecognitionException {
		PackageRContext _localctx = new PackageRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PACKAGE);
			setState(86);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(87);
				match(DOT);
				setState(88);
				match(ID);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(94);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(97);
				importR();
				}
				}
				setState(102);
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
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IMPORT);
			setState(104);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(105);
					match(DOT);
					setState(106);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(107);
					match(DOT);
					setState(108);
					match(ID);
					}
					break;
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(114);
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
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				outerR();
				}
				}
				setState(120); 
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				functionD();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
	}

	public final FunctionDContext functionD() throws RecognitionException {
		FunctionDContext _localctx = new FunctionDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FUN);
			setState(127);
			match(ID);
			setState(128);
			argument();
			setState(129);
			whichfunction();
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
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LPAR);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(134);
				match(ID);
				setState(135);
				match(COLON);
				setState(136);
				typef();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(137);
					match(COMMA);
					}
				}

				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final WhichfunctionContext whichfunction() throws RecognitionException {
		WhichfunctionContext _localctx = new WhichfunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whichfunction);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				assign();
				setState(148);
				expression();
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
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public AssignoprContext assignopr() {
			return getRuleContext(AssignoprContext.class,0);
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
			setState(165);
			match(ID);
			setState(166);
			assignopr();
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << LPAR) | (1L << PULS) | (1L << MINUS) | (1L << VAL) | (1L << VAR) | (1L << FUN))) != 0)) {
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
		public FunctionDContext functionD() {
			return getRuleContext(FunctionDContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				variableD();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				functionD();
				}
				break;
			case DPULS:
			case DMINUS:
			case LPAR:
			case PULS:
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExporContext expor() {
			return getRuleContext(ExporContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DPULS:
			case DMINUS:
			case PULS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				expor();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(LPAR);
				setState(183);
				expor();
				setState(184);
				match(RPAR);
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
		public List<TerminalNode> LOGICOR() { return getTokens(ExprParser.LOGICOR); }
		public TerminalNode LOGICOR(int i) {
			return getToken(ExprParser.LOGICOR, i);
		}
		public ExporContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expor; }
	}

	public final ExporContext expor() throws RecognitionException {
		ExporContext _localctx = new ExporContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expand();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(189);
				match(LOGICOR);
				setState(190);
				expand();
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
	}

	public final ExpandContext expand() throws RecognitionException {
		ExpandContext _localctx = new ExpandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expeq();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(197);
				match(LOGICAND);
				setState(198);
				expeq();
				}
				}
				setState(203);
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
		enterRule(_localctx, 32, RULE_expeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expcmp();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(205);
				eqopr();
				setState(206);
				expcmp();
				}
				}
				setState(212);
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
		enterRule(_localctx, 34, RULE_expcmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			exppre();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(214);
				cmpopr();
				setState(215);
				exppre();
				}
				}
				setState(221);
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
		public InoprContext inopr() {
			return getRuleContext(InoprContext.class,0);
		}
		public IsoprContext isopr() {
			return getRuleContext(IsoprContext.class,0);
		}
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public ExppreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exppre; }
	}

	public final ExppreContext exppre() throws RecognitionException {
		ExppreContext _localctx = new ExppreContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exppre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			expR();
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case NIN:
				{
				{
				setState(223);
				inopr();
				setState(224);
				expR();
				}
				}
				break;
			case IS:
			case NIS:
				{
				{
				setState(226);
				isopr();
				setState(227);
				typef();
				}
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
	}

	public final ExpRContext expR() throws RecognitionException {
		ExpRContext _localctx = new ExpRContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			expadd();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWODOT) {
				{
				{
				setState(232);
				match(TWODOT);
				setState(233);
				expadd();
				}
				}
				setState(238);
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
		enterRule(_localctx, 40, RULE_expadd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			expmul();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					addopr();
					setState(241);
					expmul();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 42, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			prefixexp();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(249);
				mulopr();
				setState(250);
				prefixexp();
				}
				}
				setState(256);
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
		public PrefixoprContext prefixopr() {
			return getRuleContext(PrefixoprContext.class,0);
		}
		public ExppostfixContext exppostfix() {
			return getRuleContext(ExppostfixContext.class,0);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_prefixexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			prefixopr();
			setState(258);
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
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public OprpostfixContext oprpostfix() {
			return getRuleContext(OprpostfixContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ExppostfixContext exppostfix() {
			return getRuleContext(ExppostfixContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode LSQ() { return getToken(ExprParser.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(ExprParser.RSQ, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ExppostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exppostfix; }
	}

	public final ExppostfixContext exppostfix() throws RecognitionException {
		ExppostfixContext _localctx = new ExppostfixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exppostfix);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(ID);
				setState(261);
				oprpostfix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(LPAR);
				setState(263);
				exppostfix();
				setState(264);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(LSQ);
				setState(267);
				exppostfix();
				setState(268);
				match(RSQ);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				functioncall();
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
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ID);
			setState(274);
			match(LPAR);
			setState(275);
			argu();
			setState(276);
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
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DPULS) | (1L << DMINUS) | (1L << LPAR) | (1L << PULS) | (1L << MINUS) | (1L << ID))) != 0)) {
				{
				{
				setState(280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(278);
					match(ID);
					}
					break;
				case DPULS:
				case DMINUS:
				case LPAR:
				case PULS:
				case MINUS:
					{
					setState(279);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(282);
					match(COMMA);
					}
				}

				}
				}
				setState(289);
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
	}

	public final OprpostfixContext oprpostfix() throws RecognitionException {
		OprpostfixContext _localctx = new OprpostfixContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_oprpostfix);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(DPULS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(DMINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(292);
					match(DOT);
					setState(293);
					match(ID);
					}
					}
					setState(298);
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
	}

	public final PrefixoprContext prefixopr() throws RecognitionException {
		PrefixoprContext _localctx = new PrefixoprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_prefixopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
	}

	public final MuloprContext mulopr() throws RecognitionException {
		MuloprContext _localctx = new MuloprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mulopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
	}

	public final AddoprContext addopr() throws RecognitionException {
		AddoprContext _localctx = new AddoprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_addopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
	}

	public final InoprContext inopr() throws RecognitionException {
		InoprContext _localctx = new InoprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
	}

	public final IsoprContext isopr() throws RecognitionException {
		IsoprContext _localctx = new IsoprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_isopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
	}

	public final EqoprContext eqopr() throws RecognitionException {
		EqoprContext _localctx = new EqoprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eqopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
	}

	public final CmpoprContext cmpopr() throws RecognitionException {
		CmpoprContext _localctx = new CmpoprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cmpopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
	}

	public final VariableDContext variableD() throws RecognitionException {
		VariableDContext _localctx = new VariableDContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableD);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				propertyD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				match(ID);
				setState(318);
				match(COLON);
				setState(319);
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
	}

	public final PropertyDContext propertyD() throws RecognitionException {
		PropertyDContext _localctx = new PropertyDContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			match(ID);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(324);
				match(COLON);
				setState(325);
				typef();
				}
			}

			setState(328);
			match(ASN);
			setState(329);
			value();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(330);
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
	}

	public final TypefContext typef() throws RecognitionException {
		TypefContext _localctx = new TypefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\5\2S\n\2"+
		"\3\2\5\2V\n\2\3\3\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3\5\3b\n\3\3"+
		"\4\7\4e\n\4\f\4\16\4h\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s"+
		"\13\5\3\5\5\5v\n\5\3\6\6\6y\n\6\r\6\16\6z\3\7\3\7\5\7\177\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\7\t\u008f"+
		"\n\t\f\t\16\t\u0092\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\n"+
		"\5\n\u009e\n\n\5\n\u00a0\n\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3\16\3\16\3\16\5\16"+
		"\u00b6\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\20\7"+
		"\20\u00c2\n\20\f\20\16\20\u00c5\13\20\3\21\3\21\3\21\7\21\u00ca\n\21\f"+
		"\21\16\21\u00cd\13\21\3\22\3\22\3\22\3\22\7\22\u00d3\n\22\f\22\16\22\u00d6"+
		"\13\22\3\23\3\23\3\23\3\23\7\23\u00dc\n\23\f\23\16\23\u00df\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e8\n\24\3\25\3\25\3\25\7\25\u00ed"+
		"\n\25\f\25\16\25\u00f0\13\25\3\26\3\26\3\26\3\26\7\26\u00f6\n\26\f\26"+
		"\16\26\u00f9\13\26\3\27\3\27\3\27\3\27\7\27\u00ff\n\27\f\27\16\27\u0102"+
		"\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0112\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u011b\n"+
		"\33\3\33\5\33\u011e\n\33\7\33\u0120\n\33\f\33\16\33\u0123\13\33\3\34\3"+
		"\34\3\34\3\34\7\34\u0129\n\34\f\34\16\34\u012c\13\34\5\34\u012e\n\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$"+
		"\5$\u0143\n$\3%\3%\3%\3%\5%\u0149\n%\3%\3%\3%\5%\u014e\n%\3&\3&\3\'\3"+
		"\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJL\2\r\4\2\13\17!!\4\2\20\21\"#\3\2\36 \3\2\"#\3\2$%\3\2&\'\3"+
		"\2\5\6\3\2\7\n\3\2./\4\2*-\60\60\4\2\63\63\65\65\2\u0157\2O\3\2\2\2\4"+
		"W\3\2\2\2\6f\3\2\2\2\bi\3\2\2\2\nx\3\2\2\2\f~\3\2\2\2\16\u0080\3\2\2\2"+
		"\20\u0087\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2\2\26\u00aa\3\2\2\2\30"+
		"\u00af\3\2\2\2\32\u00b5\3\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00c6"+
		"\3\2\2\2\"\u00ce\3\2\2\2$\u00d7\3\2\2\2&\u00e0\3\2\2\2(\u00e9\3\2\2\2"+
		"*\u00f1\3\2\2\2,\u00fa\3\2\2\2.\u0103\3\2\2\2\60\u0111\3\2\2\2\62\u0113"+
		"\3\2\2\2\64\u0121\3\2\2\2\66\u012d\3\2\2\28\u012f\3\2\2\2:\u0131\3\2\2"+
		"\2<\u0133\3\2\2\2>\u0135\3\2\2\2@\u0137\3\2\2\2B\u0139\3\2\2\2D\u013b"+
		"\3\2\2\2F\u0142\3\2\2\2H\u0144\3\2\2\2J\u014f\3\2\2\2L\u0151\3\2\2\2N"+
		"P\5\4\3\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5\6\4\2RQ\3\2\2\2RS\3\2\2\2"+
		"SU\3\2\2\2TV\5\n\6\2UT\3\2\2\2UV\3\2\2\2V\3\3\2\2\2WX\7(\2\2X]\7\64\2"+
		"\2YZ\7\24\2\2Z\\\7\64\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2`b\7\3\2\2a`\3\2\2\2ab\3\2\2\2b\5\3\2\2\2ce\5\b\5\2dc"+
		"\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hf\3\2\2\2ij\7)\2\2j"+
		"q\7\64\2\2kl\7\24\2\2lp\7\36\2\2mn\7\24\2\2np\7\64\2\2ok\3\2\2\2om\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\7\3\2\2ut\3\2"+
		"\2\2uv\3\2\2\2v\t\3\2\2\2wy\5\f\7\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\13\3\2\2\2|\177\5\16\b\2}\177\5H%\2~|\3\2\2\2~}\3\2\2\2\177\r"+
		"\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7\64\2\2\u0082\u0083\5\20\t"+
		"\2\u0083\u0085\5\22\n\2\u0084\u0086\7\3\2\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0090\7\26\2\2\u0088\u0089\7\64"+
		"\2\2\u0089\u008a\7\34\2\2\u008a\u008c\5J&\2\u008b\u008d\7\25\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\27\2\2\u0094\21\3\2\2"+
		"\2\u0095\u0096\5\24\13\2\u0096\u0097\5\34\17\2\u0097\u00a6\3\2\2\2\u0098"+
		"\u009a\7\34\2\2\u0099\u009b\5J&\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7\35\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\5\30\r\2\u00a3"+
		"\u00a4\7\31\2\2\u00a4\u00a6\3\2\2\2\u00a5\u0095\3\2\2\2\u00a5\u009f\3"+
		"\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\64\2\2\u00a8\u00a9\5\26\f\2\u00a9"+
		"\25\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab\27\3\2\2\2\u00ac\u00ae\5\32\16\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\5F$\2\u00b3"+
		"\u00b6\5\16\b\2\u00b4\u00b6\5\34\17\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00bd\5\36\20\2\u00b8"+
		"\u00b9\7\26\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\27\2\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\35\3\2\2\2\u00be"+
		"\u00c3\5 \21\2\u00bf\u00c0\7\23\2\2\u00c0\u00c2\5 \21\2\u00c1\u00bf\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\37\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5\"\22\2\u00c7\u00c8\7\22"+
		"\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00ce\u00d4\5$\23\2\u00cf\u00d0\5B\"\2\u00d0\u00d1\5$\23\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5#\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dd\5&\24\2"+
		"\u00d8\u00d9\5D#\2\u00d9\u00da\5&\24\2\u00da\u00dc\3\2\2\2\u00db\u00d8"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"%\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e7\5(\25\2\u00e1\u00e2\5> \2\u00e2"+
		"\u00e3\5(\25\2\u00e3\u00e8\3\2\2\2\u00e4\u00e5\5@!\2\u00e5\u00e6\5J&\2"+
		"\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\'\3"+
		"\2\2\2\u00e9\u00ee\5*\26\2\u00ea\u00eb\7\4\2\2\u00eb\u00ed\5*\26\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef)\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f7\5,\27\2\u00f2\u00f3"+
		"\5<\37\2\u00f3\u00f4\5,\27\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8+\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00fa\u0100\5.\30\2\u00fb\u00fc\5:\36\2\u00fc\u00fd"+
		"\5.\30\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101-\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0104\58\35\2\u0104\u0105\5\60\31\2\u0105/\3\2\2\2\u0106\u0107"+
		"\7\64\2\2\u0107\u0112\5\66\34\2\u0108\u0109\7\26\2\2\u0109\u010a\5\60"+
		"\31\2\u010a\u010b\7\27\2\2\u010b\u0112\3\2\2\2\u010c\u010d\7\32\2\2\u010d"+
		"\u010e\5\60\31\2\u010e\u010f\7\33\2\2\u010f\u0112\3\2\2\2\u0110\u0112"+
		"\5\62\32\2\u0111\u0106\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u010c\3\2\2\2"+
		"\u0111\u0110\3\2\2\2\u0112\61\3\2\2\2\u0113\u0114\7\64\2\2\u0114\u0115"+
		"\7\26\2\2\u0115\u0116\5\64\33\2\u0116\u0117\7\27\2\2\u0117\63\3\2\2\2"+
		"\u0118\u011b\7\64\2\2\u0119\u011b\5\34\17\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\7\25\2\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\65\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0124\u012e\7\20\2\2\u0125\u012e\7\21\2\2\u0126"+
		"\u0127\7\24\2\2\u0127\u0129\7\64\2\2\u0128\u0126\3\2\2\2\u0129\u012c\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012e\67\3\2\2\2\u012f\u0130\t\3\2\2\u01309\3\2\2\2\u0131\u0132\t"+
		"\4\2\2\u0132;\3\2\2\2\u0133\u0134\t\5\2\2\u0134=\3\2\2\2\u0135\u0136\t"+
		"\6\2\2\u0136?\3\2\2\2\u0137\u0138\t\7\2\2\u0138A\3\2\2\2\u0139\u013a\t"+
		"\b\2\2\u013aC\3\2\2\2\u013b\u013c\t\t\2\2\u013cE\3\2\2\2\u013d\u0143\5"+
		"H%\2\u013e\u013f\t\n\2\2\u013f\u0140\7\64\2\2\u0140\u0141\7\34\2\2\u0141"+
		"\u0143\5J&\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0143G\3\2\2\2\u0144"+
		"\u0145\t\n\2\2\u0145\u0148\7\64\2\2\u0146\u0147\7\34\2\2\u0147\u0149\5"+
		"J&\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\7!\2\2\u014b\u014d\5L\'\2\u014c\u014e\7\3\2\2\u014d\u014c\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014eI\3\2\2\2\u014f\u0150\t\13\2\2\u0150K\3\2"+
		"\2\2\u0151\u0152\t\f\2\2\u0152M\3\2\2\2(ORU]afoquz~\u0085\u008c\u0090"+
		"\u009a\u009d\u009f\u00a5\u00af\u00b5\u00bc\u00c3\u00cb\u00d4\u00dd\u00e7"+
		"\u00ee\u00f7\u0100\u0111\u011a\u011d\u0121\u012a\u012d\u0142\u0148\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}