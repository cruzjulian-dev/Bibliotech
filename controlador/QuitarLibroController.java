
package controlador;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;


public class QuitarLibroController {
    
    public static VentanaQuitarLibro ventana = new VentanaQuitarLibro();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void botonVolver(){
        QuitarLibroController.ocultar();
    }
    
    public static void botonAcceso(){
        QuitarLibroController.mostrar();
        QuitarLibroController.vaciarComboBox();
        QuitarLibroController.rellenarComboBox();
        ventana.getComboBox().setVisible(true);
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
    
    public static void botonQuitar(){
        Libro elLibro = new Libro("", 22, "", 2000);
        
        if(ventana.getComboBox().getSelectedItem() != null){
            for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
                if(ventana.getComboBox().getSelectedItem() == libro.getTitulo()){
                    elLibro = libro;
                }
            }
            for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
                if(GestionBiblioteca.getBiblioteca().quienTieneElLibro(elLibro) == socio.getNombre()){
                    GestionBiblioteca.getBiblioteca().devolverLibro(elLibro);               
                }
            }
            GestionBiblioteca.getBiblioteca().removeLibro(elLibro);
            JOptionPane.showMessageDialog(null, "Se ha quitado el libro '" + elLibro.getTitulo() + "'");
        } else {
            JOptionPane.showMessageDialog(null, "La lista de libros esta vacia!");
        }
        QuitarLibroController.vaciarComboBox();
        QuitarLibroController.rellenarComboBox();
        GestionBibliotecaController.botonActualizar(); 
    }
}
