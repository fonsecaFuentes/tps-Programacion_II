
package sistemaacademico;

import java.util.ArrayList;

public class Universidad {
    // Atributos
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    // Metodos
    // Métodos de gestión de profesores
    public void agregarProfesor(Profesor p) {
        if (p != null && buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        } else {
            System.out.println("Error: Profesor ya existe o es nulo");
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        Profesor profEncontrado = null;
        int i = 0;
        while (i < profesores.size() && !this.profesores.get(i).getId().equalsIgnoreCase(id)) {            
            i++;
        }
        if (i < profesores.size()) {
            profEncontrado = this.profesores.get(i);
        }
        return profEncontrado;
    }
    
    public Profesor eliminarProfesor(String id) {
        Profesor profAEliminar = buscarProfesorPorId(id);
        ArrayList<Curso> cursosDelProfesor = new ArrayList<>();
        cursosDelProfesor.addAll(profAEliminar.getCursos());
        for (Curso curso : cursosDelProfesor) {
            curso.setProfesor(null);
        }
        profesores.remove(profAEliminar);
        return profAEliminar;
    }
    
    public void listarProfesores() {
        if(profesores.isEmpty()){
            System.out.println("No hay profesores registrados");
        } else {
            System.out.println("\n=== PROFESORES DE " + nombre.toUpperCase() + " ===");
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    }
    
    // Métodos de gestión de cursos
    public void agregarCurso(Curso c) {
        if (c != null && buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        } else {
            System.out.println("Error: Curso ya existe o es nulo");
        }
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        int i = 0;
        while (i < cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {            
            i++;
        }
        if (i < cursos.size()) {
            cursoEncontrado = this.cursos.get(i);
        }
        return cursoEncontrado;
    }
    
    public Curso eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar.getProfesor() != null) {
            cursoAEliminar.setProfesor(null);
        }
        cursos.remove(cursoAEliminar);
        return cursoAEliminar;
    }
    
    public void listarCursos() {
        if(cursos.isEmpty()){
            System.out.println("No hay cursos registrados");
        } else {
            System.out.println("\n=== CURSOS DE " + nombre.toUpperCase() + " ===");
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }
    
    // Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null) {
            System.out.println("Error: Curso no encontrado");
        }
        if (p == null) {
            System.out.println("Error: Profesor no encontrado");
        } else {
            c.setProfesor(p);
            System.out.println("Asignado: " + p.getNombre() + " → " + c.getNombre());
        }
    }
}
