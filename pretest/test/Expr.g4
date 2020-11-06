/* Expr.g4 */
grammar Expr;

// parser rules


file    
        : packageR? importL? outerL?  // main { statement* }
        ;

packageR 
        : PACKAGE ID (DOT ID)* SEMI? 
        ;

importL 
        : (importR)*
        ;

importR
        : IMPORT ID (DOT MUL | DOT ID)* SEMI? 
        ;

outerL
        : (outerR)+     
        ;

outerR
        : functionD
        | propertyD  
        ;

functionD
        : FUN ID argument whichfunction SEMI?
        ;

argument
        : LPAR (ID COLON typef COMMA?)* RPAR
        ;

whichfunction
        : assign expression
        | (COLON typef? QUERY?)? LB innerblock RB 
        ;

assign
        : ID assignopr
        ;

assignopr
        : ASN
        | PASN
        | MASN
        | MULASN
        | DIVASN
        | MODASN
        ; 
 
innerblock
        : (statement)*
        ;

statement
        : variableD
        | functionD
        | expression
        //| forloop 
        //| whileloop
        //| ifthenelse 
        ;

expression
        : expor 
        | LPAR expor RPAR       
        ;

expor
        : expand (LOGICOR expand)*
        ;

expand
        : expeq (LOGICAND expeq)*
        ;
expeq
        : expcmp (eqopr expcmp)*
        ;

expcmp
        : exppre (cmpopr exppre)*
        ;

exppre
        : expR ((inopr expR)|(isopr typef))
        ;

expR
        : expadd (TWODOT expadd)*
        ;

expadd
        : expmul (addopr expmul)*
        ;

expmul
        : prefixexp (mulopr prefixexp)*
        ;

prefixexp
        : prefixopr exppostfix
        ;

exppostfix
        : ID oprpostfix
        | LPAR exppostfix RPAR
        | LSQ exppostfix RSQ
        | functioncall
        ;

functioncall
        : ID LPAR argu RPAR
        ;

argu
        : ((ID|expression) COMMA?)* 
        ;

oprpostfix
        : DPULS
        | DMINUS
        | (DOT ID)*
        ; 

prefixopr
        : DPULS
        | DMINUS
        | MINUS
        | PULS
        ;


mulopr
        : MUL
        | DIV
        | MOD
        ;

addopr
        : PULS
        | MINUS
        ;                

inopr
        : IN
        | NIN
        ;

isopr   
        : IS
        | NIS
        ;

eqopr
        : EQ
        | NEQ
        ;
cmpopr
        : GT
        | LT
        | GE
        | LE
        ;                


variableD
        : propertyD
        | (VAL|VAR) ID COLON typef
        ;


propertyD
        : (VAL|VAR) ID (COLON typef)? ASN value SEMI? 
        ;

typef
        : INT
        | REAL
        | STRING
        | UNIT
        | ANY
        ;

value 
        : STR
        | NUM
        ;


// lexer rules

SEMI : ';';
TWODOT : '..';

EQ : '==';
NEQ : '!=';
GE : '>=';
LE : '<=';
GT : '>';
LT : '<';
PASN : '+=';
MASN : '-=';
MULASN : '*=';
DIVASN : '/=';
MODASN : '%=';

DPULS : '++';
DMINUS : '--';
LOGICAND : '&&';
LOGICOR : '||';


DOT : '.';
COMMA : ',';
LPAR : '(';
RPAR : ')';
LB : '{';
RB : '}';
LSQ : '[';
RSQ : ']';
COLON : ':';
QUERY : '?';
MUL : '*';
DIV : '/';
MOD : '%';
ASN : '=';
PULS : '+';
MINUS : '-';

IN : 'in';
NIN : '!in';
IS : 'is';
NIS : '!is';

PACKAGE : 'package';
IMPORT : 'import';
INT : 'Int';
REAL : 'Double';
STRING : 'String';
UNIT : 'Unit';
VAL : 'val';
VAR : 'var';
ANY : 'Any';

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


