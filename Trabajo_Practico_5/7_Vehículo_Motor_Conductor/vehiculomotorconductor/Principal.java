
package vehiculomotorconductor;

public class Principal {

    public static void main(String[] args) {
        Motor motor = new Motor("Eléctrico", "asdf1547");
        Vehiculo vehiculo = new Vehiculo("ADL564", "LJ47", motor);
        Conductor usuario = new Conductor("Juan", "JuanTieneLicencia");
        usuario.setVehiculo(vehiculo);
        
        vehiculo.imprimirInfo();
    }
    
}
