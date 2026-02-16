package br.com.PraticandoJava.OOEncapsulamento.ControleOficina;

public class Carro {
  private String modelo;
  private String placa;
  private int ano;
  private String defeitoDescricao;

  public Carro(String modelo, String placa, int ano) {
    this.modelo = modelo;
    this.placa = placa;
    this.ano = ano;
  }

  public String getModelo() {
    return modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public int getAno() {
    return ano;
  }

  public String getDefeitoDescricao() {
    return defeitoDescricao;
  }

  public void setDefeitoDescricao(String defeitoDescricao) {
    this.defeitoDescricao = defeitoDescricao;
  }
}
