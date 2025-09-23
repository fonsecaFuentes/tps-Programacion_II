
package libroautoreditorial;

public class Libro {
    // Atributos
    private final String titulo;
    private final String isbn;
    private Autor autor; // Asociacion unidireccional
    private Editorial editorial; // Agregación
    
    // Constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    // Metodos
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public String identificarAutor() {
        String infoAutor = "Sin datos del autor...";
        if (autor != null) {
            infoAutor = autor.mostrarAutor();
        }
        return infoAutor;
    }
    
    public String identificarEditorial() {
        String infoEditorial = "Sin datos de la editorial...";
        if (editorial != null) {
            infoEditorial = editorial.mostrarEditorial();
        }
        return infoEditorial;
    }
    
    public void mostrarDatos() {
        System.out.println("Datos del libro\nLibro: " + titulo + "\nISBN: " + isbn);
        System.out.println();
        System.out.println(identificarAutor());
        System.out.println();
        System.out.println(identificarEditorial());
    }
}
