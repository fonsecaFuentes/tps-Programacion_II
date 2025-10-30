
package empleadospolimorfismo;

public class EmpleadoPlanta extends Empleado {
    private final double sueldoBasico;
    private final int aniosAntiguedad;
    
    public EmpleadoPlanta(String nombre, double sueldoBasico, int aniosAntiguedad) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBasico + (aniosAntiguedad + 65000);
    }
}
