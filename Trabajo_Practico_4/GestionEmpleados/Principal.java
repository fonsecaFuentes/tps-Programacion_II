
package gestionempleados;

public class Principal {

    public static void main(String[] args) {
        Empleado juan = new Empleado(101, "Juan", "Maquinista", 955344.50);
        Empleado alfonso = new Empleado("Alfonso", "Operador");
        Empleado ramon = new Empleado(102, "Ramon", "Electrico", 1522366.50);
        Empleado santiago = new Empleado("Santiago", "Portero");
        
        System.out.println("\n--- Empleados iniciales ---");
        System.out.println(juan);
        System.out.println(alfonso);
        System.out.println(ramon);
        System.out.println(santiago);
        
        // Aplicar aumentos
        juan.actualizarSalario(10);        // 10% aumento
        alfonso.actualizarSalario(20000.0);  // aumento fijo
        ramon.actualizarSalario(5);        // 5% aumento
        santiago.actualizarSalario(10000.0); // aumento fijo
        
        System.out.println("\n--- Después de actualizaciones ---");
        System.out.println(juan);
        System.out.println(alfonso);
        System.out.println(ramon);
        System.out.println(santiago);
        
        System.out.println("");
        Empleado.mostrarTotalEmpleados();
    }
    
}
