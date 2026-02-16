package br.com.PraticandoJava.OrientacaoObjeto.ContaDigital;

public class Conta {
  double saldo;

  public void zerarSaldo() {
    saldo = 0.0;
  }

  public void exibirSaldo() {
    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
  }
}
