public class ListEstoque {
    private Info primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    private Info buscar(Estoque pr) {
        Info aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfoProduto().compareTo(pr) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirProduto (Estoque pr) {
        Info novo, aux;
        Info result = this.buscar(pr);
        if (result != null) {
            System.out.println("Produto já cadastrado!");
        } else {
            novo = new Info(pr);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Cadastro efetuado!");
        }
    }

    public void exibir() {
        Info aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfoProduto());
                aux = aux.getProx();
            }
        }
    }
}
