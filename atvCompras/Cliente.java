public class Cliente implements Comparable<Cliente> {
    private String nomeDoCliente;
    private String cpf;

    public Cliente(String c) {
        this.cpf = c;
    }

    public Cliente(String c, String n) {
        this.cpf = c;
        this.nomeDoCliente = n;
    }
    
    public String getNome() {
        return nomeDoCliente;
    }

    public void setNome(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int compareTo(Cliente cl) {
        int result;
        result = this.getCpf().compareTo(cl.getCpf());
        return result;
    }

    @Override
    public String toString() {
        return "CPF: " + this.cpf + " NOME: " + this.nomeDoCliente;
    }
}