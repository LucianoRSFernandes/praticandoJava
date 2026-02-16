package br.com.PraticandoJava.OOEncapsulamento.AvaliacaoFilme;

public class Principal {
  public static void main(String[] args) {
    Filme matrix = new Filme("Matrix");
    matrix.adicionarAvaliacao(5);
    matrix.adicionarAvaliacao(4);
    matrix.adicionarAvaliacao(5);
    matrix.adicionarAvaliacao(3);
    matrix.adicionarAvaliacao(4);

    System.out.printf("Média de avaliações para %s: %.2f\n",
      matrix.getTitulo(), matrix.calcularMedia());

    System.out.println("----------");

    Filme matrix2 = new Filme("Matrix2");
    matrix2.adicionarAvaliacao(4);
    matrix2.adicionarAvaliacao(3);
    matrix2.adicionarAvaliacao(2);
    matrix2.adicionarAvaliacao(1);
    matrix2.adicionarAvaliacao(5);

    System.out.printf("Média de avaliações para %s: %.2f\n",
      matrix2.getTitulo(), matrix2.calcularMedia());
  }
}
