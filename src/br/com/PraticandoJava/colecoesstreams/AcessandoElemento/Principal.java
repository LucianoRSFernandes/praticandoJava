package br.com.PraticandoJava.colecoesstreams.AcessandoElemento;

import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    List<String> funcionarios = new ArrayList<>();
    funcionarios.add ("Rui");
    funcionarios.add ("Ana");
    funcionarios.add ("Yui");
    funcionarios.add ("Ada");
    funcionarios.add ("Enzo");

    System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
    System.out.println("Total de funcionários: " + funcionarios.size());

  }
}
