public class Quadrado extends FormaGeometrica {
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }

    public Quadrado(){
        
    }

    @Override
    public double calculaArea() {
        
        return this.lado * this.lado;
    }
    
    @Override
    public double calculaPerimetro() {
        
        return 4 * this.lado;
    }
}