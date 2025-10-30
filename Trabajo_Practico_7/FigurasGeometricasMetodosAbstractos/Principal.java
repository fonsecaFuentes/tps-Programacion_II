
package figurasgeometricasmetodosabstractos;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Rectangulo(2, 2, "Rectángulo"));
        figuras.add(new Circulo(1, "Círculo"));
        figuras.add(new Rectangulo(1, 2, "Rectángulo"));
        figuras.add(new Circulo(2, "Círculo"));
        
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }
    }
    
}
