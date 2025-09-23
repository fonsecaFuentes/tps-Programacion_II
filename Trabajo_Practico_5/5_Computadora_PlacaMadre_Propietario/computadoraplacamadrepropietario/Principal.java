
package computadoraplacamadrepropietario;

public class Principal {

    public static void main(String[] args) {
        Computadora lenovoPc = new Computadora("Lenovo", "LENOVO-T490-S6D3", "ATX", "Z790");
        Propietario wilson = new Propietario("Wilson", "Fonseca", "31317046");
        
        System.out.println("\n— Sin el propietario —");
        lenovoPc.imprimirResumen();
        
        System.out.println("\n— Con el propietario —");
        lenovoPc.setPropietario(wilson);

        lenovoPc.imprimirResumen();
        System.out.println("\n— Vista desde el propietario —");
        wilson.imprimirResumen();
    }
    
}
