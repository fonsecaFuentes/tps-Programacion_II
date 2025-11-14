
package sistemaecommerce;

import java.util.Objects;
import java.util.UUID;

public class TarjetaCredito implements PagoConDescuento {
    // Descuento (10% OFF).
    private static final double DESCUENTO_PORC = 0.10;
    // Atributos
    private final String titular;
    private final String numero;
    
    // Constructor
    public TarjetaCredito(String titular, String numero) {
        this.titular = Objects.requireNonNull(titular, "titular no puede ser null");
        this.numero = Objects.requireNonNull(numero, "número no puede ser null");
        
        if (titular.isEmpty()) {
            throw new IllegalArgumentException("titular no puede estar vacío");
        }
        if (numero.isEmpty()) {
            throw new IllegalArgumentException("número no puede estar vacío");
        }
    }
    
    /**
     * Aplica un descuento sobre el monto si es positivo.
     * @param monto
     * @return 
     */
    @Override
    public double aplicarDescuento(double monto) {
        double montoConDesc = 0;
        if (monto <= 0) {
            montoConDesc += monto;
        } else {
            montoConDesc += monto * (1.0 - DESCUENTO_PORC);
        }
        return montoConDesc;
    }

    @Override
    public boolean procesarPago(double monto) {
        // 1) Validación del monto
        if (monto <= 0) {
            System.out.println("[TarjetaCredito] Monto inválido: " + monto);
            return false;
        }
        
        // Generamos un código corto y legible para mostrar en el log
        String autorizacion = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        System.out.printf("[TarjetaCredito] Cobro exitoso a %s (%s) por $%.2f (auth=%s)%n",titular, numero, monto, autorizacion);
        
        return true;
    }
    
}
