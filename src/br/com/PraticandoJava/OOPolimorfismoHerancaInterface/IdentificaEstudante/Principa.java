package br.com.PraticandoJava.OOPolimorfismoHerancaInterface.IdentificaEstudante;

public class Principa {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Rui", "regular");
    Bolsista aluno2 = new Bolsista("Lucas");

    aluno1.identificar();
    aluno2.identificar();
  }
}
