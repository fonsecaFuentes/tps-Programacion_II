
package impuestocontribuyentecalculadora;

public class Impuesto {
    // Atributos
    private double monto;
    private Contribuyente contribuyente; // Asociacion 1:1
    
    // Constructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    // Metodos
    public double getMonto() {
        return monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    private String datosContribuyente() {
        String infoContribuyente = "No hay datos del contribuyente...";
        if (contribuyente != null) {
            infoContribuyente = contribuyente.toString();
        }
        return infoContribuyente;
    }
    
    public void imprimirDatosContribuyente() {
        System.out.println(datosContribuyente());
    }
}
