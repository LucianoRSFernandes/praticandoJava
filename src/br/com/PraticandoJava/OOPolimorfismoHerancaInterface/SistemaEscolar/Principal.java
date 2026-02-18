package br.com.PraticandoJava.OOPolimorfismoHerancaInterface.SistemaEscolar;

public class Principal {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Ana", 21, 8.5);
    Aluno aluno2 = new Aluno ("Rui", 25, 5.9);

    Docente docente1 = new Docente("Ada", 45, "IA");
    Docente docente2 = new Docente("Yui", 40, "Java");

    aluno1.exibirDados();
    aluno2.exibirDados();

    docente1.exibirDados();
    docente2.exibirDados();

  }
}
