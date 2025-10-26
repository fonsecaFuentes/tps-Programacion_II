
package sistemagestionbiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    private final String nombre;
    private final ArrayList<Libro> libros;
    
    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // Metodos
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Verificar que no exista un libro con el mismo ISBN
        if (buscarLibroPorIsbn(isbn) == null) {
            Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
            // Agregarlo a la lista
            libros.add(nuevoLibro);
            System.out.println("Libro agregado exitosamente: " + titulo);
        } else {
            System.out.println("Error: Ya existe un libro con ISBN " + isbn);
        }
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca");
        } else {
            System.out.println("=== Libros en " + nombre + " ===");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        Libro libroEncontrado = null;
        while (i < libros.size() && !this.libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {            
            i++;
        }
        if (i < libros.size()) {
            libroEncontrado = this.libros.get(i);
        }
        return libroEncontrado;
    }
    
    public Libro eliminarLibro(String isbn) {
        Libro libroAeliminar = buscarLibroPorIsbn(isbn);
        if (libroAeliminar != null) {
            this.libros.remove(libroAeliminar);
        }
        return libroAeliminar;
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("=== Libros publicados en " + anio + " ===");
        boolean encontrado = false;
        
        for (Libro l : libros) {
            int anioPuiblic = l.getAnioPublicacion();
            if (anioPuiblic == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron libros de ese año");
        }
    }
    
    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
             System.out.println("No hay autores disponibles");
        } else {
             System.out.println("=== Autores disponibles en " + nombre + " ===");
             ArrayList<String> autoresMostrados = new ArrayList<>();
             
             for (Libro libro : libros) {
                 if (libro.getAutor() != null) {
                     String idAutor = libro.getAutor().getId();
                     if (!autoresMostrados.contains(idAutor)) {
                         libro.getAutor().mostrarInfo();
                         autoresMostrados.add(idAutor);
                     }
                 }
            }
        }
    }
}
