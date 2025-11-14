
package sistemaecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Pedido implements Pagable {
    // Atributos
    private EstadoPedido estado;
    private final Cliente cliente;
    private final List<Producto> productos = new ArrayList<>();
    private final String id = UUID.randomUUID().toString().substring(0,8).toUpperCase();
    
    // Constructor
    public Pedido(EstadoPedido estado, Cliente cliente) {
        // Se valida que ninguno sea null
        this.estado = Objects.requireNonNull(estado, "estado no puede ser null");
        this.cliente = Objects.requireNonNull(cliente, "cliente no puede ser null");
    }
    
    // Metodos
    // Agrega un producto al pedido. No acepta null.
    public void agregarProducto(Producto p) {
        this.productos.add(Objects.requireNonNull(p, "producto no puede ser null"));
    }
    
    public void removerProducto(Producto p) {
        this.productos.remove(p);
    }
    
    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    // Cambia el estado del pedido y notifica al cliente.
    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
        cliente.notificarCambioEstado(this, estado);
    }
    
    /**
     * - Valida que haya productos y que no esté ya pagado.
     * - Si el medio de pago soporta descuento (PagoConDescuento), lo aplica.
     * - Procesa el pago y, si es correcto, cambia el estado a PAGADO (y notifica).
     */
    public boolean pagar(Pago metodo) {
        Objects.requireNonNull(metodo, "método de pago no puede ser null");
        if (productos.isEmpty()) {
            throw new IllegalStateException("No se puede pagar un pedido sin productos");
        }
        if (estado == EstadoPedido.PAGADO) {
            throw new IllegalStateException("El pedido ya está pagado");
        }
        
        double monto = calcularTotal();
        
        // Si el medio tiene descuento, se prepara el monto descontado.
        if (metodo instanceof PagoConDescuento conDesc) {
            monto = conDesc.aplicarDescuento(monto);
        }
        boolean ok = metodo.procesarPago(monto);
        if (ok) {
            cambiarEstado(EstadoPedido.PAGADO); // notifica al cliente
        }
        return ok;
    }
    
    // Suma el total de todos los productos
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Pedido: #" + id +
           "{estado : " + estado +
           ", items : " + productos.size() +
           ", total : $" + String.format("%.2f", calcularTotal()) + "}";
    }
    
    
}
