package controlador;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import modelo.*;
import vistas.*;

public class QuitarSocioController {
    public static VentanaQuitarSocio ventana = new VentanaQuitarSocio();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.getEstudianteComboBox().setVisible(false);
        ventana.getDocenteComboBox().setVisible(false);
        ventana.getBotonesSocio().add(ventana.getDocenteBoton());
        ventana.getBotonesSocio().add(ventana.getEstudianteBoton());
        
        if(ventana.getEstudianteBoton().isSelected()){
            QuitarSocioController.clickEstudianteBoton();
        } else if(ventana.getDocenteBoton().isSelected()){
            QuitarSocioController.clickDocenteBoton();
        }
    }
    
    /**
     * Metodo que ejecuta otra series de metodos cuando se hace click en Quitar Socio desde el menu principal
     */
    public static void botonAcceso(){
        QuitarSocioController.vaciarComboBox();
        QuitarSocioController.rellenarComboBox();
        QuitarSocioController.mostrar();
    }
    
    public static void botonAccesoEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode() == VK_ENTER){
            QuitarSocioController.vaciarComboBox();
            QuitarSocioController.rellenarComboBox();
            QuitarSocioController.mostrar();
        }
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void rellenarComboBox(){
        for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
            if(socio.soyDeLaClase().equals("Estudiante")){
                String nombre = socio.getNombre();
                ventana.getEstudianteComboBox().addItem(nombre);
            } else {
                String nombre = socio.getNombre();
                ventana.getDocenteComboBox().addItem(nombre);
            }
        }
    }
    
    public static void vaciarComboBox(){
        ventana.getEstudianteComboBox().removeAllItems();
        ventana.getDocenteComboBox().removeAllItems();
    }
    
    public static void quitarBoton(){
        Socio removerDoce = new Docente(12345678, "", "");
        Socio removerEstu = new Estudiante(12345678, "", "");
        
        if(ventana.getEstudianteBoton().isSelected()){
            for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
                if(socio.getNombre().equals(ventana.getEstudianteComboBox().getSelectedItem())){
                    removerEstu = socio;
                }   
            }
            GestionBiblioteca.getBiblioteca().removeSocio(removerEstu);
            QuitarSocioController.vaciarComboBox();
            QuitarSocioController.rellenarComboBox();
            GestionBibliotecaController.botonActualizar();
            if(removerEstu.getNombre().equals("")){
                JOptionPane.showMessageDialog(null, "La lista de socios Estudiantes esta vacía");
            } else{
                JOptionPane.showMessageDialog(null, "Se ha quitado al socio '" + removerEstu.getNombre() + "'");
            }
            
        }
        
        if(ventana.getDocenteBoton().isSelected()){
            for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
                if(socio.getNombre().equals(ventana.getDocenteComboBox().getSelectedItem())){
                    removerDoce = socio;
                }   
            }
            GestionBiblioteca.getBiblioteca().removeSocio(removerDoce);
            QuitarSocioController.vaciarComboBox();
            QuitarSocioController.rellenarComboBox();
            GestionBibliotecaController.botonActualizar();
            if(removerDoce.getNombre().equals("")){
                JOptionPane.showMessageDialog(null, "La lista de socios Docentes esta vacía");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha quitado al socio '" + removerDoce.getNombre() + "'");
            }  
        }
        
        if(ventana.getDocenteBoton().isSelected() == false && ventana.getEstudianteBoton().isSelected() == false){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion antes de continuar");
        }
    }
    
    public static void botonVolver(){
        QuitarSocioController.ocultar();
    }
    
    public static void botonVolverEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode() == VK_ENTER){
            QuitarSocioController.ocultar();
        }
    }
    
    public static void botonQuitarEnter(java.awt.event.KeyEvent evt){
        if(evt.getExtendedKeyCode() == VK_ENTER){
            QuitarSocioController.quitarBoton();
        }
    }
    
    public static void clickEstudianteBoton(){
        ventana.getEstudianteComboBox().setVisible(true);
        ventana.getDocenteComboBox().setVisible(false);
    }
    
    public static void clickDocenteBoton(){
        ventana.getEstudianteComboBox().setVisible(false);
        ventana.getDocenteComboBox().setVisible(true);
    }
    
}