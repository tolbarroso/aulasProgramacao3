public class ListCompra<T extends Comparable<T>> {
    private Info<T> primeiro;
    private Info<T> ultimo;
    private int qtd;
    
    public boolean isEmpty(){
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void exibirTodos () {
        Info<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfoCompra());
                aux = aux.getProx();
            }
        }       
    }   
}