
package sistemastockproductos;

import java.util.ArrayList;
import java.util.Collection;

public class Inventario {
    // Atributos
    private ArrayList<Producto> productos;
    
    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    // Metodos
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void agregarProductos(Collection<Producto> ps) {
        for (Producto p : ps) {
            agregarProducto(p);
        }
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        return buscadorProducto(id);
    }
    
    public Producto eliminarProducto(String id) {
        Producto prodAEliminar = buscadorProducto(id);
        this.productos.remove(prodAEliminar);
        return prodAEliminar;
    }
    
    private Producto buscadorProducto(String id) {
        int i = 0;
        Producto prodEncontrado = null;
        while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {            
            i++;
        }
        if(i < productos.size()) {
            prodEncontrado = this.productos.get(i);
        }
        return prodEncontrado;
    }
    
    public Producto actualizarStock(String id, int nuevaCantidad) {
        Producto prodAActualizar = buscadorProducto(id);
        if (prodAActualizar != null) {
            prodAActualizar.actualizarProducto(nuevaCantidad);
        }
        return prodAActualizar;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> prodListados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                prodListados.add(producto);
            }
        }
        return prodListados;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        Producto cantiMax = null;
        int stockMax = -1;
        for (Producto producto : productos) {
            if (producto.getCantidad() > stockMax) {
                stockMax = producto.getCantidad();
                cantiMax = producto;
            }
        }
        return cantiMax;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        double tmp = 0;
        if (min > max) {
            tmp = min;
            min = max;
            max = tmp;
        }
        ArrayList<Producto> listaRango = new ArrayList<>();
        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio >= min && precio <= max) {
                listaRango.add(p);
            }
        }
        return listaRango;
    }
    
    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] categoria = CategoriaProducto.values();
        
        for (int i = 0; i < categoria.length; i++) {
            System.out.println("\nCategorias: " + categoria[i].name()+
                                "\nDescripción: " + categoria[i].getDescripcion());
        }
    }
}
