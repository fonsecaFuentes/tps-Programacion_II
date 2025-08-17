/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

public class Ej10_ActualizarStock {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Stock actual: ");
        int stock = sc.nextInt();

        System.out.print("Cantidad vendida: ");
        int vendida = sc.nextInt();

        System.out.print("Cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevo = actualizarStock(stock, vendida, recibida);
        System.out.println("Nuevo stock: " + nuevo);
        
        sc.close();
    }
    
    public static int actualizarStock(int stockActual, int vendida, int recibida) {
        return stockActual - vendida + recibida;
    }
    
}
