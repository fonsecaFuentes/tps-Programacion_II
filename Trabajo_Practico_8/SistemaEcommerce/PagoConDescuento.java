
package sistemaecommerce;

public interface PagoConDescuento extends Pago {
    public abstract double aplicarDescuento(double monto);
}
