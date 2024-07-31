public class AreaCirculo {
    private final double NUMERO_PI = 3.1416; //constantes o nome precisa ser maiusculo
    private double raio;

    public double calcularArea(){
        return NUMERO_PI*raio*raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio; 
    }
    
}
