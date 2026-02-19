package br.com.PraticandoJava.stringsregex.FormatandoNumero;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor: ");
    double valor = scanner.nextDouble();

    String valorFormatado = String.format("R$ %.2f", valor);
    System.out.println("Valor formatado: " + valorFormatado);
  }
}
