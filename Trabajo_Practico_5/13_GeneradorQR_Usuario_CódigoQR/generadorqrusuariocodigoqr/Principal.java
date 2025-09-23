
package generadorqrusuariocodigoqr;

public class Principal {

    public static void main(String[] args) {
        GeneradorQR generadorQR = new GeneradorQR();
        Usuario user = new Usuario("Kiara", "Boxer", "kiaraboxer@email.com");
        generadorQR.generar("kiaraboxer@email.com", user);
    }
    
}
