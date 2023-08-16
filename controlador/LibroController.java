
package controlador;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import modelo.GestionBiblioteca;
import vistas.*;
import modelo.*;

public class LibroController {
    
    public static VentanaLibro ventana = new VentanaLibro();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void limpiarFields(){
        ventana.getTituloField().setText("");
        ventana.getEdicionField().setText("");
        ventana.getEditorialField().setText("");
        ventana.getAnioField().setText("");
    }
    
    public static void obtenerRegistrar(){
        String titulo = ventana.getTituloField().getText();
        int edicion = Integer.parseInt(ventana.getEdicionField().getText());
        String editorial = ventana.getEditorialField().getText();
        int anio = Integer.parseInt(ventana.getAnioField().getText());
        Libro unLibro = new Libro(titulo, edicion, editorial, anio);
        GestionBiblioteca.getBiblioteca().addLibro(unLibro);
        GestionBibliotecaController.botonActualizar();
        JOptionPane.showMessageDialog(null, "El libro '" + titulo + "' ha sido agregado con exito!");
    }
    
    // Inicio eventos botones
    public static void botonLibro(){
        LibroController.mostrar();
    }
    
    public static void botonLibroEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            LibroController.botonLibro();
        }
    }
    
    public static void botonAgregar(){
        if(ventana.getTituloField().getText().equals("") || ventana.getEdicionField().getText().equals("") || ventana.getEditorialField().getText().equals("") || ventana.getAnioField().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos antes de continuar");
        } else {
            LibroController.obtenerRegistrar();
            LibroController.limpiarFields();
        }
    }
    
    public static void botonAgregarEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            LibroController.botonAgregar();
        }
    }
    
    public static void botonVolver(){
        LibroController.ocultar();
    }
    
    public static void botonVolverEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode()==VK_ENTER){
            LibroController.botonVolver();
        }
    }
    // Fin eventos Botones
    
    // Inicio eventos FieldTexts
    public static void edicionFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57; // rango de caractares numericos de la tabla ASCII
        
        if (!numeros || ventana.getEdicionField().getText().length() >= 8){
             evt.consume(); // no registra los caracteres que no sean numericos
        } 
    }
    
    public static void anioFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57; // rango de caractares numericos de la tabla ASCII
        
        if (!numeros || ventana.getAnioField().getText().length() >= 4){
             evt.consume(); // no registra los caracteres que no sean numericos
        } 
    }
    // Fin eventos FieldTexts
}
