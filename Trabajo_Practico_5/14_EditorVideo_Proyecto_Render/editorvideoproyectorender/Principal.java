
package editorvideoproyectorender;

public class Principal {

    public static void main(String[] args) {
        EditorVideo editor = new EditorVideo();
        Proyecto proyecto = new Proyecto("Trailer oficial – GameHaven", 2);
        editor.exportar(Formato.MKV, proyecto);
        
    }
    
}
