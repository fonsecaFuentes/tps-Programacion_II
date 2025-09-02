
package registromascotas;

public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Métodos de acceso (setters)
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            nombre = nuevoNombre;
        }
    }
    
    public void setEspecie(String nuevaEspecie) {
        if (nuevaEspecie != null) {
            especie = nuevaEspecie;
        }
    }
    
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            edad = nuevaEdad;
        }
    }
    
    // Métodos de comportamiento
    public void mostrarInfo() {
        System.out.println(nombre + " " + especie + " " + edad);
    }
    
    public void cumplirAnios() {
        edad += 1;
    } 
}
