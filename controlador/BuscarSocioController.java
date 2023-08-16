
package controlador;
import vistas.*;
import modelo.*;

public class BuscarSocioController {
 
    public static VentanaBuscarSocio ventana = new VentanaBuscarSocio();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void limpiarFields(){
        ventana.getDniField().setText("");
        ventana.getSocioLabel().setText("");
    }
    
    public static void botonAcceso(){
        BuscarSocioController.limpiarFields();
        BuscarSocioController.mostrar();
    }
    
    public static void botonBuscar(){
        try{
            if(GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())) != null){
            ventana.getSocioLabel().setText(GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())).toString());
            } else {
            ventana.getSocioLabel().setText("El DNI buscado no pertenece a ningun socio registrado en el sistema!");
        }
        } catch (Exception e) {
            System.out.println("Excepcion atrapada");
        }
    }
    
    public static void botonVolver(){
        BuscarSocioController.ocultar();
    }
    
    public static void dniFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57; // rango de caractares numericos de la tabla ASCII
        
        if (!numeros || ventana.getDniField().getText().length() >= 8){
             evt.consume(); // no registra los caracteres que no sean numericos
        } 
    }
    
    
}
