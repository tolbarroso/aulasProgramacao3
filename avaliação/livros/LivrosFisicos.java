package livros;

public class LivrosFisicos extends Livros{
        
    private String isbn;
    private String edicao;
    
    public LivrosFisicos(String id, String titulo, String autor, int ano, String edicao) {
        super(id, titulo, autor, ano);
        this.isbn = id;
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String id) {
        this.isbn = id;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    
}
