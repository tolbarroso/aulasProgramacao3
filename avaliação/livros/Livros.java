package livros;

public class Livros implements Comparable<Livros> {
    private String id;
    private String titulo;
    private String autor;
    private int ano;

    public Livros(String id) {
        this.id = id;
    }

    public Livros(String id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }    

    public int compareTo(Livros li) {
        int result;
        result = this.getId().compareTo(li.getId());
        return result;
    }

    public String toString() {
        return "ID: " + this.id + " TÍTULO: " + this.titulo + " AUTOR: " + this.autor + " ANO: " + this.ano;
    }
}
