
// Generated from Expr.g4 by ANTLR 4.8


#include "ExprListener.h"

#include "ExprParser.h"


using namespace antlrcpp;
using namespace antlr4;

ExprParser::ExprParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

ExprParser::~ExprParser() {
  delete _interpreter;
}

std::string ExprParser::getGrammarFileName() const {
  return "Expr.g4";
}

const std::vector<std::string>& ExprParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& ExprParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- FileContext ------------------------------------------------------------------

ExprParser::FileContext::FileContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> ExprParser::FileContext::NL() {
  return getTokens(ExprParser::NL);
}

tree::TerminalNode* ExprParser::FileContext::NL(size_t i) {
  return getToken(ExprParser::NL, i);
}

ExprParser::PackageRContext* ExprParser::FileContext::packageR() {
  return getRuleContext<ExprParser::PackageRContext>(0);
}

ExprParser::ImportLContext* ExprParser::FileContext::importL() {
  return getRuleContext<ExprParser::ImportLContext>(0);
}

ExprParser::EntryLContext* ExprParser::FileContext::entryL() {
  return getRuleContext<ExprParser::EntryLContext>(0);
}


size_t ExprParser::FileContext::getRuleIndex() const {
  return ExprParser::RuleFile;
}

void ExprParser::FileContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFile(this);
}

void ExprParser::FileContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFile(this);
}

ExprParser::FileContext* ExprParser::file() {
  FileContext *_localctx = _tracker.createInstance<FileContext>(_ctx, getState());
  enterRule(_localctx, 0, ExprParser::RuleFile);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(19);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      setState(18);
      match(ExprParser::NL);
      break;
    }

    }
    setState(22);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::PACKAGE) {
      setState(21);
      packageR();
    }
    setState(25);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(24);
      importL();
      break;
    }

    }
    setState(28);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::VAL

    || _la == ExprParser::VAR) {
      setState(27);
      entryL();
    }
    setState(31);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::NL) {
      setState(30);
      match(ExprParser::NL);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PackageRContext ------------------------------------------------------------------

ExprParser::PackageRContext::PackageRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::PackageRContext::PACKAGE() {
  return getToken(ExprParser::PACKAGE, 0);
}

std::vector<tree::TerminalNode *> ExprParser::PackageRContext::STR() {
  return getTokens(ExprParser::STR);
}

tree::TerminalNode* ExprParser::PackageRContext::STR(size_t i) {
  return getToken(ExprParser::STR, i);
}

std::vector<tree::TerminalNode *> ExprParser::PackageRContext::DOT() {
  return getTokens(ExprParser::DOT);
}

tree::TerminalNode* ExprParser::PackageRContext::DOT(size_t i) {
  return getToken(ExprParser::DOT, i);
}

tree::TerminalNode* ExprParser::PackageRContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}

tree::TerminalNode* ExprParser::PackageRContext::NL() {
  return getToken(ExprParser::NL, 0);
}


size_t ExprParser::PackageRContext::getRuleIndex() const {
  return ExprParser::RulePackageR;
}

void ExprParser::PackageRContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPackageR(this);
}

void ExprParser::PackageRContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPackageR(this);
}

ExprParser::PackageRContext* ExprParser::packageR() {
  PackageRContext *_localctx = _tracker.createInstance<PackageRContext>(_ctx, getState());
  enterRule(_localctx, 2, ExprParser::RulePackageR);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(33);
    match(ExprParser::PACKAGE);
    setState(34);
    match(ExprParser::STR);
    setState(39);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::DOT) {
      setState(35);
      match(ExprParser::DOT);
      setState(36);
      match(ExprParser::STR);
      setState(41);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(43);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::SEMI) {
      setState(42);
      match(ExprParser::SEMI);
    }
    setState(46);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      setState(45);
      match(ExprParser::NL);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ImportLContext ------------------------------------------------------------------

ExprParser::ImportLContext::ImportLContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::ImportRContext *> ExprParser::ImportLContext::importR() {
  return getRuleContexts<ExprParser::ImportRContext>();
}

ExprParser::ImportRContext* ExprParser::ImportLContext::importR(size_t i) {
  return getRuleContext<ExprParser::ImportRContext>(i);
}


size_t ExprParser::ImportLContext::getRuleIndex() const {
  return ExprParser::RuleImportL;
}

void ExprParser::ImportLContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterImportL(this);
}

void ExprParser::ImportLContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitImportL(this);
}

