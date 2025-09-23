
package computadoraplacamadrepropietario;

public class PlacaMadre {
    // Atributos
    private final String modelo;
    private final String chipset;
    
    // Constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    // Metodos
    public String resumen() {
        return "Placa " + modelo + " — Chipset " + chipset;
    }
}
