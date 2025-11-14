
package sistemaecommerce;

public class Producto implements Pagable {
    // Atributos
    private final String nombre;
    private final double precio;
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Metodos
    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
    
    // Implementación de la interfaz Pagable
    @Override
    public double calcularTotal() {
        return precio;
    }
}
