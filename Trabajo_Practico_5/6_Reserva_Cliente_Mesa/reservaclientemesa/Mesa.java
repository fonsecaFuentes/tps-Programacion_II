
package reservaclientemesa;

public class Mesa {
    // Atributos
    private final int numero;
    private final int capacidad;
    
    // Constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    // Metodos
    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    
}
