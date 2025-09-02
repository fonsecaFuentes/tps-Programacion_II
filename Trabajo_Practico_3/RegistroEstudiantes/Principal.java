package registroestudiantes;

public class Principal {

    public static void main(String[] args) {
        Estudiante nuevoEstudiante = new Estudiante();
        
        nuevoEstudiante.setNombre("Wilson");
        nuevoEstudiante.setApellido("Fonseca");
        nuevoEstudiante.setCurso("9C");
        nuevoEstudiante.setCalificacion(10);
        
        nuevoEstudiante.mostrarInfo();
        nuevoEstudiante.subirCalificacion(10);
        nuevoEstudiante.mostrarInfo();
        nuevoEstudiante.bajarCalificacion(5);
        nuevoEstudiante.mostrarInfo();
        nuevoEstudiante.bajarCalificacion(11);
        nuevoEstudiante.mostrarInfo();
    }
    
}
