
package animalescomportamientosobrescrito;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Animal> animales =  new ArrayList<>();
        
        // perros
        animales.add(new Perro("Max", 3, "Labrador"));
        animales.add(new Perro("Luna", 2, "Pastor Alemán"));
        // gatos
        animales.add(new Gato("Michi", 4, "Naranja"));
        animales.add(new Gato("Pelusa", 1, "Blanco"));
        // vacas
        animales.add(new Vaca("Lola", 5, 700));
        animales.add(new Vaca("Margarita", 6, 584.74));
        
        // Mostrar información
        for (Animal a : animales) {
            System.out.println("--------------------------------------");
            a.hacerSonido();
            System.out.println("");
            a.describirAnimal();
        }
    }
    
}
