
package CelularBateriaUsuario;

public class Usuario {
    // Atributos
    private String nombre;
    private String dni;
    private Celular celular; // Referencia celular
    
    // Constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Metodos
    public void setCelular(Celular celular) {
        this.celular =  celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
    public void mostrarDatos() {
        System.out.println("El usuario con nombre: " + nombre + "\nDNI: " + dni);
        System.out.println("Caracteristicas del dispositivo:");
        celular.datosCelular();
    }
    
    public Celular getCelular() {
        return celular;
    }
    
    
    
}
