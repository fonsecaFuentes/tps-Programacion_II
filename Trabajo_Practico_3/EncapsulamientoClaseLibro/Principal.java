
package encapsulamientoclaselibro;

public class Principal {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        libro1.setTitulo("Marte Rojo");
        libro1.setAutor("Kim Stanley Robinson");
        libro1.setAnioPublicacion(-155);
        libro1.setAnioPublicacion(2030);
        libro1.setAnioPublicacion(1992);
        
        // Uso de getters
        System.out.println("\nInformacion del libro(Uso de getters):");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio de publicacion: " + libro1.getAnioPublicacion());
        
        // Uso de mostrarInfo()
        System.out.println("\nInformacion del libro(Uso de mostrarInfo()):");
        libro1.mostrarInfo();
    }
    
}
