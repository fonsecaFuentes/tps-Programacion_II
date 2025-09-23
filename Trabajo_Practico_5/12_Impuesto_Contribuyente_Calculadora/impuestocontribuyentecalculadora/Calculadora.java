
package impuestocontribuyentecalculadora;

public class Calculadora {
    // Atributos
    // Constructor
    // Metodos
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Monto a deber...\n$ " + impuesto.getMonto());
        } else {
            System.out.println("No hay impuesto a deber...");
        }
        
    }
}
