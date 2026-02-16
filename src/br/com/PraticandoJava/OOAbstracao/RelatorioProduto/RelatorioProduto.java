package br.com.PraticandoJava.OOAbstracao.RelatorioProduto;

public class RelatorioProduto {
  public static void main(String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Mouse Gamer";
    p1.preco = 159.90;
    p1.quantidade = 25;

    Produto p2 = new Produto();
    p2.nome = "Teclado";
    p2.preco = 29.99;
    p2.quantidade = 10;

    p1.listarProduto();
    p1.registrarVenda(5);
    p1.listarProduto();
    p2.listarProduto();
    p2.registrarVenda(3);
    p2.listarProduto();
  }
}
