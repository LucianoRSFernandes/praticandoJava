package br.com.PraticandoJava.OOPolimorfismoHerancaInterface.ControleReserva;

public class ReservaVip extends Reserva {

  @Override
  public void reservar() {
    System.out.println("Reserva VIP confirmada com atendimento exclusivo");
  }
}
