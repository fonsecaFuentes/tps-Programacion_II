
package pasaportefototitular;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 9, 12);
        Titular titular = new Titular("Wilson de Inocenti", "31317046");
        Pasaporte pasaporte = new Pasaporte("123456789", fecha, "www.imagen.com", "jpg");
        pasaporte.setTitular(titular);
        
        System.out.println(titular.mostrarDatosTitular());
    }
    
}
