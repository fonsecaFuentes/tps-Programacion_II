
package computadoraplacamadrepropietario;

public class Computadora {
    // Atributos
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // Composición 1:1
    private Propietario propietario;
    
    // Constructor
    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        placaMadre = new PlacaMadre(modelo, chipset); // Creamos el objeto internamente
    }
    
    // Metodos
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public String resumen() {
        String infoPropietario = "(sin propietario)";
        if (propietario != null) {
            infoPropietario = propietario.presentacion();
        }
        return "Computadora " + marca + " — Serie " + numeroSerie + "\n" +
               placaMadre.resumen() + "\nPropietario: " + infoPropietario;
    }

    public void imprimirResumen() {
        System.out.println(resumen());
    }
}
