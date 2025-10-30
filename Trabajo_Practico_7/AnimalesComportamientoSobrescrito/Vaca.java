
package animalescomportamientosobrescrito;

public class Vaca extends Animal {
    // Atributos
    private double peso;
    
    // Constructor
    public Vaca(String nombre, int edad, double peso) {
        super(edad, nombre);
        this.peso = peso;
    }
    
    // Metodos
    @Override
    public void hacerSonido() {
        System.out.println("La vaca con nombre: " + getNombre() + " dice... ¡Muuuu muuuu!");
    }
    
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Peso de la vaca: " + peso + " kg");
        System.out.println("Tipo: Vaca");
    }
}
