
package cuentabancariaclaveseguridadtitular;

public class Titular {
    // Atributos
    private final String nombre;
    private final String apellido;
    private final String dni;
    private CuentaBancaria cuentaBancaria; // Referencia a Cuentabancaria asociada
   
    // Constructor
    public Titular(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    // Metodos
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    public String infoCuentaTitular() {
        return "\nTitular...\nNombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni;
    }
    
    public void imprimirDatosTitular() {
        System.out.println(infoCuentaTitular());
    }
}
