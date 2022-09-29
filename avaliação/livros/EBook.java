package livros;

public class EBook extends LivrosDigitais {
    // tem que apresentar o numero de paginas.
    private int numeroPaginas;

    public EBook(String id, String titulo, String autor, int ano, String linkDownload, int numeroPaginas) {
        super(id, titulo, autor, ano, linkDownload);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
}
