public class Professor extends Funcionario{
    
    public Professor(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public Professor(String matricula, String nome, double salario, DadosBancarios dadoBancario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.dadoBancario = dadoBancario;
    }
}
