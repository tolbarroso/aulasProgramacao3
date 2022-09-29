package livros;

import view.Info;

public class GerenciaLivros {
    private Info primeiro;
    
    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    private Info buscarLiv(Livros liv) {
        Info aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfoLivros().compareTo(liv) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirUsuario (Livros liv) {
        Info novo, aux;
        Info result = this.buscarLiv(liv);
        if (result != null) {
            System.out.println("O Livro já está cadastrado!");
        } else {
            novo = new Info(liv);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Cadastro Efetuada!");
        }
    }

    public void exibir() {
        Info aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfoLivros());
                aux = aux.getProx();
            }
        }
    }

    public void removerLivroEspecifico(String id) {
        Livros proc = new Livros(id);
        Info atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfoLivros()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Livro não encontrado!");
            }
        } else { 
            if (proc.compareTo(this.primeiro.getInfoLivros()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfoLivros().compareTo(proc) != 0) {
                        anterior = atual;
                        atual = atual.getProx();
                    } else {
                        break;
                    }
                }
                if (atual == null) {
                    System.out.println("Valor invalido!");
                } else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }
}