
package reservaclientemesa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    // Atributos
    private final LocalDate fecha;
    private final LocalTime hora;
    private Cliente cliente; // Asociacion 1:1
    private Mesa mesa; // Agregacion
    
    // Constructor
    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    // Metodos
    public void setCliente(Cliente cliente) {
        this.cliente = cliente; 
    }
    
    public void mostrarMesa() {
        if (mesa != null) {
            System.out.println("Mesa número: " + mesa.getNumero());
            System.out.println("Capacidad " + mesa.getCapacidad() + " personas.");
        }
    }
    
    private String infoReserva() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm");
        String infoCliente = "(sin cliente)";
        
        if (cliente != null) {
            infoCliente = cliente.datosCliente();
        }
        return "Reserva: " + fecha.format(f) + " " + hora.format(h) +
           " Hs | Mesa " + mesa.getNumero() + " (cap. " + mesa.getCapacidad() + " personas) " +
           " | " + infoCliente;
    }
    
    public void imprimirReserva() {
        System.out.println(infoReserva());
    }
}
