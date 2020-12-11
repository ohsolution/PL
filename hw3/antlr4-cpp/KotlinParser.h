
// Generated from Kotlin.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  KotlinParser : public antlr4::Parser {
public:
  enum {
    SEMI = 1, TWODOT = 2, EQ = 3, NEQ = 4, GE = 5, LE = 6, GT = 7, LT = 8, 
    PASN = 9, MASN = 10, MULASN = 11, DIVASN = 12, MODASN = 13, DPULS = 14, 
    DMINUS = 15, LOGICAND = 16, LOGICOR = 17, DOT = 18, COMMA = 19, LPAR = 20, 
    RPAR = 21, LB = 22, RB = 23, LSQ = 24, RSQ = 25, COLON = 26, QUERY = 27, 
    MUL = 28, DIV = 29, MOD = 30, ASN = 31, PULS = 32, MINUS = 33, IN = 34, 
    NIN = 35, IS = 36, NIS = 37, IF = 38, ELSE = 39, FOR = 40, WHILE = 41, 
    BOOL = 42, BYTE = 43, SHORT = 44, LONG = 45, FLOAT = 46, DOUBLE = 47, 
    INT = 48, STRING = 49, UNIT = 50, SUPERANY = 51, ANY = 52, CHAR = 53, 
    PACKAGE = 54, IMPORT = 55, VAL = 56, VAR = 57, OVERRIDE = 58, CLASS = 59, 
    ABSTRACT = 60, INTERFACE = 61, GET = 62, CONSTRUCTOR = 63, NULLT = 64, 
    FUN = 65, RETC = 66, TRUE = 67, FALSE = 68, MAIN = 69, DOWN = 70, STEP = 71, 
    CHR = 72, STR = 73, ID = 74, NUM = 75, FN = 76, DIGIT = 77, WS = 78, 
    COMMENT = 79, COMMENT2 = 80
  };

  enum {
    RuleProg = 0, RulePackageR = 1, RuleImportL = 2, RuleImportR = 3, RuleOuterL = 4, 
    RuleOuterR = 5, RuleClassD = 6, RuleTypec = 7, RuleClassinner = 8, RulePropertyC = 9, 
    RuleValcD = 10, RuleFuncD = 11, RuleCargus = 12, RuleCargu = 13, RuleMainf = 14, 
    RuleFunctionD = 15, RuleArgument = 16, RuleWhichfunction = 17, RuleAssign = 18, 
    RuleAssignopr = 19, RuleInnerblock = 20, RuleStatement = 21, RuleForloop = 22, 
    RuleWhileloop = 23, RuleIfthenelse = 24, RuleElif = 25, RuleExit = 26, 
    RuleExpression = 27, RuleExpor = 28, RuleExpand = 29, RuleExpeq = 30, 
    RuleExpcmp = 31, RuleExppre = 32, RuleExprange = 33, RuleExpR = 34, 
    RuleExpadd = 35, RuleExpmul = 36, RulePrefixexp = 37, RuleExppostfix = 38, 
    RuleIndexing = 39, RuleFccall = 40, RuleArgus = 41, RuleArgu = 42, RuleOprpostfix = 43, 
    RulePrefixopr = 44, RuleMulopr = 45, RuleAddopr = 46, RuleInopr = 47, 
    RuleIsopr = 48, RuleEqopr = 49, RuleCmpopr = 50, RuleVariableD = 51, 
    RulePropertyD = 52, RuleTypef = 53, RuleValue = 54
  };

  KotlinParser(antlr4::TokenStream *input);
  ~KotlinParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class ProgContext;
  class PackageRContext;
  class ImportLContext;
  class ImportRContext;
  class OuterLContext;
  class OuterRContext;
  class ClassDContext;
  class TypecContext;
  class ClassinnerContext;
  class PropertyCContext;
  class ValcDContext;
  class FuncDContext;
  class CargusContext;
  class CarguContext;
  class MainfContext;
  class FunctionDContext;
  class ArgumentContext;
  class WhichfunctionContext;
  class AssignContext;
  class AssignoprContext;
  class InnerblockContext;
  class StatementContext;
  class ForloopContext;
  class WhileloopContext;
  class IfthenelseContext;
  class ElifContext;
  class ExitContext;
  class ExpressionContext;
  class ExporContext;
  class ExpandContext;
  class ExpeqContext;
  class ExpcmpContext;
  class ExppreContext;
  class ExprangeContext;
  class ExpRContext;
  class ExpaddContext;
  class ExpmulContext;
  class PrefixexpContext;
  class ExppostfixContext;
  class IndexingContext;
  class FccallContext;
  class ArgusContext;
  class ArguContext;
  class OprpostfixContext;
  class PrefixoprContext;
  class MuloprContext;
  class AddoprContext;
  class InoprContext;
  class IsoprContext;
  class EqoprContext;
  class CmpoprContext;
  class VariableDContext;
  class PropertyDContext;
  class TypefContext;
  class ValueContext; 

  class  ProgContext : public antlr4::ParserRuleContext {
  public:
    ProgContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MainfContext *mainf();
    PackageRContext *packageR();
    ImportLContext *importL();
    std::vector<OuterLContext *> outerL();
    OuterLContext* outerL(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProgContext* prog();

  class  PackageRContext : public antlr4::ParserRuleContext {
  public:
    PackageRContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PACKAGE();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> DOT();
    antlr4::tree::TerminalNode* DOT(size_t i);
    antlr4::tree::TerminalNode *SEMI();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PackageRContext* packageR();

  class  ImportLContext : public antlr4::ParserRuleContext {
  public:
    ImportLContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ImportRContext *> importR();
    ImportRContext* importR(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ImportLContext* importL();

  class  ImportRContext : public antlr4::ParserRuleContext {
  public:
    ImportRContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IMPORT();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> DOT();
    antlr4::tree::TerminalNode* DOT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> MUL();
    antlr4::tree::TerminalNode* MUL(size_t i);
    antlr4::tree::TerminalNode *SEMI();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ImportRContext* importR();

  class  OuterLContext : public antlr4::ParserRuleContext {
  public:
    OuterLContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<OuterRContext *> outerR();
    OuterRContext* outerR(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OuterLContext* outerL();

  class  OuterRContext : public antlr4::ParserRuleContext {
  public:
    OuterRContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionDContext *functionD();
    ClassDContext *classD();
    PropertyDContext *propertyD();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OuterRContext* outerR();

  class  ClassDContext : public antlr4::ParserRuleContext {
  public:
    ClassDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *CLASS();
    antlr4::tree::TerminalNode *INTERFACE();
    antlr4::tree::TerminalNode *LB();
    ClassinnerContext *classinner();
    antlr4::tree::TerminalNode *RB();
    antlr4::tree::TerminalNode *ABSTRACT();
    CargusContext *cargus();
    antlr4::tree::TerminalNode *COLON();
    TypecContext *typec();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassDContext* classD();

  class  TypecContext : public antlr4::ParserRuleContext {
  public:
    TypecContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypecContext* typec();

  class  ClassinnerContext : public antlr4::ParserRuleContext {
  public:
    ClassinnerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<PropertyCContext *> propertyC();
    PropertyCContext* propertyC(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMI();
    antlr4::tree::TerminalNode* SEMI(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassinnerContext* classinner();

  class  PropertyCContext : public antlr4::ParserRuleContext {
  public:
    PropertyCContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FuncDContext *funcD();
    ValcDContext *valcD();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PropertyCContext* propertyC();

  class  ValcDContext : public antlr4::ParserRuleContext {
  public:
    ValcDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *VAL();
    antlr4::tree::TerminalNode *VAR();
    antlr4::tree::TerminalNode *COLON();
    TypefContext *typef();
    antlr4::tree::TerminalNode *ASN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *SEMI();
    antlr4::tree::TerminalNode *ABSTRACT();
    antlr4::tree::TerminalNode *OVERRIDE();
    antlr4::tree::TerminalNode *GET();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ValcDContext* valcD();

  class  FuncDContext : public antlr4::ParserRuleContext {
  public:
    FuncDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FUN();
    antlr4::tree::TerminalNode *ID();
    ArgumentContext *argument();
    antlr4::tree::TerminalNode *COLON();
    WhichfunctionContext *whichfunction();
    antlr4::tree::TerminalNode *SEMI();
    antlr4::tree::TerminalNode *ABSTRACT();
    antlr4::tree::TerminalNode *OVERRIDE();
    TypefContext *typef();
    antlr4::tree::TerminalNode *QUERY();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FuncDContext* funcD();

  class  CargusContext : public antlr4::ParserRuleContext {
  public:
    CargusContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *CONSTRUCTOR();
    std::vector<CarguContext *> cargu();
    CarguContext* cargu(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CargusContext* cargus();

  class  CarguContext : public antlr4::ParserRuleContext {
  public:
    CarguContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *COLON();
    TypefContext *typef();
    antlr4::tree::TerminalNode *VAL();
    antlr4::tree::TerminalNode *VAR();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CarguContext* cargu();

  class  MainfContext : public antlr4::ParserRuleContext {
  public:
    MainfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FUN();
    antlr4::tree::TerminalNode *MAIN();
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *LB();
    InnerblockContext *innerblock();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MainfContext* mainf();

  class  FunctionDContext : public antlr4::ParserRuleContext {
  public:
    FunctionDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FUN();
    antlr4::tree::TerminalNode *ID();
    ArgumentContext *argument();
    WhichfunctionContext *whichfunction();
    antlr4::tree::TerminalNode *COLON();
    antlr4::tree::TerminalNode *SEMI();
    TypefContext *typef();
    antlr4::tree::TerminalNode *QUERY();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionDContext* functionD();

  class  ArgumentContext : public antlr4::ParserRuleContext {
  public:
    ArgumentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *RPAR();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COLON();
    antlr4::tree::TerminalNode* COLON(size_t i);
    std::vector<TypefContext *> typef();
    TypefContext* typef(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArgumentContext* argument();

  class  WhichfunctionContext : public antlr4::ParserRuleContext {
  public:
    WhichfunctionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AssignContext *assign();
    antlr4::tree::TerminalNode *LB();
    InnerblockContext *innerblock();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WhichfunctionContext* whichfunction();

  class  AssignContext : public antlr4::ParserRuleContext {
  public:
    AssignContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AssignoprContext *assignopr();
    ExpressionContext *expression();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignContext* assign();

  class  AssignoprContext : public antlr4::ParserRuleContext {
  public:
    AssignoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ASN();
    antlr4::tree::TerminalNode *PASN();
    antlr4::tree::TerminalNode *MASN();
    antlr4::tree::TerminalNode *MULASN();
    antlr4::tree::TerminalNode *DIVASN();
    antlr4::tree::TerminalNode *MODASN();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignoprContext* assignopr();

  class  InnerblockContext : public antlr4::ParserRuleContext {
  public:
    InnerblockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InnerblockContext* innerblock();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableDContext *variableD();
    antlr4::tree::TerminalNode *SEMI();
    FunctionDContext *functionD();
    ExpressionContext *expression();
    ExitContext *exit();
    antlr4::tree::TerminalNode *ID();
    AssignContext *assign();
    ForloopContext *forloop();
    WhileloopContext *whileloop();
    ClassDContext *classD();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementContext* statement();

  class  ForloopContext : public antlr4::ParserRuleContext {
  public:
    ForloopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FOR();
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *IN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RPAR();
    StatementContext *statement();
    antlr4::tree::TerminalNode *COLON();
    TypefContext *typef();
    antlr4::tree::TerminalNode *LB();
    InnerblockContext *innerblock();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForloopContext* forloop();

  class  WhileloopContext : public antlr4::ParserRuleContext {
  public:
    WhileloopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WHILE();
    antlr4::tree::TerminalNode *LPAR();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RPAR();
    StatementContext *statement();
    antlr4::tree::TerminalNode *LB();
    InnerblockContext *innerblock();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WhileloopContext* whileloop();

  class  IfthenelseContext : public antlr4::ParserRuleContext {
  public:
    IfthenelseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IF();
    antlr4::tree::TerminalNode *LPAR();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RPAR();
    StatementContext *statement();
    ElifContext *elif();
    antlr4::tree::TerminalNode *LB();
    InnerblockContext *innerblock();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfthenelseContext* ifthenelse();

  class  ElifContext : public antlr4::ParserRuleContext {
  public:
    ElifContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ELSE();
    StatementContext *statement();
    antlr4::tree::TerminalNode *LB();
    InnerblockContext *innerblock();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElifContext* elif();

  class  ExitContext : public antlr4::ParserRuleContext {
  public:
    ExitContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *RETC();
    ExpressionContext *expression();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExitContext* exit();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExporContext *expor();
    IfthenelseContext *ifthenelse();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionContext* expression();

  class  ExporContext : public antlr4::ParserRuleContext {
  public:
    ExporContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpandContext *> expand();
    ExpandContext* expand(size_t i);
    std::vector<antlr4::tree::TerminalNode *> LOGICOR();
    antlr4::tree::TerminalNode* LOGICOR(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExporContext* expor();

  class  ExpandContext : public antlr4::ParserRuleContext {
  public:
    ExpandContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpeqContext *> expeq();
    ExpeqContext* expeq(size_t i);
    std::vector<antlr4::tree::TerminalNode *> LOGICAND();
    antlr4::tree::TerminalNode* LOGICAND(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpandContext* expand();

  class  ExpeqContext : public antlr4::ParserRuleContext {
  public:
    ExpeqContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpcmpContext *> expcmp();
    ExpcmpContext* expcmp(size_t i);
    std::vector<EqoprContext *> eqopr();
    EqoprContext* eqopr(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpeqContext* expeq();

  class  ExpcmpContext : public antlr4::ParserRuleContext {
  public:
    ExpcmpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExppreContext *> exppre();
    ExppreContext* exppre(size_t i);
    std::vector<CmpoprContext *> cmpopr();
    CmpoprContext* cmpopr(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpcmpContext* expcmp();

  class  ExppreContext : public antlr4::ParserRuleContext {
  public:
    ExppreContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExprangeContext *> exprange();
    ExprangeContext* exprange(size_t i);
    std::vector<InoprContext *> inopr();
    InoprContext* inopr(size_t i);
    std::vector<IsoprContext *> isopr();
    IsoprContext* isopr(size_t i);
    std::vector<TypefContext *> typef();
    TypefContext* typef(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExppreContext* exppre();

  class  ExprangeContext : public antlr4::ParserRuleContext {
  public:
    ExprangeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpRContext *> expR();
    ExpRContext* expR(size_t i);
    std::vector<antlr4::tree::TerminalNode *> DOWN();
    antlr4::tree::TerminalNode* DOWN(size_t i);
    std::vector<antlr4::tree::TerminalNode *> STEP();
    antlr4::tree::TerminalNode* STEP(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExprangeContext* exprange();

  class  ExpRContext : public antlr4::ParserRuleContext {
  public:
    ExpRContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpaddContext *> expadd();
    ExpaddContext* expadd(size_t i);
    std::vector<antlr4::tree::TerminalNode *> TWODOT();
    antlr4::tree::TerminalNode* TWODOT(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpRContext* expR();

  class  ExpaddContext : public antlr4::ParserRuleContext {
  public:
    ExpaddContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpmulContext *> expmul();
    ExpmulContext* expmul(size_t i);
    std::vector<AddoprContext *> addopr();
    AddoprContext* addopr(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpaddContext* expadd();

  class  ExpmulContext : public antlr4::ParserRuleContext {
  public:
    ExpmulContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<PrefixexpContext *> prefixexp();
    PrefixexpContext* prefixexp(size_t i);
    std::vector<MuloprContext *> mulopr();
    MuloprContext* mulopr(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpmulContext* expmul();

  class  PrefixexpContext : public antlr4::ParserRuleContext {
  public:
    PrefixexpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExppostfixContext *exppostfix();
    PrefixoprContext *prefixopr();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrefixexpContext* prefixexp();

  class  ExppostfixContext : public antlr4::ParserRuleContext {
  public:
    ExppostfixContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FccallContext *fccall();
    IndexingContext *indexing();
    antlr4::tree::TerminalNode *ID();
    OprpostfixContext *oprpostfix();
    antlr4::tree::TerminalNode *LPAR();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *LSQ();
    antlr4::tree::TerminalNode *RSQ();
    ValueContext *value();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExppostfixContext* exppostfix();

  class  IndexingContext : public antlr4::ParserRuleContext {
  public:
    IndexingContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *LSQ();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RSQ();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexingContext* indexing();

  class  FccallContext : public antlr4::ParserRuleContext {
  public:
    FccallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *LPAR();
    ArgusContext *argus();
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *LB();
    antlr4::tree::TerminalNode *RB();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FccallContext* fccall();

  class  ArgusContext : public antlr4::ParserRuleContext {
  public:
    ArgusContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ArguContext *> argu();
    ArguContext* argu(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArgusContext* argus();

  class  ArguContext : public antlr4::ParserRuleContext {
  public:
    ArguContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    ValueContext *value();
    ExpressionContext *expression();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArguContext* argu();

  class  OprpostfixContext : public antlr4::ParserRuleContext {
  public:
    OprpostfixContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DPULS();
    antlr4::tree::TerminalNode *DMINUS();
    std::vector<antlr4::tree::TerminalNode *> DOT();
    antlr4::tree::TerminalNode* DOT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<FccallContext *> fccall();
    FccallContext* fccall(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OprpostfixContext* oprpostfix();

  class  PrefixoprContext : public antlr4::ParserRuleContext {
  public:
    PrefixoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DPULS();
    antlr4::tree::TerminalNode *DMINUS();
    antlr4::tree::TerminalNode *MINUS();
    antlr4::tree::TerminalNode *PULS();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrefixoprContext* prefixopr();

  class  MuloprContext : public antlr4::ParserRuleContext {
  public:
    MuloprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *MUL();
    antlr4::tree::TerminalNode *DIV();
    antlr4::tree::TerminalNode *MOD();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MuloprContext* mulopr();

  class  AddoprContext : public antlr4::ParserRuleContext {
  public:
    AddoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PULS();
    antlr4::tree::TerminalNode *MINUS();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AddoprContext* addopr();

  class  InoprContext : public antlr4::ParserRuleContext {
  public:
    InoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IN();
    antlr4::tree::TerminalNode *NIN();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InoprContext* inopr();

  class  IsoprContext : public antlr4::ParserRuleContext {
  public:
    IsoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IS();
    antlr4::tree::TerminalNode *NIS();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IsoprContext* isopr();

  class  EqoprContext : public antlr4::ParserRuleContext {
  public:
    EqoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EQ();
    antlr4::tree::TerminalNode *NEQ();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EqoprContext* eqopr();

  class  CmpoprContext : public antlr4::ParserRuleContext {
  public:
    CmpoprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *GT();
    antlr4::tree::TerminalNode *LT();
    antlr4::tree::TerminalNode *GE();
    antlr4::tree::TerminalNode *LE();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CmpoprContext* cmpopr();

  class  VariableDContext : public antlr4::ParserRuleContext {
  public:
    VariableDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PropertyDContext *propertyD();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *COLON();
    TypefContext *typef();
    antlr4::tree::TerminalNode *VAL();
    antlr4::tree::TerminalNode *VAR();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDContext* variableD();

  class  PropertyDContext : public antlr4::ParserRuleContext {
  public:
    PropertyDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *ASN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *VAL();
    antlr4::tree::TerminalNode *VAR();
    antlr4::tree::TerminalNode *COLON();
    TypefContext *typef();
    antlr4::tree::TerminalNode *SEMI();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PropertyDContext* propertyD();

  class  TypefContext : public antlr4::ParserRuleContext {
  public:
    TypefContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *INT();
    antlr4::tree::TerminalNode *FLOAT();
    antlr4::tree::TerminalNode *DOUBLE();
    antlr4::tree::TerminalNode *STRING();
    antlr4::tree::TerminalNode *UNIT();
    antlr4::tree::TerminalNode *ANY();
    antlr4::tree::TerminalNode *SHORT();
    antlr4::tree::TerminalNode *LONG();
    antlr4::tree::TerminalNode *BOOL();
    antlr4::tree::TerminalNode *BYTE();
    antlr4::tree::TerminalNode *CHAR();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *LT();
    TypefContext *typef();
    antlr4::tree::TerminalNode *GT();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypefContext* typef();

  class  ValueContext : public antlr4::ParserRuleContext {
  public:
    ValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *STR();
    antlr4::tree::TerminalNode *NUM();
    antlr4::tree::TerminalNode *NULLT();
    antlr4::tree::TerminalNode *TRUE();
    antlr4::tree::TerminalNode *FALSE();
    antlr4::tree::TerminalNode *CHR();
    antlr4::tree::TerminalNode *SUPERANY();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ValueContext* value();


private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

