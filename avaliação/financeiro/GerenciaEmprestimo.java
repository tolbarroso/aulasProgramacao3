package financeiro;

import view.Info;

public class GerenciaEmprestimo {
    private Info primeiro;
    
    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    private Info buscarEmp(Emprestimo emp) {
        Info aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfoEmprestimo().compareTo(emp) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirEmprestimo (Emprestimo emp) {
        Info novo, aux;
        Info result = this.buscarEmp(emp);
        if (result != null) {
            System.out.println("Emprestimo já realizado!");
        } else {
            novo = new Info(emp);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Emprestimo concluído!");
        }
    }

    public void exibir() {
        Info aux;
        if (this.isEmpty() == true) {
            System.out.println("Nenhum emprestimo realizado!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfoEmprestimo());
                aux = aux.getProx();
            }
        }
    }

    public void removerEmprestimoEspecifico(String cod) {
        Emprestimo proc = new Emprestimo(cod);
        Info atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Nenhum emprestimo realizado!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfoEmprestimo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Transição não encontrada!");
            }
        } else { 
            if (proc.compareTo(this.primeiro.getInfoEmprestimo()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfoEmprestimo().compareTo(proc) != 0) {
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