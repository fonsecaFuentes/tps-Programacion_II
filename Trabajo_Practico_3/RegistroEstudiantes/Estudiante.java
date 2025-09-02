package registroestudiantes;

public class Estudiante {
    // Atributos 
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Métodos de acceso (setters)
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            nombre = nuevoNombre;
        }
    }
    
    public void setApellido(String nuevoApellido) {
        if (nuevoApellido != null) {
            apellido = nuevoApellido;
        }
    }
    
    public void setCurso(String nuevoCurso) {
        if (nuevoCurso != null) {
            curso = nuevoCurso;
        }
    }
    
    public void setCalificacion(double nuevaCalificacion) {
        if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
            calificacion = nuevaCalificacion;
        }
    }
    
    // Métodos de comportamiento
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion -= puntos;
            if (calificacion < 0) {
                calificacion = 0;
            }
        }
    }
    
    public void subirCalificacion(double puntos)  {
        if (puntos > 0) {
            calificacion += puntos;
            if (calificacion > 10) {
                calificacion = 10;
            }
        }
    }
}
