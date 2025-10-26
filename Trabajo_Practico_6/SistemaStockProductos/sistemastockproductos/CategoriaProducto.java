
package sistemastockproductos;

public enum CategoriaProducto {
    // Atributos
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;
    
    // Constructor
    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Metodos
    public String getDescripcion() {
        return descripcion;
    }
}