ExprParser::ImportLContext* ExprParser::importL() {
  ImportLContext *_localctx = _tracker.createInstance<ImportLContext>(_ctx, getState());
  enterRule(_localctx, 4, ExprParser::RuleImportL);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(51);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::IMPORT) {
      setState(48);
      importR();
      setState(53);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ImportRContext ------------------------------------------------------------------

ExprParser::ImportRContext::ImportRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::ImportRContext::IMPORT() {
  return getToken(ExprParser::IMPORT, 0);
}

std::vector<tree::TerminalNode *> ExprParser::ImportRContext::STR() {
  return getTokens(ExprParser::STR);
}

tree::TerminalNode* ExprParser::ImportRContext::STR(size_t i) {
  return getToken(ExprParser::STR, i);
}

std::vector<tree::TerminalNode *> ExprParser::ImportRContext::DOT() {
  return getTokens(ExprParser::DOT);
}

tree::TerminalNode* ExprParser::ImportRContext::DOT(size_t i) {
  return getToken(ExprParser::DOT, i);
}

std::vector<tree::TerminalNode *> ExprParser::ImportRContext::MUL() {
  return getTokens(ExprParser::MUL);
}

tree::TerminalNode* ExprParser::ImportRContext::MUL(size_t i) {
  return getToken(ExprParser::MUL, i);
}

tree::TerminalNode* ExprParser::ImportRContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}

tree::TerminalNode* ExprParser::ImportRContext::NL() {
  return getToken(ExprParser::NL, 0);
}


size_t ExprParser::ImportRContext::getRuleIndex() const {
  return ExprParser::RuleImportR;
}

void ExprParser::ImportRContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterImportR(this);
}

void ExprParser::ImportRContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitImportR(this);
}

ExprParser::ImportRContext* ExprParser::importR() {
  ImportRContext *_localctx = _tracker.createInstance<ImportRContext>(_ctx, getState());
  enterRule(_localctx, 6, ExprParser::RuleImportR);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(54);
    match(ExprParser::IMPORT);
    setState(55);
    match(ExprParser::STR);
    setState(62);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::DOT) {
      setState(60);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
      case 1: {
        setState(56);
        match(ExprParser::DOT);
        setState(57);
        match(ExprParser::MUL);
        break;
      }

      case 2: {
        setState(58);
        match(ExprParser::DOT);
        setState(59);
        match(ExprParser::STR);
        break;
      }

      }
      setState(64);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(66);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::SEMI) {
      setState(65);
      match(ExprParser::SEMI);
    }
    setState(69);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      setState(68);
      match(ExprParser::NL);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EntryLContext ------------------------------------------------------------------

ExprParser::EntryLContext::EntryLContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::EntryRContext *> ExprParser::EntryLContext::entryR() {
  return getRuleContexts<ExprParser::EntryRContext>();
}

ExprParser::EntryRContext* ExprParser::EntryLContext::entryR(size_t i) {
  return getRuleContext<ExprParser::EntryRContext>(i);
}


size_t ExprParser::EntryLContext::getRuleIndex() const {
  return ExprParser::RuleEntryL;
}

void ExprParser::EntryLContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEntryL(this);
}

void ExprParser::EntryLContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEntryL(this);
}

ExprParser::EntryLContext* ExprParser::entryL() {
  EntryLContext *_localctx = _tracker.createInstance<EntryLContext>(_ctx, getState());
  enterRule(_localctx, 8, ExprParser::RuleEntryL);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(72); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(71);
      entryR();
      setState(74); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == ExprParser::VAL

    || _la == ExprParser::VAR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EntryRContext ------------------------------------------------------------------

ExprParser::EntryRContext::EntryRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::PropertyDContext* ExprParser::EntryRContext::propertyD() {
  return getRuleContext<ExprParser::PropertyDContext>(0);
}


size_t ExprParser::EntryRContext::getRuleIndex() const {
  return ExprParser::RuleEntryR;
}

void ExprParser::EntryRContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEntryR(this);
}

void ExprParser::EntryRContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEntryR(this);
}

ExprParser::EntryRContext* ExprParser::entryR() {
  EntryRContext *_localctx = _tracker.createInstance<EntryRContext>(_ctx, getState());
  enterRule(_localctx, 10, ExprParser::RuleEntryR);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(76);
    propertyD();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PropertyDContext ------------------------------------------------------------------

ExprParser::PropertyDContext::PropertyDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::IndentifierContext* ExprParser::PropertyDContext::indentifier() {
  return getRuleContext<ExprParser::IndentifierContext>(0);
}

tree::TerminalNode* ExprParser::PropertyDContext::EQ() {
  return getToken(ExprParser::EQ, 0);
}

tree::TerminalNode* ExprParser::PropertyDContext::STR() {
  return getToken(ExprParser::STR, 0);
}

tree::TerminalNode* ExprParser::PropertyDContext::VAL() {
  return getToken(ExprParser::VAL, 0);
}

tree::TerminalNode* ExprParser::PropertyDContext::VAR() {
  return getToken(ExprParser::VAR, 0);
}

tree::TerminalNode* ExprParser::PropertyDContext::COLON() {
  return getToken(ExprParser::COLON, 0);
}

ExprParser::TypefContext* ExprParser::PropertyDContext::typef() {
  return getRuleContext<ExprParser::TypefContext>(0);
}

tree::TerminalNode* ExprParser::PropertyDContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}

