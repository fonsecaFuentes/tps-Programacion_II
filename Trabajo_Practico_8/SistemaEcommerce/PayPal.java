
package sistemaecommerce;

import java.util.Objects;
import java.util.UUID;

public class PayPal implements Pago {
    // Atributos
    private final String cuenta;
    
    // Constructor
    public PayPal(String cuenta) {
        this.cuenta = Objects.requireNonNull(cuenta, "cuenta no puede ser null");
        if (cuenta.isEmpty()) {
            throw new IllegalArgumentException("cuenta no puede ser vacía");
        }
    }
    
    // Metodos
    @Override
    public boolean procesarPago(double monto) {
        // 1) Validación del monto
        if (monto <= 0) {
            System.out.println("[PayPal] Monto inválido: " + monto);
            return false;
        }
        
        // Generamos un código corto y legible para mostrar en el log
        String autorizacion = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        System.out.printf("[PayPal] Cobro exitoso a %s por $%.2f (auth=%s)%n",cuenta, monto, autorizacion);
        
        return true;
    }

    @Override
    public String toString() {
        return "PayPal{" + "cuenta=" + cuenta + '}';
    }
}
