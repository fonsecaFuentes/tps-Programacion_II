package granjadigital;

public class Principal {

    public static void main(String[] args) {
        System.out.println(" -------- Gallina 1 -------- ");
        // Gallina 1
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);
        gallina1.setEdad(1);
        // Métodos
        gallina1.mostrarEstado();
        System.out.println(" -------- Acciones -------- ");
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        System.out.println(" -------- Gallina 2 -------- ");
        // Gallina 2
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(2);
        // Métodos
        gallina2.mostrarEstado();
        System.out.println(" -------- Acciones -------- ");
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarEstado();
    }
    
}
