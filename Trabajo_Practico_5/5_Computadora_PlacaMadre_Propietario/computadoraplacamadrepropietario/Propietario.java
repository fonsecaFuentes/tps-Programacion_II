
package computadoraplacamadrepropietario;

public class Propietario {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String dni;
    private Computadora computadora;
    
    // Constructor
    public Propietario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    // Metodos
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    public Computadora getComputadora() {
        return computadora;
    }
    
    public String presentacion() {
        return nombre + " " + apellido + " (DNI " + dni + ")";
    }

    public String resumen() {
        String infoPC = "(sin computadora)";
        if (computadora != null) {
            infoPC = computadora.resumen();
        }
        return "Propietario: " + presentacion() + "\n" + infoPC;
    }
    
    public void imprimirResumen() {
        System.out.println(resumen());
    }
}
