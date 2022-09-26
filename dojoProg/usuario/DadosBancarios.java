public class DadosBancarios {
    private String agencia;
    private String conta;
    private Banco tipoDoBanco;

    public DadosBancarios(String agencia, String conta, Banco tipoDoBanco) {
        this.agencia = agencia;
        this.conta = conta;
        this.tipoDoBanco = tipoDoBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}