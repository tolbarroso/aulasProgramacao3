package view;

import financeiro.Emprestimo;
import livros.Livros;
import usuario.Usuario;

public class Info {
    private Usuario infoUsuarios;
    private Livros infoLivros;
    private Emprestimo infoEmprestimo;
    private Info prox;
    
    public Info(){

    }
    
    public Info(Usuario info){
        this.infoUsuarios = info;
    }

    public Info(Livros info){
        this.infoLivros = info;
    }

    public Info (Emprestimo info) {
        this.infoEmprestimo = info;
    }

    public Usuario getInfoUsuarios() {
        return infoUsuarios;
    }

    public void setInfoUsuarios(Usuario info) {
        this.infoUsuarios = info;
    }

    public Livros getInfoLivros() {
        return infoLivros;
    }

    public void setInfoLivros(Livros info) {
        this.infoLivros = info;
    }

    public Emprestimo getInfoEmprestimo() {
        return infoEmprestimo;
    }

    public void setInfoEmprestimo(Emprestimo info) {
        this.infoEmprestimo = info;
    }

    public Info getProx() {
        return prox;
    }

    public void setProx(Info prox) {
        this.prox = prox;
    }
}