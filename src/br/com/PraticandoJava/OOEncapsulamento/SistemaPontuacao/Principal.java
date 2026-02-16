package br.com.PraticandoJava.OOEncapsulamento.SistemaPontuacao;

public class Principal {
  public static void main(String[] args) {
    Aluno fernanda = new Aluno("Fernanda");
    fernanda.ganharPontos(120);
    fernanda.exibirStatus();

    System.out.println("----------");

    Aluno ada = new Aluno("Ada");
    ada.ganharPontos(320);
    ada.exibirStatus();
  }
}
