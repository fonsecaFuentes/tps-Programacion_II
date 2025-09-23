
package editorvideoproyectorender;

public class Render {
    // Atributos
    private final Formato formato;
    private Proyecto proyecto;  // Asociacion 1:1
    
    // Constructor
    public Render(Formato formato) {
        this.formato = formato;
    }
    
    // Metodos
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    private String datosProyecto() {
        String infoProyecto = "Sin información sobre el Proyecto...";
        if (proyecto != null) {
            infoProyecto = proyecto.toString() + "\nFormato " + formato;
        }
        return infoProyecto;
    }
    
    public void imprimirDatosProyecto() {
        System.out.println(datosProyecto());
    }
}
