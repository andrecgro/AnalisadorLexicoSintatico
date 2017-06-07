/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="<<587052 e 586919>>";
}

//-----------------------------------------------------------
//------------Início dos Padrões Léxicos---------------------
//-----------------------------------------------------------

/* Regra para reconhecimento de identificadores */
Nome : ([a-z] | [A-Z] | '_' ) ('_' | [a-z] | [0-9])* ;

/* Abaixo temos Padrões para números inteiros e decimais. Preferimos criar duas novas regras
 * e criar uma regra genérica de 'Número' composta pelas duas novas para facilitar o entendimento
 * e construção da gramática.
 */
Numero : Inteiro | Float  ; /* padrão léxico para reconhecimento de números em geral*/
Inteiro : ('0'..'9')+ ; /* padrão para reconhecimento de números inteiros */
Float : Inteiro '.' Inteiro ; /* padrão para reconhecimento de números decimais */

/* Padrão para reconhecimento de cadeias de caracteres, conforme especificado
 * no manual da linguagem Lua.
 */
Cadeia : ('\'' (~('\n' | '\''))* '\'') | ('"' (~('\n' | '"'))* '"'); 

/* Padrão para reconhecimento de comentários de uma única linha 
 * (que são ignorados devido ao comando skip() pertencente ao Java
 * evitando assim, alocamento desnecessário de espaço).
 */
Comentario : '--' ((~('\n'))* | EOF ) {skip();} ;

/* Lexema para reconhecimento de espaços em branco no código
 * (que são ignorados devido ao comando skip() pertencente ao Java
 * evitando assim, alocamento desnecessário de espaço).
 */
Whitespace : (' ' | '\n' | '\r' | '\t') {skip();} ; 


/* Os padrões de reconhecimento das palavras reservadas para a linguagem
 * poderiam estar declarados aqui mas foram ignorados como padrões
 * léxicos porque são terminais, então foram inseridos diretamente nas
 * regras Gramaticais.
 */



//-----------------------------------------------------------------
//-----------------Início das Regras Gramaticais-------------------
//-----------------------------------------------------------------

programa : trecho ;

trecho : (comando (';')?)* (ultimocomando (';')?)? ;

bloco : trecho;

comando :   listavar '=' listaexp | 
            chamadadefuncao | 
            'do' bloco 'end' | 
            'while' exp 'do' bloco 'end' | 
            'repeat' bloco 'until' exp | 
            'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' | 
            'for' Nome '=' exp ',' exp (',' exp)? 'do' bloco 'end' | 
            'for' listadenomes 'in' listaexp 'do' bloco 'end' | 
            'function' nomedafuncao corpodafuncao | 
            'local' 'function' Nome corpodafuncao | 
            'local' listadenomes ('=' listaexp)? ;

ultimocomando : 'return' (listaexp)? | 'break' ;

nomedafuncao : Nome ('.' Nome)* (':' Nome)? ;

listavar : var (',' var)* ;

var :   Nome                                                            var2 |
        var         (args | ':' Nome args) cham2 ('['exp']' | '.' Nome) var2 |
        '('exp')'   (args | ':' Nome args) cham2 ('['exp']' | '.' Nome) var2 |
        '('exp')'                                ('['exp']' | '.' Nome) var2;

chamadadefuncao :   Nome var2                                   (args | ':' Nome args) cham2 |
                    chamadadefuncao ('['exp']' | '.' Nome) var2 (args | ':' Nome args) cham2 |
                    '('exp')'       ('['exp']' | '.' Nome) var2 (args | ':' Nome args) cham2 |
                    '('exp')'                                   (args | ':' Nome args) cham2;

var2:   (('['exp']' | '.' Nome) var2)?;
cham2:  ((args | ':' Nome args) cham2)?;
                    

listadenomes : Nome (',' Nome)* ;

listaexp : (exp ',')* exp ;

exp :  'nil' | 'false' | 'true' | Numero | Cadeia | '...' | funcao | 
         (var | chamadadefuncao | '(' exp ')') | construtortabela | exp opbin exp | opunaria exp ;

args :  '(' (listaexp)? ')' | construtortabela | Cadeia ;

funcao : 'function' corpodafuncao ;

corpodafuncao : '(' (listapar)? ')' bloco 'end' ;

listapar : listadenomes (',' '...')? | '...' ;

construtortabela : '{' (listadecampos)? '}' ;

listadecampos : campo (separadordecampos campo)* (separadordecampos)? ;

campo : '[' exp ']' '=' exp | Nome '=' exp | exp ;

separadordecampos : ',' | ';' ;

opbin : '+' | '-' | '*' | '/' | '^' | '%' | '..' | 
         '<' | '<=' | '>' | '>=' | '==' | '~=' | 
         'and' | 'or' ;

opunaria : '-' | 'not' | '#' ;

//-----------------------------------------------------------------
//------------Passos para Eliminação da Recursividade-------------
//--------------------à Esquerda e não imediata--------------------
//-----------------------------------------------------------------