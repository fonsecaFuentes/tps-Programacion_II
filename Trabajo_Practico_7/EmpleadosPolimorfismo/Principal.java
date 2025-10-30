
package empleadospolimorfismo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Ana", 200_000, 5));
        empleados.add(new EmpleadoTemporal("Luis", 120, 1800));
        empleados.add(new EmpleadoPlanta("María", 250_000, 2));
        empleados.add(new EmpleadoTemporal("Carlos", 80, 2000));
        
        for (Empleado emp : empleados) {
            double sueldo = emp.calcularSueldo();
            System.out.println("Empleado: " + emp.getNombre() + " - Sueldo: " + sueldo);
            
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("  -> Es empleado de PLANTA");
            } else {
                System.out.println("  -> Es empleado TEMPORAL");
            }
        }
    }
    
}
