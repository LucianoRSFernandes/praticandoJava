package br.com.PraticandoJava.colecoesstreams.MapCliente;

import java.util.HashMap;
import java.util.Map;

public class Principal {
  public static void main(String[] args) {
    Map<Integer, String> clientes = new HashMap<>();
    clientes.put(1, " Paula");
    clientes.put(2, " Marcos");
    clientes.put(3, " André");

    System.out.println("Os Clientes cadastrados são: " + clientes);
    System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
  }
}
