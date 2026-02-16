package br.com.PraticandoJava.OOAbstracao.RelatorioProduto;

public class Produto {
  String nome;
  double preco;
  int quantidade;

  public void listarProduto() {
    System.out.printf("ESTOQUE ATUAL | Produto: %s - Preço: R$ %.2f - Qtd: %d%n",
      nome, preco, quantidade);
  }

  public void registrarVenda(int quantidadeVendida) {
    if (quantidadeVendida <= quantidade) {
      double valorTotalVenda = quantidadeVendida * preco;

      // Atualiza o estoque subtraindo a venda
      quantidade = quantidade - quantidadeVendida;

      System.out.println("------");
      System.out.printf("Produto: %s%n", nome);
      System.out.printf("Valor Unitário: R$ %.2f%n", preco);
      System.out.printf("Qtd Vendida: %d%n", quantidadeVendida);
      System.out.printf("VALOR TOTAL: R$ %.2f%n", valorTotalVenda);
      System.out.printf("Quantidade restante em estoque: %d%n", quantidade);
      System.out.println("-------------------");
    } else {
      System.out.println("Erro: Estoque insuficiente para realizar a venda de " + nome);
    }
  }
}
