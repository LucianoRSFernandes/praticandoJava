package br.com.PraticandoJava.OOEncapsulamento.ControleBateria;

public class Principal {
  public static void main(String[] args) {
    Bateria b = new Bateria();
    b.setNivel(85);
    System.out.println("Status: " + b.exibirStatus());

    Bateria c = new Bateria();
    c.setNivel(55);
    System.out.println("Status: " + c.exibirStatus());

    Bateria d = new Bateria();
    d.setNivel(15);
    System.out.println("Status: " + d.exibirStatus());
  }
}
