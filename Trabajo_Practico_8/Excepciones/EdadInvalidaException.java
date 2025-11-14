package excepciones;

public class EdadInvalidaException extends RuntimeException {
    public static final int MIN_DEF = 0;
    public static final int MAX_DEF = 120;

    private final int edad;
    private final int min;
    private final int max;

    // ---- Constructores principales  ----
    public EdadInvalidaException(int edad) {
        super(mensajePorDefecto(edad, MIN_DEF, MAX_DEF));
        this.edad = edad;
        this.min = MIN_DEF;
        this.max = MAX_DEF;
    }

    public EdadInvalidaException(int edad, String mensaje) {
        super(mensaje != null ? mensaje : mensajePorDefecto(edad, MIN_DEF, MAX_DEF));
        this.edad = edad;
        this.min = MIN_DEF;
        this.max = MAX_DEF;
    }

    public EdadInvalidaException(int edad, String mensaje, Throwable cause) {
        super(mensaje != null ? mensaje : mensajePorDefecto(edad, MIN_DEF, MAX_DEF), cause);
        this.edad = edad;
        this.min = MIN_DEF;
        this.max = MAX_DEF;
    }

    public EdadInvalidaException(int edad, Throwable cause) {
        super(mensajePorDefecto(edad, MIN_DEF, MAX_DEF), cause);
        this.edad = edad;
        this.min = MIN_DEF;
        this.max = MAX_DEF;
    }


    private static String mensajePorDefecto(int edad, int min, int max) {
        return "Edad inválida: " + edad + " (debe estar entre " + min + " y " + max + ")";
    }

    // Getters
    public int getEdad() {
        return edad;
    }
    
    public int getMin() {
        return min;
    }
    
    public int getMax() {
        return max;
    }
}
