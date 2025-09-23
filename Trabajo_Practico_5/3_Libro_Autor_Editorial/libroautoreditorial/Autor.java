
package libroautoreditorial;

public class Autor {
    // Atributos
    private final String nombre;
    private final String nacionalidad;
    
    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Metodos
    public String mostrarAutor() {
        return "Datos del Autor...\nNombre: " + nombre + "\nNacionalidad: " + nacionalidad;
    }
}
