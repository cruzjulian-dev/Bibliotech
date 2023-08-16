
package controlador;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import modelo.*;
import vistas.*;


public class DocenteController {
    
    public static VentanaDocente ventana = new VentanaDocente();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void limpiarFields(){
        ventana.getDniField().setText(""); // limpiar field
        ventana.getNombreField().setText(""); // limpiar field
        ventana.getAreaField().setText(""); // limpiar field
    }
    
    // Inicio eventos botones
    public static void obtenerRegistrar(){
        String nombre = ventana.getNombreField().getText(); // recuperar datos del field
        int dni = Integer.parseInt(ventana.getDniField().getText()); // recuperar datos del field
        String area = ventana.getAreaField().getText(); // recuperar datos del field
        Docente doce = new Docente(dni, nombre, area); // instanciar un Docente
        GestionBiblioteca.getBiblioteca().addSocio(doce); // agregar Docente a la lista de Socios
        JOptionPane.showMessageDialog(null, "El socio '" + nombre + "' ha sido registrado con exito!");
    }
    
    public static void botonVolver(){
        ventana.setVisible(false);
        DocenteController.limpiarFields();
    }
    
    public static void botonVolverEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            ventana.setVisible(false);
            DocenteController.limpiarFields();
        } else {
            //
        }
    }
    
    public static void botonRegistrar(){
        if(ventana.getDniField().getText().equals("") || ventana.getNombreField().getText().equals("") || ventana.getAreaField().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos antes de continuar");
        } else if((GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())) != null && GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())).soyDeLaClase() == "Docente") || (GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())) != null && GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())).soyDeLaClase() == "Estudiante")){
            JOptionPane.showMessageDialog(null, "Ya existe otro socio registrado con el mismo numero de DNI");
        } else {
            DocenteController.obtenerRegistrar();
            DocenteController.limpiarFields();
        }
    }
    
    public static void botonRegistrarEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            DocenteController.botonRegistrar();
        }         
    }
    // Fin eventos botones
    
    // Inicio eventos FieldTexts
    public static void areaFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90; // segun tabla ASCII
        boolean minusculas = key >= 97 && key <= 122; // segun tabla ASCII
        boolean punto = key == 46; // segun tabla ASCII 
        boolean espacio = key == 32; // segun tabla ASCII
            
        if (!(minusculas || mayusculas || espacio || punto)){
            evt.consume(); // no registra los caracteres que no sean alfabeticos
        }
    }
    
    public static void nombreFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90; // segun tabla ASCII
        boolean minusculas = key >= 97 && key <= 122; // segun tabla ASCII
        boolean punto = key == 46; // segun tabla ASCII 
        boolean espacio = key == 32; // segun tabla ASCII
            
        if (!(minusculas || mayusculas || espacio || punto)){
            evt.consume(); // no registra los caracteres que no sean alfabeticos
        }
    }
    
    public static void dniFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57; // rango de caractares numericos de la tabla ASCII
        
        if (!numeros || ventana.getDniField().getText().length() >= 8){
             evt.consume(); // no registra los caracteres que no sean numericos
        } 
    }
}
