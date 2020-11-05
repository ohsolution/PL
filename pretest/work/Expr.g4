/* Expr.g4 */
grammar Expr;

// parser rules


file    
        : NL? packageR? importL? outerL? NL? // main { statement* }
        ;

packageR 
        : PACKAGE ID (DOT ID)* SEMI? NL?
        ;

importL 
        : (importR)*
        ;

importR
        : IMPORT ID (DOT MUL | DOT ID)* SEMI? NL? 
        ;

outerL
        : (outerR)+     
        ;

outerR
        : functionD
        | propertyD  
        ;

functionD
        : FUN ID argument whichfunction SEMI? NL?
        ;

argument
        : LPAR (ID COLON typef COMMA?)* RPAR
        ;

whichfunction
        : EQ expression
        | COLON typef? LB innerblock RB 
        ;

innerblock
        : (statement)*
        ;

statement
        : variableD
        : functionD
        : expression
        //: 
        //: 
        ;

expression
        :         

propertyD
        : (VAL|VAR) ID (COLON typef)?  EQ value SEMI? NL?
        ;

typef
        : INT
        | REAL
        | STRING
        | UNIT
        ;

value 
        : STR
        | NUM
        ;


// lexer rules

NL : [\r\n]+;
SEMI : ';';
DOT : '.';
COMMA : ',';
MUL : '*';
LPAR : '(';
RPAR : ')';
LB : '{';
RB : '}';
COLON : ':';
EQ : '=';

PACKAGE : 'package';
IMPORT : 'import';
INT : 'Int';
REAL : 'Double';
STRING : 'String';
UNIT : 'Unit';
VAL : 'val';
VAR : 'var';

FUN : 'fun';
RET : 'return';

STR : '"' ~[\r\n]* '"';
ID : FN ( FN | DIGIT )*;
NUM : '-'?DIGIT+DOT?DIGIT*;
FN : [a-zA-Z_];
DIGIT : [0-9];


WS 
        : [ \t\r\n]+ -> skip
        ;
COMMENT 
        : '//' ~[\r\n]* -> skip
        ;
COMMENT2
        : '/*' .*? '*/' -> skip
        ;


