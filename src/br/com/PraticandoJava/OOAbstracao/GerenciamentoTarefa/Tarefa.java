package br.com.PraticandoJava.OOAbstracao.GerenciamentoTarefa;

public class Tarefa {
  String descricao;
  boolean concluida;

  public void exibir() {
    if (concluida) {
      System.out.println("Tarefa: " + descricao + " - Status: Concluída");
    } else {
      System.out.println("Tarefa: " + descricao + " - Status: Pendente");
    }
    System.out.println("---------------------"+"\n");
  }
}
