package br.com.PraticandoJava.colecoesstreams.RemovendoElemento;

import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    List<String> alunos = new ArrayList<>();
    alunos.add("Joana");
    alunos.add("Lucas");
    alunos.add("Pedro");
    alunos.add("Antônio");

    System.out.println("Lista de Alunos cadastrados: " + alunos);

    alunos.remove("Pedro");

    System.out.println("Lista de Alunos cadastrados corrida: " + alunos);
  }
}
