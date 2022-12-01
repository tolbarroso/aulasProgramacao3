package banco;

public class Conta {
    //Atributos 
    private String nomeTitular;
    private String numeroConta;
    private double saldo;
    private AccountType tipoDeConta;
 
    //Construtor
    public Conta(String nomeTitular, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.tipoDeConta = tipoDeConta;
    }

    //Getters e Setters
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valorInserido){
        this.saldo += valorInserido;

    }
    
    public void sacar(double valorRetirado){
        if(saldo>= valorRetirado){
            this.saldo -= valorRetirado;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
