
package cuentabancariaclaveseguridadtitular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClaveSeguridad {
    // Atributos
    private final String codigo;
    private final LocalDate ultimaModificacion;
    
    // Constructor
    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    // Metodos
    public String codigo() {
        return "\nCódigo de Seguridad: " + codigo;
    }
    
    public String ultimaModificacion() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        return "\nÚltima Modificación del código de seguridad: " + ultimaModificacion.format(f);
    }
    
    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        return "\nClave de Seguridad...\nCódigo: " + codigo + "\nÚltima Modificación: " + ultimaModificacion.format(f);
    }
    
}
