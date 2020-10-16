grammar Coms;

program: com* EOF;

com
    : declare
    | add
    | sub
    | print
    ;

declare
    : ID '=' value EOL
    ;

add
    : value '+' value EOL
    ;

sub
    : value '-' value EOL
    ;

print
    : 'print' '(' value ')' EOL
    ;

value
    : value '+' value
    | value '-' value
    | ID
    | INT
    ;

INT: '1'..'9' '0'..'9'* ;

ID : 'a'..'z'+ ;

EOL: ';' ;

WS: [ \t\n\r] -> skip ;