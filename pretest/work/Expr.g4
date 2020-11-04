/* Expr.g4 */
grammar Expr;

// parser rules


file    
        : NL? packageR? importL? entryL? NL? // main { statement* }
        ;

packageR 
        : PACKAGE STR (DOT STR)* SEMI? NL?
        ;

importL 
        : (importR)*
        ;

importR
        : IMPORT STR (DOT MUL | DOT STR)* SEMI? NL? 
        ;

entryL
        : (entryR)+     
        ;

entryR
        : propertyD //| Dfunction
        ;

propertyD
        : (VAL|VAR) indentifier (COLON typef)? EQ STR SEMI? NL?
        ;

indentifier
        : ID
        ;

typef
        : INT
        ;

// lexer rules

NL : [\r\n]+;
SEMI : ';';

STR : ~[\r\n.; ]+;
PACKAGE : 'package ';
IMPORT : 'import ';
DOT : '.';
MUL : '*';


VAL : 'val ';
VAR : 'var ';


DIGIT : [0-9];
FN : [a-zA-Z_];


ID : FN ( FN | DIGIT )*;


COLON : ': ';
INT : 'Int ';
EQ : '= ';

WS 
        : [ \t\r\n]+
                -> skip
        ;
COMMENT 
        : '//' ~[\r\n]* -> skip
        ;
COMMENT2
        : '/*' .*? '*/' -> skip
        ;


