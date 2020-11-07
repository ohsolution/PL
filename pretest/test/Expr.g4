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
        : assign
        | (COLON typef? QUERY?)? LB innerblock RB 
        ;

assign  
        : assignopr expression
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
        : variableD SEMI?
        | functionD SEMI?
        | expression SEMI?
        | exit SEMI?
        | ID assign SEMI?        
        //| forloop 
        //| whileloop        
        ;

ifthenelse
        : IF LPAR expression RPAR ((LB innerblock RB) | statement) elif?        
        ; 

elif
        : ELSE statement
        | ELSE LB innerblock RB
        ;

exit
        : RETC expression
        ; 

expression
        : expor 
        | ifthenelse
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
        : expR ((inopr expR)|(isopr typef))*
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
        : prefixopr? exppostfix
        ;

exppostfix
        : fccall
        | ID oprpostfix
        | LPAR expression RPAR
        | LSQ expression RSQ
        | value
        ;

fccall
        : ID LPAR argu RPAR
        ;

argu
        : ((ID|value|expression) COMMA?)* 
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
        : (VAL|VAR) ID (COLON typef)? ASN expression SEMI? 
        ;

typef
        : INT
        | FLOAT
        | DOUBLE
        | STRING
        | UNIT
        | ANY
        | SHORT
        | LONG
        | BOOL
        | BYTE
        | CHAR
        ;

value 
        : STR
        | NUM
        | NULL
        | (TRUE|FALSE)
        | CHR
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

IF : 'if';
ELSE : 'else';

BOOL : 'Boolean';
BYTE : 'Byte';
SHORT : 'Short';
LONG : 'Long';
FLOAT : 'Float';
DOUBLE : 'Double';
INT : 'Int';
STRING : 'String';
UNIT : 'Unit';
ANY : 'Any';
CHAR : 'Char';

PACKAGE : 'package';
IMPORT : 'import';
VAL : 'val';
VAR : 'var';

NULL : 'null';
FUN : 'fun';
RETC : 'return';
TRUE : 'true';
FALSE : 'false';

CHR : '\'' ~[\r\n] '\'';
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


