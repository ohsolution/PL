/* Kotlin.g4 */
grammar Kotlin;

// parser rules

prog    
        : packageR? importL? outerL? mainf outerL?
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
        | classD
        | propertyD  
        ;
classD
        : ABSTRACT? (CLASS | INTERFACE) ID cargus? (COLON typec)? (LB classinner RB)
        ;

typec
        : expression (COMMA expression)*
        ;

classinner
        : (propertyC SEMI?)*
        ;
        
propertyC
        : funcD
        | valcD
        ;

valcD
        : (ABSTRACT | OVERRIDE)? (VAL|VAR) ID (COLON typef GET?)? (ASN expression)? SEMI? 
        ;

funcD
        : (ABSTRACT | OVERRIDE)? FUN ID argument (COLON typef? QUERY?)? whichfunction? SEMI?
        ;

cargus
        : CONSTRUCTOR? LPAR cargu? (COMMA cargu)* RPAR
        ;

cargu 
        : (VAL|VAR)? ID COLON typef
        ;

mainf
        : FUN MAIN LPAR RPAR LB innerblock RB;        

functionD
        : FUN ID argument (COLON typef? QUERY?)? whichfunction SEMI?
        ;

argument
        : LPAR (ID COLON typef COMMA?)* RPAR
        ;

whichfunction
        : assign
        | LB innerblock RB 
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
        | forloop 
        | whileloop
        | classD        
        ;

forloop
        : FOR LPAR ID (COLON typef)? IN expression RPAR ((LB innerblock RB) | statement)
        ;

whileloop
        : WHILE LPAR expression RPAR ((LB innerblock RB) | statement)
        ;


ifthenelse
        : IF LPAR expression RPAR ((LB innerblock RB) | statement) elif?        
        ; 

elif
        : ELSE statement
        | ELSE LB innerblock RB
        ;

exit
        : RETC expression?
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
        : exprange ((inopr exprange)|(isopr typef))*
        ;

exprange
        : expR ((DOWN | STEP) expR)*
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
        | indexing
        | ID oprpostfix
        | LPAR expression RPAR
        | LSQ expression RSQ
        | value
        ;

indexing
        : ID LSQ expression RSQ
        ; 

fccall
        : ID LPAR argus RPAR
        | ID LB argus RB
        ;

argus
        : argu? (COMMA argu)*  
        ;
argu
        : ID
        | value
        | expression
        ;         

oprpostfix
        : DPULS
        | DMINUS
        | (DOT (fccall|ID)) *
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
        | ID '<' typef '>'
        ;

value 
        : STR
        | NUM
        | NULLT
        | (TRUE|FALSE)
        | CHR
        | SUPERANY
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
FOR : 'for';
WHILE : 'while';
BOOL : 'Boolean';
BYTE : 'Byte';
SHORT : 'Short';
LONG : 'Long';
FLOAT : 'Float';
DOUBLE : 'Double';
INT : 'Int';
STRING : 'String';
UNIT : 'Unit';
SUPERANY : 'Any()';
ANY : 'Any';
CHAR : 'Char';

PACKAGE : 'package';
IMPORT : 'import';
VAL : 'val';
VAR : 'var';
OVERRIDE : 'override';
CLASS : 'class';
ABSTRACT : 'abstract';
INTERFACE : 'interface';
GET : 'get()';
CONSTRUCTOR : 'constructor';

NULLT : 'null';
FUN : 'fun';
RETC : 'return';
TRUE : 'true';
FALSE : 'false';
MAIN : 'main';
DOWN : 'downTo';
STEP : 'step';

CHR : '\'' ~[\r\n] '\'';
STR : '"' ~[\r\n"]* '"';
ID : FN ( FN | DIGIT )*;
NUM : '-'?DIGIT+(DOT DIGIT+)?;
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


