/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

public class Ej08_PrecioFinalFuncion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto (%) : ");
        double imp = sc.nextDouble();
        System.out.print("Ingrese el descuento (%) : ");
        double desc = sc.nextDouble();

        double total = calcularPrecioFinal(base, imp, desc);
        System.out.println("Precio final: " + total);
        
        sc.close();
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double imp = precioBase * (impuestoPct / 100.0);
        double desc = precioBase * (descuentoPct / 100.0);
        return precioBase + imp - desc;
    }
    
}
