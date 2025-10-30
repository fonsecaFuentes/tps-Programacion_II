
package animalescomportamientosobrescrito;

public class Gato extends Animal {
    // Atributos
    private final String colorPelaje;
    
    // Constructor
    public Gato(String nombre, int edad, String colorPelaje) {
        super(edad, nombre);
        this.colorPelaje = colorPelaje;
    }
    
    // Metodos
    @Override
    public void hacerSonido() {
        System.out.println("El gato con nombre: " + getNombre() + " dice... ¡Miau miau!");
    }
    
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Color de pelaje: " + colorPelaje);
        System.out.println("Tipo: Gato");
    }
    
}
