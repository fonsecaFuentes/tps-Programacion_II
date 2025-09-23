
package documentofirmadigitalusuario;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 9, 9);
        Usuario user = new Usuario("Wilson", "wilson@email.com");
        Documento doc = new Documento("Lorem Ipsum", "Is simply dummy text of the printing and typesetting industry.", "0cc175b9c0f1b6a831c399e269772661", fecha, user);
        //Documento doc = new Documento("Lorem Ipsum", "Is simply dummy text of the printing and typesetting industry.", "0cc175b9c0f1b6a831c399e269772661", fecha);
        
        doc.imprimirResumen();
    }
    
}
