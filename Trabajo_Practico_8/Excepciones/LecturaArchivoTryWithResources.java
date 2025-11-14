
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lee un archivo usando BufferedReader dentro de try-with-resources.
 * Maneja IOException correctamente (incluye FileNotFoundException).
 */
public class LecturaArchivoTryWithResources {
    private static final String DEFAULT_PATH = "src\\excepciones\\MENSAJE_OCULTO.txt";
    
    public static void run(Scanner sc) {

        try (BufferedReader br = new BufferedReader(new FileReader(DEFAULT_PATH))) {
            String linea;
            System.out.println("\n--- Contenido ---");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--- Fin ---\n");
        } catch (IOException ex) {
            System.out.println("Error de E/S: " + ex.getMessage());
        }
    }
}
