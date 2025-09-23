
package reproductorcancionartista;

public class Reproductor {
    // Atributos
    private boolean estaEncendido;
    
    // Constructor
    // Metodos
    public void encender() {
        estaEncendido = true;
    }
    
    public void apagar() {
        estaEncendido = false;
    }
    
    public boolean estaEncendido() {
        return estaEncendido;
    }
    
    public void reproducir(Cancion cancion) {
        if (estaEncendido) {
            System.out.println("Reproduciendo.Canción...." + cancion.mostrarCancion() + "!!!");
            System.out.println(cancion.mostrarArtista());
        } else {
            System.out.println("Reproductor apagado!!!!");
        }
    }
}
