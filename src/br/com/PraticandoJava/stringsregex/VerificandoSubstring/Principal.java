package br.com.PraticandoJava.stringsregex.VerificandoSubstring;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o texto: ");
    String texto = scanner.nextLine();

    System.out.print("Digite a palavra a ser buscada: ");
    String palavrabuscada = scanner.nextLine();

    if (!texto.contains(palavrabuscada)) {
      System.out.println("Palavra não encontrada.");
    } else {
      System.out.println("Palavra encontrada: " + palavrabuscada);

      scanner.close();
    }
  }
}
