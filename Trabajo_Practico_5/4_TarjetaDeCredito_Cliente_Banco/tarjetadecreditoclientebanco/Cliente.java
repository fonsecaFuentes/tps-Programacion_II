
package tarjetadecreditoclientebanco;

public class Cliente {
    // Atributos
    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjetaDeCredito;
    
    // Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Metodos
    public void setTarjetaDeCredito (TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito =  tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    public String presentacion() {
        return nombre + " (DNI " + dni + ")";
    }
    
    public String mostrarDatosCliente() {
        String infoTarjeta = "El cliente no tiene tarjeta...";
        if (tarjetaDeCredito != null) {
            infoTarjeta = tarjetaDeCredito.mostrarResumen();
        }
        return "Cliente:\nNombre del titular: " + nombre +
           "\nDNI: " + dni + "\n\nTarjeta de Crédito:\n" + infoTarjeta;
    }

}
