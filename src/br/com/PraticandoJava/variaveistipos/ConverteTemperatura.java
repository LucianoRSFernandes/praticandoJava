package br.com.PraticandoJava.variaveistipos;

public class ConverteTemperatura {
  public static void main(String[] args) {
    // 1. Celsius para Fahrenheit
    int celsius = 20;
    double fahrenheit = (celsius * 9 / 5.0) + 32;
    System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

    // 2. Fahrenheit para Kelvin
    // Fórmula: K = (F - 32) * 5/9 + 273.15
    double fahrenheitParaKelvin = (fahrenheit - 32) * 5 / 9.0 + 273.15;
    System.out.println(fahrenheit + "°F equivale a " + fahrenheitParaKelvin + "K");

    // 3. Kelvin para Celsius
    // Fórmula: C = K - 273.15
    double kelvin = 300.0;
    double kelvinParaCelsius = kelvin - 273.15;
    System.out.println(kelvin + "K equivale a " + kelvinParaCelsius + "°C");
  }

}
