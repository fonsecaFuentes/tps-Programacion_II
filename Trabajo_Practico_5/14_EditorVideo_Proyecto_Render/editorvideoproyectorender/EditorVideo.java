
package editorvideoproyectorender;

public class EditorVideo {
    // Atributos
    // Constructor
    // Metodos
    public void exportar(Formato formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        render.imprimirDatosProyecto();
    }
}
