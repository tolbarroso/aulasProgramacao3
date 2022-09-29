package usuario;

import view.Info;

public class GerenciaUsuario {
    private Info primeiro;
    
    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    private Info buscarUser(Usuario user) {
        Info aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfoUsuarios().compareTo(user) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirUsuario (Usuario user) {
        Info novo, aux;
        Info result = this.buscarUser(user);
        if (result != null) {
            System.out.println("O Usuario já está cadastrado!");
        } else {
            novo = new Info(user);
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
                System.out.println(aux.getInfoUsuarios());
                aux = aux.getProx();
            }
        }
    }

    public void removerUsuarioEspecifico(String cpf) {
        Usuario proc = new Usuario(cpf);
        Info atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfoUsuarios()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Usuario não encontrado!");
            }
        } else { 
            if (proc.compareTo(this.primeiro.getInfoUsuarios()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfoUsuarios().compareTo(proc) != 0) {
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