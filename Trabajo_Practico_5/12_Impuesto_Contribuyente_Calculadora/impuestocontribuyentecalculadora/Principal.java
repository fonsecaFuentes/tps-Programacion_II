
package impuestocontribuyentecalculadora;

public class Principal {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Apolo", "20-33456789-3");
        Impuesto impuesto = new Impuesto(25456.33);
        Calculadora calculadora = new Calculadora();
        
        impuesto.setContribuyente(contribuyente);
        System.out.println("Datos del contribuyente...");
        impuesto.imprimirDatosContribuyente();
        calculadora.calcular(impuesto);
        
    }
    
}
