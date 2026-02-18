package br.com.PraticandoJava.OOPolimorfismoHerancaInterface.GeraDocumento;

public class Principal {
  public static void main(String[] args) {
    Relatorio rel2024 = new Relatorio(
      "Relatório 2024",
      "Precisamos melhorar, conforme sugestões.\n"
    );
    rel2024.imprimir();

    Relatorio rel2025 = new Relatorio(
      "Relatório 2025",
      "Tudo funcionando conforme esperado.\n"
    );
    rel2025.imprimir();

    Relatorio rel2026 = new Relatorio(
      "Relatório parcial 2026",
      "Tudo funcionando, porém precisamos de atenção no pontos sugeridos.\n"
    );
    rel2026.imprimir();
  }
}
