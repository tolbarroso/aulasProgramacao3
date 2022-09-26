public class SalarioServidor implements ISalario {
    @Override
    public double calcularSalario(double salarioBase){
        return salarioBase + (salarioBase / 2);
    }
}