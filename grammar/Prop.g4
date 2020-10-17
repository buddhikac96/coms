grammar Prop;

file : prop+;

prop : ID '=' STRING '\n' ;

ID: 'a'..'z'+;

STRING: '"' ID '"';

WS: [ \n\t\r] -> skip;