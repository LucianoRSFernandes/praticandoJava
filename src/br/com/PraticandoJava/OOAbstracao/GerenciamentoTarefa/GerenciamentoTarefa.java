package br.com.PraticandoJava.OOAbstracao.GerenciamentoTarefa;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoTarefa {
  public static void main(String[] args) {
    Tarefa t1 = new Tarefa();
    t1.descricao = "Estudar Java";
    t1.concluida = false;

    Tarefa t2 = new Tarefa();
    t2.descricao = "Fazer exercícios";
    t2.concluida = true;

    Tarefa t3 = new Tarefa();
    t3.descricao = "Dormir";
    t3.concluida = false;

    List<Tarefa> lista = new ArrayList<>();
    lista.add(t1);
    lista.add(t2);
    lista.add(t3);

    for (Tarefa t : lista) {
      t.exibir();
    }
  }
}
