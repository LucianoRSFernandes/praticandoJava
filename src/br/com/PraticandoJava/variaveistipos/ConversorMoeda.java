package br.com.PraticandoJava.variaveistipos;

public class ConversorMoeda {
  public static void main(String[] args) {

    // --- Real para Dólar ---
    double valorReaisOriginal = 451.50;
    double taxaRealDolar = 5.25;
    double valorDolares = valorReaisOriginal / taxaRealDolar;
    System.out.println("1. O valor em dólares é: US$ " + String.format("%.2f", valorDolares));

    // --- Dólar para Iene (JPY) ---
    // 1 USD ≈ 153.18 JPY
    double taxaDolarIene = 153.18;
    double valorIenes = valorDolares * taxaDolarIene;
    System.out.println("2. O valor em ienes é: ¥ " + String.format("%.2f", valorIenes));

    // --- Iene para Euro (EUR) ---
    // 1 JPY ≈ 0.0055 EUR
    double taxaIeneEuro = 0.0055;
    double valorEuros = valorIenes * taxaIeneEuro;
    System.out.println("3. O valor em euros é: € " + String.format("%.2f", valorEuros));

    // --- Euro para Peso Argentino (ARS) ---
    // 1 EUR ≈ 1656.81 ARS
    double taxaEuroPeso = 1656.81;
    double valorPesos = valorEuros * taxaEuroPeso;
    System.out.println("4. O valor em pesos argentinos é: $ " + String.format("%.2f", valorPesos));

    // --- Peso para Real (BRL) ---
    // 1 ARS ≈ 0.0037 BRL
    double taxaPesoReal = 0.0037;
    double valorFinalReais = valorPesos * taxaPesoReal;
    System.out.println("5. O valor final retornando para reais é: R$ " + String.format("%.2f", valorFinalReais));
  }
}

