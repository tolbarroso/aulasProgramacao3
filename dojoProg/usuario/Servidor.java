public class Servidor extends Funcionario {
    private String setor;
    
    public Servidor(String matricula, String nome, String setor){
        this.matricula = matricula;
        this.nome = nome;
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
