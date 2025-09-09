
package gestionempleados;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor con nombre y puesto: id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 500000;
    }
    
    // Sobrecarga de métodos actualizarSalario
    public void actualizarSalario(int porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * porcentaje / 100;
        }
    }

     public void actualizarSalario(double monto) {
         if (monto > 0) {
             this.salario += monto;
         }
    }
    
    // toString sobrescrito
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    // Método estático
    public static void mostrarTotalEmpleados() {
        System.out.println("Cantidad de empleados: " + totalEmpleados);
    }
}
