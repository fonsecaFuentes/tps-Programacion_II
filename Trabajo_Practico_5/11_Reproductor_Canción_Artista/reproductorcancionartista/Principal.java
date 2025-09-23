
package reproductorcancionartista;

public class Principal {

    public static void main(String[] args) {
        Artista artista = new Artista("Metallica", "Heavy Metal");
        Cancion cancion = new Cancion("Fade To Black");
        Reproductor reproductor = new Reproductor();
        
        cancion.setArtista(artista);
        
        reproductor.encender();
        reproductor.reproducir(cancion);
    }
    
}
