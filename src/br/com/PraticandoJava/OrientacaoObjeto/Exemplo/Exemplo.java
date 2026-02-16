package br.com.PraticandoJava.OrientacaoObjeto.Exemplo;

public class Exemplo {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario();
    funcionario1.nome = "Ana";
    funcionario1.cargo = "Gerente";
    funcionario1.salario = 9000;

    Funcionario funcionario2 = new Funcionario();
    funcionario2.nome = "Rui";
    funcionario2.cargo = "Desenvolvedor";
    funcionario2.salario = 5000;

    funcionario1.exibirInformacoes();
    funcionario2.exibirInformacoes();

    funcionario1.reajustarSalario(5);
    funcionario2.reajustarSalario(15);
  }
}
