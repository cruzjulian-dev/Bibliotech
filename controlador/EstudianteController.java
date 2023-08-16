
package controlador;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;

public class EstudianteController {
    
    public static VentanaEstudiante ventana = new VentanaEstudiante();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void limpiarFields(){
        ventana.getDniField().setText(""); // limpiar field
        ventana.getNombreField().setText(""); // limpiar field
        ventana.getCarreraField().setText(""); // limpiar field
    }
    
    // Inicio eventos botones
    public static void obtenerRegistrar(){
        String nombre = ventana.getNombreField().getText(); // recuperar datos del field
        int dni = Integer.parseInt(ventana.getDniField().getText()); // recuperar datos del field
        String carrera = ventana.getCarreraField().getText(); // recuperar datos del field
        Estudiante estu = new Estudiante(dni, nombre, carrera); // instanciar un Estudiante
        GestionBiblioteca.getBiblioteca().addSocio(estu); // agregar Estudiante a la listas de socios
        JOptionPane.showMessageDialog(null, "El socio '" + nombre + "' ha sido registrado con exito!");
    }
    
    public static void botonVolver(){
        ventana.setVisible(false);
        EstudianteController.limpiarFields();
    }
    
    public static void botonVolverEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            ventana.setVisible(false);
            EstudianteController.limpiarFields();
        }
    }
    
    public static void botonRegistrar(){
        if(ventana.getDniField().getText().equals("") || ventana.getNombreField().getText().equals("") || ventana.getCarreraField().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos antes de continuar");
        } else if ((GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())) != null && GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())).soyDeLaClase() == "Docente") || (GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())) != null && GestionBiblioteca.getBiblioteca().buscarSocio(Integer.parseInt(ventana.getDniField().getText())).soyDeLaClase() == "Estudiante")){
            JOptionPane.showMessageDialog(null, "Ya existe otro socio registrado con el mismo numero de DNI");
        } else {
            EstudianteController.obtenerRegistrar();
            EstudianteController.limpiarFields();
        }
    }
    
    public static void botonRegistrarEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            EstudianteController.botonRegistrar();
        }
    }
    // Fin eventos botones
    
    // Inicio eventos FieldTexts
    public static void carreraFieldEvent(java.awt.event.KeyEvent evt){
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
    // Fin eventos FieldTexts
}
