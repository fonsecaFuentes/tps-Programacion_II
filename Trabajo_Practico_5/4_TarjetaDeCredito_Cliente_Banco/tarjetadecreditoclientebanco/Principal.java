
package tarjetadecreditoclientebanco;

import java.time.YearMonth;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wilson Fonseca", "31317046");
        Banco banco = new Banco("Money", "065489745632");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4509123412341234", YearMonth.of(2027, 9), banco);
        
        Cliente cliente2 = new Cliente("Apolo Matusalen", "44568756");
        
        cliente.setTarjetaDeCredito(tarjeta);
        
        System.out.println("");
        System.out.println(cliente.mostrarDatosCliente());
        System.out.println("");
        System.out.println("-------------------------------------------------");
        tarjeta.setBanco(new Banco("Nuevo Banco", "30-12345678-9"));
        System.out.println("\n— Cambio de banco —");
        System.out.println(cliente.mostrarDatosCliente());
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println(cliente2.mostrarDatosCliente());
    }
    
}
