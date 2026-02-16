package br.com.PraticandoJava.OrientacaoObjeto.ControleEstoque;

public class ControlEstoque {
  public static void main(String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Camiseta";
    p1.quantidade = 10;

    Produto p2 = new Produto();
    p2.nome = "Calça";
    p2.quantidade = 30;

    p1.vender(3);
    p1.vender(8);

    p2.vender(3);
    p2.vender(8);
  }
}
