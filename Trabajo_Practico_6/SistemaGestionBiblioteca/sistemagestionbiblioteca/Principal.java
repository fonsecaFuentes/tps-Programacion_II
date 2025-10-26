
package sistemagestionbiblioteca;

public class Principal {

    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // Crear autores
        Autor autor1 = new Autor("001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("002", "Jorge Luis Borges", "Argentino");
        
        // Agregar libros
        biblioteca.agregarLibro("978-1234", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-5678", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("978-9012", "Ficciones", 1944, autor2);
        
        // Listar todos los libros
        biblioteca.listarLibros();
        
        // Buscar un libro
        Libro libro = biblioteca.buscarLibroPorIsbn("978-1234");
        if (libro != null) {
            System.out.println("\nLibro encontrado:");
            libro.mostrarInfo();
        }
        
        // Eliminar un libro
        Libro libroEliminado = biblioteca.eliminarLibro("978-5678");
        System.out.println("\nSe elimino el libro:\n" + libroEliminado + "\n");
        biblioteca.listarLibros();
        
        // Mostrar cantidad
        System.out.println("\nTotal de libros: " + biblioteca.obtenerCantidadLibros());
        
        // Filtrar por año
        biblioteca.filtrarLibrosPorAnio(1949);
        
        // Mostrar autores
        biblioteca.mostrarAutoresDisponibles();
    }
    
}
