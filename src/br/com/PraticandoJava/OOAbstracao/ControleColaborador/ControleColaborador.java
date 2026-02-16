package br.com.PraticandoJava.OOAbstracao.ControleColaborador;

public class ControleColaborador {
  public static void main(String[] args) {
    Colaborador c1 = new Colaborador();
    c1.nome = "Júlia Oliveira";
    c1.cargo = "Desenvolvedor Júnior";
    c1.nivelAcesso = 1;

    Colaborador c2 = new Colaborador();
    c2.nome = "Marco Pereira";
    c2.cargo = "Gerente Júnior";
    c2.nivelAcesso = 3;

    c1.atualizarDados("Desenvolvedor Pleno", 2);
    c2.atualizarDados("Gerente Pleno", 4);
  }
}
