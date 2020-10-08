/* Expr.g4 */
grammar Expr;

// parser rules
prog	:   (assn SEMI NEWLINE? | expr SEMI NEWLINE?)*;
expr    :   expr MULD expr
        |   expr PLUSM expr
        |   num
        |   ID
        |   LP expr RP
        ;
assn    :   ID '=' num
        ;
num     :   INT
        |   REAL
        ;

// lexer rules
NEWLINE	: [\r\n]+ ;
INT	: [+-]?[0-9]+ ;
REAL: [+-]?[0-9]+'.'[0-9]* ;
MULD: [*/];
PLUSM: [+-];
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
LP : '(';
RP : ')';
SEMI : ';';
