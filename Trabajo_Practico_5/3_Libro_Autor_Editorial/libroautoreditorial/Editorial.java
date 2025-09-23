
package libroautoreditorial;

public class Editorial {
    // Atributos
    private final String nombre;
    private final String direccion;
    
    // Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    // Metodos
    public String mostrarEditorial() {
        return "Datos de la Editorial...\nEditorial: " + nombre + "\nDirección: " + direccion;
    }
}
