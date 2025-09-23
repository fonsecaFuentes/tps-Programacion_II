
package documentofirmadigitalusuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FirmaDigital {
    // Atributos
    private final String codigoHash;
    private final LocalDate fecha;
    private final Usuario usuario; // Agregacion
    
    // Constructor
    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    // Metodos
    public String resumen() {
        String infoUsuario = "(sin usuario)";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (usuario != null) {
            infoUsuario = usuario.mostrarDatosUsuario();
        }
        return "Firma: " + codigoHash + " — " + fecha.format(f) + "\n" + "Usuario: " + infoUsuario;
    }
  
    public void imprimirResumen() {
        System.out.println(resumen());
    }
}
