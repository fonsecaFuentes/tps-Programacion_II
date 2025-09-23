
package documentofirmadigitalusuario;

import java.time.LocalDate;

public class Documento {
    // Atributos
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firmaDigital; // Composición 1:1
    
    // Constructor
    public Documento(String titulo, String contenido, String codigoHash, LocalDate fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    // Metodos
    public String resumen() {
        return "Documento: «" + titulo + "»\n" + "Contenido: " + contenido + "\n\n" + firmaDigital.resumen();
    }
    
    public void imprimirResumen() {
        System.out.println(resumen());
    }
}
