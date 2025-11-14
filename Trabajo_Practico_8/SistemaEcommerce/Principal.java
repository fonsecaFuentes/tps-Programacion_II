
package sistemaecommerce;

public class Principal {

    public static void main(String[] args) {
        // ====== 1) Crear cliente ======
        Cliente cliente = new Cliente("Wilson", "FonsecaFuentes", "fonsecaFuentes@example.com");

        // ====== 2) Crear productos ======
        Producto p1 = new Producto("Teclado mecánico", 35000.00);
        Producto p2 = new Producto("Mouse inalámbrico", 19500.00);
        Producto p3 = new Producto("Auriculares", 28000.00);

        // ====== 3) Crear pedido (estado inicial CREADO) ======
        Pedido pedido = new Pedido(EstadoPedido.CREADO, cliente);

        // Agregar productos
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        System.out.println("=== Productos en el pedido ===");
        pedido.listarProductos();
        System.out.printf("Total sin descuento: $%.2f%n%n", pedido.calcularTotal());

        // ====== 4) Probar pago con PayPal (NO aplica descuento) ======
        System.out.println("=== Pago con PayPal ===");
        Pago paypal = new PayPal("cuenta.paypal@correo.com");
        try {
            boolean ok = pedido.pagar(paypal);
            System.out.println("¿Pago OK? " + ok);
            System.out.println("Estado del pedido: " + pedido.getEstado());
        } catch (Exception e) {
            System.out.println("Error al pagar con PayPal: " + e.getMessage());
        }

        // ====== 5) Intentar pagar de nuevo (debe fallar: ya pagado) ======
        System.out.println("\n=== Intento de pagar de nuevo (debe fallar) ===");
        try {
            boolean ok = pedido.pagar(paypal);
            System.out.println("¿Pago OK? " + ok);
        } catch (Exception e) {
            System.out.println("Esperado: " + e.getMessage());
        }

        // ====== 6) Nuevo pedido para probar TarjetaCredito (con DESCUENTO) ======
        System.out.println("\n=== Nuevo pedido con Tarjeta de Crédito (con descuento) ===");
        Pedido pedido2 = new Pedido(EstadoPedido.CREADO, cliente);
        pedido2.agregarProducto(new Producto("Monitor 24\"", 120_000.00));
        pedido2.agregarProducto(new Producto("HDMI 2.1", 9_900.00));
        System.out.printf("Total antes de descuento: $%.2f%n", pedido2.calcularTotal());

        PagoConDescuento tarjeta = new TarjetaCredito("Alfredo de Inocenti", "4111 1111 1111 1111");
        try {
            // Nota: Pedido acepta cualquier Pago; si además es PagoConDescuento, aplica descuento automáticamente.
            boolean ok = pedido2.pagar(tarjeta);
            System.out.println("¿Pago OK? " + ok);
            System.out.println("Estado del pedido2: " + pedido2.getEstado());
        } catch (Exception e) {
            System.out.println("Error al pagar con tarjeta: " + e.getMessage());
        }

        // ====== 7) Caso borde: pedido vacío (debe lanzar excepción) ======
        System.out.println("\n=== Caso borde: pedido vacío ===");
        Pedido pedidoVacio = new Pedido(EstadoPedido.CREADO, cliente);
        try {
            pedidoVacio.pagar(paypal);
        } catch (Exception e) {
            System.out.println("Esperado (no se puede pagar pedido vacío): " + e.getMessage());
        }
    }
}
