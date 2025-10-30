
package figurasgeometricasmetodosabstractos;

public class Circulo extends Figura{
    // Atributos
    private final double radio;
    
    // Constructor
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Metodos
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
