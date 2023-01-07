//package main
//
//import "fmt"
//
//var pow = []int{1, 2, 4, 8, 16, 32, 64, 128}
//
//func main() {
//   for i, v := range pow {
//      fmt.Printf("2**%d = %d\n", i, v)
//   }
//}

grammar go;

golang:package imports globalVars funcs;

package:'package' packageName;
packageName:NAME;

imports
    : importPackage*
    | 'import' '('(dependencyPackage)+')' ;
importPackage: 'import' dependencyPackage ;
dependencyPackage:STRING;


globalVars:  (globalVarsDeclaration | globalVarsAssignment )*;
globalVarsDeclaration
    : globalBasicVarDeclaration
    | structDeclaration
    | funcDeclaration
    | interfaceDeclaration
    ;
globalBasicVarDeclaration
    :'var' basicVarsDeclaration
    | 'var' '('basicVarsDeclaration')';
globalVarsAssignment
    : globalBasicVarDeclaration '=' (varValue(',' varValue)*)
    | 'var' varName(',' varName)* '=' (varValue(',' varValue)*)
    | 'var' varName '=' compoundTypes array
    ;

basicVarsDeclaration:varName(',' varName)* parameterTypes;
varName:NAME;
structDeclaration:'type' structName 'struct' '{' (varName parameterTypes)+'}';
structName:NAME;
funcDeclaration:'type' functionName 'func' '(' (parameterTypes(',' parameterTypes)*) ')' (parameterTypes(',' parameterTypes)*);
functionName:NAME;
interfaceDeclaration: 'type' interfaceName 'interface' '{' (functionName'('(parameterTypes(',' parameterTypes)*) ')'returnTypes)+'}';
interfaceName:NAME;

name
    :packageName
    |varName
    |structName
    |functionName
    |interfaceName
    ;

funcs:( func )*;
func:'func' fromStruct functionName '(' parameterList ')' returnTypes '{' functionBody? '}';
fromStruct:('('varName structName')')?;
parameterList:(parameter(',' parameter)*)?;
parameter:(computationalStatement(',' computationalStatement)*) (parameterTypes(',' parameterTypes)*);
returnTypes
    :'('(parameter)*')'
    |'('(parameterTypes(',' parameterTypes)*)')'
    | parameterTypes
    | (parameterTypes(',' parameterTypes)*) //interface
    |
    ;

parameterTypes:(basicTypes|compoundTypes);
compoundTypes
    :'*' (basicTypes|compoundTypes) //ptr
    | '['(arraySize | '...')']' (basicTypes|compoundTypes) //array
    | '[]' (basicTypes|compoundTypes) //slice
    | structName //struct
    |'map''['(basicTypes|compoundTypes)']'(basicTypes|compoundTypes) //map
    | functionName //func
    | interfaceName //interface
    ;
//    type cb func(int) int
arraySize:INT;
basicTypes
    :'string'
    |'bool'
    |'int'|'int8'|'int16'|'int32'|'int64'
    |'uint'|'uint8'|'uint16'|'uint32'|'uint64'
    |'byte'
    |'uintptr'
    |'rune'
    |'float32'|'float64'
    |'complex64'|'complex128'
    |'error'
    ;
functionBody
    :(localVarsDeclaration | assignmentStatement | conditionalStatement | loopStatement | returnStatement | callFunctionStatement)+;

localVarsDeclaration:'var' basicVarsDeclaration;
assignmentStatement
    : localVarsDeclaration '=' (varValue(',' varValue)*)
    | 'var' varName(',' varName)* '=' (varValue(',' varValue)*)
    | (computationalStatement)(',' (computationalStatement))* assignmentOperator (computationalStatement(',' computationalStatement)*)
    ;

