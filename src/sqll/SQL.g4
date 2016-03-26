/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar SQL;


fragment LETTER: ( 'a'..'z' | 'A'..'Z') ;
fragment DIGIT: '0'..'9' ;


//keywords
K_CREATE
:	('C'|'c') ('R'|'r') ('E'|'e') ('A'|'a') ('T'|'t') ('E'|'e')
;

K_DATABASE
:	('D'|'d') ('A'|'a') ('T'|'t') ('A'|'a') ('B'|'b') ('A'|'a') ('S'|'s') ('E'|'e')
;

K_DATABASES
:	('D'|'d') ('A'|'a') ('T'|'t') ('A'|'a') ('B'|'b') ('A'|'a') ('S'|'s') ('E'|'e') ('S'|'s') 
;

K_DROP
:	('D'|'d') ('R'|'r') ('O'|'o') ('P'|'p')
;

K_USE
:	('U'|'u') ('S'|'s') ('E'|'e')
;

K_SHOW
:	('S'|'s') ('H'|'h') ('O'|'o') ('W'|'w')
;

K_ALTER
:	('A'|'a') ('L'|'l') ('T'|'t') ('E'|'e') ('R'|'r')
;

K_RENAME
:	('R'|'r') ('E'|'e') ('N'|'n') ('A'|'a') ('M'|'m') ('E'|'e')
;

K_TO
:	('T'|'t') ('O'|'o')
;

K_TABLE
:	('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e')
;

K_TABLES
:	('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e') ('S'|'s')
;

K_CONSTRAINT
:	('C'|'c') ('O'|'o') ('N'|'n') ('S'|'s') ('T'|'t') ('R'|'r') ('A'|'a') ('I'|'i') ('N'|'n') ('T'|'t')
;

K_COLUMN
:	('C'|'c') ('O'|'o') ('L'|'l') ('U'|'u') ('M'|'m') ('N'|'n')
;

K_COLUMNS
:	('C'|'c') ('O'|'o') ('L'|'l') ('U'|'u') ('M'|'m') ('N'|'n') ('S'|'s')
;

K_FROM
:	('F'|'f') ('R'|'r') ('O'|'o') ('M'|'m')
;

K_ADD
:	('A'|'a') ('D'|'d') ('D'|'d')
;

K_SELECT
:	('S'|'s') ('E'|'e') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t')
;

K_WHERE
: 	('W'|'w') ('H'|'h') ('E'|'e') ('R'|'r') ('E'|'e')
;

K_INT
:	('I'|'i') ('N'|'n') ('T'|'t')
;

K_DATE
:	('D'|'d') ('A'|'a') ('T'|'t') ('E'|'e')
;

K_CHAR
:	('C'|'c') ('H'|'h') ('A'|'a') ('R'|'r')
;

K_FLOAT
: 	('F'|'f') ('L'|'l') ('O'|'o') ('A'|'a') ('T'|'t')
;

K_PRIMARY
:	('P'|'p') ('R'|'r') ('I'|'i') ('M'|'m') ('A'|'a') ('R'|'r') ('Y'|'y')
;

K_CHECK
:	('C'|'c') ('H'|'h') ('E'|'e') ('C'|'c') ('K'|'k')
;

K_REFERENCES
:	('R'|'r') ('E'|'e') ('F'|'f') ('E'|'e') ('R'|'r') ('E'|'e') ('N'|'n') ('C'|'c') ('E'|'e') ('S'|'s')
;

K_FOREIGN
:	('F'|'f') ('O'|'o') ('R'|'r') ('E'|'e') ('I'|'i') ('G'|'g') ('N'|'n')
;

K_KEY
: 	('K'|'k') ('E'|'e') ('Y'|'y')
;

K_INSERT
:	('I'|'i') ('N'|'n') ('S'|'s') ('E'|'e') ('R'|'r') ('T'|'t')
;

K_INTO
:	('I'|'i') ('N'|'n') ('T'|'t') ('O'|'o')
;

K_VALUES
:	('V'|'v') ('A'|'a') ('L'|'l') ('U'|'u') ('E'|'e') ('S'|'s')
;

K_ORDER
:	('O'|'o') ('R'|'r') ('D'|'d') ('E'|'e') ('R'|'r')
;

K_SET
:	('S'|'s') ('E'|'e') ('T'|'t')
;

K_UPDATE
: 	('U'|'u') ('P'|'p') ('D'|'d') ('A'|'a')  ('T'|'t') ('E'|'e')
;

K_BY
:	('B'|'b') ('Y'|'y')
;

K_ASC
:	('A'|'a') ('S'|'s') ('C'|'c')
;

K_DESC
:	('D'|'d') ('E'|'e') ('S'|'s') ('C'|'c')
;

K_AND
:	('A'|'a') ('N'|'n') ('D'|'d')
;

K_OR
:	('O'|'o') ('R'|'r')
;

K_NOT
:	('N'|'n') ('O'|'o') ('T'|'t')
;

K_NULL
:	('N'|'n') ('U'|'u') ('L'|'l') ('L'|'l')
;

