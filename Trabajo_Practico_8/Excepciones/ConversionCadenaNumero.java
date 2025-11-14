
package excepciones;

import java.util.Scanner;

/**
 * Lee un texto y lo intenta convertir a int con Integer.parseInt.
 * Maneja NumberFormatException si no es válido.
 */
public class ConversionCadenaNumero {
    public static void run(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        String texto = sc.nextLine();
        
        try {
            int valor = Integer.parseInt(texto.trim());
            System.out.println("Entero válido: " + valor);
        } catch(NumberFormatException ex) {
             System.out.println("Error: el texto ingresado no es un entero válido.");
        }
    }
}
