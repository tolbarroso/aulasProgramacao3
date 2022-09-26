public class ProdutoInternacional extends Estoque{
    public ProdutoInternacional(String nomeDoProduto, String codigoDoProduto, double valorProduto) {
        super(nomeDoProduto, codigoDoProduto, valorProduto);
    }

    public ProdutoInternacional(String codigoDoProduto) {
        super(codigoDoProduto);
    }

    public double calcularValorI(double valorProduto){
        return valorProduto + ((30 * valorProduto)/ 100);
    }
}