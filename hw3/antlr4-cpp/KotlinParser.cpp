
// Generated from Kotlin.g4 by ANTLR 4.8


#include "KotlinVisitor.h"

#include "KotlinParser.h"


using namespace antlrcpp;
using namespace antlr4;

KotlinParser::KotlinParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

KotlinParser::~KotlinParser() {
  delete _interpreter;
}

std::string KotlinParser::getGrammarFileName() const {
  return "Kotlin.g4";
}

const std::vector<std::string>& KotlinParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& KotlinParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgContext ------------------------------------------------------------------

KotlinParser::ProgContext::ProgContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::MainfContext* KotlinParser::ProgContext::mainf() {
  return getRuleContext<KotlinParser::MainfContext>(0);
}

KotlinParser::PackageRContext* KotlinParser::ProgContext::packageR() {
  return getRuleContext<KotlinParser::PackageRContext>(0);
}

KotlinParser::ImportLContext* KotlinParser::ProgContext::importL() {
  return getRuleContext<KotlinParser::ImportLContext>(0);
}

std::vector<KotlinParser::OuterLContext *> KotlinParser::ProgContext::outerL() {
  return getRuleContexts<KotlinParser::OuterLContext>();
}

KotlinParser::OuterLContext* KotlinParser::ProgContext::outerL(size_t i) {
  return getRuleContext<KotlinParser::OuterLContext>(i);
}


size_t KotlinParser::ProgContext::getRuleIndex() const {
  return KotlinParser::RuleProg;
}


antlrcpp::Any KotlinParser::ProgContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitProg(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ProgContext* KotlinParser::prog() {
  ProgContext *_localctx = _tracker.createInstance<ProgContext>(_ctx, getState());
  enterRule(_localctx, 0, KotlinParser::RuleProg);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(109);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::PACKAGE) {
      setState(108);
      packageR();
    }
    setState(112);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      setState(111);
      importL();
      break;
    }

    }
    setState(115);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(114);
      outerL();
      break;
    }

    }
    setState(117);
    mainf();
    setState(119);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 56) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 56)) & ((1ULL << (KotlinParser::VAL - 56))
      | (1ULL << (KotlinParser::VAR - 56))
      | (1ULL << (KotlinParser::CLASS - 56))
      | (1ULL << (KotlinParser::ABSTRACT - 56))
      | (1ULL << (KotlinParser::INTERFACE - 56))
      | (1ULL << (KotlinParser::FUN - 56)))) != 0)) {
      setState(118);
      outerL();
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

KotlinParser::PackageRContext::PackageRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::PackageRContext::PACKAGE() {
  return getToken(KotlinParser::PACKAGE, 0);
}

std::vector<tree::TerminalNode *> KotlinParser::PackageRContext::ID() {
  return getTokens(KotlinParser::ID);
}

tree::TerminalNode* KotlinParser::PackageRContext::ID(size_t i) {
  return getToken(KotlinParser::ID, i);
}

std::vector<tree::TerminalNode *> KotlinParser::PackageRContext::DOT() {
  return getTokens(KotlinParser::DOT);
}

tree::TerminalNode* KotlinParser::PackageRContext::DOT(size_t i) {
  return getToken(KotlinParser::DOT, i);
}

tree::TerminalNode* KotlinParser::PackageRContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}


size_t KotlinParser::PackageRContext::getRuleIndex() const {
  return KotlinParser::RulePackageR;
}


