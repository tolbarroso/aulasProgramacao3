public class Estoque implements Comparable<Estoque> {
    private String nomeDoProduto;
    private String codigoDoProduto;
    private double valorProduto;
    private double novoValor;

    public Estoque(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public Estoque(String nomeDoProduto, String codigoDoProduto, double valorProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.codigoDoProduto = codigoDoProduto;
        this.valorProduto = valorProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    @Override
    public int compareTo(Estoque pr) {
        int result;
        result = this.getCodigoDoProduto().compareTo(pr.getCodigoDoProduto());
        return result;
    }

    @Override
    public String toString() {
        return "CÓDIGO: " + this.codigoDoProduto + " PRODUTO: " + this.nomeDoProduto + " PREÇO: " + this.valorProduto;
    }
}