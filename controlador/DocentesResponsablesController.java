
package controlador;
import vistas.*;
import modelo.*;

public class DocentesResponsablesController {
    
    public static VentanaDocentesResponsables ventana = new VentanaDocentesResponsables();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void listarDocentes(){
        ventana.getTextArea().setText(GestionBiblioteca.getBiblioteca().listaDeDocentesResponsables());
    }
    
    public static void botonAcceso(){
        ventana.setVisible(true);
        listarDocentes();
    }    
    
    public static void botonVolver(){
        ocultar();
    }
}
