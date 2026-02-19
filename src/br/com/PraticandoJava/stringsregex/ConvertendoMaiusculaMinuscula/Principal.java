package br.com.PraticandoJava.stringsregex.ConvertendoMaiusculaMinuscula;

public class Principal {
  public static void main(String[] args) {
    String titulo = "O Senhor dos Anéis";
    String corpo = "História de fantasia de um mundo medieval em guerra com o Mal";

    String tituloFormatado = titulo.toUpperCase();
    System.out.println("Titulo: " + tituloFormatado);

    String corpoFormatado = corpo.toLowerCase();
    System.out.println("Corpo: " + corpoFormatado);

  }
}
