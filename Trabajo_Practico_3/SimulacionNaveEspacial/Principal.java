package simulacionnaveespacial;

public class Principal {

    public static void main(String[] args) {
        NaveEspacial enterprise = new NaveEspacial();

        enterprise.setNombre("USS Enterprise");
        enterprise.setCombustible(50);
        enterprise.mostrarEstado();

        System.out.println("\n--- Intento 1: avanzar sin despegar (y sin recargar) ---");
        enterprise.avanzar(60);

        System.out.println("\n--- Despegue ---");
        enterprise.despegar();

        System.out.println("\n--- Intento 2: avanzar 60 con solo 50 de combustible ---");
        enterprise.avanzar(60);

        System.out.println("\n--- Recarga ---");
        enterprise.recargarCombustible(100);

        System.out.println("\n--- Intento 3: avanzar correctamente ---");
        enterprise.avanzar(60);

        System.out.println("\n--- Estado final ---");
        enterprise.mostrarEstado();
    }
    
}
