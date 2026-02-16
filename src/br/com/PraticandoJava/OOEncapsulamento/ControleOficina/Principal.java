package br.com.PraticandoJava.OOEncapsulamento.ControleOficina;

public class Principal {
  public static void main(String[] args) {
    Carro gol = new Carro("Gol", "ABC-1234", 2020);
    gol.setDefeitoDescricao("Lanterna quebrada");

    Carro fusca = new Carro("Fusca", "DEF-5678", 1968);
    fusca.setDefeitoDescricao("Freio Falhando");

    System.out.println("Veículo cadastrado:");
    System.out.println("Modelo: " + gol.getModelo() + ", Placa: " + gol.getPlaca() + ", Ano: " + gol.getAno() + ", Defeito: " + gol.getDefeitoDescricao());
    System.out.println("Modelo: " + fusca.getModelo() + ", Placa: " + fusca.getPlaca() + ", Ano: " + fusca.getAno() + ", Defeito: " + fusca.getDefeitoDescricao());
  }
}
