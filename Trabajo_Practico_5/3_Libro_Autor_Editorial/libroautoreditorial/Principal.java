
package libroautoreditorial;

public class Principal {

    public static void main(String[] args) {
        Editorial editorial = new Editorial("Planeta", "C/ Fantasía 123");
        Autor autor = new Autor("George Martin", "EE.UU.");
        Libro libro = new Libro("Juegos de Tronos", "978-84-376-2157-3", editorial);
        Libro libro2 = new Libro("El problema de los tres cuerpos", "978-3-16-148410-0", null);
        
        libro.setAutor(autor);
        libro.mostrarDatos();
        System.out.println("");
        libro2.mostrarDatos();
    }
    
}
