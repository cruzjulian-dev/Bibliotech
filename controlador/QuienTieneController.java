
package controlador;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;

public class QuienTieneController {
 
    public static VentanaQuienTiene ventana = new VentanaQuienTiene();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void rellenarComboBox(){
        for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
            String tituloLibro = libro.getTitulo();
            ventana.getComboBox().addItem(tituloLibro);
        }
    }
    
    public static void vaciarComboBox(){
        ventana.getComboBox().removeAllItems();
    }
    
    public static void botonAcceso(){
        mostrar();
        vaciarComboBox();
        rellenarComboBox();
        ventana.getSocioLabel().setText("");
    }
    
    public static void botonBuscar(){
        Libro elLibro = new Libro("", 22, "", 2000);
        
        if(ventana.getComboBox().getSelectedItem() != null){
            for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
                if(ventana.getComboBox().getSelectedItem() == libro.getTitulo()){
                    elLibro = libro;
                }
            }
            ventana.getSocioLabel().setText(GestionBiblioteca.getBiblioteca().quienTieneElLibro(elLibro));
        } else {
            JOptionPane.showMessageDialog(null, "La lista de libros esta vacia!");
        }
        //vaciarComboBox();
        //rellenarComboBox();
        GestionBibliotecaController.botonActualizar(); 
    }
    
    public static void botonVolver(){
        ocultar();
    }
}
