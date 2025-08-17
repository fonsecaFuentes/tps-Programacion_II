/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

public class Ej07_ValidacionNotaDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: nota invalida. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);
        
        sc.close();
    }
    
}
