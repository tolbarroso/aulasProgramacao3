public class ProdutoNacional extends Estoque{
    public ProdutoNacional(String nomeDoProduto, String codigoDoProduto, double valorProduto) {
        super(nomeDoProduto, codigoDoProduto, valorProduto);
    }
    
    public ProdutoNacional(String codigoDoProduto) {
        super(codigoDoProduto);
    }

    public double calcularValorN(double valorProduto){
        return valorProduto;
    }
}