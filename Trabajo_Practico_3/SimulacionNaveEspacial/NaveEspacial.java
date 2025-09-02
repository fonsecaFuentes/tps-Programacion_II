package simulacionnaveespacial;

public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private int distancia;
    private final int max_combustible = 500;
    private boolean enVuelo;
    
    // Setters
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            nombre = nuevoNombre;
        }
    }
    
    public void setCombustible(int cantidad) {
        if (cantidad < 0) {
            cantidad = 0;
        } else if (cantidad > max_combustible) {
            combustible = max_combustible;
        }
        combustible = cantidad;
    }
    // Getters
    
    // Métodos
    public void despegar() {
        if (enVuelo) {
             System.out.println("La nave ya está en vuelo.");
        } else if (combustible <= 0) {
            System.out.println("No hay combustible para despegar.");
        } else {
            enVuelo = true;
            System.out.println("Despegue exitoso. ¡Buen viaje!");
        }
    }
    
    public void avanzar(int nuevaDistancia) {
        if (!enVuelo) {
            System.out.println("Primero debe despegar la nave.");
        } else if (nuevaDistancia <= 0) {
            System.out.println("Ingrese una distancia válida.");
        } else if (combustible < nuevaDistancia) {
            System.out.println("Combustible insuficiente para recorrer "
                    + nuevaDistancia + " años luz. Necesita " + nuevaDistancia
                    + " unidades de combustible. La nave tiene " + combustible
                    + " unidades de combustible");
        }else {
            distancia += nuevaDistancia;
            combustible -= nuevaDistancia;
            System.out.println(
                "Ha viajado " + nuevaDistancia + " años luz. Combustible restante: " + combustible + "."
            );
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Ingrese una cantidad positiva para recargar.");
        } else {
            int antes = combustible;
            combustible += cantidad;
            if (combustible > max_combustible) {
                combustible = max_combustible;
            }
            int cargadoReal = combustible - antes;
            if (cargadoReal < cantidad) {
                System.out.println("Se recargaron " + cargadoReal +
                                   " unidades (tope " + max_combustible + ").");
            } else {
                System.out.println("Se recargaron " + cargadoReal + " unidades.");
            }
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("En vuelo: " + enVuelo);
        System.out.println("Distancia recorrida: " + distancia + " años luz");
        System.out.println("Combustible: " + combustible + "/" + max_combustible);
    }
}
