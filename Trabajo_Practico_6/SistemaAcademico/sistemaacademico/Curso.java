
package sistemaacademico;

public class Curso {
    // Atributos
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    // Metodos
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) {
            return;
        }
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = profesor;
        
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("""
                           ----------------------------
                           Código del curso: """ + codigo +
                "\nNombre del curso: " + nombre +
                "\nProfesor a cargo del curso: " + obtenerNomProfesor());
    }
    
    private String obtenerNomProfesor() {
        String nombreProf = "Desconocido...";
        if (profesor != null) {
            nombreProf = profesor.getNombre();
        }
        return nombreProf;
    }
}
