
package sistemaacademico;

public class Principal {

    public static void main(String[] args) {
        // 1. Crear universidad
        Universidad uni = new Universidad("Universidad Nacional");
        
        // 2. Crear 3 profesores
        Profesor p1 = new Profesor("P001", "Dr. Juan Pérez", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Dra. María García", "Física");
        Profesor p3 = new Profesor("P003", "Ing. Carlos López", "Informática");
        
        // 3. Crear 5 cursos
        Curso c1 = new Curso("MAT101", "Cálculo I");
        Curso c2 = new Curso("MAT102", "Álgebra Lineal");
        Curso c3 = new Curso("FIS101", "Física I");
        Curso c4 = new Curso("INF101", "Programación I");
        Curso c5 = new Curso("INF102", "Estructuras de Datos");
        
        // 4. Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        
        // 5. Asignar profesores a cursos
        System.out.println("\n--- ASIGNACIONES ---");
        uni.asignarProfesorACurso("MAT101", "P001");
        uni.asignarProfesorACurso("MAT102", "P001");
        uni.asignarProfesorACurso("FIS101", "P002");
        uni.asignarProfesorACurso("INF101", "P003");
        uni.asignarProfesorACurso("INF102", "P003");
        
        // 6. Listar todo
        uni.listarProfesores();
        uni.listarCursos();
        
        // 7. Cambiar profesor de un curso
        System.out.println("\n--- CAMBIO DE PROFESOR ---");
        uni.asignarProfesorACurso("MAT102", "P003");
        
        // Verificar sincronización
        System.out.println("\nCursos de Dr. Juan Pérez:");
        p1.listarCursos();
        
        System.out.println("\nCursos de Ing. Carlos López:");
        p3.listarCursos();
        
        // 8. Eliminar un curso
        System.out.println("\n--- ELIMINACIÓN DE CURSO ---");
        uni.eliminarCurso("INF101");
        
        System.out.println("\nCursos de Ing. Carlos López:");
        p3.listarCursos();
        
        // 9. Eliminar un profesor
        System.out.println("\n--- ELIMINACIÓN DE PROFESOR ---");
        uni.eliminarProfesor("P002");
        
        System.out.println("\nEstado del curso FIS101:");
        c3.mostrarInfo();
    }
    
}
