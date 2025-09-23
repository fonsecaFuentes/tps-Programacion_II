
package reservaclientemesa;

public class Cliente {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String telefono;
    
    // Constructor
    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    // Metodos
    public String datosCliente() {
        return "\nCliente: " + nombre + " " + apellido +
                "\nTeléfono: " + telefono;
    }
}
