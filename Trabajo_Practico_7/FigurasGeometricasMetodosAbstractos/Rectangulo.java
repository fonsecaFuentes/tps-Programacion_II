
package figurasgeometricasmetodosabstractos;

public class Rectangulo extends Figura {
    // Atributos
    private final double base;
    private final double altura;
    
    // Constructor
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Metodos
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
