
package vehiculomotorconductor;

public class Vehiculo {
    // Atributos
    private final String patente;
    private final String modelo;
    private Motor motor; // Agregacion
    private Conductor conductor; // Asociacion 1:1
    
    // Constructor
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    // Metodos
    public Conductor getConductor() {
        return conductor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    private String infoMotor() {
        String infMotor = "(sin motor...)";
        if (motor != null) {
            infMotor = motor.infoMotor();
        }
        return infMotor;
    }
    
    private String infoConductor() {
        String infoConductor = "(sin conductor...)";
        if (conductor != null) {
            infoConductor = conductor.infoConductor();
        }
        return infoConductor;
    }
    
    public String resumen() {
    return "\nInformacion del Vehículo..." +
           "\nPatente: " + patente +
           "\nModelo: " + modelo +
           "\n\nInformacion del Motor..." +
           "\n" + infoMotor() +
           "\n\nInformacion del Conductor..." +
           "\n" + infoConductor();
}
    
    public void imprimirInfo() {
        System.out.println(resumen());
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
