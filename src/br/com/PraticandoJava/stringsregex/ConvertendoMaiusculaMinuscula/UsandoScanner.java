package br.com.PraticandoJava.stringsregex.ConvertendoMaiusculaMinuscula;

import java.util.Scanner;

public class UsandoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o titulo: ");
    String titulo = scanner.nextLine();
    System.out.print("Digite o corpo: ");
    String corpo = scanner.nextLine();

    String maiusculas = titulo.toUpperCase();
    String minusculas = corpo.toLowerCase();

    System.out.println("Texto em maiúsculas: " + maiusculas);
    System.out.println("Texto em minúsculas: " + minusculas);
    scanner.close();
  }
}
