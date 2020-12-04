
// Generated from Kotlin.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "KotlinParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by KotlinParser.
 */
class  KotlinVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by KotlinParser.
   */
    virtual antlrcpp::Any visitProg(KotlinParser::ProgContext *context) = 0;

    virtual antlrcpp::Any visitPackageR(KotlinParser::PackageRContext *context) = 0;

    virtual antlrcpp::Any visitImportL(KotlinParser::ImportLContext *context) = 0;

    virtual antlrcpp::Any visitImportR(KotlinParser::ImportRContext *context) = 0;

    virtual antlrcpp::Any visitOuterL(KotlinParser::OuterLContext *context) = 0;

    virtual antlrcpp::Any visitOuterR(KotlinParser::OuterRContext *context) = 0;

    virtual antlrcpp::Any visitClassD(KotlinParser::ClassDContext *context) = 0;

    virtual antlrcpp::Any visitTypec(KotlinParser::TypecContext *context) = 0;

    virtual antlrcpp::Any visitClassinner(KotlinParser::ClassinnerContext *context) = 0;

    virtual antlrcpp::Any visitPropertyC(KotlinParser::PropertyCContext *context) = 0;

    virtual antlrcpp::Any visitValcD(KotlinParser::ValcDContext *context) = 0;

    virtual antlrcpp::Any visitFuncD(KotlinParser::FuncDContext *context) = 0;

    virtual antlrcpp::Any visitCargus(KotlinParser::CargusContext *context) = 0;

    virtual antlrcpp::Any visitCargu(KotlinParser::CarguContext *context) = 0;

    virtual antlrcpp::Any visitMainf(KotlinParser::MainfContext *context) = 0;

    virtual antlrcpp::Any visitFunctionD(KotlinParser::FunctionDContext *context) = 0;

    virtual antlrcpp::Any visitArgument(KotlinParser::ArgumentContext *context) = 0;

    virtual antlrcpp::Any visitWhichfunction(KotlinParser::WhichfunctionContext *context) = 0;

    virtual antlrcpp::Any visitAssign(KotlinParser::AssignContext *context) = 0;

    virtual antlrcpp::Any visitAssignopr(KotlinParser::AssignoprContext *context) = 0;

    virtual antlrcpp::Any visitInnerblock(KotlinParser::InnerblockContext *context) = 0;

    virtual antlrcpp::Any visitStatement(KotlinParser::StatementContext *context) = 0;

    virtual antlrcpp::Any visitForloop(KotlinParser::ForloopContext *context) = 0;

    virtual antlrcpp::Any visitWhileloop(KotlinParser::WhileloopContext *context) = 0;

    virtual antlrcpp::Any visitIfthenelse(KotlinParser::IfthenelseContext *context) = 0;

    virtual antlrcpp::Any visitElif(KotlinParser::ElifContext *context) = 0;

    virtual antlrcpp::Any visitExit(KotlinParser::ExitContext *context) = 0;

    virtual antlrcpp::Any visitExpression(KotlinParser::ExpressionContext *context) = 0;

    virtual antlrcpp::Any visitExpor(KotlinParser::ExporContext *context) = 0;

    virtual antlrcpp::Any visitExpand(KotlinParser::ExpandContext *context) = 0;

    virtual antlrcpp::Any visitExpeq(KotlinParser::ExpeqContext *context) = 0;

    virtual antlrcpp::Any visitExpcmp(KotlinParser::ExpcmpContext *context) = 0;

    virtual antlrcpp::Any visitExppre(KotlinParser::ExppreContext *context) = 0;

    virtual antlrcpp::Any visitExprange(KotlinParser::ExprangeContext *context) = 0;

    virtual antlrcpp::Any visitExpR(KotlinParser::ExpRContext *context) = 0;

    virtual antlrcpp::Any visitExpadd(KotlinParser::ExpaddContext *context) = 0;

    virtual antlrcpp::Any visitExpmul(KotlinParser::ExpmulContext *context) = 0;

    virtual antlrcpp::Any visitPrefixexp(KotlinParser::PrefixexpContext *context) = 0;

    virtual antlrcpp::Any visitExppostfix(KotlinParser::ExppostfixContext *context) = 0;

    virtual antlrcpp::Any visitFccall(KotlinParser::FccallContext *context) = 0;

    virtual antlrcpp::Any visitArgus(KotlinParser::ArgusContext *context) = 0;

    virtual antlrcpp::Any visitArgu(KotlinParser::ArguContext *context) = 0;

    virtual antlrcpp::Any visitOprpostfix(KotlinParser::OprpostfixContext *context) = 0;

    virtual antlrcpp::Any visitPrefixopr(KotlinParser::PrefixoprContext *context) = 0;

    virtual antlrcpp::Any visitMulopr(KotlinParser::MuloprContext *context) = 0;

    virtual antlrcpp::Any visitAddopr(KotlinParser::AddoprContext *context) = 0;

    virtual antlrcpp::Any visitInopr(KotlinParser::InoprContext *context) = 0;

    virtual antlrcpp::Any visitIsopr(KotlinParser::IsoprContext *context) = 0;

    virtual antlrcpp::Any visitEqopr(KotlinParser::EqoprContext *context) = 0;

    virtual antlrcpp::Any visitCmpopr(KotlinParser::CmpoprContext *context) = 0;

    virtual antlrcpp::Any visitVariableD(KotlinParser::VariableDContext *context) = 0;

    virtual antlrcpp::Any visitPropertyD(KotlinParser::PropertyDContext *context) = 0;

    virtual antlrcpp::Any visitTypef(KotlinParser::TypefContext *context) = 0;

    virtual antlrcpp::Any visitValue(KotlinParser::ValueContext *context) = 0;


};

