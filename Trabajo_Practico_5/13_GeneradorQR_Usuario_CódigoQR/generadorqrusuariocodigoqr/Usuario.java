
package generadorqrusuariocodigoqr;

public class Usuario {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String email;
    
    // Constructor
    public Usuario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    // Metodos
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEmail: " + email;
    }
}
