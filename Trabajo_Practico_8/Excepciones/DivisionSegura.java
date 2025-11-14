
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Solicita dos enteros y realiza la división a/b con manejo de errores:
 * - ArithmeticException si b == 0
 * - NumberFormatException / InputMismatch si la entrada no es un entero
 */
public class DivisionSegura {
    public static void run(Scanner sc) {
        try {
             System.out.print("Ingrese dividendo (entero): ");
             int a = Integer.parseInt(sc.nextLine().trim());
             
             System.out.print("Ingrese divisor  (entero): ");
             int b = Integer.parseInt(sc.nextLine().trim());
             
             int resultado = a / b;
             System.out.println("Resultado: " + resultado);
        } catch(ArithmeticException ex) {
            System.out.println("Error: división por cero no permitida.");
        } catch (NumberFormatException | InputMismatchException ex) {
             System.out.println("Error: debés ingresar números enteros.");
        }
    }
}
