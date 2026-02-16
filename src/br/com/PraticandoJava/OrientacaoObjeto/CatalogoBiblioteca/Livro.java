package br.com.PraticandoJava.OrientacaoObjeto.CatalogoBiblioteca;

public class Livro {
  String titulo;
  String autor;
  int paginas;
  boolean status;
  int diasAtraso;

  public void verCatalogo() {
    System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
  }

  public double calcularMulta() {
    return diasAtraso * 2.50;
  }

  public void statusLivro() {
    double multa = calcularMulta();
    if (status) {
      System.out.println("Livro disponível para empréstimo");
    } else {
      System.out.printf("Livro: %s \nMulta por %d dias de atraso: R$ %.2f%n",
        titulo, diasAtraso, multa);
    }
    System.out.println("________________________ \n");
  }
}
