
package encapsulamientoclaselibro;


public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // Setters
    public void setTitulo(String nuevoTitulo) {
        if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
            titulo = nuevoTitulo;
        }
    }
    
    public void setAutor(String nombre) {
        if (nombre != null && !nombre.isEmpty() ) {
            autor = nombre;
        }
    }
    
    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) {
            anioPublicacion = anio;
        } else {
            System.out.println("Anio invalido: " + anio);
        }
    }
    
    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + anioPublicacion);
    }
}
