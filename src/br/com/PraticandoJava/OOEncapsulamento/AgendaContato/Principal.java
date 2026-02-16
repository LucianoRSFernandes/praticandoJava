package br.com.PraticandoJava.OOEncapsulamento.AgendaContato;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    ArrayList<Contato> contatos = new ArrayList<>();

    contatos.add(new Contato("João Silva", "(11) 99999-0000"));
    contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
    contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));
    contatos.add(new Contato("Rui Oliveira", "(11) 96787-0011"));

    System.out.println("Lista de contatos:");
    int indice = 1;
    for (Contato contato : contatos) { //for-each percorre cada objeto Contato na lista contatos
      System.out.printf("%d. %s - %s\n", //imprime o número do contato (indice), nome e telefone do contato
        indice++,
        contato.getNome(),
        contato.getTelefone());
    }
  }
}
