grammar FileSpec;

@header {
package com.github.zxh.classpy.spec.parser;
}

spec     : (part|selector)+ EOF ;
part     : name=ID ('#'var=ID)? '{' (field|table)+ '}' ;
field    : type=ID name=ID ';';
table    : type=ID name=ID '[' count=ID (minus1='-1')? ']' ';';
selector : name=ID '=' type=ID ':' '{' (header=EXPR)? branch+ '}' ;
branch   : val=(INT|STR) '->' type=ID ;


ID   : [a-zA-Z_][a-zA-Z_0-9]* ;
INT  : '0' | [1-9] [0-9]*     ;
STR  : '"' (~["])+ '"'        ;
EXPR : '$' '(' (~[(])+ ')'    ;

// Whitespace and comments
WS           : [ \t\r\n\u000C]+ -> skip ;
COMMENT      : '/*' .*? '*/'    -> skip ;
LINE_COMMENT : '//' ~[\r\n]*    -> skip ;