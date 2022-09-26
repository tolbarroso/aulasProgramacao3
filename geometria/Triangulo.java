public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
        
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }
    
    @Override
    public double calculaPerimetro() {
        //assumindo que o triângulo é equilatero.
        return 3 * this.base;
    }
}