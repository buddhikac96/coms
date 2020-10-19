grammar Expr;

prog: (decl | expr)+ EOF            # Program
    ;

decl: ID ':' INT_TYPE '=' NUM       # Declaration
    ;

expr: expr '*' expr                 # Multiplication
    | expr '+' expr                 # Addition
    | ID                            # Variable
    | NUM                           # Number
    ;

INT_TYPE: 'int';

ID: [a-z][a-zA-Z0-9_]*;

NUM: '0' | '-'?[1-9][0-9]*;



WS: [ \t\n]+ -> skip;