
package tarjetadecreditoclientebanco;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class TarjetaDeCredito {
    // Atributos
    private final String numero;
    private final YearMonth fechaVencimiento;
    private Cliente cliente; // Asociacion 1:1
    private Banco banco; // Agregacion
    
    // Constructor
    public TarjetaDeCredito(String numero, YearMonth fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    // Metodos
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        // Evitamos un bucle
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public String mostrarResumen() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/uuuu");
        String infoDelBanco = "Sin datos del Banco...";
        String infoCliente = "(sin cliente)";
        
        if (banco != null) {
            infoDelBanco = banco.datosDelBanco();
        }
        if (cliente != null) {
            infoCliente = cliente.presentacion();
        }
        
        return "Tarjeta ****" + ultimos4() +
           "\nVencimiento: " + fechaVencimiento.format(f) +
           "\nTitular: " + infoCliente +
           "\nBanco:\n" + infoDelBanco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    
    private String ultimos4() {
        String ultimos4;
        if (numero.length() <= 4) {
            ultimos4 = numero;
        } else {
            ultimos4 = numero.substring(numero.length() - 4);
        }
        return ultimos4;
    }
}
