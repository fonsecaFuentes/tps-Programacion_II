
package vehiculomotorconductor;

public class Conductor {
    // Atributos
    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo;
    
    // Constructor
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    // Metodos
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    
    public String infoConductor() {
        return "Nombre: " + nombre + "\nLicencia: " + licencia;
    }
}
