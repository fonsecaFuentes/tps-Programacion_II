
package sistemagestionbiblioteca;

public class Libro {
    // Atributos
    private final String isbn;
    private final String titulo;
    private final int anioPublicacion;
    private final Autor autor;
    
    // Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    // Metodos
    public void mostrarInfo() {
        System.out.println("""
                           ----------------------------
                           Isbn del Libro: """ + isbn +
                "\nTitulo: " + titulo +
                "\nAño de Publicacion: $ " + anioPublicacion +
                "\nAutor: $ " + obtenerNombreAutor());
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
     
    @Override
    public String toString() {
        return """
                ----------------------------
                Isbn del Libro: """ + isbn +
                "\nTitulo: " + titulo +
                "\nAño de Publicacion: $ " + anioPublicacion +
                "\nAutor: $ " + obtenerNombreAutor();
    }
    
    private String obtenerNombreAutor() {
        String nombreAutor = "Autor desconocido";
        if (autor != null) {
            nombreAutor = autor.getNombre();
        }
        return nombreAutor;
    }
}
