
package sistemaecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Cliente implements Notificable {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String email;
    private final List<Pedido> pedidos = new ArrayList();
    
    // Constructor
    public Cliente(String nombre, String apellido, String email) {
        this.nombre =  nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    // Metodos
    /**
     * Agrega un pedido a la lista del cliente. 
     * Valida si el pedido pertenece a este cliente.
     */
    public void agregarPedido(Pedido p) {
        Objects.requireNonNull(p, "pedido no puede ser null");
        if (p.getCliente() != this) {
            throw new IllegalArgumentException("El pedido pertenece a otro cliente");
        }
        pedidos.add(p);
    }
    
    // Devuelve una vista de solo lectura de los pedidos.
    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }
    
    /**
     * Implementación de la interfaz Notificable:
     * recibe avisos cuando un pedido cambia de estado.
     * Por ahora imprime por consola; en un sistema real, enviaría email/SMS/push.
     * @param p
     * @param e
     */
    @Override
    public void notificarCambioEstado(Pedido p, EstadoPedido e) {
        System.out.println("Cliente \nNombre: " + nombre + " " + apellido + "\nEmail: " + email +
                "\nPedido: " + p + "\nEstado: " + e);
    }
    
}
