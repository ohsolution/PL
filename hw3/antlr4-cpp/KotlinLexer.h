
// Generated from Kotlin.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  KotlinLexer : public antlr4::Lexer {
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

  KotlinLexer(antlr4::CharStream *input);
  ~KotlinLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

