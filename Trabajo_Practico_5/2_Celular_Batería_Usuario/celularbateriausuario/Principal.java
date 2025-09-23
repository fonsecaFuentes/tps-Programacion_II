
package CelularBateriaUsuario;

public class Principal {

    public static void main(String[] args) {
        Bateria bateria = new Bateria("asdhhh55456", 45000);
        Celular celular = new Celular("12sas", "Motoro", "G44", bateria);
        Usuario usuario = new Usuario("Wilson Fonseca", "31317046");
        
        celular.datosCelular();
        celular.setBateria(null);
        System.out.println("");
        celular.datosCelular();
        System.out.println("");
        usuario.setCelular(celular);
        usuario.mostrarDatos();
    }
    
}
