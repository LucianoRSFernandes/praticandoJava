package br.com.PraticandoJava.OOAbstracao.CalculoMediaNota;

public class CalculandoMediaNota {
  public static void main(String[] args) {

    Aluno a1 = new Aluno();
    a1.nome = "João Silva";
    a1.nota1 = 6.5;
    a1.nota2 = 7.5;

    Aluno a2 = new Aluno();
    a2.nome = "Yui Oda";
    a2.nota1 = 5.8;
    a2.nota2 = 9.2;

    Aluno a3 = new Aluno();
    a3.nome = "Rui Brabo";
    a3.nota1 = 5.8;
    a3.nota2 = 3.2;

    a1.mostrarResultado();
    a2.mostrarResultado();
    a3.mostrarResultado();
  }
}
