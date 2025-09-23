
package citamedicapacienteprofesional;

public class Paciente {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String obraSocial;
    
    // Constructor
    public Paciente(String nombre, String apellido, String obraSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.obraSocial = obraSocial;
    }

    // Metodos
    @Override
    public String toString() {
        return "\nPaciente...\nNombre: " + nombre + "\nApellido: " + apellido +"\nObra Social: " + obraSocial;
    }
    
}
