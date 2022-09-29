package financeiro;

import livros.Livros;
import usuario.Usuario;

public class Emprestimo implements Comparable<Emprestimo>{
    private String codigoTransicao;
    private Usuario codUser;
    private Livros codLiv;

    public Emprestimo(String codigoTransicao, Usuario codUser, Livros codLiv) {
        this.codigoTransicao = codigoTransicao;
        this.codUser = codUser;
        this.codLiv = codLiv;
    }

    public Emprestimo(String cod) {
        this.codigoTransicao = cod;
    }

    public String getCodigoTransicao() {
        return codigoTransicao;
    }

    public void setCodigoTransicao(String cod) {
        this.codigoTransicao = cod;
    }

    @Override
    public int compareTo(Emprestimo emp) {
        int result;
        result = this.getCodigoTransicao().compareTo(emp.getCodigoTransicao());
        return result;
    }
    
}
