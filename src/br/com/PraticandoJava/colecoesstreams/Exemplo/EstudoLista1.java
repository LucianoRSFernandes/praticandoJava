package br.com.PraticandoJava.colecoesstreams.Exemplo;

import java.util.*;

public class EstudoLista1 {
  public static void main(String[] args) {
    List<String> funcionarios = new ArrayList<>();
    funcionarios.add("Rui");
    funcionarios.add("Rui");
    funcionarios.add("Ana");

    System.out.println(funcionarios);
    System.out.println(funcionarios.get(0));

    Set<String> produtos = new HashSet<>();
    produtos.add("Água");
    produtos.add("Coca-cola");
    produtos.add("gelo");
    produtos.add("Água");
    produtos.add("Coca-cola");

    System.out.println(produtos);

    Map<Integer, String> clientes = new HashMap<>();
    clientes.put(1, "Paula");
    clientes.put(2, "Marcos");
    clientes.put(3, "André");
    clientes.put(4, "Vanessa");
    clientes.put(4, "Vanessa");
    clientes.put(5, "Vanessa");
    clientes.put(4, "Kátia");

    System.out.println(clientes);
    System.out.println(clientes.get(4));

  }
}
