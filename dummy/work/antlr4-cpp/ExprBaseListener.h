
// Generated from Expr.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "ExprListener.h"


/**
 * This class provides an empty implementation of ExprListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  ExprBaseListener : public ExprListener {
public:

  virtual void enterFile(ExprParser::FileContext * /*ctx*/) override { }
  virtual void exitFile(ExprParser::FileContext * /*ctx*/) override { }

  virtual void enterPackageR(ExprParser::PackageRContext * /*ctx*/) override { }
  virtual void exitPackageR(ExprParser::PackageRContext * /*ctx*/) override { }

  virtual void enterImportL(ExprParser::ImportLContext * /*ctx*/) override { }
  virtual void exitImportL(ExprParser::ImportLContext * /*ctx*/) override { }

  virtual void enterImportR(ExprParser::ImportRContext * /*ctx*/) override { }
  virtual void exitImportR(ExprParser::ImportRContext * /*ctx*/) override { }

  virtual void enterTopL(ExprParser::TopLContext * /*ctx*/) override { }
  virtual void exitTopL(ExprParser::TopLContext * /*ctx*/) override { }

  virtual void enterTopR(ExprParser::TopRContext * /*ctx*/) override { }
  virtual void exitTopR(ExprParser::TopRContext * /*ctx*/) override { }

  virtual void enterPropertyD(ExprParser::PropertyDContext * /*ctx*/) override { }
  virtual void exitPropertyD(ExprParser::PropertyDContext * /*ctx*/) override { }

  virtual void enterTypef(ExprParser::TypefContext * /*ctx*/) override { }
  virtual void exitTypef(ExprParser::TypefContext * /*ctx*/) override { }

  virtual void enterValue(ExprParser::ValueContext * /*ctx*/) override { }
  virtual void exitValue(ExprParser::ValueContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

