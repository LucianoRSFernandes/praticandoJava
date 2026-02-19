package br.com.PraticandoJava.stringsregex.Exemplo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exemplo2 {
  public static void main(String[] args) {

    String texto = "Meu email é rui@email.com";
    Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
    Matcher matcher = pattern.matcher(texto);

    if (matcher.find()) {
      System.out.println(matcher.group());
    }
    System.out.println(formatarTelefone("21999234543"));
  }
    /*
    simbolo - Descrição
    . - Caractere.exceto querbra de linha
    \d - Dígito (0-9)
    \D - Caractere que não é um dígito
    \w - Caractere alfanumerico
    \W - Caractere não alfanumerico
    \s - Espaço em branco
    \S - Caractere que não é um espaço em branco
    ^ - Inicio da String
    $ - Fim da String

    [abc] - Qualquer caractere dentro dos colchetes ('a', 'b' ou 'c')
    [^abc] - Qualquer caractere exceto os que não estejam dentro dos colchetes
    [a-z] - Qualquer caractere minúsculo de 'a' a 'z'
    [A-Z] - Qualquer caractere maiúsculo de 'A' a 'Z'
    [0-9] - Qualquer digito
    [a-zA-Z] - Qualquer letra maiúscula o minúscula

    * - 0 ou mais ocorrências do padrão anterior
    + - 1 ou mais ocorrências do padrão anterior
    ? - 0 ou 1 ocorrências do padrão anterior
    {n} - Exatamente n ocorrências do padrão anterior
    {n,} - n ou mais do ocorrências do padrão anterior
    {n,m} - Entre n e m ocorrências do padrão anterior

    método - descrição
    find - Procura por um padrão em qualquer parte da String.
           Retorna o primeiro resultado encontrado
    matches - verifica se a string inteira corresponde ao padrão
    looking At - Verifica se a string parcialmente corresponde ao padrão
    replaceAll - Substitui ocorrências do padrão por uma string.

     */


  public static String formatarTelefone(String telefone) {
    String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(telefone);

    if (matcher.matches()) {
      return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
    }

    return "Número de telefone inválido!";
  }
}
