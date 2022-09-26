public class Info <T extends Comparable<T>> {
    private Cliente infoCliente;
    private Estoque infoProduto;
    private Compra infoCompra;
    private T info;
    private Info<T> prox; 

    public Info(Cliente valorC) {
        this.infoCliente = valorC;
    }

    public Info(Estoque valorP) {
        this.infoProduto = valorP;
    }

    public Cliente getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(Cliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    public Compra getInfoCrompra() {
        return infoCompra;
    }

    public void setInfoCompra(Compra infoCompra) {
        this.infoCompra = infoCompra;
    }

    public Estoque getInfoProduto() {
        return infoProduto;
    }

    public void setInfoProduto(Estoque infoProduto) {
        this.infoProduto = infoProduto;
    }

    public void setProx(Info<T> prox) {
        this.prox = prox;
    }

    public Info<T> getProx() {
        return this.prox;
    }
}