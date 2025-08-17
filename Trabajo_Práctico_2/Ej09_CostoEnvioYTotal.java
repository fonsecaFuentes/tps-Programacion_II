/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

public class Ej09_CostoEnvioYTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String zona;
        
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Peso del paquete (kg): ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiamos!!!! Me Habia olvidado de esto!!

        System.out.print("Zona de envio elija (1 - Nacional / 2 - Internacional): ");
        int opcion = sc.nextInt();
        if (opcion == 1){
            zona = "Nacional";
        } else if (opcion == 2){
            zona = "Internacional";
        } else {
            System.out.println("Opción incorrecta. Se tomará como Internacional por defecto.");
            zona = "Internacional";
        }

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotal(precio, costoEnvio);

        System.out.println("Costo de envio: " + costoEnvio);
        System.out.println("Total a pagar: " + total);
        
        sc.close();
    }
    
    public static double calcularCostoEnvio(double pesoKg, String zona) { 
        double precioKg;
        if (zona.equals("Nacional")) {
            precioKg = 5.0;
        } else {
            precioKg = 10.0;
        }
        return precioKg * pesoKg;
    }

    public static double calcularTotal(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
