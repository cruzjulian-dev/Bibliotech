
package controlador;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;

public class DevolverLibroController {
    
    public static VentanaDevolverLibro ventana = new VentanaDevolverLibro();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void botonAcceso(){
        vaciarComboBox();
        rellenarComboBox();
        mostrar();
    }
    
    public static void botonVolver(){
        ocultar();
    }
    
    public static void botonDevolver(){
        Libro elLibro = new Libro("", 1, "", 2);
        if(ventana.getComboBox().getSelectedItem() != null){
            
            for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
                if(libro.prestado() == true && libro.getTitulo().equals(ventana.getComboBox().getSelectedItem())){
                    elLibro = libro;
                }
            }
            
            GestionBiblioteca.getBiblioteca().devolverLibro(elLibro);
            vaciarComboBox();
            rellenarComboBox();
            JOptionPane.showMessageDialog(null, "La devolucion fue realizada existosamente!");
        } else {
            JOptionPane.showMessageDialog(null, "La lista de libros esta vacia!");
        }
    }
    
    public static void botonDevolver(Libro libro){
        GestionBiblioteca.getBiblioteca().devolverLibro(libro);
        JOptionPane.showMessageDialog(null, "La devolucion fue realizada existosamente!");
    }
    
    public static void rellenarComboBox(){
        for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
            if(libro.prestado() == true){
                String tituloLibro = libro.getTitulo();
                ventana.getComboBox().addItem(tituloLibro);
            }
        }
    }
    
    public static void vaciarComboBox(){
        ventana.getComboBox().removeAllItems();
    }
}
