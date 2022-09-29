package usuario;

public class Usuario implements Comparable<Usuario> {

    private String cpf;
    private String nome;
    private int quantLivros;

    public Usuario(String cpf) {
        this.cpf = cpf;
    }

    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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
        result = this.getCpf().compareTo(user.getCpf());
        return result;
    }

    public String toString() {
        return this.cpf + " " + this.nome;
    }
}
