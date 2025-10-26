
package sistemaacademico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    // Atributos
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    // Metodos
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    
    public void agregarCurso(Curso curso) {
    if (curso != null && !cursos.contains(curso)) {
        cursos.add(curso);
        
        if (curso.getProfesor() != this) {
            curso.setProfesor(this);
        }
    }
}
    
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c) && c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta ningún curso.");
        } else {
            System.out.println("=== Cursos dictados por " + nombre + " ===");
            for (Curso curso : cursos) {
                System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println("""
                           ----------------------------
                           ID del Profesor: """ + id +
                           "\nNombre: " + nombre +
                           "\nEspecialidad: " + especialidad +
                           "\nCantidad de cursos: " + cursos.size());
    }
}
