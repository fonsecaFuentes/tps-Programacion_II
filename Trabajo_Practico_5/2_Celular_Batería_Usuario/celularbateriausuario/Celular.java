
package CelularBateriaUsuario;

public class Celular {
    // Atributos
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    // Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    // Metodos
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public void datosCelular() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Imei: " + imei);
        if (bateria != null) {
            System.out.println("Capacidad de bateria: " + mostrarCapacidadBateria() + " mAh");
            System.out.println("Modelo de bateria: " + mostarModeloBateria());
        }else {
            System.out.println("El dispositivo no tiene batería");
        }
    }
    
    public String mostarModeloBateria() {
        String infoModeloBateria = "Sin bateria";
        if (bateria != null) {
            infoModeloBateria = bateria.getModelo();
        }
        return infoModeloBateria;
    }
    
    public int mostrarCapacidadBateria() {
        int infoCapacidadBateria = 0;
        if (bateria != null) {
            infoCapacidadBateria = bateria.getCapacidadMah();
        }
        return infoCapacidadBateria;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
}
