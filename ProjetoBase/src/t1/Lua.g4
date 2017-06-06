/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="587052 e 586919";
}
/*
 * Início dos Padrões Léxicos
 */
Nome : ('_' | 'a'..'z' | 'A'..'Z') ('_' | 'a'..'z' | '0'..'9')* ; /* regra para identificadores */

Numero : Inteiro | Float  ; /* padrão léxico para reconhecimento de números em geral*/
Inteiro : ('0'..'9')+ ; /* padrão para reconhecimento de números inteiros */
Float : Inteiro'.'Inteiro ; /* padrão para reconhecimento de números decimais */

Cadeia : ('\'' (~('\n' | '\''))* '\'') | ('"' (~('\n' | '"'))* '"'); /* padrão para reconhecimento de cadeias de caracteres */

Comentario : '--' ((~('\n'))* | EOF ) {skip();} ; /* padrão para reconhecimento de comentários de uma única linha (que são ignorados devido ao comando skip()) */

Whitespace : [ \n\r\t] {skip();} ; /* lexema para reconhecimento de espaços em branco no código (que são ignorados devido ao comando skip())*/

And : 'and' ; /* palavra-chave reservada da linguagem */
Break : 'break' ; /* palavra-chave reservada da linguagem */
Do : 'do' ; /* palavra-chave reservada da linguagem */
Else : 'else' ; /* palavra-chave reservada da linguagem */
Elsif : 'elsif' ; /* palavra-chave reservada da linguagem */
End : 'end' ; /* palavra-chave reservada da linguagem */
False : 'false' ; /* palavra-chave reservada da linguagem */
For : 'for' ; /* palavra-chave reservada da linguagem */
Function : 'function' ; /* palavra-chave reservada da linguagem */
If : 'if' ; /* palavra-chave reservada da linguagem */
In : 'in' ; /* palavra-chave reservada da linguagem */
Local : 'local' ; /* palavra-chave reservada da linguagem */
Nil : 'nil' ; /* palavra-chave reservada da linguagem */
Not : 'not' ; /* palavra-chave reservada da linguagem */
Or : 'or' ; /* palavra-chave reservada da linguagem */
Repeat : 'repeat' ; /* palavra-chave reservada da linguagem */
Return : 'return' ; /* palavra-chave reservada da linguagem */
Then : 'then' ; /* palavra-chave reservada da linguagem */
True : 'true' ; /* palavra-chave reservada da linguagem */
Until : 'until' ; /* palavra-chave reservada da linguagem */
When : 'when' ; /* palavra-chave reservada da linguagem */

/*
 * Início das Regras Gramaticais
 */

programa : trecho ;

trecho : (comando (';')?)* (ultimocomando (';')?)? ;

bloco : trecho;

comando :  listavar '=' listaexp | 
         chamadadefuncao | 
         Do bloco End | 
         While exp Do bloco End | 
         Repeat bloco Until exp | 
         If exp Then bloco (Elseif exp Then bloco)* (Then bloco)? End | 
         For Nome '=' exp ',' exp (',' exp)? Do bloco End | 
         For listadenomes In listaexp Do bloco End | 
         Function nomedafuncao corpodafuncao | 
         Local Function Nome corpodafuncao | 
         Local listadenomes ('=' listaexp)? ;

ultimocomando : Return (listaexp)? | Break ;

nomedafuncao : Nome ('.' Nome)* (':' Nome)? ;

listavar : var (',' var)* ;

var :  Nome | expprefixo '[' exp ']' | expprefixo '.' Nome ;

listadenomes : Nome (',' Nome)* ;

listaexp : (exp ',')* exp ;

exp :  Nil | False | True | Numero | Cadeia | '...' | funcao | 
         expprefixo | construtortabela | exp opbin exp | opunaria exp ;

expprefixo : var | chamadadefuncao | '(' exp ')' ;

chamadadefuncao :  expprefixo args | expprefixo ':' Nome args ;

args :  '(' (listaexp)? ')' | construtortabela | Cadeia ;

funcao : 'function' corpodafuncao ;

corpodafuncao : '(' (listapar)? ')' bloco End ;

listapar : listadenomes (',' '...')? | '...' ;

construtortabela : '{' (listadecampos)? '}' ;

listadecampos : campo (separadordecampos campo)* (separadordecampos)? ;

campo : '[' exp ']' '=' exp | Nome '=' exp | exp ;

separadordecampos : ',' | ';' ;

opbin : '+' | '-' | '*' | '/' | '^' | '%' | '..' | 
         '<' | '<=' | '>' | '>=' | '==' | '~=' | 
         And | Or ;

opunaria : '-' | Not | '#' ;