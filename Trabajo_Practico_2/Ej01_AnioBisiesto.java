/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

public class Ej01_AnioBisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el anio: ");
        int anio = sc.nextInt();
        
        boolean bisiesto = (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);
        
        if (bisiesto){
            System.out.println("El anio " + anio + " es bisiesto.");
        }
        else{
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
        
        sc.close();
    }   
}
