
package editorvideoproyectorender;

public class Proyecto {
    // Atributos
    private final String nombre;
    private final int duracionMin;
    
    // Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    // Metodos
    @Override
    public String toString() {
        return "Nombre de Proyecto: " + nombre + "\nDuración Minutos: " + duracionMin;
    }
}
