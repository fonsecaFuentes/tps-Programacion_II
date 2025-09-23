
package generadorqrusuariocodigoqr;

public class CodigoQR {
    // Atributos
    private final String valor;
    private Usuario usuario; // Asociacion 1:1
    
    // Constructor
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    // Metodos
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    private String datosUsuario() {
        String infoUsuario = "Sin datos del Usuario";
        if (usuario != null) {
            infoUsuario = usuario.toString();
        }
        return infoUsuario;
    }
    
    public void imprimirDatos() {
        System.out.println(datosUsuario());
        System.out.println("Valor QR...");
        System.out.println(valor);
    }
    
}
