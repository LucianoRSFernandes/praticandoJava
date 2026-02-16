package br.com.PraticandoJava.OOEncapsulamento.ControleSaldoBancario;

public class Principal {
  public static void main(String[] args) {
    Conta conta1 = new Conta("Ana");
    conta1.depositar(1000.00);
    conta1.sacar(1200.00);
    conta1.exibirSaldo();

    Conta conta2 = new Conta("Rui");
    conta2.depositar(1000.00);
    conta2.sacar(200.00);
    conta2.exibirSaldo();
  }
}
