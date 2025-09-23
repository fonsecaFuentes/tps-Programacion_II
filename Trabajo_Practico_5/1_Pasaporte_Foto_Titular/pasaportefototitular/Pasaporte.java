
package pasaportefototitular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pasaporte {
    // Atributos
    private final String numero;
    private final LocalDate fechaEmision;
    private final Foto foto; // Composición 1:1
    private Titular titular; // Asociacion 1:1
    
    // Constructor
    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        foto = new Foto(imagen, formato);
    }
    
    // Metodos
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public String mostrarDatosPasaporte() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Pasaporte número: " + numero +
               "\nFecha de emision: " + fechaEmision.format(f) +
               "\nDatos de foto:\n" + foto.mostrarDatosFoto();
    }
}
