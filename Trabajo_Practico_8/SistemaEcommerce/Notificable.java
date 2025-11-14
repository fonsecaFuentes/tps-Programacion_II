
package sistemaecommerce;

public interface Notificable {
    public abstract void notificarCambioEstado(Pedido p, EstadoPedido nuevo);
}
