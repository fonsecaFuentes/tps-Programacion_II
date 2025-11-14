
package excepciones;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("\n=== MENÚ – Ejercicios de Excepciones ===");
                System.out.println("1) División segura (ArithmeticException)");
                System.out.println("2) Conversión de cadena a número (NumberFormatException)");
                System.out.println("3) Lectura de archivo (FileNotFoundException)");
                System.out.println("4) Excepción personalizada (EdadInvalidaException)");
                System.out.println("5) try-with-resources con BufferedReader (IOException)");
                System.out.println("0) Salir");
                System.out.print("Elegí una opción: ");

                String input = sc.nextLine().trim();
                int opcionParse = -1;
                try { opcionParse = Integer.parseInt(input); } catch (NumberFormatException ignored) {}
                opcion = opcionParse;

                switch (opcion) {
                    case 1 -> DivisionSegura.run(sc);
                    case 2 -> ConversionCadenaNumero.run(sc);
                    case 3 -> LecturaArchivoSimple.run(sc);
                    case 4 -> runExcepcionPersonalizada(sc);
                    case 5 -> LecturaArchivoTryWithResources.run(sc);
                    case 0 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
        }
    }

    // Opción 4
    private static void runExcepcionPersonalizada(Scanner sc) {
        System.out.print("Ingresá tu edad (entero): ");
        String texto = sc.nextLine().trim();
        try {
            int edad = Integer.parseInt(texto);
            validarEdad(edad); // puede lanzar EdadInvalidaException
            System.out.println("Edad válida.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debés ingresar un número entero.");
        } catch (EdadInvalidaException e) {
            // Si tu excepción tiene mensaje propio…
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Lanza EdadInvalidaException si la edad NO está en [0, 120]
    private static void validarEdad(int edad) throws EdadInvalidaException {
        final int MIN = EdadInvalidaException.MIN_DEF;
        final int MAX = EdadInvalidaException.MAX_DEF;
        if (edad < MIN || edad > MAX) {
            throw new EdadInvalidaException(edad); // <-- PASAMOS LA EDAD
        }
    }
}
