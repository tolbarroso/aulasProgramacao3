package livros;

public class LivrosDigitais extends Livros{
    // tem que apresentar um link de download.
    public String linkDownload;

    public LivrosDigitais(String id, String titulo, String autor, int ano, String linkDownload) {
        super(id, titulo, autor, ano);
        this.linkDownload = linkDownload;
    }
    
}