tree::TerminalNode* ExprParser::PropertyDContext::NL() {
  return getToken(ExprParser::NL, 0);
}


size_t ExprParser::PropertyDContext::getRuleIndex() const {
  return ExprParser::RulePropertyD;
}

void ExprParser::PropertyDContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPropertyD(this);
}

void ExprParser::PropertyDContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPropertyD(this);
}

ExprParser::PropertyDContext* ExprParser::propertyD() {
  PropertyDContext *_localctx = _tracker.createInstance<PropertyDContext>(_ctx, getState());
  enterRule(_localctx, 12, ExprParser::RulePropertyD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(78);
    _la = _input->LA(1);
    if (!(_la == ExprParser::VAL

    || _la == ExprParser::VAR)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(79);
    indentifier();
    setState(82);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::COLON) {
      setState(80);
      match(ExprParser::COLON);
      setState(81);
      typef();
    }
    setState(84);
    match(ExprParser::EQ);
    setState(85);
    match(ExprParser::STR);
    setState(87);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::SEMI) {
      setState(86);
      match(ExprParser::SEMI);
    }
    setState(90);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      setState(89);
      match(ExprParser::NL);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndentifierContext ------------------------------------------------------------------

ExprParser::IndentifierContext::IndentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::IndentifierContext::ID() {
  return getToken(ExprParser::ID, 0);
}


size_t ExprParser::IndentifierContext::getRuleIndex() const {
  return ExprParser::RuleIndentifier;
}

void ExprParser::IndentifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndentifier(this);
}

void ExprParser::IndentifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndentifier(this);
}

ExprParser::IndentifierContext* ExprParser::indentifier() {
  IndentifierContext *_localctx = _tracker.createInstance<IndentifierContext>(_ctx, getState());
  enterRule(_localctx, 14, ExprParser::RuleIndentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(92);
    match(ExprParser::ID);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypefContext ------------------------------------------------------------------

ExprParser::TypefContext::TypefContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::TypefContext::INT() {
  return getToken(ExprParser::INT, 0);
}


size_t ExprParser::TypefContext::getRuleIndex() const {
  return ExprParser::RuleTypef;
}

void ExprParser::TypefContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTypef(this);
}

void ExprParser::TypefContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTypef(this);
}

