
package reservaclientemesa;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 2, 25);
        LocalTime hora = LocalTime.of(20, 30);
        
        Mesa mesa = new Mesa(22, 5);
        Reserva reserva1 = new Reserva(fecha, hora, mesa);
        Cliente cliente = new Cliente("Wilson", "Fonseca", "+54 9 11 1234-5678");
        
        reserva1.setCliente(cliente);
        reserva1.imprimirReserva();
        

    }
    
}
