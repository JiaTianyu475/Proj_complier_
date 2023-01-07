/*
   SELECT * FROM students
   SELECT id, score, name FROM students
   SELECT * FROM students WHERE score >= 80
   SELECT * FROM students WHERE NOT class_id = 2
   SELECT * FROM students WHERE (score < 80 OR score > 90) AND gender = 'M'
   SELECT id, name, gender, score FROM students ORDER BY score LIMIT 3 OFFSET 3
   SELECT COUNT(*) num FROM students
   SELECT AVG(score) average FROM students WHERE gender = 'M'
   SELECT COUNT(*) num FROM students GROUP BY class_id

   在WHERE中使用子查询
   SELECT * FROM emp WHERE salary = (SELECT MIN(salary) FROM emp)
   在FROM中使用子查询
   SELECT * FROM emp,(
   		  SELECT dept_id , AVG(salary) avg_salary
   		  FROM emp
   		  GROUP BY dept_id
   		  ) t_dept_avg
   WHERE emp.dept_id = t_dept_avg.dept_i

   连接查询
   SELECT Sno,Sname,Class,Cno,Grade
  FROM S LEFT OUTER JOIN SC ON S.Sno = SC.Sno
*/
grammar sql;
selectStatement:'SELECT' selectElements 'FROM' tables (selectClause)?;

selectElements:'DISTINCT'? '*' | (selectElement (',' selectElement)*);
selectElement
    : ((tableName | tabelAlias)'.')? tableColumn ('AS'? tableColumnAlias)? #Column
    | aggFunction ('AS'? aggFunctionResAlias)? #Aggfunc
    ;
tableColumn:STRING;
aggFunction
    :('AVG' | 'SUM' | 'MAX' | 'MIN') '(' aggFunctionArg ')'
    |'COUNT' '(' ('*' |  aggFunctionArg) ')'
    ;
aggFunctionArg: (tableColumn | tableColumnAlias);
tableColumnAlias:STRING;
aggFunctionResAlias:STRING;

tables
    :table (',' table)*
    |table joinOperator table ('ON' tableColumn_ '=' tableColumn_)?
    ;
table:(tableName | '(' selectStatement ')') ('AS'? tabelAlias)?;
tableName:STRING;
tabelAlias:STRING;
joinOperator: 'INNER JOIN' | 'NATURAL JOIN' | 'CROSS JOIN' | 'LEFT' 'OUTER'? ' JOIN' | 'RIGHT' 'OUTER'? ' JOIN';

selectClause
    : whereClause
    | groupByCaluse
    | havingCaluse
    | orderByClause
    | limitClause
    ;

whereClause
    :'WHERE' logicExpression;
groupByCaluse
    :'GROUP BY' tableColumn_ ('ASC' | 'DESC')?;
orderByClause
    :'ORDER BY' (tableColumn_ (',' tableColumn_)*) ('ASC' | 'DESC')?;
havingCaluse
    :'HAVING' logicExpression;
limitClause
    :'LIMIT' INT 'OFFSET' INT;
logicExpression
    : logicExpression logicalOperator logicExpression
    |'NOT' logicExpression
    | '(' logicExpression ')'
    | tableColumn_ compareOperator ((tableColumn_) | value | '('selectStatement ')')
    | tableColumn_ 'NOT'? 'IN' ('(' (value (',' value)*)')' | '('selectStatement ')')
    | tableColumn_ 'BETWEEN' value 'AND' value
    | tableColumn_ 'IS' 'NOT'? 'NULL'
    ;

tableColumn_: ((tableName | tabelAlias)'.')? (tableColumn | tableColumnAlias);
logicalOperator:'AND' | 'OR';
compareOperator:'>' | '>=' | '=' | '<' | '<=' | '!=' | '<>';
value
    : INT #int
    | '"'STRING'"' #string
    | FLOAT #float
    ;

FLOAT: '-'? INT '.' INT;
INT: '0' | '-'? [1-9] [0-9]*;
STRING: [a-zA-Z0-9_]+;
WS: ' ' -> skip;
WS2: [ \t\r\n]+ -> skip;