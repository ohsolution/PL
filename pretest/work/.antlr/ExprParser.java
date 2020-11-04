// Generated from /home/ohhaeseong/Ohsolution/University/ProgrammingLanguage/pretest/work/Expr.g4 by ANTLR 4.8
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
		NL=1, SEMI=2, STR=3, PACKAGE=4, IMPORT=5, DOT=6, MUL=7, VAL=8, VAR=9, 
		DIGIT=10, FN=11, ID=12, COLON=13, INT=14, EQ=15, WS=16, COMMENT=17, COMMENT2=18;
	public static final int
		RULE_file = 0, RULE_packageR = 1, RULE_importL = 2, RULE_importR = 3, 
		RULE_entryL = 4, RULE_entryR = 5, RULE_propertyD = 6, RULE_indentifier = 7, 
		RULE_typef = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "packageR", "importL", "importR", "entryL", "entryR", "propertyD", 
			"indentifier", "typef"
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
		public List<TerminalNode> NL() { return getTokens(ExprParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ExprParser.NL, i);
		}
		public PackageRContext packageR() {
			return getRuleContext(PackageRContext.class,0);
		}
		public ImportLContext importL() {
			return getRuleContext(ImportLContext.class,0);
		}
		public EntryLContext entryL() {
			return getRuleContext(EntryLContext.class,0);
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
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(18);
				match(NL);
				}
				break;
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(21);
				packageR();
				}
			}

			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(24);
				importL();
				}
				break;
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(27);
				entryL();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(30);
				match(NL);
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
		public List<TerminalNode> STR() { return getTokens(ExprParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(ExprParser.STR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ExprParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ExprParser.DOT, i);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public TerminalNode NL() { return getToken(ExprParser.NL, 0); }
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
			setState(33);
			match(PACKAGE);
			setState(34);
			match(STR);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(35);
				match(DOT);
				setState(36);
				match(STR);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(42);
				match(SEMI);
				}
			}

			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(45);
				match(NL);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(48);
				importR();
				}
				}
				setState(53);
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
		public List<TerminalNode> STR() { return getTokens(ExprParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(ExprParser.STR, i);
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
		public TerminalNode NL() { return getToken(ExprParser.NL, 0); }
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
			setState(54);
			match(IMPORT);
			setState(55);
			match(STR);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(56);
					match(DOT);
					setState(57);
					match(MUL);
					}
					break;
				case 2:
					{
					setState(58);
					match(DOT);
					setState(59);
					match(STR);
					}
					break;
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(65);
				match(SEMI);
				}
			}

			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(68);
				match(NL);
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

	public static class EntryLContext extends ParserRuleContext {
		public List<EntryRContext> entryR() {
			return getRuleContexts(EntryRContext.class);
		}
		public EntryRContext entryR(int i) {
			return getRuleContext(EntryRContext.class,i);
		}
		public EntryLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryL; }
	}

	public final EntryLContext entryL() throws RecognitionException {
		EntryLContext _localctx = new EntryLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entryL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				entryR();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAL || _la==VAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryRContext extends ParserRuleContext {
		public PropertyDContext propertyD() {
			return getRuleContext(PropertyDContext.class,0);
		}
		public EntryRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryR; }
	}

	public final EntryRContext entryR() throws RecognitionException {
		EntryRContext _localctx = new EntryRContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entryR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			propertyD();
			}
		}
		catch (RecognitionException re) {
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
		public IndentifierContext indentifier() {
			return getRuleContext(IndentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode VAL() { return getToken(ExprParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TypefContext typef() {
			return getRuleContext(TypefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public TerminalNode NL() { return getToken(ExprParser.NL, 0); }
		public PropertyDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyD; }
	}

	public final PropertyDContext propertyD() throws RecognitionException {
		PropertyDContext _localctx = new PropertyDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propertyD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			indentifier();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(80);
				match(COLON);
				setState(81);
				typef();
				}
			}

			setState(84);
			match(EQ);
			setState(85);
			match(STR);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(86);
				match(SEMI);
				}
			}

			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(89);
				match(NL);
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

	public static class IndentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IndentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indentifier; }
	}

	public final IndentifierContext indentifier() throws RecognitionException {
		IndentifierContext _localctx = new IndentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public TypefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typef; }
	}

	public final TypefContext typef() throws RecognitionException {
		TypefContext _localctx = new TypefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(INT);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"+
		"\n\2\3\2\5\2\31\n\2\3\2\5\2\34\n\2\3\2\5\2\37\n\2\3\2\5\2\"\n\2\3\3\3"+
		"\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\5\5\5E\n\5\3\5\5\5H\n\5\3\6\6\6K\n\6\r\6\16\6L\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\5\bU\n\b\3\b\3\b\3\b\5\bZ\n\b\3\b\5\b]\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\n\13\2j\2\25\3\2\2\2\4#\3\2\2\2\6"+
		"\65\3\2\2\2\b8\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20^\3\2\2\2\22"+
		"`\3\2\2\2\24\26\7\3\2\2\25\24\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31"+
		"\5\4\3\2\30\27\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\5\6\4\2\33\32"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\37\5\n\6\2\36\35\3\2\2\2\36\37"+
		"\3\2\2\2\37!\3\2\2\2 \"\7\3\2\2! \3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\7\6"+
		"\2\2$)\7\5\2\2%&\7\b\2\2&(\7\5\2\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*-\3\2\2\2+)\3\2\2\2,.\7\4\2\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/"+
		"\61\7\3\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\64\5\b\5\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65"+
		"\3\2\2\289\7\7\2\29@\7\5\2\2:;\7\b\2\2;?\7\t\2\2<=\7\b\2\2=?\7\5\2\2>"+
		":\3\2\2\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2"+
		"CE\7\4\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\7\3\2\2GF\3\2\2\2GH\3\2\2\2"+
		"H\t\3\2\2\2IK\5\f\7\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2"+
		"\2\2NO\5\16\b\2O\r\3\2\2\2PQ\t\2\2\2QT\5\20\t\2RS\7\17\2\2SU\5\22\n\2"+
		"TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\21\2\2WY\7\5\2\2XZ\7\4\2\2YX\3\2\2"+
		"\2YZ\3\2\2\2Z\\\3\2\2\2[]\7\3\2\2\\[\3\2\2\2\\]\3\2\2\2]\17\3\2\2\2^_"+
		"\7\16\2\2_\21\3\2\2\2`a\7\20\2\2a\23\3\2\2\2\23\25\30\33\36!)-\60\65>"+
		"@DGLTY\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}