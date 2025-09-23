
package citamedicapacienteprofesional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CitaMedica {
    // Atributos
    private final LocalDate fecha;
    private final LocalTime hora;
    private Paciente paciente; // Asociacion 1:1
    private Profesional profesional; // Asociacion 1:1
    
    // Constructor
    public CitaMedica(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    // Metodos
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    private String resumenCitaMedica() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm");
        
        String infoPaciente = "(Sin informacion de Paciente...)";
        String infoProfesional = "(Sin informacion del Profesional...)"; 
        
        if (paciente != null) {
            infoPaciente = paciente.toString();
        }
        if (profesional != null) {
            infoProfesional = profesional.toString();
        }
        
        return "\nTurno...\nFecha: " + fecha.format(f) + "\nHora: " + hora.format(h) + "\n" + infoPaciente + "\n" + infoProfesional;
    }
    
    public void imprimirResumen() {
        System.out.println(resumenCitaMedica());
    }
    
}
