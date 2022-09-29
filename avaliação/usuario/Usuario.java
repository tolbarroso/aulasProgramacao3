package usuario;

public class Usuario implements Comparable<Usuario> {

    private int[] cpf;
    private String nome;
    private int quantLivros;

    public Usuario(int[] cpf) {
        this.cpf = cpf;
    }

    public Usuario(int[] cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public int[] getCpf() {
        return cpf;
    }

    public void setCpf(int[] cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantLivros() {
        return quantLivros;
    }

    public void setQuantLivros(int quantLivros) {
        this.quantLivros = quantLivros;
    }

    public int compareTo(Usuario user) {
        int result;
        result = this.getCpf().length;
        return result;
    }

    public String toString() {
        return this.cpf + " " + this.nome;
    }
}
