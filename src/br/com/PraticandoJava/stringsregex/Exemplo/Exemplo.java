package br.com.PraticandoJava.stringsregex.Exemplo;

public class Exemplo {
  public static void main(String[] args) {
    String professor = "Jacqueline Oliveira";

    String disciplina = "Java e Programação Orientada a Objetos";

    String curriculo = """
      Pós-graduada em Engenharia e
      Arquitetura de Software;
      Desenvolvedora backend Java desde 2010;
      """;

    String texto = String.format("Disciplina: %s - %s", disciplina, professor);
    System.out.println(texto);

    System.out.printf("Nome: %s %nDisciplina: %s", professor, disciplina);

    System.out.println("\n" + curriculo);

    String texto1 = String.format("Disciplina: %s - %s", disciplina.trim(), professor.toUpperCase());
    System.out.println(texto1);
    System.out.printf("Nome: %s %nDisciplina: %s",
      professor.replace("Oliveira", "Magalhães"),
      disciplina);


    /*
    Formatação:
    %s = Substitui uma string.
    %d = Substitui um inteiro.
    %f = Substitui um número em ponto flutuante (Float/double).
    %n = Insere um linha.
    %.2f = Formata o valor com duas casas decimais.

    método trim(), que remove espaços em branco no início e no final da string.
    método toLowerCase(), que convertem um texto para letras minúsculas.
    método toUpperCase(), que convertem um texto para letras maiúsculas.
    método replace(), que permite substituir partes do texto por outro valor.
    método charAt() – Retorna o caractere de uma posição específica na string.
    método substring() – Permite extrair um trecho da string, podendo definir tanto a posição inicial quanto a final. Por exemplo, substring(0, 10).
    método contains() – Verifica se uma determinada palavra ou sequência de caracteres está presente na string.
    método startsWith() – Confere se a string começa com um determinado conjunto de caracteres. Por exemplo, professor.startsWith("Jac") retornará true se o nome começar com "Jac".
    método endsWith() – Similar ao startsWith, mas verifica se a string termina com um determinado sufixo.
     */
  }
}
