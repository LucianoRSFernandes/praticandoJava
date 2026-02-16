package br.com.PraticandoJava.OOEncapsulamento.Exemplo;

public class Exemplo {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("Ana", 9000 );
    funcionario1.setCargo("Gerente");

    Funcionario funcionario2 = new Funcionario("Rui", 5000); // Criado pelo construtor imutável, add pelo parâmetro;
    funcionario2.setCargo("Desenvolvedor");//criado pelo setter e modificado pelo parâmetro;

    System.out.println("Funcionário tem o nome: " + funcionario1.getNome());
    System.out.println("Funcionário tem o cargo: " + funcionario1.getCargo());
    System.out.println("\nFuncionário tem o salario: " + funcionario1.getSalario());

    System.out.println("Funcionário tem o nome: " + funcionario2.getNome());
    System.out.println("Funcionário tem o cargo: " + funcionario2.getCargo());
    System.out.println("\nFuncionário tem o salario: " + funcionario2.getSalario());

    funcionario1.reajustarSalario(5);
    funcionario1.reajustarSalario(10);
    funcionario2.reajustarSalario(15);
  }
}
