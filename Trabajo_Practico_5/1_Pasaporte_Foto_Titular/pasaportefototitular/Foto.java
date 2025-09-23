
package pasaportefototitular;

public class Foto {
    // Atributos
    private final String imagen;
    private final String formato;
    
    // Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato =  formato;
    }
    
    // Metodo
    public String mostrarDatosFoto() {
        return "Formato: " + formato + "\nUrl de la imagen: " + imagen;
    }
    
    
}
