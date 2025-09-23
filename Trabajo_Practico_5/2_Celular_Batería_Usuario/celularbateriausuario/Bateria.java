
package CelularBateriaUsuario;

public class Bateria {
    // Atributos
    private final String modelo;
    private final int capacidadMah; // capacidad en miliamperio-hora (mAh) 
    
    // Constructor
    public Bateria(String modelo, int capacidadMah) {
        this.modelo = modelo;
        this.capacidadMah = capacidadMah;
    }
    
    // Metodos
    public String getModelo() {
        return modelo;
    }

    public int getCapacidadMah() {
        return capacidadMah;
    }

}
