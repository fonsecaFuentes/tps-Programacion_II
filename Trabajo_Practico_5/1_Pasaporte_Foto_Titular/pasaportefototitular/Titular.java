
package pasaportefototitular;

public class Titular {
    // Atributos
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte; // Referencia al pasaporte asociado
    
    // Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Metodos
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public String mostrarDatosTitular() {
        String infoPasaporte = "Sin pasaporte";
        if (pasaporte != null) {
            infoPasaporte = pasaporte.mostrarDatosPasaporte();
        }
        return "Titular: " + nombre + "\nDNI: " + dni +
               ".\nSu " + infoPasaporte;
    }

}
