package br.com.PraticandoJava.OrientacaoObjeto.ContaDigital;

public class ContaDigital extends Conta {
  public static void main(String[] args) {

    ContaDigital conta = new ContaDigital();

    conta.saldo = 1579.42;
    conta.exibirSaldo();
    conta.zerarSaldo();
    conta.exibirSaldo();
  }
}