antlrcpp::Any KotlinParser::PackageRContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitPackageR(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::PackageRContext* KotlinParser::packageR() {
  PackageRContext *_localctx = _tracker.createInstance<PackageRContext>(_ctx, getState());
  enterRule(_localctx, 2, KotlinParser::RulePackageR);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(121);
    match(KotlinParser::PACKAGE);
    setState(122);
    match(KotlinParser::ID);
    setState(127);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::DOT) {
      setState(123);
      match(KotlinParser::DOT);
      setState(124);
      match(KotlinParser::ID);
      setState(129);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(131);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::SEMI) {
      setState(130);
      match(KotlinParser::SEMI);
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

KotlinParser::ImportLContext::ImportLContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ImportRContext *> KotlinParser::ImportLContext::importR() {
  return getRuleContexts<KotlinParser::ImportRContext>();
}

KotlinParser::ImportRContext* KotlinParser::ImportLContext::importR(size_t i) {
  return getRuleContext<KotlinParser::ImportRContext>(i);
}


size_t KotlinParser::ImportLContext::getRuleIndex() const {
  return KotlinParser::RuleImportL;
}


antlrcpp::Any KotlinParser::ImportLContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitImportL(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ImportLContext* KotlinParser::importL() {
  ImportLContext *_localctx = _tracker.createInstance<ImportLContext>(_ctx, getState());
  enterRule(_localctx, 4, KotlinParser::RuleImportL);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(136);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::IMPORT) {
      setState(133);
      importR();
      setState(138);
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

KotlinParser::ImportRContext::ImportRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ImportRContext::IMPORT() {
  return getToken(KotlinParser::IMPORT, 0);
}

std::vector<tree::TerminalNode *> KotlinParser::ImportRContext::ID() {
  return getTokens(KotlinParser::ID);
}

tree::TerminalNode* KotlinParser::ImportRContext::ID(size_t i) {
  return getToken(KotlinParser::ID, i);
}

std::vector<tree::TerminalNode *> KotlinParser::ImportRContext::DOT() {
  return getTokens(KotlinParser::DOT);
}

tree::TerminalNode* KotlinParser::ImportRContext::DOT(size_t i) {
  return getToken(KotlinParser::DOT, i);
}

std::vector<tree::TerminalNode *> KotlinParser::ImportRContext::MUL() {
  return getTokens(KotlinParser::MUL);
}

tree::TerminalNode* KotlinParser::ImportRContext::MUL(size_t i) {
  return getToken(KotlinParser::MUL, i);
}

tree::TerminalNode* KotlinParser::ImportRContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}


size_t KotlinParser::ImportRContext::getRuleIndex() const {
  return KotlinParser::RuleImportR;
}


antlrcpp::Any KotlinParser::ImportRContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitImportR(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ImportRContext* KotlinParser::importR() {
  ImportRContext *_localctx = _tracker.createInstance<ImportRContext>(_ctx, getState());
  enterRule(_localctx, 6, KotlinParser::RuleImportR);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(139);
    match(KotlinParser::IMPORT);
    setState(140);
    match(KotlinParser::ID);
    setState(147);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::DOT) {
      setState(145);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
      case 1: {
        setState(141);
        match(KotlinParser::DOT);
        setState(142);
        match(KotlinParser::MUL);
        break;
      }

      case 2: {
        setState(143);
        match(KotlinParser::DOT);
        setState(144);
        match(KotlinParser::ID);
        break;
      }

      }
      setState(149);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(151);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::SEMI) {
      setState(150);
      match(KotlinParser::SEMI);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OuterLContext ------------------------------------------------------------------

KotlinParser::OuterLContext::OuterLContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::OuterRContext *> KotlinParser::OuterLContext::outerR() {
  return getRuleContexts<KotlinParser::OuterRContext>();
}

KotlinParser::OuterRContext* KotlinParser::OuterLContext::outerR(size_t i) {
  return getRuleContext<KotlinParser::OuterRContext>(i);
}


size_t KotlinParser::OuterLContext::getRuleIndex() const {
  return KotlinParser::RuleOuterL;
}


antlrcpp::Any KotlinParser::OuterLContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitOuterL(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::OuterLContext* KotlinParser::outerL() {
  OuterLContext *_localctx = _tracker.createInstance<OuterLContext>(_ctx, getState());
  enterRule(_localctx, 8, KotlinParser::RuleOuterL);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(154); 
    _errHandler->sync(this);
    alt = 1;
    do {
      switch (alt) {
        case 1: {
              setState(153);
              outerR();
              break;
            }

      default:
        throw NoViableAltException(this);
      }
      setState(156); 
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    } while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OuterRContext ------------------------------------------------------------------

KotlinParser::OuterRContext::OuterRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::FunctionDContext* KotlinParser::OuterRContext::functionD() {
  return getRuleContext<KotlinParser::FunctionDContext>(0);
}

KotlinParser::ClassDContext* KotlinParser::OuterRContext::classD() {
  return getRuleContext<KotlinParser::ClassDContext>(0);
}

KotlinParser::PropertyDContext* KotlinParser::OuterRContext::propertyD() {
  return getRuleContext<KotlinParser::PropertyDContext>(0);
}


size_t KotlinParser::OuterRContext::getRuleIndex() const {
  return KotlinParser::RuleOuterR;
}


antlrcpp::Any KotlinParser::OuterRContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitOuterR(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::OuterRContext* KotlinParser::outerR() {
  OuterRContext *_localctx = _tracker.createInstance<OuterRContext>(_ctx, getState());
  enterRule(_localctx, 10, KotlinParser::RuleOuterR);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(161);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::FUN: {
        enterOuterAlt(_localctx, 1);
        setState(158);
        functionD();
        break;
      }

      case KotlinParser::CLASS:
      case KotlinParser::ABSTRACT:
      case KotlinParser::INTERFACE: {
        enterOuterAlt(_localctx, 2);
        setState(159);
        classD();
        break;
      }

      case KotlinParser::VAL:
      case KotlinParser::VAR: {
        enterOuterAlt(_localctx, 3);
        setState(160);
        propertyD();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassDContext ------------------------------------------------------------------

KotlinParser::ClassDContext::ClassDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ClassDContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::ClassDContext::CLASS() {
  return getToken(KotlinParser::CLASS, 0);
}

tree::TerminalNode* KotlinParser::ClassDContext::INTERFACE() {
  return getToken(KotlinParser::INTERFACE, 0);
}

tree::TerminalNode* KotlinParser::ClassDContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::ClassinnerContext* KotlinParser::ClassDContext::classinner() {
  return getRuleContext<KotlinParser::ClassinnerContext>(0);
}

tree::TerminalNode* KotlinParser::ClassDContext::RB() {
  return getToken(KotlinParser::RB, 0);
}

tree::TerminalNode* KotlinParser::ClassDContext::ABSTRACT() {
  return getToken(KotlinParser::ABSTRACT, 0);
}

KotlinParser::CargusContext* KotlinParser::ClassDContext::cargus() {
  return getRuleContext<KotlinParser::CargusContext>(0);
}

tree::TerminalNode* KotlinParser::ClassDContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::TypecContext* KotlinParser::ClassDContext::typec() {
  return getRuleContext<KotlinParser::TypecContext>(0);
}


size_t KotlinParser::ClassDContext::getRuleIndex() const {
  return KotlinParser::RuleClassD;
}


antlrcpp::Any KotlinParser::ClassDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitClassD(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ClassDContext* KotlinParser::classD() {
  ClassDContext *_localctx = _tracker.createInstance<ClassDContext>(_ctx, getState());
  enterRule(_localctx, 12, KotlinParser::RuleClassD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(164);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::ABSTRACT) {
      setState(163);
      match(KotlinParser::ABSTRACT);
    }
    setState(166);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::CLASS

    || _la == KotlinParser::INTERFACE)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(167);
    match(KotlinParser::ID);
    setState(169);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::LPAR

    || _la == KotlinParser::CONSTRUCTOR) {
      setState(168);
      cargus();
    }
    setState(173);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::COLON) {
      setState(171);
      match(KotlinParser::COLON);
      setState(172);
      typec();
    }

    setState(175);
    match(KotlinParser::LB);
    setState(176);
    classinner();
    setState(177);
    match(KotlinParser::RB);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypecContext ------------------------------------------------------------------

KotlinParser::TypecContext::TypecContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpressionContext *> KotlinParser::TypecContext::expression() {
  return getRuleContexts<KotlinParser::ExpressionContext>();
}

KotlinParser::ExpressionContext* KotlinParser::TypecContext::expression(size_t i) {
  return getRuleContext<KotlinParser::ExpressionContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::TypecContext::COMMA() {
  return getTokens(KotlinParser::COMMA);
}

tree::TerminalNode* KotlinParser::TypecContext::COMMA(size_t i) {
  return getToken(KotlinParser::COMMA, i);
}


size_t KotlinParser::TypecContext::getRuleIndex() const {
  return KotlinParser::RuleTypec;
}


antlrcpp::Any KotlinParser::TypecContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitTypec(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::TypecContext* KotlinParser::typec() {
  TypecContext *_localctx = _tracker.createInstance<TypecContext>(_ctx, getState());
  enterRule(_localctx, 14, KotlinParser::RuleTypec);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(179);
    expression();
    setState(184);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::COMMA) {
      setState(180);
      match(KotlinParser::COMMA);
      setState(181);
      expression();
      setState(186);
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

//----------------- ClassinnerContext ------------------------------------------------------------------

KotlinParser::ClassinnerContext::ClassinnerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::PropertyCContext *> KotlinParser::ClassinnerContext::propertyC() {
  return getRuleContexts<KotlinParser::PropertyCContext>();
}

KotlinParser::PropertyCContext* KotlinParser::ClassinnerContext::propertyC(size_t i) {
  return getRuleContext<KotlinParser::PropertyCContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ClassinnerContext::SEMI() {
  return getTokens(KotlinParser::SEMI);
}

tree::TerminalNode* KotlinParser::ClassinnerContext::SEMI(size_t i) {
  return getToken(KotlinParser::SEMI, i);
}


size_t KotlinParser::ClassinnerContext::getRuleIndex() const {
  return KotlinParser::RuleClassinner;
}


antlrcpp::Any KotlinParser::ClassinnerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitClassinner(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ClassinnerContext* KotlinParser::classinner() {
  ClassinnerContext *_localctx = _tracker.createInstance<ClassinnerContext>(_ctx, getState());
  enterRule(_localctx, 16, KotlinParser::RuleClassinner);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(193);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (((((_la - 56) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 56)) & ((1ULL << (KotlinParser::VAL - 56))
      | (1ULL << (KotlinParser::VAR - 56))
      | (1ULL << (KotlinParser::OVERRIDE - 56))
      | (1ULL << (KotlinParser::ABSTRACT - 56))
      | (1ULL << (KotlinParser::FUN - 56)))) != 0)) {
      setState(187);
      propertyC();
      setState(189);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == KotlinParser::SEMI) {
        setState(188);
        match(KotlinParser::SEMI);
      }
      setState(195);
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

//----------------- PropertyCContext ------------------------------------------------------------------

KotlinParser::PropertyCContext::PropertyCContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::FuncDContext* KotlinParser::PropertyCContext::funcD() {
  return getRuleContext<KotlinParser::FuncDContext>(0);
}

KotlinParser::ValcDContext* KotlinParser::PropertyCContext::valcD() {
  return getRuleContext<KotlinParser::ValcDContext>(0);
}


size_t KotlinParser::PropertyCContext::getRuleIndex() const {
  return KotlinParser::RulePropertyC;
}


antlrcpp::Any KotlinParser::PropertyCContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitPropertyC(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::PropertyCContext* KotlinParser::propertyC() {
  PropertyCContext *_localctx = _tracker.createInstance<PropertyCContext>(_ctx, getState());
  enterRule(_localctx, 18, KotlinParser::RulePropertyC);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(198);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(196);
      funcD();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(197);
      valcD();
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

//----------------- ValcDContext ------------------------------------------------------------------

KotlinParser::ValcDContext::ValcDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ValcDContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::ValcDContext::VAL() {
  return getToken(KotlinParser::VAL, 0);
}

tree::TerminalNode* KotlinParser::ValcDContext::VAR() {
  return getToken(KotlinParser::VAR, 0);
}

tree::TerminalNode* KotlinParser::ValcDContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::TypefContext* KotlinParser::ValcDContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::ValcDContext::ASN() {
  return getToken(KotlinParser::ASN, 0);
}

KotlinParser::ExpressionContext* KotlinParser::ValcDContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

tree::TerminalNode* KotlinParser::ValcDContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}

tree::TerminalNode* KotlinParser::ValcDContext::ABSTRACT() {
  return getToken(KotlinParser::ABSTRACT, 0);
}

tree::TerminalNode* KotlinParser::ValcDContext::OVERRIDE() {
  return getToken(KotlinParser::OVERRIDE, 0);
}

tree::TerminalNode* KotlinParser::ValcDContext::GET() {
  return getToken(KotlinParser::GET, 0);
}


size_t KotlinParser::ValcDContext::getRuleIndex() const {
  return KotlinParser::RuleValcD;
}


antlrcpp::Any KotlinParser::ValcDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitValcD(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ValcDContext* KotlinParser::valcD() {
  ValcDContext *_localctx = _tracker.createInstance<ValcDContext>(_ctx, getState());
  enterRule(_localctx, 20, KotlinParser::RuleValcD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(201);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::OVERRIDE

    || _la == KotlinParser::ABSTRACT) {
      setState(200);
      _la = _input->LA(1);
      if (!(_la == KotlinParser::OVERRIDE

      || _la == KotlinParser::ABSTRACT)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(203);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::VAL

    || _la == KotlinParser::VAR)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(204);
    match(KotlinParser::ID);
    setState(210);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::COLON) {
      setState(205);
      match(KotlinParser::COLON);
      setState(206);
      typef();
      setState(208);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == KotlinParser::GET) {
        setState(207);
        match(KotlinParser::GET);
      }
    }
    setState(214);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::ASN) {
      setState(212);
      match(KotlinParser::ASN);
      setState(213);
      expression();
    }
    setState(217);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      setState(216);
      match(KotlinParser::SEMI);
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

//----------------- FuncDContext ------------------------------------------------------------------

KotlinParser::FuncDContext::FuncDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::FuncDContext::FUN() {
  return getToken(KotlinParser::FUN, 0);
}

tree::TerminalNode* KotlinParser::FuncDContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

KotlinParser::ArgumentContext* KotlinParser::FuncDContext::argument() {
  return getRuleContext<KotlinParser::ArgumentContext>(0);
}

tree::TerminalNode* KotlinParser::FuncDContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::WhichfunctionContext* KotlinParser::FuncDContext::whichfunction() {
  return getRuleContext<KotlinParser::WhichfunctionContext>(0);
}

tree::TerminalNode* KotlinParser::FuncDContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}

tree::TerminalNode* KotlinParser::FuncDContext::ABSTRACT() {
  return getToken(KotlinParser::ABSTRACT, 0);
}

tree::TerminalNode* KotlinParser::FuncDContext::OVERRIDE() {
  return getToken(KotlinParser::OVERRIDE, 0);
}

KotlinParser::TypefContext* KotlinParser::FuncDContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::FuncDContext::QUERY() {
  return getToken(KotlinParser::QUERY, 0);
}


size_t KotlinParser::FuncDContext::getRuleIndex() const {
  return KotlinParser::RuleFuncD;
}


antlrcpp::Any KotlinParser::FuncDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitFuncD(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::FuncDContext* KotlinParser::funcD() {
  FuncDContext *_localctx = _tracker.createInstance<FuncDContext>(_ctx, getState());
  enterRule(_localctx, 22, KotlinParser::RuleFuncD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(220);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::OVERRIDE

    || _la == KotlinParser::ABSTRACT) {
      setState(219);
      _la = _input->LA(1);
      if (!(_la == KotlinParser::OVERRIDE

      || _la == KotlinParser::ABSTRACT)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(222);
    match(KotlinParser::FUN);
    setState(223);
    match(KotlinParser::ID);
    setState(224);
    argument();
    setState(232);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::COLON) {
      setState(225);
      match(KotlinParser::COLON);
      setState(227);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (((((_la - 42) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 42)) & ((1ULL << (KotlinParser::BOOL - 42))
        | (1ULL << (KotlinParser::BYTE - 42))
        | (1ULL << (KotlinParser::SHORT - 42))
        | (1ULL << (KotlinParser::LONG - 42))
        | (1ULL << (KotlinParser::FLOAT - 42))
        | (1ULL << (KotlinParser::DOUBLE - 42))
        | (1ULL << (KotlinParser::INT - 42))
        | (1ULL << (KotlinParser::STRING - 42))
        | (1ULL << (KotlinParser::UNIT - 42))
        | (1ULL << (KotlinParser::ANY - 42))
        | (1ULL << (KotlinParser::CHAR - 42))
        | (1ULL << (KotlinParser::ID - 42)))) != 0)) {
        setState(226);
        typef();
      }
      setState(230);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == KotlinParser::QUERY) {
        setState(229);
        match(KotlinParser::QUERY);
      }
    }
    setState(235);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::PASN)
      | (1ULL << KotlinParser::MASN)
      | (1ULL << KotlinParser::MULASN)
      | (1ULL << KotlinParser::DIVASN)
      | (1ULL << KotlinParser::MODASN)
      | (1ULL << KotlinParser::LB)
      | (1ULL << KotlinParser::ASN))) != 0)) {
      setState(234);
      whichfunction();
    }
    setState(238);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx)) {
    case 1: {
      setState(237);
      match(KotlinParser::SEMI);
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

//----------------- CargusContext ------------------------------------------------------------------

KotlinParser::CargusContext::CargusContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::CargusContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

tree::TerminalNode* KotlinParser::CargusContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

tree::TerminalNode* KotlinParser::CargusContext::CONSTRUCTOR() {
  return getToken(KotlinParser::CONSTRUCTOR, 0);
}

std::vector<KotlinParser::CarguContext *> KotlinParser::CargusContext::cargu() {
  return getRuleContexts<KotlinParser::CarguContext>();
}

KotlinParser::CarguContext* KotlinParser::CargusContext::cargu(size_t i) {
  return getRuleContext<KotlinParser::CarguContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::CargusContext::COMMA() {
  return getTokens(KotlinParser::COMMA);
}

tree::TerminalNode* KotlinParser::CargusContext::COMMA(size_t i) {
  return getToken(KotlinParser::COMMA, i);
}


size_t KotlinParser::CargusContext::getRuleIndex() const {
  return KotlinParser::RuleCargus;
}


antlrcpp::Any KotlinParser::CargusContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitCargus(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::CargusContext* KotlinParser::cargus() {
  CargusContext *_localctx = _tracker.createInstance<CargusContext>(_ctx, getState());
  enterRule(_localctx, 24, KotlinParser::RuleCargus);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(241);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::CONSTRUCTOR) {
      setState(240);
      match(KotlinParser::CONSTRUCTOR);
    }
    setState(243);
    match(KotlinParser::LPAR);
    setState(245);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 56) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 56)) & ((1ULL << (KotlinParser::VAL - 56))
      | (1ULL << (KotlinParser::VAR - 56))
      | (1ULL << (KotlinParser::ID - 56)))) != 0)) {
      setState(244);
      cargu();
    }
    setState(251);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::COMMA) {
      setState(247);
      match(KotlinParser::COMMA);
      setState(248);
      cargu();
      setState(253);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(254);
    match(KotlinParser::RPAR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CarguContext ------------------------------------------------------------------

KotlinParser::CarguContext::CarguContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::CarguContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::CarguContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::TypefContext* KotlinParser::CarguContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::CarguContext::VAL() {
  return getToken(KotlinParser::VAL, 0);
}

tree::TerminalNode* KotlinParser::CarguContext::VAR() {
  return getToken(KotlinParser::VAR, 0);
}


size_t KotlinParser::CarguContext::getRuleIndex() const {
  return KotlinParser::RuleCargu;
}


antlrcpp::Any KotlinParser::CarguContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitCargu(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::CarguContext* KotlinParser::cargu() {
  CarguContext *_localctx = _tracker.createInstance<CarguContext>(_ctx, getState());
  enterRule(_localctx, 26, KotlinParser::RuleCargu);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(257);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::VAL

    || _la == KotlinParser::VAR) {
      setState(256);
      _la = _input->LA(1);
      if (!(_la == KotlinParser::VAL

      || _la == KotlinParser::VAR)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(259);
    match(KotlinParser::ID);
    setState(260);
    match(KotlinParser::COLON);
    setState(261);
    typef();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MainfContext ------------------------------------------------------------------

KotlinParser::MainfContext::MainfContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::MainfContext::FUN() {
  return getToken(KotlinParser::FUN, 0);
}

tree::TerminalNode* KotlinParser::MainfContext::MAIN() {
  return getToken(KotlinParser::MAIN, 0);
}

tree::TerminalNode* KotlinParser::MainfContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

tree::TerminalNode* KotlinParser::MainfContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

tree::TerminalNode* KotlinParser::MainfContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::InnerblockContext* KotlinParser::MainfContext::innerblock() {
  return getRuleContext<KotlinParser::InnerblockContext>(0);
}

tree::TerminalNode* KotlinParser::MainfContext::RB() {
  return getToken(KotlinParser::RB, 0);
}


size_t KotlinParser::MainfContext::getRuleIndex() const {
  return KotlinParser::RuleMainf;
}


antlrcpp::Any KotlinParser::MainfContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitMainf(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::MainfContext* KotlinParser::mainf() {
  MainfContext *_localctx = _tracker.createInstance<MainfContext>(_ctx, getState());
  enterRule(_localctx, 28, KotlinParser::RuleMainf);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(263);
    match(KotlinParser::FUN);
    setState(264);
    match(KotlinParser::MAIN);
    setState(265);
    match(KotlinParser::LPAR);
    setState(266);
    match(KotlinParser::RPAR);
    setState(267);
    match(KotlinParser::LB);
    setState(268);
    innerblock();
    setState(269);
    match(KotlinParser::RB);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDContext ------------------------------------------------------------------

KotlinParser::FunctionDContext::FunctionDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::FunctionDContext::FUN() {
  return getToken(KotlinParser::FUN, 0);
}

tree::TerminalNode* KotlinParser::FunctionDContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

KotlinParser::ArgumentContext* KotlinParser::FunctionDContext::argument() {
  return getRuleContext<KotlinParser::ArgumentContext>(0);
}

KotlinParser::WhichfunctionContext* KotlinParser::FunctionDContext::whichfunction() {
  return getRuleContext<KotlinParser::WhichfunctionContext>(0);
}

tree::TerminalNode* KotlinParser::FunctionDContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

tree::TerminalNode* KotlinParser::FunctionDContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}

KotlinParser::TypefContext* KotlinParser::FunctionDContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::FunctionDContext::QUERY() {
  return getToken(KotlinParser::QUERY, 0);
}


size_t KotlinParser::FunctionDContext::getRuleIndex() const {
  return KotlinParser::RuleFunctionD;
}


antlrcpp::Any KotlinParser::FunctionDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitFunctionD(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::FunctionDContext* KotlinParser::functionD() {
  FunctionDContext *_localctx = _tracker.createInstance<FunctionDContext>(_ctx, getState());
  enterRule(_localctx, 30, KotlinParser::RuleFunctionD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(271);
    match(KotlinParser::FUN);
    setState(272);
    match(KotlinParser::ID);
    setState(273);
    argument();
    setState(281);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::COLON) {
      setState(274);
      match(KotlinParser::COLON);
      setState(276);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (((((_la - 42) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 42)) & ((1ULL << (KotlinParser::BOOL - 42))
        | (1ULL << (KotlinParser::BYTE - 42))
        | (1ULL << (KotlinParser::SHORT - 42))
        | (1ULL << (KotlinParser::LONG - 42))
        | (1ULL << (KotlinParser::FLOAT - 42))
        | (1ULL << (KotlinParser::DOUBLE - 42))
        | (1ULL << (KotlinParser::INT - 42))
        | (1ULL << (KotlinParser::STRING - 42))
        | (1ULL << (KotlinParser::UNIT - 42))
        | (1ULL << (KotlinParser::ANY - 42))
        | (1ULL << (KotlinParser::CHAR - 42))
        | (1ULL << (KotlinParser::ID - 42)))) != 0)) {
        setState(275);
        typef();
      }
      setState(279);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == KotlinParser::QUERY) {
        setState(278);
        match(KotlinParser::QUERY);
      }
    }
    setState(283);
    whichfunction();
    setState(285);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      setState(284);
      match(KotlinParser::SEMI);
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

//----------------- ArgumentContext ------------------------------------------------------------------

KotlinParser::ArgumentContext::ArgumentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ArgumentContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

tree::TerminalNode* KotlinParser::ArgumentContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

std::vector<tree::TerminalNode *> KotlinParser::ArgumentContext::ID() {
  return getTokens(KotlinParser::ID);
}

tree::TerminalNode* KotlinParser::ArgumentContext::ID(size_t i) {
  return getToken(KotlinParser::ID, i);
}

std::vector<tree::TerminalNode *> KotlinParser::ArgumentContext::COLON() {
  return getTokens(KotlinParser::COLON);
}

tree::TerminalNode* KotlinParser::ArgumentContext::COLON(size_t i) {
  return getToken(KotlinParser::COLON, i);
}

std::vector<KotlinParser::TypefContext *> KotlinParser::ArgumentContext::typef() {
  return getRuleContexts<KotlinParser::TypefContext>();
}

KotlinParser::TypefContext* KotlinParser::ArgumentContext::typef(size_t i) {
  return getRuleContext<KotlinParser::TypefContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ArgumentContext::COMMA() {
  return getTokens(KotlinParser::COMMA);
}

tree::TerminalNode* KotlinParser::ArgumentContext::COMMA(size_t i) {
  return getToken(KotlinParser::COMMA, i);
}


size_t KotlinParser::ArgumentContext::getRuleIndex() const {
  return KotlinParser::RuleArgument;
}


antlrcpp::Any KotlinParser::ArgumentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitArgument(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ArgumentContext* KotlinParser::argument() {
  ArgumentContext *_localctx = _tracker.createInstance<ArgumentContext>(_ctx, getState());
  enterRule(_localctx, 32, KotlinParser::RuleArgument);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(287);
    match(KotlinParser::LPAR);
    setState(296);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::ID) {
      setState(288);
      match(KotlinParser::ID);
      setState(289);
      match(KotlinParser::COLON);
      setState(290);
      typef();
      setState(292);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == KotlinParser::COMMA) {
        setState(291);
        match(KotlinParser::COMMA);
      }
      setState(298);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(299);
    match(KotlinParser::RPAR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WhichfunctionContext ------------------------------------------------------------------

KotlinParser::WhichfunctionContext::WhichfunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::AssignContext* KotlinParser::WhichfunctionContext::assign() {
  return getRuleContext<KotlinParser::AssignContext>(0);
}

tree::TerminalNode* KotlinParser::WhichfunctionContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::InnerblockContext* KotlinParser::WhichfunctionContext::innerblock() {
  return getRuleContext<KotlinParser::InnerblockContext>(0);
}

tree::TerminalNode* KotlinParser::WhichfunctionContext::RB() {
  return getToken(KotlinParser::RB, 0);
}


size_t KotlinParser::WhichfunctionContext::getRuleIndex() const {
  return KotlinParser::RuleWhichfunction;
}


antlrcpp::Any KotlinParser::WhichfunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitWhichfunction(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::WhichfunctionContext* KotlinParser::whichfunction() {
  WhichfunctionContext *_localctx = _tracker.createInstance<WhichfunctionContext>(_ctx, getState());
  enterRule(_localctx, 34, KotlinParser::RuleWhichfunction);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(306);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::PASN:
      case KotlinParser::MASN:
      case KotlinParser::MULASN:
      case KotlinParser::DIVASN:
      case KotlinParser::MODASN:
      case KotlinParser::ASN: {
        enterOuterAlt(_localctx, 1);
        setState(301);
        assign();
        break;
      }

      case KotlinParser::LB: {
        enterOuterAlt(_localctx, 2);
        setState(302);
        match(KotlinParser::LB);
        setState(303);
        innerblock();
        setState(304);
        match(KotlinParser::RB);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignContext ------------------------------------------------------------------

KotlinParser::AssignContext::AssignContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::AssignoprContext* KotlinParser::AssignContext::assignopr() {
  return getRuleContext<KotlinParser::AssignoprContext>(0);
}

KotlinParser::ExpressionContext* KotlinParser::AssignContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}


size_t KotlinParser::AssignContext::getRuleIndex() const {
  return KotlinParser::RuleAssign;
}


antlrcpp::Any KotlinParser::AssignContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitAssign(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::AssignContext* KotlinParser::assign() {
  AssignContext *_localctx = _tracker.createInstance<AssignContext>(_ctx, getState());
  enterRule(_localctx, 36, KotlinParser::RuleAssign);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(308);
    assignopr();
    setState(309);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignoprContext ------------------------------------------------------------------

KotlinParser::AssignoprContext::AssignoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::AssignoprContext::ASN() {
  return getToken(KotlinParser::ASN, 0);
}

tree::TerminalNode* KotlinParser::AssignoprContext::PASN() {
  return getToken(KotlinParser::PASN, 0);
}

tree::TerminalNode* KotlinParser::AssignoprContext::MASN() {
  return getToken(KotlinParser::MASN, 0);
}

tree::TerminalNode* KotlinParser::AssignoprContext::MULASN() {
  return getToken(KotlinParser::MULASN, 0);
}

tree::TerminalNode* KotlinParser::AssignoprContext::DIVASN() {
  return getToken(KotlinParser::DIVASN, 0);
}

tree::TerminalNode* KotlinParser::AssignoprContext::MODASN() {
  return getToken(KotlinParser::MODASN, 0);
}


size_t KotlinParser::AssignoprContext::getRuleIndex() const {
  return KotlinParser::RuleAssignopr;
}


antlrcpp::Any KotlinParser::AssignoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitAssignopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::AssignoprContext* KotlinParser::assignopr() {
  AssignoprContext *_localctx = _tracker.createInstance<AssignoprContext>(_ctx, getState());
  enterRule(_localctx, 38, KotlinParser::RuleAssignopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(311);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::PASN)
      | (1ULL << KotlinParser::MASN)
      | (1ULL << KotlinParser::MULASN)
      | (1ULL << KotlinParser::DIVASN)
      | (1ULL << KotlinParser::MODASN)
      | (1ULL << KotlinParser::ASN))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InnerblockContext ------------------------------------------------------------------

KotlinParser::InnerblockContext::InnerblockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::StatementContext *> KotlinParser::InnerblockContext::statement() {
  return getRuleContexts<KotlinParser::StatementContext>();
}

KotlinParser::StatementContext* KotlinParser::InnerblockContext::statement(size_t i) {
  return getRuleContext<KotlinParser::StatementContext>(i);
}


size_t KotlinParser::InnerblockContext::getRuleIndex() const {
  return KotlinParser::RuleInnerblock;
}


antlrcpp::Any KotlinParser::InnerblockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitInnerblock(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::InnerblockContext* KotlinParser::innerblock() {
  InnerblockContext *_localctx = _tracker.createInstance<InnerblockContext>(_ctx, getState());
  enterRule(_localctx, 40, KotlinParser::RuleInnerblock);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(316);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (((((_la - 14) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 14)) & ((1ULL << (KotlinParser::DPULS - 14))
      | (1ULL << (KotlinParser::DMINUS - 14))
      | (1ULL << (KotlinParser::LPAR - 14))
      | (1ULL << (KotlinParser::LSQ - 14))
      | (1ULL << (KotlinParser::PULS - 14))
      | (1ULL << (KotlinParser::MINUS - 14))
      | (1ULL << (KotlinParser::IF - 14))
      | (1ULL << (KotlinParser::FOR - 14))
      | (1ULL << (KotlinParser::WHILE - 14))
      | (1ULL << (KotlinParser::SUPERANY - 14))
      | (1ULL << (KotlinParser::VAL - 14))
      | (1ULL << (KotlinParser::VAR - 14))
      | (1ULL << (KotlinParser::CLASS - 14))
      | (1ULL << (KotlinParser::ABSTRACT - 14))
      | (1ULL << (KotlinParser::INTERFACE - 14))
      | (1ULL << (KotlinParser::NULLT - 14))
      | (1ULL << (KotlinParser::FUN - 14))
      | (1ULL << (KotlinParser::RETC - 14))
      | (1ULL << (KotlinParser::TRUE - 14))
      | (1ULL << (KotlinParser::FALSE - 14))
      | (1ULL << (KotlinParser::CHR - 14))
      | (1ULL << (KotlinParser::STR - 14))
      | (1ULL << (KotlinParser::ID - 14))
      | (1ULL << (KotlinParser::NUM - 14)))) != 0)) {
      setState(313);
      statement();
      setState(318);
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

//----------------- StatementContext ------------------------------------------------------------------

KotlinParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::VariableDContext* KotlinParser::StatementContext::variableD() {
  return getRuleContext<KotlinParser::VariableDContext>(0);
}

tree::TerminalNode* KotlinParser::StatementContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}

KotlinParser::FunctionDContext* KotlinParser::StatementContext::functionD() {
  return getRuleContext<KotlinParser::FunctionDContext>(0);
}

KotlinParser::ExpressionContext* KotlinParser::StatementContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

KotlinParser::ExitContext* KotlinParser::StatementContext::exit() {
  return getRuleContext<KotlinParser::ExitContext>(0);
}

tree::TerminalNode* KotlinParser::StatementContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

KotlinParser::AssignContext* KotlinParser::StatementContext::assign() {
  return getRuleContext<KotlinParser::AssignContext>(0);
}

KotlinParser::ForloopContext* KotlinParser::StatementContext::forloop() {
  return getRuleContext<KotlinParser::ForloopContext>(0);
}

KotlinParser::WhileloopContext* KotlinParser::StatementContext::whileloop() {
  return getRuleContext<KotlinParser::WhileloopContext>(0);
}

KotlinParser::ClassDContext* KotlinParser::StatementContext::classD() {
  return getRuleContext<KotlinParser::ClassDContext>(0);
}


size_t KotlinParser::StatementContext::getRuleIndex() const {
  return KotlinParser::RuleStatement;
}


antlrcpp::Any KotlinParser::StatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitStatement(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::StatementContext* KotlinParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 42, KotlinParser::RuleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(343);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 47, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(319);
      variableD();
      setState(321);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx)) {
      case 1: {
        setState(320);
        match(KotlinParser::SEMI);
        break;
      }

      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(323);
      functionD();
      setState(325);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx)) {
      case 1: {
        setState(324);
        match(KotlinParser::SEMI);
        break;
      }

      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(327);
      expression();
      setState(329);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 44, _ctx)) {
      case 1: {
        setState(328);
        match(KotlinParser::SEMI);
        break;
      }

      }
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(331);
      exit();
      setState(333);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx)) {
      case 1: {
        setState(332);
        match(KotlinParser::SEMI);
        break;
      }

      }
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(335);
      match(KotlinParser::ID);
      setState(336);
      assign();
      setState(338);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
      case 1: {
        setState(337);
        match(KotlinParser::SEMI);
        break;
      }

      }
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(340);
      forloop();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(341);
      whileloop();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(342);
      classD();
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

//----------------- ForloopContext ------------------------------------------------------------------

KotlinParser::ForloopContext::ForloopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ForloopContext::FOR() {
  return getToken(KotlinParser::FOR, 0);
}

tree::TerminalNode* KotlinParser::ForloopContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

tree::TerminalNode* KotlinParser::ForloopContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::ForloopContext::IN() {
  return getToken(KotlinParser::IN, 0);
}

KotlinParser::ExpressionContext* KotlinParser::ForloopContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

tree::TerminalNode* KotlinParser::ForloopContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

KotlinParser::StatementContext* KotlinParser::ForloopContext::statement() {
  return getRuleContext<KotlinParser::StatementContext>(0);
}

tree::TerminalNode* KotlinParser::ForloopContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::TypefContext* KotlinParser::ForloopContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::ForloopContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::InnerblockContext* KotlinParser::ForloopContext::innerblock() {
  return getRuleContext<KotlinParser::InnerblockContext>(0);
}

tree::TerminalNode* KotlinParser::ForloopContext::RB() {
  return getToken(KotlinParser::RB, 0);
}


size_t KotlinParser::ForloopContext::getRuleIndex() const {
  return KotlinParser::RuleForloop;
}


antlrcpp::Any KotlinParser::ForloopContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitForloop(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ForloopContext* KotlinParser::forloop() {
  ForloopContext *_localctx = _tracker.createInstance<ForloopContext>(_ctx, getState());
  enterRule(_localctx, 44, KotlinParser::RuleForloop);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(345);
    match(KotlinParser::FOR);
    setState(346);
    match(KotlinParser::LPAR);
    setState(347);
    match(KotlinParser::ID);
    setState(350);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::COLON) {
      setState(348);
      match(KotlinParser::COLON);
      setState(349);
      typef();
    }
    setState(352);
    match(KotlinParser::IN);
    setState(353);
    expression();
    setState(354);
    match(KotlinParser::RPAR);
    setState(360);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::LB: {
        setState(355);
        match(KotlinParser::LB);
        setState(356);
        innerblock();
        setState(357);
        match(KotlinParser::RB);
        break;
      }

      case KotlinParser::DPULS:
      case KotlinParser::DMINUS:
      case KotlinParser::LPAR:
      case KotlinParser::LSQ:
      case KotlinParser::PULS:
      case KotlinParser::MINUS:
      case KotlinParser::IF:
      case KotlinParser::FOR:
      case KotlinParser::WHILE:
      case KotlinParser::SUPERANY:
      case KotlinParser::VAL:
      case KotlinParser::VAR:
      case KotlinParser::CLASS:
      case KotlinParser::ABSTRACT:
      case KotlinParser::INTERFACE:
      case KotlinParser::NULLT:
      case KotlinParser::FUN:
      case KotlinParser::RETC:
      case KotlinParser::TRUE:
      case KotlinParser::FALSE:
      case KotlinParser::CHR:
      case KotlinParser::STR:
      case KotlinParser::ID:
      case KotlinParser::NUM: {
        setState(359);
        statement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WhileloopContext ------------------------------------------------------------------

KotlinParser::WhileloopContext::WhileloopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::WhileloopContext::WHILE() {
  return getToken(KotlinParser::WHILE, 0);
}

tree::TerminalNode* KotlinParser::WhileloopContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

KotlinParser::ExpressionContext* KotlinParser::WhileloopContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

tree::TerminalNode* KotlinParser::WhileloopContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

KotlinParser::StatementContext* KotlinParser::WhileloopContext::statement() {
  return getRuleContext<KotlinParser::StatementContext>(0);
}

tree::TerminalNode* KotlinParser::WhileloopContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::InnerblockContext* KotlinParser::WhileloopContext::innerblock() {
  return getRuleContext<KotlinParser::InnerblockContext>(0);
}

tree::TerminalNode* KotlinParser::WhileloopContext::RB() {
  return getToken(KotlinParser::RB, 0);
}


size_t KotlinParser::WhileloopContext::getRuleIndex() const {
  return KotlinParser::RuleWhileloop;
}


antlrcpp::Any KotlinParser::WhileloopContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitWhileloop(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::WhileloopContext* KotlinParser::whileloop() {
  WhileloopContext *_localctx = _tracker.createInstance<WhileloopContext>(_ctx, getState());
  enterRule(_localctx, 46, KotlinParser::RuleWhileloop);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(362);
    match(KotlinParser::WHILE);
    setState(363);
    match(KotlinParser::LPAR);
    setState(364);
    expression();
    setState(365);
    match(KotlinParser::RPAR);
    setState(371);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::LB: {
        setState(366);
        match(KotlinParser::LB);
        setState(367);
        innerblock();
        setState(368);
        match(KotlinParser::RB);
        break;
      }

      case KotlinParser::DPULS:
      case KotlinParser::DMINUS:
      case KotlinParser::LPAR:
      case KotlinParser::LSQ:
      case KotlinParser::PULS:
      case KotlinParser::MINUS:
      case KotlinParser::IF:
      case KotlinParser::FOR:
      case KotlinParser::WHILE:
      case KotlinParser::SUPERANY:
      case KotlinParser::VAL:
      case KotlinParser::VAR:
      case KotlinParser::CLASS:
      case KotlinParser::ABSTRACT:
      case KotlinParser::INTERFACE:
      case KotlinParser::NULLT:
      case KotlinParser::FUN:
      case KotlinParser::RETC:
      case KotlinParser::TRUE:
      case KotlinParser::FALSE:
      case KotlinParser::CHR:
      case KotlinParser::STR:
      case KotlinParser::ID:
      case KotlinParser::NUM: {
        setState(370);
        statement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfthenelseContext ------------------------------------------------------------------

KotlinParser::IfthenelseContext::IfthenelseContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::IfthenelseContext::IF() {
  return getToken(KotlinParser::IF, 0);
}

tree::TerminalNode* KotlinParser::IfthenelseContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

KotlinParser::ExpressionContext* KotlinParser::IfthenelseContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

tree::TerminalNode* KotlinParser::IfthenelseContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

KotlinParser::StatementContext* KotlinParser::IfthenelseContext::statement() {
  return getRuleContext<KotlinParser::StatementContext>(0);
}

KotlinParser::ElifContext* KotlinParser::IfthenelseContext::elif() {
  return getRuleContext<KotlinParser::ElifContext>(0);
}

tree::TerminalNode* KotlinParser::IfthenelseContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::InnerblockContext* KotlinParser::IfthenelseContext::innerblock() {
  return getRuleContext<KotlinParser::InnerblockContext>(0);
}

tree::TerminalNode* KotlinParser::IfthenelseContext::RB() {
  return getToken(KotlinParser::RB, 0);
}


size_t KotlinParser::IfthenelseContext::getRuleIndex() const {
  return KotlinParser::RuleIfthenelse;
}


antlrcpp::Any KotlinParser::IfthenelseContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitIfthenelse(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::IfthenelseContext* KotlinParser::ifthenelse() {
  IfthenelseContext *_localctx = _tracker.createInstance<IfthenelseContext>(_ctx, getState());
  enterRule(_localctx, 48, KotlinParser::RuleIfthenelse);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(373);
    match(KotlinParser::IF);
    setState(374);
    match(KotlinParser::LPAR);
    setState(375);
    expression();
    setState(376);
    match(KotlinParser::RPAR);
    setState(382);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::LB: {
        setState(377);
        match(KotlinParser::LB);
        setState(378);
        innerblock();
        setState(379);
        match(KotlinParser::RB);
        break;
      }

      case KotlinParser::DPULS:
      case KotlinParser::DMINUS:
      case KotlinParser::LPAR:
      case KotlinParser::LSQ:
      case KotlinParser::PULS:
      case KotlinParser::MINUS:
      case KotlinParser::IF:
      case KotlinParser::FOR:
      case KotlinParser::WHILE:
      case KotlinParser::SUPERANY:
      case KotlinParser::VAL:
      case KotlinParser::VAR:
      case KotlinParser::CLASS:
      case KotlinParser::ABSTRACT:
      case KotlinParser::INTERFACE:
      case KotlinParser::NULLT:
      case KotlinParser::FUN:
      case KotlinParser::RETC:
      case KotlinParser::TRUE:
      case KotlinParser::FALSE:
      case KotlinParser::CHR:
      case KotlinParser::STR:
      case KotlinParser::ID:
      case KotlinParser::NUM: {
        setState(381);
        statement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(385);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 52, _ctx)) {
    case 1: {
      setState(384);
      elif();
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

//----------------- ElifContext ------------------------------------------------------------------

KotlinParser::ElifContext::ElifContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ElifContext::ELSE() {
  return getToken(KotlinParser::ELSE, 0);
}

KotlinParser::StatementContext* KotlinParser::ElifContext::statement() {
  return getRuleContext<KotlinParser::StatementContext>(0);
}

tree::TerminalNode* KotlinParser::ElifContext::LB() {
  return getToken(KotlinParser::LB, 0);
}

KotlinParser::InnerblockContext* KotlinParser::ElifContext::innerblock() {
  return getRuleContext<KotlinParser::InnerblockContext>(0);
}

tree::TerminalNode* KotlinParser::ElifContext::RB() {
  return getToken(KotlinParser::RB, 0);
}


size_t KotlinParser::ElifContext::getRuleIndex() const {
  return KotlinParser::RuleElif;
}


antlrcpp::Any KotlinParser::ElifContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitElif(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ElifContext* KotlinParser::elif() {
  ElifContext *_localctx = _tracker.createInstance<ElifContext>(_ctx, getState());
  enterRule(_localctx, 50, KotlinParser::RuleElif);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(394);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(387);
      match(KotlinParser::ELSE);
      setState(388);
      statement();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(389);
      match(KotlinParser::ELSE);
      setState(390);
      match(KotlinParser::LB);
      setState(391);
      innerblock();
      setState(392);
      match(KotlinParser::RB);
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

//----------------- ExitContext ------------------------------------------------------------------

KotlinParser::ExitContext::ExitContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ExitContext::RETC() {
  return getToken(KotlinParser::RETC, 0);
}

KotlinParser::ExpressionContext* KotlinParser::ExitContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}


size_t KotlinParser::ExitContext::getRuleIndex() const {
  return KotlinParser::RuleExit;
}


antlrcpp::Any KotlinParser::ExitContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExit(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExitContext* KotlinParser::exit() {
  ExitContext *_localctx = _tracker.createInstance<ExitContext>(_ctx, getState());
  enterRule(_localctx, 52, KotlinParser::RuleExit);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(396);
    match(KotlinParser::RETC);
    setState(398);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx)) {
    case 1: {
      setState(397);
      expression();
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

//----------------- ExpressionContext ------------------------------------------------------------------

KotlinParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::ExporContext* KotlinParser::ExpressionContext::expor() {
  return getRuleContext<KotlinParser::ExporContext>(0);
}

KotlinParser::IfthenelseContext* KotlinParser::ExpressionContext::ifthenelse() {
  return getRuleContext<KotlinParser::IfthenelseContext>(0);
}


size_t KotlinParser::ExpressionContext::getRuleIndex() const {
  return KotlinParser::RuleExpression;
}


antlrcpp::Any KotlinParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpressionContext* KotlinParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 54, KotlinParser::RuleExpression);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(402);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::DPULS:
      case KotlinParser::DMINUS:
      case KotlinParser::LPAR:
      case KotlinParser::LSQ:
      case KotlinParser::PULS:
      case KotlinParser::MINUS:
      case KotlinParser::SUPERANY:
      case KotlinParser::NULLT:
      case KotlinParser::TRUE:
      case KotlinParser::FALSE:
      case KotlinParser::CHR:
      case KotlinParser::STR:
      case KotlinParser::ID:
      case KotlinParser::NUM: {
        enterOuterAlt(_localctx, 1);
        setState(400);
        expor();
        break;
      }

      case KotlinParser::IF: {
        enterOuterAlt(_localctx, 2);
        setState(401);
        ifthenelse();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExporContext ------------------------------------------------------------------

KotlinParser::ExporContext::ExporContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpandContext *> KotlinParser::ExporContext::expand() {
  return getRuleContexts<KotlinParser::ExpandContext>();
}

KotlinParser::ExpandContext* KotlinParser::ExporContext::expand(size_t i) {
  return getRuleContext<KotlinParser::ExpandContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ExporContext::LOGICOR() {
  return getTokens(KotlinParser::LOGICOR);
}

tree::TerminalNode* KotlinParser::ExporContext::LOGICOR(size_t i) {
  return getToken(KotlinParser::LOGICOR, i);
}


size_t KotlinParser::ExporContext::getRuleIndex() const {
  return KotlinParser::RuleExpor;
}


antlrcpp::Any KotlinParser::ExporContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpor(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExporContext* KotlinParser::expor() {
  ExporContext *_localctx = _tracker.createInstance<ExporContext>(_ctx, getState());
  enterRule(_localctx, 56, KotlinParser::RuleExpor);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(404);
    expand();
    setState(409);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::LOGICOR) {
      setState(405);
      match(KotlinParser::LOGICOR);
      setState(406);
      expand();
      setState(411);
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

//----------------- ExpandContext ------------------------------------------------------------------

KotlinParser::ExpandContext::ExpandContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpeqContext *> KotlinParser::ExpandContext::expeq() {
  return getRuleContexts<KotlinParser::ExpeqContext>();
}

KotlinParser::ExpeqContext* KotlinParser::ExpandContext::expeq(size_t i) {
  return getRuleContext<KotlinParser::ExpeqContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ExpandContext::LOGICAND() {
  return getTokens(KotlinParser::LOGICAND);
}

tree::TerminalNode* KotlinParser::ExpandContext::LOGICAND(size_t i) {
  return getToken(KotlinParser::LOGICAND, i);
}


size_t KotlinParser::ExpandContext::getRuleIndex() const {
  return KotlinParser::RuleExpand;
}


antlrcpp::Any KotlinParser::ExpandContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpand(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpandContext* KotlinParser::expand() {
  ExpandContext *_localctx = _tracker.createInstance<ExpandContext>(_ctx, getState());
  enterRule(_localctx, 58, KotlinParser::RuleExpand);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(412);
    expeq();
    setState(417);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::LOGICAND) {
      setState(413);
      match(KotlinParser::LOGICAND);
      setState(414);
      expeq();
      setState(419);
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

//----------------- ExpeqContext ------------------------------------------------------------------

KotlinParser::ExpeqContext::ExpeqContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpcmpContext *> KotlinParser::ExpeqContext::expcmp() {
  return getRuleContexts<KotlinParser::ExpcmpContext>();
}

KotlinParser::ExpcmpContext* KotlinParser::ExpeqContext::expcmp(size_t i) {
  return getRuleContext<KotlinParser::ExpcmpContext>(i);
}

std::vector<KotlinParser::EqoprContext *> KotlinParser::ExpeqContext::eqopr() {
  return getRuleContexts<KotlinParser::EqoprContext>();
}

KotlinParser::EqoprContext* KotlinParser::ExpeqContext::eqopr(size_t i) {
  return getRuleContext<KotlinParser::EqoprContext>(i);
}


size_t KotlinParser::ExpeqContext::getRuleIndex() const {
  return KotlinParser::RuleExpeq;
}


antlrcpp::Any KotlinParser::ExpeqContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpeq(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpeqContext* KotlinParser::expeq() {
  ExpeqContext *_localctx = _tracker.createInstance<ExpeqContext>(_ctx, getState());
  enterRule(_localctx, 60, KotlinParser::RuleExpeq);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(420);
    expcmp();
    setState(426);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::EQ

    || _la == KotlinParser::NEQ) {
      setState(421);
      eqopr();
      setState(422);
      expcmp();
      setState(428);
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

//----------------- ExpcmpContext ------------------------------------------------------------------

KotlinParser::ExpcmpContext::ExpcmpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExppreContext *> KotlinParser::ExpcmpContext::exppre() {
  return getRuleContexts<KotlinParser::ExppreContext>();
}

KotlinParser::ExppreContext* KotlinParser::ExpcmpContext::exppre(size_t i) {
  return getRuleContext<KotlinParser::ExppreContext>(i);
}

std::vector<KotlinParser::CmpoprContext *> KotlinParser::ExpcmpContext::cmpopr() {
  return getRuleContexts<KotlinParser::CmpoprContext>();
}

KotlinParser::CmpoprContext* KotlinParser::ExpcmpContext::cmpopr(size_t i) {
  return getRuleContext<KotlinParser::CmpoprContext>(i);
}


size_t KotlinParser::ExpcmpContext::getRuleIndex() const {
  return KotlinParser::RuleExpcmp;
}


antlrcpp::Any KotlinParser::ExpcmpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpcmp(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpcmpContext* KotlinParser::expcmp() {
  ExpcmpContext *_localctx = _tracker.createInstance<ExpcmpContext>(_ctx, getState());
  enterRule(_localctx, 62, KotlinParser::RuleExpcmp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(429);
    exppre();
    setState(435);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::GE)
      | (1ULL << KotlinParser::LE)
      | (1ULL << KotlinParser::GT)
      | (1ULL << KotlinParser::LT))) != 0)) {
      setState(430);
      cmpopr();
      setState(431);
      exppre();
      setState(437);
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

//----------------- ExppreContext ------------------------------------------------------------------

KotlinParser::ExppreContext::ExppreContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExprangeContext *> KotlinParser::ExppreContext::exprange() {
  return getRuleContexts<KotlinParser::ExprangeContext>();
}

KotlinParser::ExprangeContext* KotlinParser::ExppreContext::exprange(size_t i) {
  return getRuleContext<KotlinParser::ExprangeContext>(i);
}

std::vector<KotlinParser::InoprContext *> KotlinParser::ExppreContext::inopr() {
  return getRuleContexts<KotlinParser::InoprContext>();
}

KotlinParser::InoprContext* KotlinParser::ExppreContext::inopr(size_t i) {
  return getRuleContext<KotlinParser::InoprContext>(i);
}

std::vector<KotlinParser::IsoprContext *> KotlinParser::ExppreContext::isopr() {
  return getRuleContexts<KotlinParser::IsoprContext>();
}

KotlinParser::IsoprContext* KotlinParser::ExppreContext::isopr(size_t i) {
  return getRuleContext<KotlinParser::IsoprContext>(i);
}

std::vector<KotlinParser::TypefContext *> KotlinParser::ExppreContext::typef() {
  return getRuleContexts<KotlinParser::TypefContext>();
}

KotlinParser::TypefContext* KotlinParser::ExppreContext::typef(size_t i) {
  return getRuleContext<KotlinParser::TypefContext>(i);
}


size_t KotlinParser::ExppreContext::getRuleIndex() const {
  return KotlinParser::RuleExppre;
}


antlrcpp::Any KotlinParser::ExppreContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExppre(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExppreContext* KotlinParser::exppre() {
  ExppreContext *_localctx = _tracker.createInstance<ExppreContext>(_ctx, getState());
  enterRule(_localctx, 64, KotlinParser::RuleExppre);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(438);
    exprange();
    setState(447);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::IN)
      | (1ULL << KotlinParser::NIN)
      | (1ULL << KotlinParser::IS)
      | (1ULL << KotlinParser::NIS))) != 0)) {
      setState(445);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case KotlinParser::IN:
        case KotlinParser::NIN: {
          setState(439);
          inopr();
          setState(440);
          exprange();
          break;
        }

        case KotlinParser::IS:
        case KotlinParser::NIS: {
          setState(442);
          isopr();
          setState(443);
          typef();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(449);
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

//----------------- ExprangeContext ------------------------------------------------------------------

KotlinParser::ExprangeContext::ExprangeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpRContext *> KotlinParser::ExprangeContext::expR() {
  return getRuleContexts<KotlinParser::ExpRContext>();
}

KotlinParser::ExpRContext* KotlinParser::ExprangeContext::expR(size_t i) {
  return getRuleContext<KotlinParser::ExpRContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ExprangeContext::DOWN() {
  return getTokens(KotlinParser::DOWN);
}

tree::TerminalNode* KotlinParser::ExprangeContext::DOWN(size_t i) {
  return getToken(KotlinParser::DOWN, i);
}

std::vector<tree::TerminalNode *> KotlinParser::ExprangeContext::STEP() {
  return getTokens(KotlinParser::STEP);
}

tree::TerminalNode* KotlinParser::ExprangeContext::STEP(size_t i) {
  return getToken(KotlinParser::STEP, i);
}


size_t KotlinParser::ExprangeContext::getRuleIndex() const {
  return KotlinParser::RuleExprange;
}


antlrcpp::Any KotlinParser::ExprangeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExprange(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExprangeContext* KotlinParser::exprange() {
  ExprangeContext *_localctx = _tracker.createInstance<ExprangeContext>(_ctx, getState());
  enterRule(_localctx, 66, KotlinParser::RuleExprange);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(450);
    expR();
    setState(455);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::DOWN

    || _la == KotlinParser::STEP) {
      setState(451);
      _la = _input->LA(1);
      if (!(_la == KotlinParser::DOWN

      || _la == KotlinParser::STEP)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(452);
      expR();
      setState(457);
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

//----------------- ExpRContext ------------------------------------------------------------------

KotlinParser::ExpRContext::ExpRContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpaddContext *> KotlinParser::ExpRContext::expadd() {
  return getRuleContexts<KotlinParser::ExpaddContext>();
}

KotlinParser::ExpaddContext* KotlinParser::ExpRContext::expadd(size_t i) {
  return getRuleContext<KotlinParser::ExpaddContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ExpRContext::TWODOT() {
  return getTokens(KotlinParser::TWODOT);
}

tree::TerminalNode* KotlinParser::ExpRContext::TWODOT(size_t i) {
  return getToken(KotlinParser::TWODOT, i);
}


size_t KotlinParser::ExpRContext::getRuleIndex() const {
  return KotlinParser::RuleExpR;
}


antlrcpp::Any KotlinParser::ExpRContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpR(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpRContext* KotlinParser::expR() {
  ExpRContext *_localctx = _tracker.createInstance<ExpRContext>(_ctx, getState());
  enterRule(_localctx, 68, KotlinParser::RuleExpR);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(458);
    expadd();
    setState(463);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::TWODOT) {
      setState(459);
      match(KotlinParser::TWODOT);
      setState(460);
      expadd();
      setState(465);
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

//----------------- ExpaddContext ------------------------------------------------------------------

KotlinParser::ExpaddContext::ExpaddContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ExpmulContext *> KotlinParser::ExpaddContext::expmul() {
  return getRuleContexts<KotlinParser::ExpmulContext>();
}

KotlinParser::ExpmulContext* KotlinParser::ExpaddContext::expmul(size_t i) {
  return getRuleContext<KotlinParser::ExpmulContext>(i);
}

std::vector<KotlinParser::AddoprContext *> KotlinParser::ExpaddContext::addopr() {
  return getRuleContexts<KotlinParser::AddoprContext>();
}

KotlinParser::AddoprContext* KotlinParser::ExpaddContext::addopr(size_t i) {
  return getRuleContext<KotlinParser::AddoprContext>(i);
}


size_t KotlinParser::ExpaddContext::getRuleIndex() const {
  return KotlinParser::RuleExpadd;
}


antlrcpp::Any KotlinParser::ExpaddContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpadd(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpaddContext* KotlinParser::expadd() {
  ExpaddContext *_localctx = _tracker.createInstance<ExpaddContext>(_ctx, getState());
  enterRule(_localctx, 70, KotlinParser::RuleExpadd);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(466);
    expmul();
    setState(472);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 64, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(467);
        addopr();
        setState(468);
        expmul(); 
      }
      setState(474);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 64, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpmulContext ------------------------------------------------------------------

KotlinParser::ExpmulContext::ExpmulContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::PrefixexpContext *> KotlinParser::ExpmulContext::prefixexp() {
  return getRuleContexts<KotlinParser::PrefixexpContext>();
}

KotlinParser::PrefixexpContext* KotlinParser::ExpmulContext::prefixexp(size_t i) {
  return getRuleContext<KotlinParser::PrefixexpContext>(i);
}

std::vector<KotlinParser::MuloprContext *> KotlinParser::ExpmulContext::mulopr() {
  return getRuleContexts<KotlinParser::MuloprContext>();
}

KotlinParser::MuloprContext* KotlinParser::ExpmulContext::mulopr(size_t i) {
  return getRuleContext<KotlinParser::MuloprContext>(i);
}


size_t KotlinParser::ExpmulContext::getRuleIndex() const {
  return KotlinParser::RuleExpmul;
}


antlrcpp::Any KotlinParser::ExpmulContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExpmul(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExpmulContext* KotlinParser::expmul() {
  ExpmulContext *_localctx = _tracker.createInstance<ExpmulContext>(_ctx, getState());
  enterRule(_localctx, 72, KotlinParser::RuleExpmul);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(475);
    prefixexp();
    setState(481);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::MUL)
      | (1ULL << KotlinParser::DIV)
      | (1ULL << KotlinParser::MOD))) != 0)) {
      setState(476);
      mulopr();
      setState(477);
      prefixexp();
      setState(483);
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

//----------------- PrefixexpContext ------------------------------------------------------------------

KotlinParser::PrefixexpContext::PrefixexpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::ExppostfixContext* KotlinParser::PrefixexpContext::exppostfix() {
  return getRuleContext<KotlinParser::ExppostfixContext>(0);
}

KotlinParser::PrefixoprContext* KotlinParser::PrefixexpContext::prefixopr() {
  return getRuleContext<KotlinParser::PrefixoprContext>(0);
}


size_t KotlinParser::PrefixexpContext::getRuleIndex() const {
  return KotlinParser::RulePrefixexp;
}


antlrcpp::Any KotlinParser::PrefixexpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitPrefixexp(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::PrefixexpContext* KotlinParser::prefixexp() {
  PrefixexpContext *_localctx = _tracker.createInstance<PrefixexpContext>(_ctx, getState());
  enterRule(_localctx, 74, KotlinParser::RulePrefixexp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(485);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::DPULS)
      | (1ULL << KotlinParser::DMINUS)
      | (1ULL << KotlinParser::PULS)
      | (1ULL << KotlinParser::MINUS))) != 0)) {
      setState(484);
      prefixopr();
    }
    setState(487);
    exppostfix();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExppostfixContext ------------------------------------------------------------------

KotlinParser::ExppostfixContext::ExppostfixContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::FccallContext* KotlinParser::ExppostfixContext::fccall() {
  return getRuleContext<KotlinParser::FccallContext>(0);
}

tree::TerminalNode* KotlinParser::ExppostfixContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

KotlinParser::OprpostfixContext* KotlinParser::ExppostfixContext::oprpostfix() {
  return getRuleContext<KotlinParser::OprpostfixContext>(0);
}

tree::TerminalNode* KotlinParser::ExppostfixContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

KotlinParser::ExpressionContext* KotlinParser::ExppostfixContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

tree::TerminalNode* KotlinParser::ExppostfixContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}

tree::TerminalNode* KotlinParser::ExppostfixContext::LSQ() {
  return getToken(KotlinParser::LSQ, 0);
}

tree::TerminalNode* KotlinParser::ExppostfixContext::RSQ() {
  return getToken(KotlinParser::RSQ, 0);
}

KotlinParser::ValueContext* KotlinParser::ExppostfixContext::value() {
  return getRuleContext<KotlinParser::ValueContext>(0);
}


size_t KotlinParser::ExppostfixContext::getRuleIndex() const {
  return KotlinParser::RuleExppostfix;
}


antlrcpp::Any KotlinParser::ExppostfixContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitExppostfix(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ExppostfixContext* KotlinParser::exppostfix() {
  ExppostfixContext *_localctx = _tracker.createInstance<ExppostfixContext>(_ctx, getState());
  enterRule(_localctx, 76, KotlinParser::RuleExppostfix);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(501);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 67, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(489);
      fccall();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(490);
      match(KotlinParser::ID);
      setState(491);
      oprpostfix();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(492);
      match(KotlinParser::LPAR);
      setState(493);
      expression();
      setState(494);
      match(KotlinParser::RPAR);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(496);
      match(KotlinParser::LSQ);
      setState(497);
      expression();
      setState(498);
      match(KotlinParser::RSQ);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(500);
      value();
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

//----------------- FccallContext ------------------------------------------------------------------

KotlinParser::FccallContext::FccallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::FccallContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::FccallContext::LPAR() {
  return getToken(KotlinParser::LPAR, 0);
}

KotlinParser::ArgusContext* KotlinParser::FccallContext::argus() {
  return getRuleContext<KotlinParser::ArgusContext>(0);
}

tree::TerminalNode* KotlinParser::FccallContext::RPAR() {
  return getToken(KotlinParser::RPAR, 0);
}


size_t KotlinParser::FccallContext::getRuleIndex() const {
  return KotlinParser::RuleFccall;
}


antlrcpp::Any KotlinParser::FccallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitFccall(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::FccallContext* KotlinParser::fccall() {
  FccallContext *_localctx = _tracker.createInstance<FccallContext>(_ctx, getState());
  enterRule(_localctx, 78, KotlinParser::RuleFccall);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(503);
    match(KotlinParser::ID);
    setState(504);
    match(KotlinParser::LPAR);
    setState(505);
    argus();
    setState(506);
    match(KotlinParser::RPAR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArgusContext ------------------------------------------------------------------

KotlinParser::ArgusContext::ArgusContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KotlinParser::ArguContext *> KotlinParser::ArgusContext::argu() {
  return getRuleContexts<KotlinParser::ArguContext>();
}

KotlinParser::ArguContext* KotlinParser::ArgusContext::argu(size_t i) {
  return getRuleContext<KotlinParser::ArguContext>(i);
}

std::vector<tree::TerminalNode *> KotlinParser::ArgusContext::COMMA() {
  return getTokens(KotlinParser::COMMA);
}

tree::TerminalNode* KotlinParser::ArgusContext::COMMA(size_t i) {
  return getToken(KotlinParser::COMMA, i);
}


size_t KotlinParser::ArgusContext::getRuleIndex() const {
  return KotlinParser::RuleArgus;
}


antlrcpp::Any KotlinParser::ArgusContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitArgus(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ArgusContext* KotlinParser::argus() {
  ArgusContext *_localctx = _tracker.createInstance<ArgusContext>(_ctx, getState());
  enterRule(_localctx, 80, KotlinParser::RuleArgus);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(509);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 14) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 14)) & ((1ULL << (KotlinParser::DPULS - 14))
      | (1ULL << (KotlinParser::DMINUS - 14))
      | (1ULL << (KotlinParser::LPAR - 14))
      | (1ULL << (KotlinParser::LSQ - 14))
      | (1ULL << (KotlinParser::PULS - 14))
      | (1ULL << (KotlinParser::MINUS - 14))
      | (1ULL << (KotlinParser::IF - 14))
      | (1ULL << (KotlinParser::SUPERANY - 14))
      | (1ULL << (KotlinParser::NULLT - 14))
      | (1ULL << (KotlinParser::TRUE - 14))
      | (1ULL << (KotlinParser::FALSE - 14))
      | (1ULL << (KotlinParser::CHR - 14))
      | (1ULL << (KotlinParser::STR - 14))
      | (1ULL << (KotlinParser::ID - 14))
      | (1ULL << (KotlinParser::NUM - 14)))) != 0)) {
      setState(508);
      argu();
    }
    setState(515);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KotlinParser::COMMA) {
      setState(511);
      match(KotlinParser::COMMA);
      setState(512);
      argu();
      setState(517);
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

//----------------- ArguContext ------------------------------------------------------------------

KotlinParser::ArguContext::ArguContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ArguContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

KotlinParser::ValueContext* KotlinParser::ArguContext::value() {
  return getRuleContext<KotlinParser::ValueContext>(0);
}

KotlinParser::ExpressionContext* KotlinParser::ArguContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}


size_t KotlinParser::ArguContext::getRuleIndex() const {
  return KotlinParser::RuleArgu;
}


antlrcpp::Any KotlinParser::ArguContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitArgu(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ArguContext* KotlinParser::argu() {
  ArguContext *_localctx = _tracker.createInstance<ArguContext>(_ctx, getState());
  enterRule(_localctx, 82, KotlinParser::RuleArgu);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(521);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 70, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(518);
      match(KotlinParser::ID);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(519);
      value();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(520);
      expression();
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

//----------------- OprpostfixContext ------------------------------------------------------------------

KotlinParser::OprpostfixContext::OprpostfixContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::OprpostfixContext::DPULS() {
  return getToken(KotlinParser::DPULS, 0);
}

tree::TerminalNode* KotlinParser::OprpostfixContext::DMINUS() {
  return getToken(KotlinParser::DMINUS, 0);
}

std::vector<tree::TerminalNode *> KotlinParser::OprpostfixContext::DOT() {
  return getTokens(KotlinParser::DOT);
}

tree::TerminalNode* KotlinParser::OprpostfixContext::DOT(size_t i) {
  return getToken(KotlinParser::DOT, i);
}

std::vector<tree::TerminalNode *> KotlinParser::OprpostfixContext::ID() {
  return getTokens(KotlinParser::ID);
}

tree::TerminalNode* KotlinParser::OprpostfixContext::ID(size_t i) {
  return getToken(KotlinParser::ID, i);
}

std::vector<KotlinParser::FccallContext *> KotlinParser::OprpostfixContext::fccall() {
  return getRuleContexts<KotlinParser::FccallContext>();
}

KotlinParser::FccallContext* KotlinParser::OprpostfixContext::fccall(size_t i) {
  return getRuleContext<KotlinParser::FccallContext>(i);
}


size_t KotlinParser::OprpostfixContext::getRuleIndex() const {
  return KotlinParser::RuleOprpostfix;
}


antlrcpp::Any KotlinParser::OprpostfixContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitOprpostfix(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::OprpostfixContext* KotlinParser::oprpostfix() {
  OprpostfixContext *_localctx = _tracker.createInstance<OprpostfixContext>(_ctx, getState());
  enterRule(_localctx, 84, KotlinParser::RuleOprpostfix);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(535);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 73, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(523);
      match(KotlinParser::DPULS);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(524);
      match(KotlinParser::DMINUS);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(532);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == KotlinParser::DOT) {
        setState(525);
        match(KotlinParser::DOT);
        setState(528);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 71, _ctx)) {
        case 1: {
          setState(526);
          match(KotlinParser::ID);
          break;
        }

        case 2: {
          setState(527);
          fccall();
          break;
        }

        }
        setState(534);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
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

//----------------- PrefixoprContext ------------------------------------------------------------------

KotlinParser::PrefixoprContext::PrefixoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::PrefixoprContext::DPULS() {
  return getToken(KotlinParser::DPULS, 0);
}

tree::TerminalNode* KotlinParser::PrefixoprContext::DMINUS() {
  return getToken(KotlinParser::DMINUS, 0);
}

tree::TerminalNode* KotlinParser::PrefixoprContext::MINUS() {
  return getToken(KotlinParser::MINUS, 0);
}

tree::TerminalNode* KotlinParser::PrefixoprContext::PULS() {
  return getToken(KotlinParser::PULS, 0);
}


size_t KotlinParser::PrefixoprContext::getRuleIndex() const {
  return KotlinParser::RulePrefixopr;
}


antlrcpp::Any KotlinParser::PrefixoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitPrefixopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::PrefixoprContext* KotlinParser::prefixopr() {
  PrefixoprContext *_localctx = _tracker.createInstance<PrefixoprContext>(_ctx, getState());
  enterRule(_localctx, 86, KotlinParser::RulePrefixopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(537);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::DPULS)
      | (1ULL << KotlinParser::DMINUS)
      | (1ULL << KotlinParser::PULS)
      | (1ULL << KotlinParser::MINUS))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MuloprContext ------------------------------------------------------------------

KotlinParser::MuloprContext::MuloprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::MuloprContext::MUL() {
  return getToken(KotlinParser::MUL, 0);
}

tree::TerminalNode* KotlinParser::MuloprContext::DIV() {
  return getToken(KotlinParser::DIV, 0);
}

tree::TerminalNode* KotlinParser::MuloprContext::MOD() {
  return getToken(KotlinParser::MOD, 0);
}


size_t KotlinParser::MuloprContext::getRuleIndex() const {
  return KotlinParser::RuleMulopr;
}


antlrcpp::Any KotlinParser::MuloprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitMulopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::MuloprContext* KotlinParser::mulopr() {
  MuloprContext *_localctx = _tracker.createInstance<MuloprContext>(_ctx, getState());
  enterRule(_localctx, 88, KotlinParser::RuleMulopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(539);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::MUL)
      | (1ULL << KotlinParser::DIV)
      | (1ULL << KotlinParser::MOD))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AddoprContext ------------------------------------------------------------------

KotlinParser::AddoprContext::AddoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::AddoprContext::PULS() {
  return getToken(KotlinParser::PULS, 0);
}

tree::TerminalNode* KotlinParser::AddoprContext::MINUS() {
  return getToken(KotlinParser::MINUS, 0);
}


size_t KotlinParser::AddoprContext::getRuleIndex() const {
  return KotlinParser::RuleAddopr;
}


antlrcpp::Any KotlinParser::AddoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitAddopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::AddoprContext* KotlinParser::addopr() {
  AddoprContext *_localctx = _tracker.createInstance<AddoprContext>(_ctx, getState());
  enterRule(_localctx, 90, KotlinParser::RuleAddopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(541);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::PULS

    || _la == KotlinParser::MINUS)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InoprContext ------------------------------------------------------------------

KotlinParser::InoprContext::InoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::InoprContext::IN() {
  return getToken(KotlinParser::IN, 0);
}

tree::TerminalNode* KotlinParser::InoprContext::NIN() {
  return getToken(KotlinParser::NIN, 0);
}


size_t KotlinParser::InoprContext::getRuleIndex() const {
  return KotlinParser::RuleInopr;
}


antlrcpp::Any KotlinParser::InoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitInopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::InoprContext* KotlinParser::inopr() {
  InoprContext *_localctx = _tracker.createInstance<InoprContext>(_ctx, getState());
  enterRule(_localctx, 92, KotlinParser::RuleInopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(543);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::IN

    || _la == KotlinParser::NIN)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IsoprContext ------------------------------------------------------------------

KotlinParser::IsoprContext::IsoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::IsoprContext::IS() {
  return getToken(KotlinParser::IS, 0);
}

tree::TerminalNode* KotlinParser::IsoprContext::NIS() {
  return getToken(KotlinParser::NIS, 0);
}


size_t KotlinParser::IsoprContext::getRuleIndex() const {
  return KotlinParser::RuleIsopr;
}


antlrcpp::Any KotlinParser::IsoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitIsopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::IsoprContext* KotlinParser::isopr() {
  IsoprContext *_localctx = _tracker.createInstance<IsoprContext>(_ctx, getState());
  enterRule(_localctx, 94, KotlinParser::RuleIsopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(545);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::IS

    || _la == KotlinParser::NIS)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EqoprContext ------------------------------------------------------------------

KotlinParser::EqoprContext::EqoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::EqoprContext::EQ() {
  return getToken(KotlinParser::EQ, 0);
}

tree::TerminalNode* KotlinParser::EqoprContext::NEQ() {
  return getToken(KotlinParser::NEQ, 0);
}


size_t KotlinParser::EqoprContext::getRuleIndex() const {
  return KotlinParser::RuleEqopr;
}


antlrcpp::Any KotlinParser::EqoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitEqopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::EqoprContext* KotlinParser::eqopr() {
  EqoprContext *_localctx = _tracker.createInstance<EqoprContext>(_ctx, getState());
  enterRule(_localctx, 96, KotlinParser::RuleEqopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(547);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::EQ

    || _la == KotlinParser::NEQ)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CmpoprContext ------------------------------------------------------------------

KotlinParser::CmpoprContext::CmpoprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::CmpoprContext::GT() {
  return getToken(KotlinParser::GT, 0);
}

tree::TerminalNode* KotlinParser::CmpoprContext::LT() {
  return getToken(KotlinParser::LT, 0);
}

tree::TerminalNode* KotlinParser::CmpoprContext::GE() {
  return getToken(KotlinParser::GE, 0);
}

tree::TerminalNode* KotlinParser::CmpoprContext::LE() {
  return getToken(KotlinParser::LE, 0);
}


size_t KotlinParser::CmpoprContext::getRuleIndex() const {
  return KotlinParser::RuleCmpopr;
}


antlrcpp::Any KotlinParser::CmpoprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitCmpopr(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::CmpoprContext* KotlinParser::cmpopr() {
  CmpoprContext *_localctx = _tracker.createInstance<CmpoprContext>(_ctx, getState());
  enterRule(_localctx, 98, KotlinParser::RuleCmpopr);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(549);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KotlinParser::GE)
      | (1ULL << KotlinParser::LE)
      | (1ULL << KotlinParser::GT)
      | (1ULL << KotlinParser::LT))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDContext ------------------------------------------------------------------

KotlinParser::VariableDContext::VariableDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KotlinParser::PropertyDContext* KotlinParser::VariableDContext::propertyD() {
  return getRuleContext<KotlinParser::PropertyDContext>(0);
}

tree::TerminalNode* KotlinParser::VariableDContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::VariableDContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::TypefContext* KotlinParser::VariableDContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::VariableDContext::VAL() {
  return getToken(KotlinParser::VAL, 0);
}

tree::TerminalNode* KotlinParser::VariableDContext::VAR() {
  return getToken(KotlinParser::VAR, 0);
}


size_t KotlinParser::VariableDContext::getRuleIndex() const {
  return KotlinParser::RuleVariableD;
}


antlrcpp::Any KotlinParser::VariableDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitVariableD(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::VariableDContext* KotlinParser::variableD() {
  VariableDContext *_localctx = _tracker.createInstance<VariableDContext>(_ctx, getState());
  enterRule(_localctx, 100, KotlinParser::RuleVariableD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(556);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 74, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(551);
      propertyD();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(552);
      _la = _input->LA(1);
      if (!(_la == KotlinParser::VAL

      || _la == KotlinParser::VAR)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(553);
      match(KotlinParser::ID);
      setState(554);
      match(KotlinParser::COLON);
      setState(555);
      typef();
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

//----------------- PropertyDContext ------------------------------------------------------------------

KotlinParser::PropertyDContext::PropertyDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::PropertyDContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::PropertyDContext::ASN() {
  return getToken(KotlinParser::ASN, 0);
}

KotlinParser::ExpressionContext* KotlinParser::PropertyDContext::expression() {
  return getRuleContext<KotlinParser::ExpressionContext>(0);
}

tree::TerminalNode* KotlinParser::PropertyDContext::VAL() {
  return getToken(KotlinParser::VAL, 0);
}

tree::TerminalNode* KotlinParser::PropertyDContext::VAR() {
  return getToken(KotlinParser::VAR, 0);
}

tree::TerminalNode* KotlinParser::PropertyDContext::COLON() {
  return getToken(KotlinParser::COLON, 0);
}

KotlinParser::TypefContext* KotlinParser::PropertyDContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::PropertyDContext::SEMI() {
  return getToken(KotlinParser::SEMI, 0);
}


size_t KotlinParser::PropertyDContext::getRuleIndex() const {
  return KotlinParser::RulePropertyD;
}


antlrcpp::Any KotlinParser::PropertyDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitPropertyD(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::PropertyDContext* KotlinParser::propertyD() {
  PropertyDContext *_localctx = _tracker.createInstance<PropertyDContext>(_ctx, getState());
  enterRule(_localctx, 102, KotlinParser::RulePropertyD);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(558);
    _la = _input->LA(1);
    if (!(_la == KotlinParser::VAL

    || _la == KotlinParser::VAR)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(559);
    match(KotlinParser::ID);
    setState(562);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == KotlinParser::COLON) {
      setState(560);
      match(KotlinParser::COLON);
      setState(561);
      typef();
    }
    setState(564);
    match(KotlinParser::ASN);
    setState(565);
    expression();
    setState(567);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 76, _ctx)) {
    case 1: {
      setState(566);
      match(KotlinParser::SEMI);
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

//----------------- TypefContext ------------------------------------------------------------------

KotlinParser::TypefContext::TypefContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::TypefContext::INT() {
  return getToken(KotlinParser::INT, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::FLOAT() {
  return getToken(KotlinParser::FLOAT, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::DOUBLE() {
  return getToken(KotlinParser::DOUBLE, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::STRING() {
  return getToken(KotlinParser::STRING, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::UNIT() {
  return getToken(KotlinParser::UNIT, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::ANY() {
  return getToken(KotlinParser::ANY, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::SHORT() {
  return getToken(KotlinParser::SHORT, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::LONG() {
  return getToken(KotlinParser::LONG, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::BOOL() {
  return getToken(KotlinParser::BOOL, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::BYTE() {
  return getToken(KotlinParser::BYTE, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::CHAR() {
  return getToken(KotlinParser::CHAR, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::ID() {
  return getToken(KotlinParser::ID, 0);
}

tree::TerminalNode* KotlinParser::TypefContext::LT() {
  return getToken(KotlinParser::LT, 0);
}

KotlinParser::TypefContext* KotlinParser::TypefContext::typef() {
  return getRuleContext<KotlinParser::TypefContext>(0);
}

tree::TerminalNode* KotlinParser::TypefContext::GT() {
  return getToken(KotlinParser::GT, 0);
}


size_t KotlinParser::TypefContext::getRuleIndex() const {
  return KotlinParser::RuleTypef;
}


antlrcpp::Any KotlinParser::TypefContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitTypef(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::TypefContext* KotlinParser::typef() {
  TypefContext *_localctx = _tracker.createInstance<TypefContext>(_ctx, getState());
  enterRule(_localctx, 104, KotlinParser::RuleTypef);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(585);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::INT: {
        enterOuterAlt(_localctx, 1);
        setState(569);
        match(KotlinParser::INT);
        break;
      }

      case KotlinParser::FLOAT: {
        enterOuterAlt(_localctx, 2);
        setState(570);
        match(KotlinParser::FLOAT);
        break;
      }

      case KotlinParser::DOUBLE: {
        enterOuterAlt(_localctx, 3);
        setState(571);
        match(KotlinParser::DOUBLE);
        break;
      }

      case KotlinParser::STRING: {
        enterOuterAlt(_localctx, 4);
        setState(572);
        match(KotlinParser::STRING);
        break;
      }

      case KotlinParser::UNIT: {
        enterOuterAlt(_localctx, 5);
        setState(573);
        match(KotlinParser::UNIT);
        break;
      }

      case KotlinParser::ANY: {
        enterOuterAlt(_localctx, 6);
        setState(574);
        match(KotlinParser::ANY);
        break;
      }

      case KotlinParser::SHORT: {
        enterOuterAlt(_localctx, 7);
        setState(575);
        match(KotlinParser::SHORT);
        break;
      }

      case KotlinParser::LONG: {
        enterOuterAlt(_localctx, 8);
        setState(576);
        match(KotlinParser::LONG);
        break;
      }

      case KotlinParser::BOOL: {
        enterOuterAlt(_localctx, 9);
        setState(577);
        match(KotlinParser::BOOL);
        break;
      }

      case KotlinParser::BYTE: {
        enterOuterAlt(_localctx, 10);
        setState(578);
        match(KotlinParser::BYTE);
        break;
      }

      case KotlinParser::CHAR: {
        enterOuterAlt(_localctx, 11);
        setState(579);
        match(KotlinParser::CHAR);
        break;
      }

      case KotlinParser::ID: {
        enterOuterAlt(_localctx, 12);
        setState(580);
        match(KotlinParser::ID);
        setState(581);
        match(KotlinParser::LT);
        setState(582);
        typef();
        setState(583);
        match(KotlinParser::GT);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ValueContext ------------------------------------------------------------------

KotlinParser::ValueContext::ValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KotlinParser::ValueContext::STR() {
  return getToken(KotlinParser::STR, 0);
}

tree::TerminalNode* KotlinParser::ValueContext::NUM() {
  return getToken(KotlinParser::NUM, 0);
}

tree::TerminalNode* KotlinParser::ValueContext::NULLT() {
  return getToken(KotlinParser::NULLT, 0);
}

tree::TerminalNode* KotlinParser::ValueContext::TRUE() {
  return getToken(KotlinParser::TRUE, 0);
}

tree::TerminalNode* KotlinParser::ValueContext::FALSE() {
  return getToken(KotlinParser::FALSE, 0);
}

tree::TerminalNode* KotlinParser::ValueContext::CHR() {
  return getToken(KotlinParser::CHR, 0);
}

tree::TerminalNode* KotlinParser::ValueContext::SUPERANY() {
  return getToken(KotlinParser::SUPERANY, 0);
}


size_t KotlinParser::ValueContext::getRuleIndex() const {
  return KotlinParser::RuleValue;
}


antlrcpp::Any KotlinParser::ValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KotlinVisitor*>(visitor))
    return parserVisitor->visitValue(this);
  else
    return visitor->visitChildren(this);
}

KotlinParser::ValueContext* KotlinParser::value() {
  ValueContext *_localctx = _tracker.createInstance<ValueContext>(_ctx, getState());
  enterRule(_localctx, 106, KotlinParser::RuleValue);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(593);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KotlinParser::STR: {
        enterOuterAlt(_localctx, 1);
        setState(587);
        match(KotlinParser::STR);
        break;
      }

      case KotlinParser::NUM: {
        enterOuterAlt(_localctx, 2);
        setState(588);
        match(KotlinParser::NUM);
        break;
      }

      case KotlinParser::NULLT: {
        enterOuterAlt(_localctx, 3);
        setState(589);
        match(KotlinParser::NULLT);
        break;
      }

      case KotlinParser::TRUE:
      case KotlinParser::FALSE: {
        enterOuterAlt(_localctx, 4);
        setState(590);
        _la = _input->LA(1);
        if (!(_la == KotlinParser::TRUE

        || _la == KotlinParser::FALSE)) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
        break;
      }

      case KotlinParser::CHR: {
        enterOuterAlt(_localctx, 5);
        setState(591);
        match(KotlinParser::CHR);
        break;
      }

      case KotlinParser::SUPERANY: {
        enterOuterAlt(_localctx, 6);
        setState(592);
        match(KotlinParser::SUPERANY);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> KotlinParser::_decisionToDFA;
atn::PredictionContextCache KotlinParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN KotlinParser::_atn;
std::vector<uint16_t> KotlinParser::_serializedATN;

std::vector<std::string> KotlinParser::_ruleNames = {
  "prog", "packageR", "importL", "importR", "outerL", "outerR", "classD", 
  "typec", "classinner", "propertyC", "valcD", "funcD", "cargus", "cargu", 
  "mainf", "functionD", "argument", "whichfunction", "assign", "assignopr", 
  "innerblock", "statement", "forloop", "whileloop", "ifthenelse", "elif", 
  "exit", "expression", "expor", "expand", "expeq", "expcmp", "exppre", 
  "exprange", "expR", "expadd", "expmul", "prefixexp", "exppostfix", "fccall", 
  "argus", "argu", "oprpostfix", "prefixopr", "mulopr", "addopr", "inopr", 
  "isopr", "eqopr", "cmpopr", "variableD", "propertyD", "typef", "value"
};

std::vector<std::string> KotlinParser::_literalNames = {
  "", "';'", "'..'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+='", 
  "'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'&&'", "'||'", "'.'", 
  "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "'?'", "'*'", 
  "'/'", "'%'", "'='", "'+'", "'-'", "'in'", "'!in'", "'is'", "'!is'", "'if'", 
  "'else'", "'for'", "'while'", "'Boolean'", "'Byte'", "'Short'", "'Long'", 
  "'Float'", "'Double'", "'Int'", "'String'", "'Unit'", "'Any()'", "'Any'", 
  "'Char'", "'package'", "'import'", "'val'", "'var'", "'override'", "'class'", 
  "'abstract'", "'interface'", "'get()'", "'constructor'", "'null'", "'fun'", 
  "'return'", "'true'", "'false'", "'main'", "'downTo'", "'step'"
};

std::vector<std::string> KotlinParser::_symbolicNames = {
  "", "SEMI", "TWODOT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "PASN", "MASN", 
  "MULASN", "DIVASN", "MODASN", "DPULS", "DMINUS", "LOGICAND", "LOGICOR", 
  "DOT", "COMMA", "LPAR", "RPAR", "LB", "RB", "LSQ", "RSQ", "COLON", "QUERY", 
  "MUL", "DIV", "MOD", "ASN", "PULS", "MINUS", "IN", "NIN", "IS", "NIS", 
  "IF", "ELSE", "FOR", "WHILE", "BOOL", "BYTE", "SHORT", "LONG", "FLOAT", 
  "DOUBLE", "INT", "STRING", "UNIT", "SUPERANY", "ANY", "CHAR", "PACKAGE", 
  "IMPORT", "VAL", "VAR", "OVERRIDE", "CLASS", "ABSTRACT", "INTERFACE", 
  "GET", "CONSTRUCTOR", "NULLT", "FUN", "RETC", "TRUE", "FALSE", "MAIN", 
  "DOWN", "STEP", "CHR", "STR", "ID", "NUM", "FN", "DIGIT", "WS", "COMMENT", 
  "COMMENT2"
};

dfa::Vocabulary KotlinParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> KotlinParser::_tokenNames;

KotlinParser::Initializer::Initializer() {
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
    0x3, 0x52, 0x256, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x4, 
    0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 0x15, 
    0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 0x9, 0x17, 0x4, 0x18, 0x9, 
    0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 
    0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 
    0x1f, 0x9, 0x1f, 0x4, 0x20, 0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 
    0x9, 0x22, 0x4, 0x23, 0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x4, 0x25, 0x9, 
    0x25, 0x4, 0x26, 0x9, 0x26, 0x4, 0x27, 0x9, 0x27, 0x4, 0x28, 0x9, 0x28, 
    0x4, 0x29, 0x9, 0x29, 0x4, 0x2a, 0x9, 0x2a, 0x4, 0x2b, 0x9, 0x2b, 0x4, 
    0x2c, 0x9, 0x2c, 0x4, 0x2d, 0x9, 0x2d, 0x4, 0x2e, 0x9, 0x2e, 0x4, 0x2f, 
    0x9, 0x2f, 0x4, 0x30, 0x9, 0x30, 0x4, 0x31, 0x9, 0x31, 0x4, 0x32, 0x9, 
    0x32, 0x4, 0x33, 0x9, 0x33, 0x4, 0x34, 0x9, 0x34, 0x4, 0x35, 0x9, 0x35, 
    0x4, 0x36, 0x9, 0x36, 0x4, 0x37, 0x9, 0x37, 0x3, 0x2, 0x5, 0x2, 0x70, 
    0xa, 0x2, 0x3, 0x2, 0x5, 0x2, 0x73, 0xa, 0x2, 0x3, 0x2, 0x5, 0x2, 0x76, 
    0xa, 0x2, 0x3, 0x2, 0x3, 0x2, 0x5, 0x2, 0x7a, 0xa, 0x2, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x80, 0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 
    0x83, 0xb, 0x3, 0x3, 0x3, 0x5, 0x3, 0x86, 0xa, 0x3, 0x3, 0x4, 0x7, 0x4, 
    0x89, 0xa, 0x4, 0xc, 0x4, 0xe, 0x4, 0x8c, 0xb, 0x4, 0x3, 0x5, 0x3, 0x5, 
    0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 0x94, 0xa, 0x5, 0xc, 
    0x5, 0xe, 0x5, 0x97, 0xb, 0x5, 0x3, 0x5, 0x5, 0x5, 0x9a, 0xa, 0x5, 0x3, 
    0x6, 0x6, 0x6, 0x9d, 0xa, 0x6, 0xd, 0x6, 0xe, 0x6, 0x9e, 0x3, 0x7, 0x3, 
    0x7, 0x3, 0x7, 0x5, 0x7, 0xa4, 0xa, 0x7, 0x3, 0x8, 0x5, 0x8, 0xa7, 0xa, 
    0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 0xac, 0xa, 0x8, 0x3, 0x8, 
    0x3, 0x8, 0x5, 0x8, 0xb0, 0xa, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 
    0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x7, 0x9, 0xb9, 0xa, 0x9, 0xc, 0x9, 
    0xe, 0x9, 0xbc, 0xb, 0x9, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0xc0, 0xa, 0xa, 
    0x7, 0xa, 0xc2, 0xa, 0xa, 0xc, 0xa, 0xe, 0xa, 0xc5, 0xb, 0xa, 0x3, 0xb, 
    0x3, 0xb, 0x5, 0xb, 0xc9, 0xa, 0xb, 0x3, 0xc, 0x5, 0xc, 0xcc, 0xa, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xd3, 0xa, 
    0xc, 0x5, 0xc, 0xd5, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xd9, 0xa, 
    0xc, 0x3, 0xc, 0x5, 0xc, 0xdc, 0xa, 0xc, 0x3, 0xd, 0x5, 0xd, 0xdf, 0xa, 
    0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0xe6, 
    0xa, 0xd, 0x3, 0xd, 0x5, 0xd, 0xe9, 0xa, 0xd, 0x5, 0xd, 0xeb, 0xa, 0xd, 
    0x3, 0xd, 0x5, 0xd, 0xee, 0xa, 0xd, 0x3, 0xd, 0x5, 0xd, 0xf1, 0xa, 0xd, 
    0x3, 0xe, 0x5, 0xe, 0xf4, 0xa, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0xf8, 
    0xa, 0xe, 0x3, 0xe, 0x3, 0xe, 0x7, 0xe, 0xfc, 0xa, 0xe, 0xc, 0xe, 0xe, 
    0xe, 0xff, 0xb, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x5, 0xf, 0x104, 
    0xa, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 
    0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 0x117, 
    0xa, 0x11, 0x3, 0x11, 0x5, 0x11, 0x11a, 0xa, 0x11, 0x5, 0x11, 0x11c, 
    0xa, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 0x120, 0xa, 0x11, 0x3, 0x12, 
    0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x5, 0x12, 0x127, 0xa, 0x12, 
    0x7, 0x12, 0x129, 0xa, 0x12, 0xc, 0x12, 0xe, 0x12, 0x12c, 0xb, 0x12, 
    0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
    0x13, 0x5, 0x13, 0x135, 0xa, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
    0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x7, 0x16, 0x13d, 0xa, 0x16, 0xc, 0x16, 
    0xe, 0x16, 0x140, 0xb, 0x16, 0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 0x144, 
    0xa, 0x17, 0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 0x148, 0xa, 0x17, 0x3, 0x17, 
    0x3, 0x17, 0x5, 0x17, 0x14c, 0xa, 0x17, 0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 
    0x150, 0xa, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 0x155, 
    0xa, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 0x15a, 0xa, 0x17, 
    0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x161, 
    0xa, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
    0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x16b, 0xa, 0x18, 0x3, 0x19, 
    0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 
    0x19, 0x3, 0x19, 0x5, 0x19, 0x176, 0xa, 0x19, 0x3, 0x1a, 0x3, 0x1a, 
    0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
    0x1a, 0x5, 0x1a, 0x181, 0xa, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0x184, 0xa, 
    0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
    0x3, 0x1b, 0x5, 0x1b, 0x18d, 0xa, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 
    0x191, 0xa, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x5, 0x1d, 0x195, 0xa, 0x1d, 
    0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x7, 0x1e, 0x19a, 0xa, 0x1e, 0xc, 0x1e, 
    0xe, 0x1e, 0x19d, 0xb, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x7, 0x1f, 
    0x1a2, 0xa, 0x1f, 0xc, 0x1f, 0xe, 0x1f, 0x1a5, 0xb, 0x1f, 0x3, 0x20, 
    0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x7, 0x20, 0x1ab, 0xa, 0x20, 0xc, 0x20, 
    0xe, 0x20, 0x1ae, 0xb, 0x20, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 
    0x7, 0x21, 0x1b4, 0xa, 0x21, 0xc, 0x21, 0xe, 0x21, 0x1b7, 0xb, 0x21, 
    0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 
    0x22, 0x7, 0x22, 0x1c0, 0xa, 0x22, 0xc, 0x22, 0xe, 0x22, 0x1c3, 0xb, 
    0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x7, 0x23, 0x1c8, 0xa, 0x23, 
    0xc, 0x23, 0xe, 0x23, 0x1cb, 0xb, 0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 
    0x7, 0x24, 0x1d0, 0xa, 0x24, 0xc, 0x24, 0xe, 0x24, 0x1d3, 0xb, 0x24, 
    0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x7, 0x25, 0x1d9, 0xa, 0x25, 
    0xc, 0x25, 0xe, 0x25, 0x1dc, 0xb, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
    0x3, 0x26, 0x7, 0x26, 0x1e2, 0xa, 0x26, 0xc, 0x26, 0xe, 0x26, 0x1e5, 
    0xb, 0x26, 0x3, 0x27, 0x5, 0x27, 0x1e8, 0xa, 0x27, 0x3, 0x27, 0x3, 0x27, 
    0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 
    0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x5, 0x28, 
    0x1f8, 0xa, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
    0x3, 0x2a, 0x5, 0x2a, 0x200, 0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x7, 0x2a, 
    0x204, 0xa, 0x2a, 0xc, 0x2a, 0xe, 0x2a, 0x207, 0xb, 0x2a, 0x3, 0x2b, 
    0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x20c, 0xa, 0x2b, 0x3, 0x2c, 0x3, 0x2c, 
    0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x213, 0xa, 0x2c, 0x7, 0x2c, 
    0x215, 0xa, 0x2c, 0xc, 0x2c, 0xe, 0x2c, 0x218, 0xb, 0x2c, 0x5, 0x2c, 
    0x21a, 0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2f, 
    0x3, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 
    0x32, 0x3, 0x33, 0x3, 0x33, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
    0x3, 0x34, 0x5, 0x34, 0x22f, 0xa, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 
    0x3, 0x35, 0x5, 0x35, 0x235, 0xa, 0x35, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 
    0x5, 0x35, 0x23a, 0xa, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 
    0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 
    0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 
    0x24c, 0xa, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
    0x3, 0x37, 0x5, 0x37, 0x254, 0xa, 0x37, 0x3, 0x37, 0x2, 0x2, 0x38, 0x2, 
    0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 
    0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 
    0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 
    0x4e, 0x50, 0x52, 0x54, 0x56, 0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 
    0x66, 0x68, 0x6a, 0x6c, 0x2, 0xf, 0x4, 0x2, 0x3d, 0x3d, 0x3f, 0x3f, 
    0x4, 0x2, 0x3c, 0x3c, 0x3e, 0x3e, 0x3, 0x2, 0x3a, 0x3b, 0x4, 0x2, 0xb, 
    0xf, 0x21, 0x21, 0x3, 0x2, 0x48, 0x49, 0x4, 0x2, 0x10, 0x11, 0x22, 0x23, 
    0x3, 0x2, 0x1e, 0x20, 0x3, 0x2, 0x22, 0x23, 0x3, 0x2, 0x24, 0x25, 0x3, 
    0x2, 0x26, 0x27, 0x3, 0x2, 0x5, 0x6, 0x3, 0x2, 0x7, 0xa, 0x3, 0x2, 0x45, 
    0x46, 0x2, 0x288, 0x2, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x4, 0x7b, 0x3, 0x2, 
    0x2, 0x2, 0x6, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x8, 0x8d, 0x3, 0x2, 0x2, 0x2, 
    0xa, 0x9c, 0x3, 0x2, 0x2, 0x2, 0xc, 0xa3, 0x3, 0x2, 0x2, 0x2, 0xe, 0xa6, 
    0x3, 0x2, 0x2, 0x2, 0x10, 0xb5, 0x3, 0x2, 0x2, 0x2, 0x12, 0xc3, 0x3, 
    0x2, 0x2, 0x2, 0x14, 0xc8, 0x3, 0x2, 0x2, 0x2, 0x16, 0xcb, 0x3, 0x2, 
    0x2, 0x2, 0x18, 0xde, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xf3, 0x3, 0x2, 0x2, 
    0x2, 0x1c, 0x103, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x109, 0x3, 0x2, 0x2, 0x2, 
    0x20, 0x111, 0x3, 0x2, 0x2, 0x2, 0x22, 0x121, 0x3, 0x2, 0x2, 0x2, 0x24, 
    0x134, 0x3, 0x2, 0x2, 0x2, 0x26, 0x136, 0x3, 0x2, 0x2, 0x2, 0x28, 0x139, 
    0x3, 0x2, 0x2, 0x2, 0x2a, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x159, 0x3, 
    0x2, 0x2, 0x2, 0x2e, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x30, 0x16c, 0x3, 0x2, 
    0x2, 0x2, 0x32, 0x177, 0x3, 0x2, 0x2, 0x2, 0x34, 0x18c, 0x3, 0x2, 0x2, 
    0x2, 0x36, 0x18e, 0x3, 0x2, 0x2, 0x2, 0x38, 0x194, 0x3, 0x2, 0x2, 0x2, 
    0x3a, 0x196, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x19e, 0x3, 0x2, 0x2, 0x2, 0x3e, 
    0x1a6, 0x3, 0x2, 0x2, 0x2, 0x40, 0x1af, 0x3, 0x2, 0x2, 0x2, 0x42, 0x1b8, 
    0x3, 0x2, 0x2, 0x2, 0x44, 0x1c4, 0x3, 0x2, 0x2, 0x2, 0x46, 0x1cc, 0x3, 
    0x2, 0x2, 0x2, 0x48, 0x1d4, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x1dd, 0x3, 0x2, 
    0x2, 0x2, 0x4c, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x1f7, 0x3, 0x2, 0x2, 
    0x2, 0x50, 0x1f9, 0x3, 0x2, 0x2, 0x2, 0x52, 0x1ff, 0x3, 0x2, 0x2, 0x2, 
    0x54, 0x20b, 0x3, 0x2, 0x2, 0x2, 0x56, 0x219, 0x3, 0x2, 0x2, 0x2, 0x58, 
    0x21b, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x21d, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x21f, 
    0x3, 0x2, 0x2, 0x2, 0x5e, 0x221, 0x3, 0x2, 0x2, 0x2, 0x60, 0x223, 0x3, 
    0x2, 0x2, 0x2, 0x62, 0x225, 0x3, 0x2, 0x2, 0x2, 0x64, 0x227, 0x3, 0x2, 
    0x2, 0x2, 0x66, 0x22e, 0x3, 0x2, 0x2, 0x2, 0x68, 0x230, 0x3, 0x2, 0x2, 
    0x2, 0x6a, 0x24b, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x253, 0x3, 0x2, 0x2, 0x2, 
    0x6e, 0x70, 0x5, 0x4, 0x3, 0x2, 0x6f, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x6f, 
    0x70, 0x3, 0x2, 0x2, 0x2, 0x70, 0x72, 0x3, 0x2, 0x2, 0x2, 0x71, 0x73, 
    0x5, 0x6, 0x4, 0x2, 0x72, 0x71, 0x3, 0x2, 0x2, 0x2, 0x72, 0x73, 0x3, 
    0x2, 0x2, 0x2, 0x73, 0x75, 0x3, 0x2, 0x2, 0x2, 0x74, 0x76, 0x5, 0xa, 
    0x6, 0x2, 0x75, 0x74, 0x3, 0x2, 0x2, 0x2, 0x75, 0x76, 0x3, 0x2, 0x2, 
    0x2, 0x76, 0x77, 0x3, 0x2, 0x2, 0x2, 0x77, 0x79, 0x5, 0x1e, 0x10, 0x2, 
    0x78, 0x7a, 0x5, 0xa, 0x6, 0x2, 0x79, 0x78, 0x3, 0x2, 0x2, 0x2, 0x79, 
    0x7a, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x3, 0x3, 0x2, 0x2, 0x2, 0x7b, 0x7c, 
    0x7, 0x38, 0x2, 0x2, 0x7c, 0x81, 0x7, 0x4c, 0x2, 0x2, 0x7d, 0x7e, 0x7, 
    0x14, 0x2, 0x2, 0x7e, 0x80, 0x7, 0x4c, 0x2, 0x2, 0x7f, 0x7d, 0x3, 0x2, 
    0x2, 0x2, 0x80, 0x83, 0x3, 0x2, 0x2, 0x2, 0x81, 0x7f, 0x3, 0x2, 0x2, 
    0x2, 0x81, 0x82, 0x3, 0x2, 0x2, 0x2, 0x82, 0x85, 0x3, 0x2, 0x2, 0x2, 
    0x83, 0x81, 0x3, 0x2, 0x2, 0x2, 0x84, 0x86, 0x7, 0x3, 0x2, 0x2, 0x85, 
    0x84, 0x3, 0x2, 0x2, 0x2, 0x85, 0x86, 0x3, 0x2, 0x2, 0x2, 0x86, 0x5, 
    0x3, 0x2, 0x2, 0x2, 0x87, 0x89, 0x5, 0x8, 0x5, 0x2, 0x88, 0x87, 0x3, 
    0x2, 0x2, 0x2, 0x89, 0x8c, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x88, 0x3, 0x2, 
    0x2, 0x2, 0x8a, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x7, 0x3, 0x2, 0x2, 
    0x2, 0x8c, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x8d, 0x8e, 0x7, 0x39, 0x2, 0x2, 
    0x8e, 0x95, 0x7, 0x4c, 0x2, 0x2, 0x8f, 0x90, 0x7, 0x14, 0x2, 0x2, 0x90, 
    0x94, 0x7, 0x1e, 0x2, 0x2, 0x91, 0x92, 0x7, 0x14, 0x2, 0x2, 0x92, 0x94, 
    0x7, 0x4c, 0x2, 0x2, 0x93, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x93, 0x91, 0x3, 
    0x2, 0x2, 0x2, 0x94, 0x97, 0x3, 0x2, 0x2, 0x2, 0x95, 0x93, 0x3, 0x2, 
    0x2, 0x2, 0x95, 0x96, 0x3, 0x2, 0x2, 0x2, 0x96, 0x99, 0x3, 0x2, 0x2, 
    0x2, 0x97, 0x95, 0x3, 0x2, 0x2, 0x2, 0x98, 0x9a, 0x7, 0x3, 0x2, 0x2, 
    0x99, 0x98, 0x3, 0x2, 0x2, 0x2, 0x99, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x9a, 
    0x9, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x9d, 0x5, 0xc, 0x7, 0x2, 0x9c, 0x9b, 
    0x3, 0x2, 0x2, 0x2, 0x9d, 0x9e, 0x3, 0x2, 0x2, 0x2, 0x9e, 0x9c, 0x3, 
    0x2, 0x2, 0x2, 0x9e, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x9f, 0xb, 0x3, 0x2, 
    0x2, 0x2, 0xa0, 0xa4, 0x5, 0x20, 0x11, 0x2, 0xa1, 0xa4, 0x5, 0xe, 0x8, 
    0x2, 0xa2, 0xa4, 0x5, 0x68, 0x35, 0x2, 0xa3, 0xa0, 0x3, 0x2, 0x2, 0x2, 
    0xa3, 0xa1, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa4, 
    0xd, 0x3, 0x2, 0x2, 0x2, 0xa5, 0xa7, 0x7, 0x3e, 0x2, 0x2, 0xa6, 0xa5, 
    0x3, 0x2, 0x2, 0x2, 0xa6, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xa8, 0x3, 
    0x2, 0x2, 0x2, 0xa8, 0xa9, 0x9, 0x2, 0x2, 0x2, 0xa9, 0xab, 0x7, 0x4c, 
    0x2, 0x2, 0xaa, 0xac, 0x5, 0x1a, 0xe, 0x2, 0xab, 0xaa, 0x3, 0x2, 0x2, 
    0x2, 0xab, 0xac, 0x3, 0x2, 0x2, 0x2, 0xac, 0xaf, 0x3, 0x2, 0x2, 0x2, 
    0xad, 0xae, 0x7, 0x1c, 0x2, 0x2, 0xae, 0xb0, 0x5, 0x10, 0x9, 0x2, 0xaf, 
    0xad, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xb0, 0x3, 0x2, 0x2, 0x2, 0xb0, 0xb1, 
    0x3, 0x2, 0x2, 0x2, 0xb1, 0xb2, 0x7, 0x18, 0x2, 0x2, 0xb2, 0xb3, 0x5, 
    0x12, 0xa, 0x2, 0xb3, 0xb4, 0x7, 0x19, 0x2, 0x2, 0xb4, 0xf, 0x3, 0x2, 
    0x2, 0x2, 0xb5, 0xba, 0x5, 0x38, 0x1d, 0x2, 0xb6, 0xb7, 0x7, 0x15, 0x2, 
    0x2, 0xb7, 0xb9, 0x5, 0x38, 0x1d, 0x2, 0xb8, 0xb6, 0x3, 0x2, 0x2, 0x2, 
    0xb9, 0xbc, 0x3, 0x2, 0x2, 0x2, 0xba, 0xb8, 0x3, 0x2, 0x2, 0x2, 0xba, 
    0xbb, 0x3, 0x2, 0x2, 0x2, 0xbb, 0x11, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xba, 
    0x3, 0x2, 0x2, 0x2, 0xbd, 0xbf, 0x5, 0x14, 0xb, 0x2, 0xbe, 0xc0, 0x7, 
    0x3, 0x2, 0x2, 0xbf, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xc0, 0x3, 0x2, 
    0x2, 0x2, 0xc0, 0xc2, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xbd, 0x3, 0x2, 0x2, 
    0x2, 0xc2, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc1, 0x3, 0x2, 0x2, 0x2, 
    0xc3, 0xc4, 0x3, 0x2, 0x2, 0x2, 0xc4, 0x13, 0x3, 0x2, 0x2, 0x2, 0xc5, 
    0xc3, 0x3, 0x2, 0x2, 0x2, 0xc6, 0xc9, 0x5, 0x18, 0xd, 0x2, 0xc7, 0xc9, 
    0x5, 0x16, 0xc, 0x2, 0xc8, 0xc6, 0x3, 0x2, 0x2, 0x2, 0xc8, 0xc7, 0x3, 
    0x2, 0x2, 0x2, 0xc9, 0x15, 0x3, 0x2, 0x2, 0x2, 0xca, 0xcc, 0x9, 0x3, 
    0x2, 0x2, 0xcb, 0xca, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xcc, 0x3, 0x2, 0x2, 
    0x2, 0xcc, 0xcd, 0x3, 0x2, 0x2, 0x2, 0xcd, 0xce, 0x9, 0x4, 0x2, 0x2, 
    0xce, 0xd4, 0x7, 0x4c, 0x2, 0x2, 0xcf, 0xd0, 0x7, 0x1c, 0x2, 0x2, 0xd0, 
    0xd2, 0x5, 0x6a, 0x36, 0x2, 0xd1, 0xd3, 0x7, 0x40, 0x2, 0x2, 0xd2, 0xd1, 
    0x3, 0x2, 0x2, 0x2, 0xd2, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd5, 0x3, 
    0x2, 0x2, 0x2, 0xd4, 0xcf, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd5, 0x3, 0x2, 
    0x2, 0x2, 0xd5, 0xd8, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xd7, 0x7, 0x21, 0x2, 
    0x2, 0xd7, 0xd9, 0x5, 0x38, 0x1d, 0x2, 0xd8, 0xd6, 0x3, 0x2, 0x2, 0x2, 
    0xd8, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xda, 
    0xdc, 0x7, 0x3, 0x2, 0x2, 0xdb, 0xda, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xdc, 
    0x3, 0x2, 0x2, 0x2, 0xdc, 0x17, 0x3, 0x2, 0x2, 0x2, 0xdd, 0xdf, 0x9, 
    0x3, 0x2, 0x2, 0xde, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xde, 0xdf, 0x3, 0x2, 
    0x2, 0x2, 0xdf, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xe1, 0x7, 0x43, 0x2, 
    0x2, 0xe1, 0xe2, 0x7, 0x4c, 0x2, 0x2, 0xe2, 0xea, 0x5, 0x22, 0x12, 0x2, 
    0xe3, 0xe5, 0x7, 0x1c, 0x2, 0x2, 0xe4, 0xe6, 0x5, 0x6a, 0x36, 0x2, 0xe5, 
    0xe4, 0x3, 0x2, 0x2, 0x2, 0xe5, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe8, 
    0x3, 0x2, 0x2, 0x2, 0xe7, 0xe9, 0x7, 0x1d, 0x2, 0x2, 0xe8, 0xe7, 0x3, 
    0x2, 0x2, 0x2, 0xe8, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xeb, 0x3, 0x2, 
    0x2, 0x2, 0xea, 0xe3, 0x3, 0x2, 0x2, 0x2, 0xea, 0xeb, 0x3, 0x2, 0x2, 
    0x2, 0xeb, 0xed, 0x3, 0x2, 0x2, 0x2, 0xec, 0xee, 0x5, 0x24, 0x13, 0x2, 
    0xed, 0xec, 0x3, 0x2, 0x2, 0x2, 0xed, 0xee, 0x3, 0x2, 0x2, 0x2, 0xee, 
    0xf0, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf1, 0x7, 0x3, 0x2, 0x2, 0xf0, 0xef, 
    0x3, 0x2, 0x2, 0x2, 0xf0, 0xf1, 0x3, 0x2, 0x2, 0x2, 0xf1, 0x19, 0x3, 
    0x2, 0x2, 0x2, 0xf2, 0xf4, 0x7, 0x41, 0x2, 0x2, 0xf3, 0xf2, 0x3, 0x2, 
    0x2, 0x2, 0xf3, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xf5, 0x3, 0x2, 0x2, 
    0x2, 0xf5, 0xf7, 0x7, 0x16, 0x2, 0x2, 0xf6, 0xf8, 0x5, 0x1c, 0xf, 0x2, 
    0xf7, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xf8, 
    0xfd, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xfa, 0x7, 0x15, 0x2, 0x2, 0xfa, 0xfc, 
    0x5, 0x1c, 0xf, 0x2, 0xfb, 0xf9, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xff, 0x3, 
    0x2, 0x2, 0x2, 0xfd, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xfd, 0xfe, 0x3, 0x2, 
    0x2, 0x2, 0xfe, 0x100, 0x3, 0x2, 0x2, 0x2, 0xff, 0xfd, 0x3, 0x2, 0x2, 
    0x2, 0x100, 0x101, 0x7, 0x17, 0x2, 0x2, 0x101, 0x1b, 0x3, 0x2, 0x2, 
    0x2, 0x102, 0x104, 0x9, 0x4, 0x2, 0x2, 0x103, 0x102, 0x3, 0x2, 0x2, 
    0x2, 0x103, 0x104, 0x3, 0x2, 0x2, 0x2, 0x104, 0x105, 0x3, 0x2, 0x2, 
    0x2, 0x105, 0x106, 0x7, 0x4c, 0x2, 0x2, 0x106, 0x107, 0x7, 0x1c, 0x2, 
    0x2, 0x107, 0x108, 0x5, 0x6a, 0x36, 0x2, 0x108, 0x1d, 0x3, 0x2, 0x2, 
    0x2, 0x109, 0x10a, 0x7, 0x43, 0x2, 0x2, 0x10a, 0x10b, 0x7, 0x47, 0x2, 
    0x2, 0x10b, 0x10c, 0x7, 0x16, 0x2, 0x2, 0x10c, 0x10d, 0x7, 0x17, 0x2, 
    0x2, 0x10d, 0x10e, 0x7, 0x18, 0x2, 0x2, 0x10e, 0x10f, 0x5, 0x2a, 0x16, 
    0x2, 0x10f, 0x110, 0x7, 0x19, 0x2, 0x2, 0x110, 0x1f, 0x3, 0x2, 0x2, 
    0x2, 0x111, 0x112, 0x7, 0x43, 0x2, 0x2, 0x112, 0x113, 0x7, 0x4c, 0x2, 
    0x2, 0x113, 0x11b, 0x5, 0x22, 0x12, 0x2, 0x114, 0x116, 0x7, 0x1c, 0x2, 
    0x2, 0x115, 0x117, 0x5, 0x6a, 0x36, 0x2, 0x116, 0x115, 0x3, 0x2, 0x2, 
    0x2, 0x116, 0x117, 0x3, 0x2, 0x2, 0x2, 0x117, 0x119, 0x3, 0x2, 0x2, 
    0x2, 0x118, 0x11a, 0x7, 0x1d, 0x2, 0x2, 0x119, 0x118, 0x3, 0x2, 0x2, 
    0x2, 0x119, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x11c, 0x3, 0x2, 0x2, 
    0x2, 0x11b, 0x114, 0x3, 0x2, 0x2, 0x2, 0x11b, 0x11c, 0x3, 0x2, 0x2, 
    0x2, 0x11c, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x11f, 0x5, 0x24, 0x13, 
    0x2, 0x11e, 0x120, 0x7, 0x3, 0x2, 0x2, 0x11f, 0x11e, 0x3, 0x2, 0x2, 
    0x2, 0x11f, 0x120, 0x3, 0x2, 0x2, 0x2, 0x120, 0x21, 0x3, 0x2, 0x2, 0x2, 
    0x121, 0x12a, 0x7, 0x16, 0x2, 0x2, 0x122, 0x123, 0x7, 0x4c, 0x2, 0x2, 
    0x123, 0x124, 0x7, 0x1c, 0x2, 0x2, 0x124, 0x126, 0x5, 0x6a, 0x36, 0x2, 
    0x125, 0x127, 0x7, 0x15, 0x2, 0x2, 0x126, 0x125, 0x3, 0x2, 0x2, 0x2, 
    0x126, 0x127, 0x3, 0x2, 0x2, 0x2, 0x127, 0x129, 0x3, 0x2, 0x2, 0x2, 
    0x128, 0x122, 0x3, 0x2, 0x2, 0x2, 0x129, 0x12c, 0x3, 0x2, 0x2, 0x2, 
    0x12a, 0x128, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x12b, 0x3, 0x2, 0x2, 0x2, 
    0x12b, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x12c, 0x12a, 0x3, 0x2, 0x2, 0x2, 
    0x12d, 0x12e, 0x7, 0x17, 0x2, 0x2, 0x12e, 0x23, 0x3, 0x2, 0x2, 0x2, 
    0x12f, 0x135, 0x5, 0x26, 0x14, 0x2, 0x130, 0x131, 0x7, 0x18, 0x2, 0x2, 
    0x131, 0x132, 0x5, 0x2a, 0x16, 0x2, 0x132, 0x133, 0x7, 0x19, 0x2, 0x2, 
    0x133, 0x135, 0x3, 0x2, 0x2, 0x2, 0x134, 0x12f, 0x3, 0x2, 0x2, 0x2, 
    0x134, 0x130, 0x3, 0x2, 0x2, 0x2, 0x135, 0x25, 0x3, 0x2, 0x2, 0x2, 0x136, 
    0x137, 0x5, 0x28, 0x15, 0x2, 0x137, 0x138, 0x5, 0x38, 0x1d, 0x2, 0x138, 
    0x27, 0x3, 0x2, 0x2, 0x2, 0x139, 0x13a, 0x9, 0x5, 0x2, 0x2, 0x13a, 0x29, 
    0x3, 0x2, 0x2, 0x2, 0x13b, 0x13d, 0x5, 0x2c, 0x17, 0x2, 0x13c, 0x13b, 
    0x3, 0x2, 0x2, 0x2, 0x13d, 0x140, 0x3, 0x2, 0x2, 0x2, 0x13e, 0x13c, 
    0x3, 0x2, 0x2, 0x2, 0x13e, 0x13f, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x2b, 0x3, 
    0x2, 0x2, 0x2, 0x140, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x141, 0x143, 0x5, 
    0x66, 0x34, 0x2, 0x142, 0x144, 0x7, 0x3, 0x2, 0x2, 0x143, 0x142, 0x3, 
    0x2, 0x2, 0x2, 0x143, 0x144, 0x3, 0x2, 0x2, 0x2, 0x144, 0x15a, 0x3, 
    0x2, 0x2, 0x2, 0x145, 0x147, 0x5, 0x20, 0x11, 0x2, 0x146, 0x148, 0x7, 
    0x3, 0x2, 0x2, 0x147, 0x146, 0x3, 0x2, 0x2, 0x2, 0x147, 0x148, 0x3, 
    0x2, 0x2, 0x2, 0x148, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x149, 0x14b, 0x5, 
    0x38, 0x1d, 0x2, 0x14a, 0x14c, 0x7, 0x3, 0x2, 0x2, 0x14b, 0x14a, 0x3, 
    0x2, 0x2, 0x2, 0x14b, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x14c, 0x15a, 0x3, 
    0x2, 0x2, 0x2, 0x14d, 0x14f, 0x5, 0x36, 0x1c, 0x2, 0x14e, 0x150, 0x7, 
    0x3, 0x2, 0x2, 0x14f, 0x14e, 0x3, 0x2, 0x2, 0x2, 0x14f, 0x150, 0x3, 
    0x2, 0x2, 0x2, 0x150, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x151, 0x152, 0x7, 
    0x4c, 0x2, 0x2, 0x152, 0x154, 0x5, 0x26, 0x14, 0x2, 0x153, 0x155, 0x7, 
    0x3, 0x2, 0x2, 0x154, 0x153, 0x3, 0x2, 0x2, 0x2, 0x154, 0x155, 0x3, 
    0x2, 0x2, 0x2, 0x155, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x156, 0x15a, 0x5, 
    0x2e, 0x18, 0x2, 0x157, 0x15a, 0x5, 0x30, 0x19, 0x2, 0x158, 0x15a, 0x5, 
    0xe, 0x8, 0x2, 0x159, 0x141, 0x3, 0x2, 0x2, 0x2, 0x159, 0x145, 0x3, 
    0x2, 0x2, 0x2, 0x159, 0x149, 0x3, 0x2, 0x2, 0x2, 0x159, 0x14d, 0x3, 
    0x2, 0x2, 0x2, 0x159, 0x151, 0x3, 0x2, 0x2, 0x2, 0x159, 0x156, 0x3, 
    0x2, 0x2, 0x2, 0x159, 0x157, 0x3, 0x2, 0x2, 0x2, 0x159, 0x158, 0x3, 
    0x2, 0x2, 0x2, 0x15a, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x15c, 0x7, 0x2a, 
    0x2, 0x2, 0x15c, 0x15d, 0x7, 0x16, 0x2, 0x2, 0x15d, 0x160, 0x7, 0x4c, 
    0x2, 0x2, 0x15e, 0x15f, 0x7, 0x1c, 0x2, 0x2, 0x15f, 0x161, 0x5, 0x6a, 
    0x36, 0x2, 0x160, 0x15e, 0x3, 0x2, 0x2, 0x2, 0x160, 0x161, 0x3, 0x2, 
    0x2, 0x2, 0x161, 0x162, 0x3, 0x2, 0x2, 0x2, 0x162, 0x163, 0x7, 0x24, 
    0x2, 0x2, 0x163, 0x164, 0x5, 0x38, 0x1d, 0x2, 0x164, 0x16a, 0x7, 0x17, 
    0x2, 0x2, 0x165, 0x166, 0x7, 0x18, 0x2, 0x2, 0x166, 0x167, 0x5, 0x2a, 
    0x16, 0x2, 0x167, 0x168, 0x7, 0x19, 0x2, 0x2, 0x168, 0x16b, 0x3, 0x2, 
    0x2, 0x2, 0x169, 0x16b, 0x5, 0x2c, 0x17, 0x2, 0x16a, 0x165, 0x3, 0x2, 
    0x2, 0x2, 0x16a, 0x169, 0x3, 0x2, 0x2, 0x2, 0x16b, 0x2f, 0x3, 0x2, 0x2, 
    0x2, 0x16c, 0x16d, 0x7, 0x2b, 0x2, 0x2, 0x16d, 0x16e, 0x7, 0x16, 0x2, 
    0x2, 0x16e, 0x16f, 0x5, 0x38, 0x1d, 0x2, 0x16f, 0x175, 0x7, 0x17, 0x2, 
    0x2, 0x170, 0x171, 0x7, 0x18, 0x2, 0x2, 0x171, 0x172, 0x5, 0x2a, 0x16, 
    0x2, 0x172, 0x173, 0x7, 0x19, 0x2, 0x2, 0x173, 0x176, 0x3, 0x2, 0x2, 
    0x2, 0x174, 0x176, 0x5, 0x2c, 0x17, 0x2, 0x175, 0x170, 0x3, 0x2, 0x2, 
    0x2, 0x175, 0x174, 0x3, 0x2, 0x2, 0x2, 0x176, 0x31, 0x3, 0x2, 0x2, 0x2, 
    0x177, 0x178, 0x7, 0x28, 0x2, 0x2, 0x178, 0x179, 0x7, 0x16, 0x2, 0x2, 
    0x179, 0x17a, 0x5, 0x38, 0x1d, 0x2, 0x17a, 0x180, 0x7, 0x17, 0x2, 0x2, 
    0x17b, 0x17c, 0x7, 0x18, 0x2, 0x2, 0x17c, 0x17d, 0x5, 0x2a, 0x16, 0x2, 
    0x17d, 0x17e, 0x7, 0x19, 0x2, 0x2, 0x17e, 0x181, 0x3, 0x2, 0x2, 0x2, 
    0x17f, 0x181, 0x5, 0x2c, 0x17, 0x2, 0x180, 0x17b, 0x3, 0x2, 0x2, 0x2, 
    0x180, 0x17f, 0x3, 0x2, 0x2, 0x2, 0x181, 0x183, 0x3, 0x2, 0x2, 0x2, 
    0x182, 0x184, 0x5, 0x34, 0x1b, 0x2, 0x183, 0x182, 0x3, 0x2, 0x2, 0x2, 
    0x183, 0x184, 0x3, 0x2, 0x2, 0x2, 0x184, 0x33, 0x3, 0x2, 0x2, 0x2, 0x185, 
    0x186, 0x7, 0x29, 0x2, 0x2, 0x186, 0x18d, 0x5, 0x2c, 0x17, 0x2, 0x187, 
    0x188, 0x7, 0x29, 0x2, 0x2, 0x188, 0x189, 0x7, 0x18, 0x2, 0x2, 0x189, 
    0x18a, 0x5, 0x2a, 0x16, 0x2, 0x18a, 0x18b, 0x7, 0x19, 0x2, 0x2, 0x18b, 
    0x18d, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x185, 0x3, 0x2, 0x2, 0x2, 0x18c, 
    0x187, 0x3, 0x2, 0x2, 0x2, 0x18d, 0x35, 0x3, 0x2, 0x2, 0x2, 0x18e, 0x190, 
    0x7, 0x44, 0x2, 0x2, 0x18f, 0x191, 0x5, 0x38, 0x1d, 0x2, 0x190, 0x18f, 
    0x3, 0x2, 0x2, 0x2, 0x190, 0x191, 0x3, 0x2, 0x2, 0x2, 0x191, 0x37, 0x3, 
    0x2, 0x2, 0x2, 0x192, 0x195, 0x5, 0x3a, 0x1e, 0x2, 0x193, 0x195, 0x5, 
    0x32, 0x1a, 0x2, 0x194, 0x192, 0x3, 0x2, 0x2, 0x2, 0x194, 0x193, 0x3, 
    0x2, 0x2, 0x2, 0x195, 0x39, 0x3, 0x2, 0x2, 0x2, 0x196, 0x19b, 0x5, 0x3c, 
    0x1f, 0x2, 0x197, 0x198, 0x7, 0x13, 0x2, 0x2, 0x198, 0x19a, 0x5, 0x3c, 
    0x1f, 0x2, 0x199, 0x197, 0x3, 0x2, 0x2, 0x2, 0x19a, 0x19d, 0x3, 0x2, 
    0x2, 0x2, 0x19b, 0x199, 0x3, 0x2, 0x2, 0x2, 0x19b, 0x19c, 0x3, 0x2, 
    0x2, 0x2, 0x19c, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x19d, 0x19b, 0x3, 0x2, 0x2, 
    0x2, 0x19e, 0x1a3, 0x5, 0x3e, 0x20, 0x2, 0x19f, 0x1a0, 0x7, 0x12, 0x2, 
    0x2, 0x1a0, 0x1a2, 0x5, 0x3e, 0x20, 0x2, 0x1a1, 0x19f, 0x3, 0x2, 0x2, 
    0x2, 0x1a2, 0x1a5, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a1, 0x3, 0x2, 0x2, 
    0x2, 0x1a3, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a4, 0x3d, 0x3, 0x2, 0x2, 0x2, 
    0x1a5, 0x1a3, 0x3, 0x2, 0x2, 0x2, 0x1a6, 0x1ac, 0x5, 0x40, 0x21, 0x2, 
    0x1a7, 0x1a8, 0x5, 0x62, 0x32, 0x2, 0x1a8, 0x1a9, 0x5, 0x40, 0x21, 0x2, 
    0x1a9, 0x1ab, 0x3, 0x2, 0x2, 0x2, 0x1aa, 0x1a7, 0x3, 0x2, 0x2, 0x2, 
    0x1ab, 0x1ae, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1aa, 0x3, 0x2, 0x2, 0x2, 
    0x1ac, 0x1ad, 0x3, 0x2, 0x2, 0x2, 0x1ad, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x1ae, 
    0x1ac, 0x3, 0x2, 0x2, 0x2, 0x1af, 0x1b5, 0x5, 0x42, 0x22, 0x2, 0x1b0, 
    0x1b1, 0x5, 0x64, 0x33, 0x2, 0x1b1, 0x1b2, 0x5, 0x42, 0x22, 0x2, 0x1b2, 
    0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1b3, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1b4, 
    0x1b7, 0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1b3, 0x3, 0x2, 0x2, 0x2, 0x1b5, 
    0x1b6, 0x3, 0x2, 0x2, 0x2, 0x1b6, 0x41, 0x3, 0x2, 0x2, 0x2, 0x1b7, 0x1b5, 
    0x3, 0x2, 0x2, 0x2, 0x1b8, 0x1c1, 0x5, 0x44, 0x23, 0x2, 0x1b9, 0x1ba, 
    0x5, 0x5e, 0x30, 0x2, 0x1ba, 0x1bb, 0x5, 0x44, 0x23, 0x2, 0x1bb, 0x1c0, 
    0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1bd, 0x5, 0x60, 0x31, 0x2, 0x1bd, 0x1be, 
    0x5, 0x6a, 0x36, 0x2, 0x1be, 0x1c0, 0x3, 0x2, 0x2, 0x2, 0x1bf, 0x1b9, 
    0x3, 0x2, 0x2, 0x2, 0x1bf, 0x1bc, 0x3, 0x2, 0x2, 0x2, 0x1c0, 0x1c3, 
    0x3, 0x2, 0x2, 0x2, 0x1c1, 0x1bf, 0x3, 0x2, 0x2, 0x2, 0x1c1, 0x1c2, 
    0x3, 0x2, 0x2, 0x2, 0x1c2, 0x43, 0x3, 0x2, 0x2, 0x2, 0x1c3, 0x1c1, 0x3, 
    0x2, 0x2, 0x2, 0x1c4, 0x1c9, 0x5, 0x46, 0x24, 0x2, 0x1c5, 0x1c6, 0x9, 
    0x6, 0x2, 0x2, 0x1c6, 0x1c8, 0x5, 0x46, 0x24, 0x2, 0x1c7, 0x1c5, 0x3, 
    0x2, 0x2, 0x2, 0x1c8, 0x1cb, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1c7, 0x3, 
    0x2, 0x2, 0x2, 0x1c9, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1ca, 0x45, 0x3, 0x2, 
    0x2, 0x2, 0x1cb, 0x1c9, 0x3, 0x2, 0x2, 0x2, 0x1cc, 0x1d1, 0x5, 0x48, 
    0x25, 0x2, 0x1cd, 0x1ce, 0x7, 0x4, 0x2, 0x2, 0x1ce, 0x1d0, 0x5, 0x48, 
    0x25, 0x2, 0x1cf, 0x1cd, 0x3, 0x2, 0x2, 0x2, 0x1d0, 0x1d3, 0x3, 0x2, 
    0x2, 0x2, 0x1d1, 0x1cf, 0x3, 0x2, 0x2, 0x2, 0x1d1, 0x1d2, 0x3, 0x2, 
    0x2, 0x2, 0x1d2, 0x47, 0x3, 0x2, 0x2, 0x2, 0x1d3, 0x1d1, 0x3, 0x2, 0x2, 
    0x2, 0x1d4, 0x1da, 0x5, 0x4a, 0x26, 0x2, 0x1d5, 0x1d6, 0x5, 0x5c, 0x2f, 
    0x2, 0x1d6, 0x1d7, 0x5, 0x4a, 0x26, 0x2, 0x1d7, 0x1d9, 0x3, 0x2, 0x2, 
    0x2, 0x1d8, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1d9, 0x1dc, 0x3, 0x2, 0x2, 
    0x2, 0x1da, 0x1d8, 0x3, 0x2, 0x2, 0x2, 0x1da, 0x1db, 0x3, 0x2, 0x2, 
    0x2, 0x1db, 0x49, 0x3, 0x2, 0x2, 0x2, 0x1dc, 0x1da, 0x3, 0x2, 0x2, 0x2, 
    0x1dd, 0x1e3, 0x5, 0x4c, 0x27, 0x2, 0x1de, 0x1df, 0x5, 0x5a, 0x2e, 0x2, 
    0x1df, 0x1e0, 0x5, 0x4c, 0x27, 0x2, 0x1e0, 0x1e2, 0x3, 0x2, 0x2, 0x2, 
    0x1e1, 0x1de, 0x3, 0x2, 0x2, 0x2, 0x1e2, 0x1e5, 0x3, 0x2, 0x2, 0x2, 
    0x1e3, 0x1e1, 0x3, 0x2, 0x2, 0x2, 0x1e3, 0x1e4, 0x3, 0x2, 0x2, 0x2, 
    0x1e4, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x1e3, 0x3, 0x2, 0x2, 0x2, 0x1e6, 
    0x1e8, 0x5, 0x58, 0x2d, 0x2, 0x1e7, 0x1e6, 0x3, 0x2, 0x2, 0x2, 0x1e7, 
    0x1e8, 0x3, 0x2, 0x2, 0x2, 0x1e8, 0x1e9, 0x3, 0x2, 0x2, 0x2, 0x1e9, 
    0x1ea, 0x5, 0x4e, 0x28, 0x2, 0x1ea, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x1eb, 
    0x1f8, 0x5, 0x50, 0x29, 0x2, 0x1ec, 0x1ed, 0x7, 0x4c, 0x2, 0x2, 0x1ed, 
    0x1f8, 0x5, 0x56, 0x2c, 0x2, 0x1ee, 0x1ef, 0x7, 0x16, 0x2, 0x2, 0x1ef, 
    0x1f0, 0x5, 0x38, 0x1d, 0x2, 0x1f0, 0x1f1, 0x7, 0x17, 0x2, 0x2, 0x1f1, 
    0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1f2, 0x1f3, 0x7, 0x1a, 0x2, 0x2, 0x1f3, 
    0x1f4, 0x5, 0x38, 0x1d, 0x2, 0x1f4, 0x1f5, 0x7, 0x1b, 0x2, 0x2, 0x1f5, 
    0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1f6, 0x1f8, 0x5, 0x6c, 0x37, 0x2, 0x1f7, 
    0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1ec, 0x3, 0x2, 0x2, 0x2, 0x1f7, 
    0x1ee, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1f2, 0x3, 0x2, 0x2, 0x2, 0x1f7, 
    0x1f6, 0x3, 0x2, 0x2, 0x2, 0x1f8, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x1f9, 0x1fa, 
    0x7, 0x4c, 0x2, 0x2, 0x1fa, 0x1fb, 0x7, 0x16, 0x2, 0x2, 0x1fb, 0x1fc, 
    0x5, 0x52, 0x2a, 0x2, 0x1fc, 0x1fd, 0x7, 0x17, 0x2, 0x2, 0x1fd, 0x51, 
    0x3, 0x2, 0x2, 0x2, 0x1fe, 0x200, 0x5, 0x54, 0x2b, 0x2, 0x1ff, 0x1fe, 
    0x3, 0x2, 0x2, 0x2, 0x1ff, 0x200, 0x3, 0x2, 0x2, 0x2, 0x200, 0x205, 
    0x3, 0x2, 0x2, 0x2, 0x201, 0x202, 0x7, 0x15, 0x2, 0x2, 0x202, 0x204, 
    0x5, 0x54, 0x2b, 0x2, 0x203, 0x201, 0x3, 0x2, 0x2, 0x2, 0x204, 0x207, 
    0x3, 0x2, 0x2, 0x2, 0x205, 0x203, 0x3, 0x2, 0x2, 0x2, 0x205, 0x206, 
    0x3, 0x2, 0x2, 0x2, 0x206, 0x53, 0x3, 0x2, 0x2, 0x2, 0x207, 0x205, 0x3, 
    0x2, 0x2, 0x2, 0x208, 0x20c, 0x7, 0x4c, 0x2, 0x2, 0x209, 0x20c, 0x5, 
    0x6c, 0x37, 0x2, 0x20a, 0x20c, 0x5, 0x38, 0x1d, 0x2, 0x20b, 0x208, 0x3, 
    0x2, 0x2, 0x2, 0x20b, 0x209, 0x3, 0x2, 0x2, 0x2, 0x20b, 0x20a, 0x3, 
    0x2, 0x2, 0x2, 0x20c, 0x55, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x21a, 0x7, 0x10, 
    0x2, 0x2, 0x20e, 0x21a, 0x7, 0x11, 0x2, 0x2, 0x20f, 0x212, 0x7, 0x14, 
    0x2, 0x2, 0x210, 0x213, 0x7, 0x4c, 0x2, 0x2, 0x211, 0x213, 0x5, 0x50, 
    0x29, 0x2, 0x212, 0x210, 0x3, 0x2, 0x2, 0x2, 0x212, 0x211, 0x3, 0x2, 
    0x2, 0x2, 0x213, 0x215, 0x3, 0x2, 0x2, 0x2, 0x214, 0x20f, 0x3, 0x2, 
    0x2, 0x2, 0x215, 0x218, 0x3, 0x2, 0x2, 0x2, 0x216, 0x214, 0x3, 0x2, 
    0x2, 0x2, 0x216, 0x217, 0x3, 0x2, 0x2, 0x2, 0x217, 0x21a, 0x3, 0x2, 
    0x2, 0x2, 0x218, 0x216, 0x3, 0x2, 0x2, 0x2, 0x219, 0x20d, 0x3, 0x2, 
    0x2, 0x2, 0x219, 0x20e, 0x3, 0x2, 0x2, 0x2, 0x219, 0x216, 0x3, 0x2, 
    0x2, 0x2, 0x21a, 0x57, 0x3, 0x2, 0x2, 0x2, 0x21b, 0x21c, 0x9, 0x7, 0x2, 
    0x2, 0x21c, 0x59, 0x3, 0x2, 0x2, 0x2, 0x21d, 0x21e, 0x9, 0x8, 0x2, 0x2, 
    0x21e, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x21f, 0x220, 0x9, 0x9, 0x2, 0x2, 0x220, 
    0x5d, 0x3, 0x2, 0x2, 0x2, 0x221, 0x222, 0x9, 0xa, 0x2, 0x2, 0x222, 0x5f, 
    0x3, 0x2, 0x2, 0x2, 0x223, 0x224, 0x9, 0xb, 0x2, 0x2, 0x224, 0x61, 0x3, 
    0x2, 0x2, 0x2, 0x225, 0x226, 0x9, 0xc, 0x2, 0x2, 0x226, 0x63, 0x3, 0x2, 
    0x2, 0x2, 0x227, 0x228, 0x9, 0xd, 0x2, 0x2, 0x228, 0x65, 0x3, 0x2, 0x2, 
    0x2, 0x229, 0x22f, 0x5, 0x68, 0x35, 0x2, 0x22a, 0x22b, 0x9, 0x4, 0x2, 
    0x2, 0x22b, 0x22c, 0x7, 0x4c, 0x2, 0x2, 0x22c, 0x22d, 0x7, 0x1c, 0x2, 
    0x2, 0x22d, 0x22f, 0x5, 0x6a, 0x36, 0x2, 0x22e, 0x229, 0x3, 0x2, 0x2, 
    0x2, 0x22e, 0x22a, 0x3, 0x2, 0x2, 0x2, 0x22f, 0x67, 0x3, 0x2, 0x2, 0x2, 
    0x230, 0x231, 0x9, 0x4, 0x2, 0x2, 0x231, 0x234, 0x7, 0x4c, 0x2, 0x2, 
    0x232, 0x233, 0x7, 0x1c, 0x2, 0x2, 0x233, 0x235, 0x5, 0x6a, 0x36, 0x2, 
    0x234, 0x232, 0x3, 0x2, 0x2, 0x2, 0x234, 0x235, 0x3, 0x2, 0x2, 0x2, 
    0x235, 0x236, 0x3, 0x2, 0x2, 0x2, 0x236, 0x237, 0x7, 0x21, 0x2, 0x2, 
    0x237, 0x239, 0x5, 0x38, 0x1d, 0x2, 0x238, 0x23a, 0x7, 0x3, 0x2, 0x2, 
    0x239, 0x238, 0x3, 0x2, 0x2, 0x2, 0x239, 0x23a, 0x3, 0x2, 0x2, 0x2, 
    0x23a, 0x69, 0x3, 0x2, 0x2, 0x2, 0x23b, 0x24c, 0x7, 0x32, 0x2, 0x2, 
    0x23c, 0x24c, 0x7, 0x30, 0x2, 0x2, 0x23d, 0x24c, 0x7, 0x31, 0x2, 0x2, 
    0x23e, 0x24c, 0x7, 0x33, 0x2, 0x2, 0x23f, 0x24c, 0x7, 0x34, 0x2, 0x2, 
    0x240, 0x24c, 0x7, 0x36, 0x2, 0x2, 0x241, 0x24c, 0x7, 0x2e, 0x2, 0x2, 
    0x242, 0x24c, 0x7, 0x2f, 0x2, 0x2, 0x243, 0x24c, 0x7, 0x2c, 0x2, 0x2, 
    0x244, 0x24c, 0x7, 0x2d, 0x2, 0x2, 0x245, 0x24c, 0x7, 0x37, 0x2, 0x2, 
    0x246, 0x247, 0x7, 0x4c, 0x2, 0x2, 0x247, 0x248, 0x7, 0xa, 0x2, 0x2, 
    0x248, 0x249, 0x5, 0x6a, 0x36, 0x2, 0x249, 0x24a, 0x7, 0x9, 0x2, 0x2, 
    0x24a, 0x24c, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x23b, 0x3, 0x2, 0x2, 0x2, 
    0x24b, 0x23c, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x23d, 0x3, 0x2, 0x2, 0x2, 
    0x24b, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x23f, 0x3, 0x2, 0x2, 0x2, 
    0x24b, 0x240, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x241, 0x3, 0x2, 0x2, 0x2, 
    0x24b, 0x242, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x243, 0x3, 0x2, 0x2, 0x2, 
    0x24b, 0x244, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x245, 0x3, 0x2, 0x2, 0x2, 
    0x24b, 0x246, 0x3, 0x2, 0x2, 0x2, 0x24c, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x24d, 
    0x254, 0x7, 0x4b, 0x2, 0x2, 0x24e, 0x254, 0x7, 0x4d, 0x2, 0x2, 0x24f, 
    0x254, 0x7, 0x42, 0x2, 0x2, 0x250, 0x254, 0x9, 0xe, 0x2, 0x2, 0x251, 
    0x254, 0x7, 0x4a, 0x2, 0x2, 0x252, 0x254, 0x7, 0x35, 0x2, 0x2, 0x253, 
    0x24d, 0x3, 0x2, 0x2, 0x2, 0x253, 0x24e, 0x3, 0x2, 0x2, 0x2, 0x253, 
    0x24f, 0x3, 0x2, 0x2, 0x2, 0x253, 0x250, 0x3, 0x2, 0x2, 0x2, 0x253, 
    0x251, 0x3, 0x2, 0x2, 0x2, 0x253, 0x252, 0x3, 0x2, 0x2, 0x2, 0x254, 
    0x6d, 0x3, 0x2, 0x2, 0x2, 0x51, 0x6f, 0x72, 0x75, 0x79, 0x81, 0x85, 
    0x8a, 0x93, 0x95, 0x99, 0x9e, 0xa3, 0xa6, 0xab, 0xaf, 0xba, 0xbf, 0xc3, 
    0xc8, 0xcb, 0xd2, 0xd4, 0xd8, 0xdb, 0xde, 0xe5, 0xe8, 0xea, 0xed, 0xf0, 
    0xf3, 0xf7, 0xfd, 0x103, 0x116, 0x119, 0x11b, 0x11f, 0x126, 0x12a, 0x134, 
    0x13e, 0x143, 0x147, 0x14b, 0x14f, 0x154, 0x159, 0x160, 0x16a, 0x175, 
    0x180, 0x183, 0x18c, 0x190, 0x194, 0x19b, 0x1a3, 0x1ac, 0x1b5, 0x1bf, 
    0x1c1, 0x1c9, 0x1d1, 0x1da, 0x1e3, 0x1e7, 0x1f7, 0x1ff, 0x205, 0x20b, 
    0x212, 0x216, 0x219, 0x22e, 0x234, 0x239, 0x24b, 0x253, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

KotlinParser::Initializer KotlinParser::_init;
