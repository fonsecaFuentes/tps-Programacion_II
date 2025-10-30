
package figurasgeometricasmetodosabstractos;

public abstract class Figura {
    // Atributos
    private final String nombre;
    
    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public abstract double calcularArea();
}
