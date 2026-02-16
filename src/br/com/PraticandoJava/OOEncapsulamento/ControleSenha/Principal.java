package br.com.PraticandoJava.OOEncapsulamento.ControleSenha;

public class Principal {
  public static void main(String[] args) {
    Usuario user1 = new Usuario("123456");
    user1.setSenha("1234s56", "abc123");

    Usuario user2 = new Usuario("123456");
    user2.setSenha("123456", "abc123");

    Usuario user3 = new Usuario("abc123");
    user3.setSenha("abc1s3", "1234s56");
  }
}
