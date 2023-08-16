
package controlador;
import vistas.*;
import modelo.*;

public class ListaLibrosController {
    
    public static VentanaListaLibros ventana = new VentanaListaLibros();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void listarLibros(){
        ventana.getTextArea().setText(GestionBiblioteca.getBiblioteca().listaDeLibros());
        ventana.getTextArea().setEditable(false);
    }
    
    public static void botonAcceso(){
        ListaLibrosController.mostrar();
        ListaLibrosController.listarLibros();
    }
    
    public static void botonVolver(){
        ocultar();
    }
}
