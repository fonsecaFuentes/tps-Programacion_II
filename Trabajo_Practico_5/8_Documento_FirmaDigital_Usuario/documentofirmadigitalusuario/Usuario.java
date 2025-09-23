
package documentofirmadigitalusuario;

public class Usuario {
    // Atributos
    private final String nombre;
    private final String email;
    
    // Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Metodos
    public String mostrarDatosUsuario() {
        return nombre + " <" + email + ">";
    }
}
