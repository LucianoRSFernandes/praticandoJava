package br.com.PraticandoJava.colecoesstreams.EstatísticaNota;

import java.util.List;

public class Principal {
  public static void main(String[] args) {
    List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

    double mediaNotas = notas.stream()
      .reduce(0.0, Double::sum);
  }
}
