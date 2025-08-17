package tp2;

import java.util.Scanner;

public class Ej04_DescuentoPorCategoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingresa la categoria (A, B o C): ");
        char cat = sc.next().trim().toUpperCase().charAt(0);

        double porc;
        switch (cat) {
            case 'A': porc = 0.10; break;
            case 'B': porc = 0.15; break;
            case 'C': porc = 0.20; break;
            default:
                System.out.println("Categoria invalida");
                return;
        }

        double descuento = precio * porc;
        double finalP = precio - descuento;

        System.out.println("Descuento aplicado: " + (int)(porc * 100) + "%");
        System.out.println("Precio final: " + finalP);
        
        sc.close();
    }
    
}
