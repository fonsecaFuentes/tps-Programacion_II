
package generadorqrusuariocodigoqr;

public class GeneradorQR {
    // Atributos
    // Constructor
    // Metodos
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario);
        qr.imprimirDatos();
    }
}
