/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoPractico1;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         // Ingreso números
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = sc.nextInt();

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // Para evitar una división por cero
        String divisionResultado;
        if (num2 != 0) {
            double division = (double) num1 / num2;
            divisionResultado = String.valueOf(division);
        } else {
            divisionResultado = "Error: division por cero";
        }

        // Resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + divisionResultado);

        sc.close();
    }
    
}
