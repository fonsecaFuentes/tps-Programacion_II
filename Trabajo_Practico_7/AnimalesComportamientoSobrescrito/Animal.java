
package animalescomportamientosobrescrito;

public class Animal {
    // Atributos
    private final int edad;
    private final String nombre;
    
    // Constructor
     public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    // Metodos
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void describirAnimal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public String getNombre() {
        return nombre;
    }
}
