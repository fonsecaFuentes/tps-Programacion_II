
package citamedicapacienteprofesional;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 10, 24);
        LocalTime hora = LocalTime.of(15, 30);
        
        LocalDate fecha2 = LocalDate.of(2025, 11, 21);
        LocalTime hora2 = LocalTime.of(16, 20);
        
        LocalDate fecha3 = LocalDate.of(2025, 10, 15);
        LocalTime hora3 = LocalTime.of(18, 20);
        
        Paciente paciente = new Paciente("Sofía", "Benítez", "PAMI");
        Paciente paciente12 = new Paciente("Matías", "Castro", "OSDE");
        
        Profesional profesional = new Profesional("Elena", "Ramírez", "Cardióloga");
        Profesional profesional2 = new Profesional("Javier", "Soto", "Pediatra");
        
        CitaMedica turno = new CitaMedica(fecha, hora);
        
        CitaMedica turno2 = new CitaMedica(fecha2, hora2);
        CitaMedica turno3 = new CitaMedica(fecha3, hora3);
        
        turno.setPaciente(paciente);
        turno.setProfesional(profesional);
        turno.imprimirResumen();
        System.out.println("");
        
        turno2.setPaciente(paciente12);
        turno2.imprimirResumen();
        System.out.println("");
        
        turno3.setProfesional(profesional2);
        turno3.imprimirResumen();
    }
    
}