computationalStatement
    : STRING #String
    | INT #Atom
    | FLOAT #Atom
    | staticValue #Atom
    | varName #Atom
    | parameterTypes  #Atom
    | computationalStatement '['computationalStatement']' #ArrayValue
    | computationalStatement '.' varName #StructValue
    | callFunctionName'(' callFunctionparameters ')' #callFunc
    | '('computationalStatement')' #noAtom
    | ('-'|'+') computationalStatement #unaryOperator
    | computationalStatement ('++' | '--') #unaryOperatorRight
    | ('*'|'&') computationalStatement #unaryOperator
    | '!' computationalStatement #unaryOperator
    | computationalStatement ('*' | '/' | '%' ) computationalStatement #binaryOperator
    | computationalStatement ('+'|'-') computationalStatement #binaryOperator
    | computationalStatement ('<<'|'>>') computationalStatement #binaryOperator
    | computationalStatement ('<'|'<='|'>'|'>=') computationalStatement #binaryOperator
    | computationalStatement ('=='|'!=') computationalStatement #binaryOperator
    | computationalStatement '&' computationalStatement #binaryOperator
    | computationalStatement '^' computationalStatement #binaryOperator
    | computationalStatement '|' computationalStatement #binaryOperator
    | computationalStatement '&&' computationalStatement #binaryOperator
    | computationalStatement '||' computationalStatement #binaryOperator
    ;
callFunctionName:((dependencyPackage|interfaceName) '.')? functionName ('.' functionName)*;
callFunctionparameters:((computationalStatement)(',' (computationalStatement))*)?;

assignmentOperator:':='|'='|arithOperator'='|bitOperator'=';
arithOperator: '*' | '/' | '%' | '+' | '-' ;
bitOperator:'&' | '|' | '^' |'<<'|'>>';


conditionalStatement
    :ifConditionalStatement
    |switchConditionalStatement
    |selectconditionalStatement
    ;
ifConditionalStatement
    :'if' ifCondition '{' ifConditionBody '}'
    |'if' ifCondition '{' ifConditionBody '}' ('else if' ifCondition '{'ifConditionBody'}')* ('else' '{'ifConditionBody'}')* //if elseif else
    ;
ifCondition:computationalStatement;
ifConditionBody:functionBody?;
switchConditionalStatement:'switch' switchCondition '{' switchCaseClause* '}';
switchCondition:computationalStatement;
switchCaseClause
    :'case' caseCondition ':'  caseConditionBody
    |'default' ':'  caseConditionBody
    ;
caseCondition: (computationalStatement(','computationalStatement)*);
caseConditionBody:'{'?functionBody?'}'?;
selectconditionalStatement: 'select' '{' selectCaseClause* '}';
selectCaseClause
    :'case' varName? assignmentOperator? '<-' varName ':' '{'? functionBody? '}'?
    |'default' ':' '{'? functionBody? '}'?;

loopStatement:(forFlag ':')? 'for' forConditionClause '{' loopBody? '}';
loopBody
    :functionBody
    | 'break' forFlag?
    | 'continue' forFlag?
    | 'goto' forFlag
    ;
forFlag:NAME;
forConditionClause
    : init ';' forCondition ';' post #triCondition//init; condition; post
    | computationalStatement #singleCondition
    |         #emptyCondition //for{}
    | (varName) (',' (varName))? ':=' 'range' computationalStatement #rangeCondition // key, value := range oldMap
    ;
init:assignmentStatement?;
forCondition: computationalStatement;
post: (computationalStatement|assignmentStatement)?;


returnStatement: 'return' computationalStatement?;
callFunctionStatement: (dependencyPackage '.')? functionName('.' functionName)* '(' callFunctionparameters ')';


varValue
    :'-'? INT
    |FLOAT
    |STRING
    ;
staticValue:'true' | 'false'| 'iota' | 'nil';
FLOAT:'-'? INT '.' DIGIT*;
STRING : '"' (ESC | ~["\\])* '"' ;

array
    :'{'(INT(',' INT)*)'}'
    |'{'(FLOAT(',' FLOAT)*)'}'
    |'{'(STRING(',' STRING)*)'}'
    ;

NAME:(LETTER|'_') (LETTER|DIGIT|'_')*;
fragment LETTER:[a-zA-Z];
fragment DIGIT:[0-9];
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
INT
    :  UNSIGNEDINT '.' UNSIGNEDINT EXP?
    |  UNSIGNEDINT EXP
    |  UNSIGNEDINT
    ;
 UNSIGNEDINT : '0' | [1-9] [0-9]* ;
fragment EXP : [Ee] [+\-]? INT ;
WS : ( ' ' | '\t' | '\n' | '\r' )+ -> skip;
NOTE:'/*' . *'*/'  -> skip;
NOTE2:'//' ~[\r\n]* ('\n'|'\r')  -> skip;