package br.com.PraticandoJava.colecoesstreams.ElementoUnico;

import java.util.HashSet;
import java.util.Set;

public class Principal {
  public static void main(String[] args) {
    Set<String> eventos = new HashSet<>();
    eventos.add("IA Conference Brasil");
    eventos.add("AI Summit");
    eventos.add("DevFest");
    eventos.add("Cloud Expo");
    eventos.add("IA Conference Brasil");
    eventos.add("DevFest");

    System.out.println("A Lista de Eventos: " + eventos);
  }
}
