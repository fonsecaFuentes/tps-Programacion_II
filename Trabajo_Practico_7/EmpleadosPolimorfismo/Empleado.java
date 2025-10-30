
package empleadospolimorfismo;

public abstract class Empleado {
    // Atributos
    private final String nombre;
    
    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSueldo();
}
