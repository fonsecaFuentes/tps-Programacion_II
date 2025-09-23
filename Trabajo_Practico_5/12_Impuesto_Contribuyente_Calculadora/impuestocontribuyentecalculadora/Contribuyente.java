
package impuestocontribuyentecalculadora;

public class Contribuyente {
    // Atributos
    private final String nombre;
    private final String cuil;
    
    // Constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    
    // Metodos
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCuil: " + cuil;
    }
    
}
