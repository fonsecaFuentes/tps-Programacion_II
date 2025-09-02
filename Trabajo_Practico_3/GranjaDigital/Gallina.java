package granjadigital;

public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    // Setters
    public void setIdGallina(int id) {
        if (id > 0) {
            idGallina = id;
        }
    }
    
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            edad = nuevaEdad;
        }
    }
    
    // Métodos
    public void envejecer() {
        edad += 1;
    }
    
    public void ponerHuevo() {
        huevosPuestos += 1;
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
}
