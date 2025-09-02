package registromascotas;

public class Principal {

    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        
        miMascota.setNombre("Apolo");
        miMascota.setEspecie("perro");
        miMascota.setEdad(13);
        
        miMascota.mostrarInfo();
        miMascota.cumplirAnios();
        miMascota.mostrarInfo();
    }
    
}
