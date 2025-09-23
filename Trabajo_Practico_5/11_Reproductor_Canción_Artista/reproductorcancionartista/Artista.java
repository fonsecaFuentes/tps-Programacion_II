
package reproductorcancionartista;

public class Artista {
    // Atributos
    private final String nombre;
    private final String genero;
    
    // Constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Metodos
    public String infoNombreArtista() {
        return "\nNombre de Artista: " + nombre;
    }
    
    public String infoGeneroArtista() {
        return "\nGenero del Artista: " + genero;
    }
}
