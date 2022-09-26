public class SysGen {

    public static void main(String[] args) {
        Professor prof1 = new Professor("575", "Xavier");
        SalarioProfessor salarioProf = new SalarioProfessor();
        prof1.setSalario(600);
        salarioProf.calcularSalario(prof1.getSalario());

        Servidor serv1 = new Servidor("57", "Maria");
        SalarioServidor salarioServ = new SalarioServidor();
        serv1.setSalario(500);
        salarioServ.calcularSalario(serv1.getSalario());
    }
}