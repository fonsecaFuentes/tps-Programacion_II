
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lee un archivo línea por línea usando Scanner(File).
 * Maneja FileNotFoundException si la ruta no existe.
 */
public class LecturaArchivoSimple {
    private static final String DEFAULT_PATH = "src\\excepciones\\MENSAJE_OCULTO.txt";
    
    public static void run(Scanner sc) {
        File archivo = new File(DEFAULT_PATH);
        try (Scanner fileScanner = new Scanner(archivo)) { // cierra solo
            System.out.println("\n--- Contenido (" + archivo.getAbsolutePath() + ") ---");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            System.out.println("--- Fin ---\n");
        } catch (FileNotFoundException ex) {
            System.out.println("""
                               Error: el archivo no existe o la ruta es incorrecta.
                               Ruta: """ + archivo.getAbsolutePath());
        }
    }
}
