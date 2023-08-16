
package controlador;
import vistas.*;
import modelo.*;

public class ListaSociosController {
    
    public static VentanaListaSocios ventana = new VentanaListaSocios();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void listarSocios(){
        ventana.getTextArea().setText(GestionBiblioteca.getBiblioteca().listaDeSocios());
        ventana.getTextArea().setEditable(false);
    }
    
    public static void vaciarLista(){
        ventana.getTextArea().setText(" ");
    }
    
    public static void botonAcceso(){
        ListaSociosController.mostrar();
        ListaSociosController.vaciarLista();
        ListaSociosController.listarSocios();
    }
    
    public static void botonVolver(){
        ocultar();
    }
}
