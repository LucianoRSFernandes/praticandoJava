package br.com.PraticandoJava.OOEncapsulamento.GestaoEstoque;

public class Principal {
  public static void main(String[] args) {
    Produto p1 = new Produto();
    p1.setNome("Mouse");
    p1.setPreco(-59.90);
    p1.setNome("Mouse");
    p1.setPreco(59.90);

    Produto p2 = new Produto();
    p2.setNome("Mouse Gamer");
    p2.setPreco(-9.90);
    p2.setNome("Mouse Gamer");
    p2.setPreco(159.90);

    System.out.println("\n____________________________");
    System.out.printf("Produto: %s\nPreço: %.2f\n", p1.getNome(), p1.getPreco());
    System.out.println("\n____________________________");
    System.out.printf("Produto: %s\nPreço: %.2f\n", p2.getNome(), p2.getPreco());
  }
}
