
package cuentabancariaclaveseguridadtitular;

import java.time.LocalDate;

public class CuentaBancaria {
    // Atributos
    private final String cbu;
    private double saldo;
    private final ClaveSeguridad claveSeguridad; // Composición 1:1
    private Titular titular; // Asociacion 1:1
    
    // Constructor
    public CuentaBancaria(String cbu, double saldo, String codigo, LocalDate ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion); // Se crea internamente
    }
    
    // Metodos
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    public void mostrarClaveSeguridad() {
        System.out.println("Información clave de seguridad - Cuenta origen - CBU: " + cbu + "\n" + claveSeguridad.toString());
    }
    
    private String infoCuentaBancaria() {
        return "\nCuenta Bancaria...\nCBU: " + cbu + "\nSaldo: " + saldo;
    }
    
    public void imprimirDatosCuenta() {
        System.out.println(infoCuentaBancaria());
    }
}
