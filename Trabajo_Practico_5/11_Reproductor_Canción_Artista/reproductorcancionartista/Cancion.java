
package reproductorcancionartista;

public class Cancion {
    // Atributos
    private final String titulo;
    private Artista artista; // Asociacion 1:1
    
    // Constructor
    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    // Metodos
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    public String mostrarArtista() {
        String infoNombreArtista = "Nombre del Artista...(Sin Datos)";
        String infoGeneroArtista = "Genero...(Sin Datos)";
        if (artista != null) {
            infoNombreArtista = artista.infoNombreArtista();
            infoGeneroArtista = artista.infoGeneroArtista();
        }
        return infoNombreArtista + "\n" + infoGeneroArtista;
    }
    
    public String mostrarCancion() {
        return titulo;
    }
}
