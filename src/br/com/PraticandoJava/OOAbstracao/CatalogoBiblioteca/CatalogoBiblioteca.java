package br.com.PraticandoJava.OOAbstracao.CatalogoBiblioteca;

public class CatalogoBiblioteca {
  public static void main(String[] args) {

    Livro l1 = new Livro();
    l1.titulo = "O Guia do Mochileiro das Galáxias";
    l1.autor = "Douglas Adams";
    l1.paginas = 208;
    l1.status = false;
    l1.diasAtraso = 3;

    Livro l2 = new Livro();
    l2.titulo = "O Silmarillion";
    l2.autor = "J. R. R. Tolkien";
    l2.paginas = 480;
    l2.status = true;

    l1.verCatalogo();
    l1.statusLivro();
    l2.verCatalogo();
    l2.statusLivro();

  }
}
