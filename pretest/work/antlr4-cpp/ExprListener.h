
// Generated from Expr.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "ExprParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by ExprParser.
 */
class  ExprListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterFile(ExprParser::FileContext *ctx) = 0;
  virtual void exitFile(ExprParser::FileContext *ctx) = 0;

  virtual void enterPackageR(ExprParser::PackageRContext *ctx) = 0;
  virtual void exitPackageR(ExprParser::PackageRContext *ctx) = 0;

  virtual void enterImportL(ExprParser::ImportLContext *ctx) = 0;
  virtual void exitImportL(ExprParser::ImportLContext *ctx) = 0;

  virtual void enterImportR(ExprParser::ImportRContext *ctx) = 0;
  virtual void exitImportR(ExprParser::ImportRContext *ctx) = 0;

  virtual void enterEntryL(ExprParser::EntryLContext *ctx) = 0;
  virtual void exitEntryL(ExprParser::EntryLContext *ctx) = 0;

  virtual void enterEntryR(ExprParser::EntryRContext *ctx) = 0;
  virtual void exitEntryR(ExprParser::EntryRContext *ctx) = 0;

  virtual void enterPropertyD(ExprParser::PropertyDContext *ctx) = 0;
  virtual void exitPropertyD(ExprParser::PropertyDContext *ctx) = 0;

  virtual void enterIndentifier(ExprParser::IndentifierContext *ctx) = 0;
  virtual void exitIndentifier(ExprParser::IndentifierContext *ctx) = 0;

  virtual void enterTypef(ExprParser::TypefContext *ctx) = 0;
  virtual void exitTypef(ExprParser::TypefContext *ctx) = 0;


};