ExprParser::TypefContext* ExprParser::typef() {
  TypefContext *_localctx = _tracker.createInstance<TypefContext>(_ctx, getState());
  enterRule(_localctx, 16, ExprParser::RuleTypef);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(94);
    match(ExprParser::INT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> ExprParser::_decisionToDFA;
atn::PredictionContextCache ExprParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN ExprParser::_atn;
std::vector<uint16_t> ExprParser::_serializedATN;

std::vector<std::string> ExprParser::_ruleNames = {
  "file", "packageR", "importL", "importR", "entryL", "entryR", "propertyD", 
  "indentifier", "typef"
};

std::vector<std::string> ExprParser::_literalNames = {
  "", "", "';'", "", "'package '", "'import '", "'.'", "'*'", "'val '", 
  "'var '", "", "", "", "': '", "'Int '", "'= '"
};

std::vector<std::string> ExprParser::_symbolicNames = {
  "", "NL", "SEMI", "STR", "PACKAGE", "IMPORT", "DOT", "MUL", "VAL", "VAR", 
  "DIGIT", "FN", "ID", "COLON", "INT", "EQ", "WS", "COMMENT", "COMMENT2"
};

dfa::Vocabulary ExprParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> ExprParser::_tokenNames;

ExprParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x14, 0x63, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 0x4, 
    0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x3, 0x2, 0x5, 
    0x2, 0x16, 0xa, 0x2, 0x3, 0x2, 0x5, 0x2, 0x19, 0xa, 0x2, 0x3, 0x2, 0x5, 
    0x2, 0x1c, 0xa, 0x2, 0x3, 0x2, 0x5, 0x2, 0x1f, 0xa, 0x2, 0x3, 0x2, 0x5, 
    0x2, 0x22, 0xa, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 
    0x28, 0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 0x2b, 0xb, 0x3, 0x3, 0x3, 0x5, 0x3, 
    0x2e, 0xa, 0x3, 0x3, 0x3, 0x5, 0x3, 0x31, 0xa, 0x3, 0x3, 0x4, 0x7, 0x4, 
    0x34, 0xa, 0x4, 0xc, 0x4, 0xe, 0x4, 0x37, 0xb, 0x4, 0x3, 0x5, 0x3, 0x5, 
    0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 0x3f, 0xa, 0x5, 0xc, 
    0x5, 0xe, 0x5, 0x42, 0xb, 0x5, 0x3, 0x5, 0x5, 0x5, 0x45, 0xa, 0x5, 0x3, 
    0x5, 0x5, 0x5, 0x48, 0xa, 0x5, 0x3, 0x6, 0x6, 0x6, 0x4b, 0xa, 0x6, 0xd, 
    0x6, 0xe, 0x6, 0x4c, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 
    0x3, 0x8, 0x5, 0x8, 0x55, 0xa, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 
    0x8, 0x5a, 0xa, 0x8, 0x3, 0x8, 0x5, 0x8, 0x5d, 0xa, 0x8, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x2, 0x2, 0xb, 0x2, 0x4, 0x6, 0x8, 
    0xa, 0xc, 0xe, 0x10, 0x12, 0x2, 0x3, 0x3, 0x2, 0xa, 0xb, 0x2, 0x6a, 
    0x2, 0x15, 0x3, 0x2, 0x2, 0x2, 0x4, 0x23, 0x3, 0x2, 0x2, 0x2, 0x6, 0x35, 
    0x3, 0x2, 0x2, 0x2, 0x8, 0x38, 0x3, 0x2, 0x2, 0x2, 0xa, 0x4a, 0x3, 0x2, 
    0x2, 0x2, 0xc, 0x4e, 0x3, 0x2, 0x2, 0x2, 0xe, 0x50, 0x3, 0x2, 0x2, 0x2, 
    0x10, 0x5e, 0x3, 0x2, 0x2, 0x2, 0x12, 0x60, 0x3, 0x2, 0x2, 0x2, 0x14, 
    0x16, 0x7, 0x3, 0x2, 0x2, 0x15, 0x14, 0x3, 0x2, 0x2, 0x2, 0x15, 0x16, 
    0x3, 0x2, 0x2, 0x2, 0x16, 0x18, 0x3, 0x2, 0x2, 0x2, 0x17, 0x19, 0x5, 
    0x4, 0x3, 0x2, 0x18, 0x17, 0x3, 0x2, 0x2, 0x2, 0x18, 0x19, 0x3, 0x2, 
    0x2, 0x2, 0x19, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x1c, 0x5, 0x6, 0x4, 
    0x2, 0x1b, 0x1a, 0x3, 0x2, 0x2, 0x2, 0x1b, 0x1c, 0x3, 0x2, 0x2, 0x2, 
    0x1c, 0x1e, 0x3, 0x2, 0x2, 0x2, 0x1d, 0x1f, 0x5, 0xa, 0x6, 0x2, 0x1e, 
    0x1d, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x1f, 0x21, 
    0x3, 0x2, 0x2, 0x2, 0x20, 0x22, 0x7, 0x3, 0x2, 0x2, 0x21, 0x20, 0x3, 
    0x2, 0x2, 0x2, 0x21, 0x22, 0x3, 0x2, 0x2, 0x2, 0x22, 0x3, 0x3, 0x2, 
    0x2, 0x2, 0x23, 0x24, 0x7, 0x6, 0x2, 0x2, 0x24, 0x29, 0x7, 0x5, 0x2, 
    0x2, 0x25, 0x26, 0x7, 0x8, 0x2, 0x2, 0x26, 0x28, 0x7, 0x5, 0x2, 0x2, 
    0x27, 0x25, 0x3, 0x2, 0x2, 0x2, 0x28, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x29, 
    0x27, 0x3, 0x2, 0x2, 0x2, 0x29, 0x2a, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x2d, 
    0x3, 0x2, 0x2, 0x2, 0x2b, 0x29, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x2e, 0x7, 
    0x4, 0x2, 0x2, 0x2d, 0x2c, 0x3, 0x2, 0x2, 0x2, 0x2d, 0x2e, 0x3, 0x2, 
    0x2, 0x2, 0x2e, 0x30, 0x3, 0x2, 0x2, 0x2, 0x2f, 0x31, 0x7, 0x3, 0x2, 
    0x2, 0x30, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x30, 0x31, 0x3, 0x2, 0x2, 0x2, 
    0x31, 0x5, 0x3, 0x2, 0x2, 0x2, 0x32, 0x34, 0x5, 0x8, 0x5, 0x2, 0x33, 
    0x32, 0x3, 0x2, 0x2, 0x2, 0x34, 0x37, 0x3, 0x2, 0x2, 0x2, 0x35, 0x33, 
    0x3, 0x2, 0x2, 0x2, 0x35, 0x36, 0x3, 0x2, 0x2, 0x2, 0x36, 0x7, 0x3, 
    0x2, 0x2, 0x2, 0x37, 0x35, 0x3, 0x2, 0x2, 0x2, 0x38, 0x39, 0x7, 0x7, 
    0x2, 0x2, 0x39, 0x40, 0x7, 0x5, 0x2, 0x2, 0x3a, 0x3b, 0x7, 0x8, 0x2, 
    0x2, 0x3b, 0x3f, 0x7, 0x9, 0x2, 0x2, 0x3c, 0x3d, 0x7, 0x8, 0x2, 0x2, 
    0x3d, 0x3f, 0x7, 0x5, 0x2, 0x2, 0x3e, 0x3a, 0x3, 0x2, 0x2, 0x2, 0x3e, 
    0x3c, 0x3, 0x2, 0x2, 0x2, 0x3f, 0x42, 0x3, 0x2, 0x2, 0x2, 0x40, 0x3e, 
    0x3, 0x2, 0x2, 0x2, 0x40, 0x41, 0x3, 0x2, 0x2, 0x2, 0x41, 0x44, 0x3, 
    0x2, 0x2, 0x2, 0x42, 0x40, 0x3, 0x2, 0x2, 0x2, 0x43, 0x45, 0x7, 0x4, 
    0x2, 0x2, 0x44, 0x43, 0x3, 0x2, 0x2, 0x2, 0x44, 0x45, 0x3, 0x2, 0x2, 
    0x2, 0x45, 0x47, 0x3, 0x2, 0x2, 0x2, 0x46, 0x48, 0x7, 0x3, 0x2, 0x2, 
    0x47, 0x46, 0x3, 0x2, 0x2, 0x2, 0x47, 0x48, 0x3, 0x2, 0x2, 0x2, 0x48, 
    0x9, 0x3, 0x2, 0x2, 0x2, 0x49, 0x4b, 0x5, 0xc, 0x7, 0x2, 0x4a, 0x49, 
    0x3, 0x2, 0x2, 0x2, 0x4b, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x4a, 0x3, 
    0x2, 0x2, 0x2, 0x4c, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x4d, 0xb, 0x3, 0x2, 
    0x2, 0x2, 0x4e, 0x4f, 0x5, 0xe, 0x8, 0x2, 0x4f, 0xd, 0x3, 0x2, 0x2, 
    0x2, 0x50, 0x51, 0x9, 0x2, 0x2, 0x2, 0x51, 0x54, 0x5, 0x10, 0x9, 0x2, 
    0x52, 0x53, 0x7, 0xf, 0x2, 0x2, 0x53, 0x55, 0x5, 0x12, 0xa, 0x2, 0x54, 
    0x52, 0x3, 0x2, 0x2, 0x2, 0x54, 0x55, 0x3, 0x2, 0x2, 0x2, 0x55, 0x56, 
    0x3, 0x2, 0x2, 0x2, 0x56, 0x57, 0x7, 0x11, 0x2, 0x2, 0x57, 0x59, 0x7, 
    0x5, 0x2, 0x2, 0x58, 0x5a, 0x7, 0x4, 0x2, 0x2, 0x59, 0x58, 0x3, 0x2, 
    0x2, 0x2, 0x59, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x5c, 0x3, 0x2, 0x2, 
    0x2, 0x5b, 0x5d, 0x7, 0x3, 0x2, 0x2, 0x5c, 0x5b, 0x3, 0x2, 0x2, 0x2, 
    0x5c, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x5d, 0xf, 0x3, 0x2, 0x2, 0x2, 0x5e, 
    0x5f, 0x7, 0xe, 0x2, 0x2, 0x5f, 0x11, 0x3, 0x2, 0x2, 0x2, 0x60, 0x61, 
    0x7, 0x10, 0x2, 0x2, 0x61, 0x13, 0x3, 0x2, 0x2, 0x2, 0x13, 0x15, 0x18, 
    0x1b, 0x1e, 0x21, 0x29, 0x2d, 0x30, 0x35, 0x3e, 0x40, 0x44, 0x47, 0x4c, 
    0x54, 0x59, 0x5c, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

ExprParser::Initializer ExprParser::_init;
