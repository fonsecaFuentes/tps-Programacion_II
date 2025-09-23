
package vehiculomotorconductor;

public class Motor {
    // Atributos
    private final String tipo;
    private final String numeroSerie;
    
    // Constructor
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Metodos
    public String infoMotor() {
        return "Tipo: " + tipo + "\nNúmero de serie: " + numeroSerie;
    }
    
}
