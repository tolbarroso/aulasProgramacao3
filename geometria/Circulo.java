public class Circulo extends FormaGeometrica {
    private double raio; 

    public Circulo(double raio){
        this.raio = raio;
    }

    public Circulo(){
        
    }
   
    @Override
    public double calculaArea() {
        
        return Math.PI*Math.pow(this.raio,2);
    }

    @Override
    public double calculaPerimetro() {
        return (2*Math.PI) * this.raio;
    }
}