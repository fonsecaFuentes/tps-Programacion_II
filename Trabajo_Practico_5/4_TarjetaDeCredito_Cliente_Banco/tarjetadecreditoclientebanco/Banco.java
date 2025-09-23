
package tarjetadecreditoclientebanco;

public class Banco {
    // Atributos
    private final String nombre;
    private final String cuit;
    
    // Constructor
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    // Metodos
    public String datosDelBanco() {
        return "Nombre del Banco: " + nombre + "\nCuit: " + cuit;
    }
    
}
