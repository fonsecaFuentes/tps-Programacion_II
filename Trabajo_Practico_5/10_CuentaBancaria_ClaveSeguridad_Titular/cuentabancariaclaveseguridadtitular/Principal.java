
package cuentabancariaclaveseguridadtitular;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 6, 24);
        CuentaBancaria cuentaBancaria = new CuentaBancaria("0170099220000012345678", 12500.75, "456sdada", fecha);
        Titular titular = new Titular("Sofía", "Benítez ", "26547896");
        
        titular.setCuentaBancaria(cuentaBancaria);
        
        titular.imprimirDatosTitular();
        cuentaBancaria.imprimirDatosCuenta();
        System.out.println("");
        cuentaBancaria.mostrarClaveSeguridad();
              
        
    }
    
}
