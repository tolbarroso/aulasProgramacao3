public abstract class Funcionario {
    protected String matricula;
    protected String nome;
    protected double salario;
    protected DadosBancarios dadoBancario;

    public Funcionario(String matricula, String nome, double salario, DadosBancarios dadoBancario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.dadoBancario = dadoBancario;
    }

    public Funcionario(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public DadosBancarios getDadoBancario() {
        return dadoBancario;
    }

    public void setDadoBancario(DadosBancarios dadoBancario) {
        this.dadoBancario = dadoBancario;
    }
    
}