K_DELETE
:	('D'|'d') ('E'|'e') ('L'|'l') ('E'|'e') ('T'|'t') ('E'|'e')
;

SPACES
: [ \t\r\n\f]+ -> channel(HIDDEN)
;

SINGLE_LINE_COMMENT
: '//' ~('\r' | '\n' )*  -> channel(HIDDEN)
;

MULTILINE_COMMENT
: '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
;

ID : LETTER (LETTER | DIGIT)* ;
NUM: UNUM(UNUM)* ;
UNUM: DIGIT ;
DATE:  '\'' UNUM UNUM UNUM UNUM '-' UNUM UNUM '-' UNUM UNUM '\'';

CHAR: '\''~('\r'|'\n'|'\'')* '\'';




todo
: (casitodo) (';'casitodo)* (';')?
;

casitodo
: 	database
| 	table
|	data
;

database
:	K_CREATE K_DATABASE ID													# createDB
|	K_DROP  K_DATABASE  ID													# dropDB
|	K_USE  K_DATABASE  ID													# useDB
|	K_SHOW  K_DATABASES														# showDB
|	K_ALTER  K_DATABASE  ID  K_RENAME  K_TO  ID								# alterDB
;

data
:	insert																	
|	update
|	delete																	
|	query																	
;

table
:	K_CREATE  K_TABLE  ID '(' (ID tipo (',' ID tipo)*)+ (constraints) ')'	#createTB
|	K_ALTER  K_TABLE  ID   (tableAction (',' tableAction)*)+				#alterTB
|	K_ALTER  K_TABLE  ID  K_RENAME  K_TO  ID 								#renameTB
|	K_DROP  K_TABLE  ID														#dropTB
|	K_SHOW  K_TABLES														#showTB
| 	K_SHOW  K_COLUMNS  K_FROM  ID 											#showColums
;

constraints
:	(K_CONSTRAINT constraint (',' K_CONSTRAINT constraint)*)*
;

tableAction
:	K_ADD  K_COLUMN  ID tipo (constraints) 									#addColumnTB
|	K_ADD  K_CONSTRAINT constraint											#addConstraintTB
|	K_DROP  K_COLUMN  ID													#dropColumnTB
|	K_DROP  K_CONSTRAINT  ID												#dropConstraintTB
;

tipo
:	K_INT																	# tipoInt
|	K_FLOAT																	# tipoFloat
|	K_DATE																	# tipoDate
|	K_CHAR '(' NUM ')'														# tipoChar
;

constraint
:	ID K_PRIMARY  K_KEY '(' (ID (',' ID )*)* ')'							# cPK
|	ID K_FOREIGN  K_KEY '(' (ID (',' ID )*)* ')' references					# cFK
|	ID K_CHECK (exp)														# cCheck
;

references
:	K_REFERENCES ID '('(ID (',' ID )*)*')'
;

exp
:	expr
;


expr
:	expr logicExpAnd exp2													#expAnd
|	exp2																	#expNotAnd
;

exp2
:	exp2 logicExpOr exp3													#expOr
|	exp3																	#expNotOr
;

exp3
:	exp3 relationalExpEq exp4												#expEq
|	exp4																	#expNotEq
;

exp4
:	exp4 relationalExpGL unifactor											#expGL
|	unifactor																#expNotGl
;

unifactor
:	K_NOT factor															#expNotFactor
| 	factor																	#expFactor
;

factor
:	literal																	#expLiteral
|	'(' exp ')'																#expParentheses
| 	ID ('.'ID)?																#expID
;

literal
:	formatValue
;

logicExp
:	logicExpAnd
|	logicExpOr
|	logicExpNot
;

logicExpNot
:	K_NOT
;

logicExpOr	
:	K_OR	
;

logicExpAnd
:	K_AND
;

relationalExpEq
: 	'='
|	'<>'
;

relationalExpGL
:	'<'
|	'<='
|	'>'
|	'>='
;

relationalExp
:	relationalExpGL
|	relationalExpEq
;

insert
:	K_INSERT  K_INTO  ID ('(' (ID (',' ID )*)* ')')? K_VALUES '(' (formatValue (',' formatValue )*)* ')'
;

formatValue
:	entero
|	decimal
|	fecha
|	character
|	nullType
;

nullType
:	K_NULL
;

entero
: ('-')? NUM
;

decimal
: entero '.' NUM
;

fecha
:	DATE
;

character
:	CHAR
;

update
:	K_UPDATE  ID  K_SET  asignacion (',' asignacion)*  (K_WHERE exp)?
;

asignacion
:	ID '=' literal
;

condicion
:	(expresion relationalExp (formatValue | expresion)) (logicExp condicion)?
;

delete
:	K_DELETE   K_FROM  ID  (K_WHERE exp)?
;

query
:	K_SELECT ('*' |	column (',' column)*) K_FROM ID (',' ID)* (K_WHERE  exp)? (K_ORDER  K_BY orderby (',' orderby)*)? 
;


column
:	ID('.' ID)?
;

orderby
: expresion (K_ASC | K_DESC)?
;

expresion
:	ID('.' ID)? 
;