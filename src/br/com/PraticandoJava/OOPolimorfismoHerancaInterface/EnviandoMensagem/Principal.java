package br.com.PraticandoJava.OOPolimorfismoHerancaInterface.EnviandoMensagem;

public class Principal {
  public static void main(String[] args) {
    Notificador notificacao = new Notificador();
    notificacao.enviarMensagem("Olá!\n");
    notificacao.enviarMensagem("João", "Bom dia!\n");
    notificacao.enviarMensagem("Yui", "Boa noite!\n");
    notificacao.enviarMensagem("Maria", "Atenção!\n", 2);
    notificacao.enviarMensagem("Vera", "Aguardando Resposta!\n", 2);
  }
}
