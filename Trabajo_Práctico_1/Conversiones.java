/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoPractico1;

import java.util.Scanner;

public class Conversiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura con int
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = sc.nextInt();

        int divisionEntera = num1 / num2;
        System.out.println("Division entera: " + divisionEntera);

        // Conversión a double
        double divisionDecimal = (double) num1 / num2;
        System.out.println("Division con decimales: " + divisionDecimal);

        sc.close();
    }
    
}
