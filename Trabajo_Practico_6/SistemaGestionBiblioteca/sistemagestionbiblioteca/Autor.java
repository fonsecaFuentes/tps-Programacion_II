
package sistemagestionbiblioteca;

public class Autor {
    // Atributos
    private final String id;
    private final String nombre;
    private final String nacionalidad;
    
    // Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Metodos
    public void mostrarInfo() {
        System.out.println("""
                           ----------------------------
                           ID del Autor: """ + id +
                "\nNombre del Autor: " + nombre +
                "\nNacionalidad del Autor: $ " + nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Libro{" +
           "ID = '" + id + '\'' +
           ", Nombre = '" + nombre + '\'' +
           ", Nacionalidad = " + nacionalidad +
           '}';
    }
    
    
}
