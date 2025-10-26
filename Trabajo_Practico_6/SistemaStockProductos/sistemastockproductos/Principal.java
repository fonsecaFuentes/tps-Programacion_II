
package sistemastockproductos;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        Inventario i = new Inventario();
        cargarInventario(i);
        // Listar todos los productos mostrando su información y categoría. 
//        i.listarProductos();
        
        // Buscar un producto por ID y mostrar su información.
//        i.buscarProductoPorId("P-3003");
        
        // Filtrar y mostrar productos que pertenezcan a una categoría específica.
//        ArrayList<Producto> lista = i.filtrarPorCategoria(CategoriaProducto.ROPA);
//        for (Producto producto : lista) {
//            System.out.println("Productos con categoria: " + producto.getCategoria());
//            producto.mostrarInfo();
//        }

        // Eliminar un producto por su ID y listar los productos restantes.
//        Producto prodEliminado = i.eliminarProducto("P-0001");
//        System.out.println("Se elimino el producto: " + prodEliminado);
//        i.listarProductos();

        // Actualizar el stock de un producto existente.
//        Producto prodAACtualizar = i.actualizarStock("P-0002", 300);
//        System.out.println("Se actualizao el producto: " + prodAACtualizar.getNombre()+
//                "\nCantidad actualizada: " + prodAACtualizar.getCantidad());
//        i.buscarProductoPorId("P-0002");

        // Mostrar el total de stock disponible
//        System.out.println("Cantidad total del stock de productos: " + i.obtenerTotalStock());
        
        // Obtener y mostrar el producto con mayor stock
//        System.out.println("El producto con mayor stock es: ");

        // Filtrar productos con precios entre $1000 y $3000.
        ArrayList<Producto> listaRango = i.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("Productos con precio entre $1000 y $3000:");
        for (Producto prod : listaRango) {
            prod.mostrarInfo();
        }

        // Mostrar las categorías disponibles con sus descripciones.
//        i.mostrarCategoriasDisponibles();
    }
    
    public static void cargarInventario(Inventario i) {
        ArrayList<Producto> lista = new ArrayList<>();
        // Crear al menos cinco productos con diferentes categorías y agregarlos al inventario
        Producto p1 = new Producto("P-0001", "Arroz Largo Fino 1 kg", 950, 40, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P-0002", "Yerba Mate 1 kg", 2400, 25, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("P-0003", "Galletitas de Avena", 750, 60, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("P-1001", "Auriculares Bluetooth", 9500, 12, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("P-1002", "Mouse Óptico USB", 1800, 80, CategoriaProducto.ELECTRONICA);
        Producto p6 = new Producto("P-1003", "Teclado Mecánico", 27000, 10, CategoriaProducto.ELECTRONICA);
        Producto p7 = new Producto("P-2001", "Remera Algodón (M)", 3200, 35, CategoriaProducto.ROPA);
        Producto p8 = new Producto("P-2002", "Campera Rompeviento (L)", 28500, 8, CategoriaProducto.ROPA);
        Producto p9 = new Producto("P-2003", "Medias Deportivas (par)", 900, 120, CategoriaProducto.ROPA);
        Producto p10 = new Producto("P-3001", "Almohada Viscoelástica", 6800, 22, CategoriaProducto.HOGAR);
        Producto p11 = new Producto("P-3002", "Lámpara de Mesa LED", 2950, 18, CategoriaProducto.HOGAR);
        Producto p12 = new Producto("P-3003", "Set 6 Vasos Templados", 1200, 50, CategoriaProducto.HOGAR);
        
        Collections.addAll(lista, p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
        i.agregarProductos(lista);
        
    }
    
}
