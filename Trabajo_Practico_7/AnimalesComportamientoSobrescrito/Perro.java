
package animalescomportamientosobrescrito;

public class Perro extends Animal {
    // Atributos
    private String raza;
    
    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(edad, nombre);
        this.raza = raza;
    }

    // Metodos
    @Override
    public void hacerSonido() {
        System.out.println("El perro con nombre: " + getNombre() + " dice... ¡Guau guau!");
    }

    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Raza: " + raza);
        System.out.println("Tipo: Perro");
    }
}
