
package sistemastockproductos;

import java.util.ArrayList;

public class Producto {
    // Atributos
    private final String id;
    private final String nombre;
    private final double precio;
    private int cantidad;
    private final CategoriaProducto categoria;
    
    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Metodos
    public void mostrarInfo() {
        System.out.println("""
                           ----------------------------
                           ID del producto: """ + id +
                "\nNombre: " + nombre +
                "\nPrecio: $ " + precio +
                "\nCantidad disponible: " + cantidad +
                "\nCategoría: " + categoria +
                "\nDescripción: " + categoria.getDescripcion());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public void actualizarProducto(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
    
    
}
