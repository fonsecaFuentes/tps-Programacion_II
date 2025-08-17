/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

public class Ej11_DescuentoEspecialGlobal {
    
    static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
        
        sc.close();
    }
    
    public static double calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        // Mostrar según consigna (puedes dejar con printf si querés 2 decimales)
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);

        return precioFinal;
    }
    
}
