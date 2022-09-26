public class ListCliente {
    private Info primeiro;
    
    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    private Info buscar(Cliente cl) {
        Info aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfoCliente().compareTo(cl) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirCliente (Cliente cl) {
        Info novo, aux;
        Info result = this.buscar(cl);
        if (result != null) {
            System.out.println("O cliente já está cadastrado!");
        } else {
            novo = new Info(cl);
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
                System.out.println(aux.getInfoCliente());
                aux = aux.getProx();
            }
        }
    }

}