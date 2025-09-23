
package citamedicapacienteprofesional;

public class Profesional {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String especialidad;
    
    // Constructor
    public Profesional(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    // Metodos
    @Override
    public String toString() {
        return "\nProfesional...\nNombre: " + nombre + "\nApellido: " + apellido + "\nEspecialidad: " + especialidad;
    }
}
