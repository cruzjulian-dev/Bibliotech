
package controlador;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;

public class PrestarLibroController {
    
    public static VentanaPrestarLibro ventana = new VentanaPrestarLibro();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void botonVolver(){
        ocultar();
    }
    
    public static void botonVolverEnter(java.awt.event.ActionEvent evt){
        //if(evt.getExtendedKeyCode() == VK_ENTER){
        //    ocultar();
        //}
    }
    
    public static void botonAcceso(){
        mostrar();
        ventana.getEstudianteComboBox().setVisible(false);
        ventana.getDocenteComboBox().setVisible(false);
        ventana.getBotonesSocio().add(ventana.getDocenteBoton());
        ventana.getBotonesSocio().add(ventana.getEstudianteBoton());
        
        if(ventana.getEstudianteBoton().isSelected()){
            clickEstudianteBoton();
        } else if(ventana.getDocenteBoton().isSelected()){
            clickDocenteBoton();
        }
        vaciarComboBox();
        rellenarComboBoxSocios();
        rellenarComboBoxLibro();
    }
    
    public static void botonPrestar(){
        Calendar fechaRetiro = Calendar.getInstance();
        Socio unEstudiante = new Estudiante(1, "", "");
        Socio unDocente = new Docente(2, "", "");
        Libro elLibro = new Libro("", 22, "", 2000);
        boolean banderaEstu = false;
        boolean banderaDoce = false;
        boolean banderaLibro = false;
        
        // recorro y almaceno si existe el libro seleccionado del combobox
        if(ventana.getLibroComboBox().getSelectedItem() != null){
            for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
                if(ventana.getLibroComboBox().getSelectedItem() == libro.getTitulo() && libro.prestado() == false){
                    elLibro = libro;
                    banderaLibro = true;
                }
            }
        }
        
        // recorro y almaceno si existe el estudiante seleccionado del combobox
        if(ventana.getEstudianteBoton().isSelected() && ventana.getEstudianteComboBox().getSelectedItem() != null){
            for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
                if(socio.getNombre().equals(ventana.getEstudianteComboBox().getSelectedItem()) && socio.puedePedir() == true){
                    unEstudiante = socio;
                    banderaEstu = true;
                } 
            }
        }
        
        // recorro y almaceno si existe el docente seleccionado del combobox
        if(ventana.getDocenteBoton().isSelected() && ventana.getDocenteComboBox().getSelectedItem() != null){
            for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
                if(socio.getNombre().equals(ventana.getDocenteComboBox().getSelectedItem()) && socio.puedePedir() == true){
                    unDocente = socio;
                    banderaDoce = true;
                }
            }
        }
        
        if(banderaLibro == true && (banderaEstu == true && banderaDoce == false)){
            SimpleDateFormat formatRetiro = new SimpleDateFormat("dd/MM/yyyy");
            String fechaRetiroStr = formatRetiro.format(fechaRetiro.getTime());
            ventana.getFechaEditLabel().setText(fechaRetiroStr);
            GestionBiblioteca.getBiblioteca().prestarLibro(fechaRetiro, unEstudiante, elLibro);
            vaciarComboBox();
            rellenarComboBoxLibro();
            rellenarComboBoxSocios();
            JOptionPane.showMessageDialog(null, "El prestamo se ha realizado exitosamente!");
        } else if(banderaLibro == true &&(banderaEstu == false && banderaDoce == true)){
            SimpleDateFormat formatRetiro = new SimpleDateFormat("dd/MM/yyyy");
            String fechaRetiroStr = formatRetiro.format(fechaRetiro.getTime());
            ventana.getFechaEditLabel().setText(fechaRetiroStr);
            GestionBiblioteca.getBiblioteca().prestarLibro(fechaRetiro, unDocente, elLibro);  
            vaciarComboBox();
            rellenarComboBoxLibro();
            rellenarComboBoxSocios();
            JOptionPane.showMessageDialog(null, "El prestamo se ha realizado exitosamente!");
        } else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar realizar el prestamo");
        }   
    }
    
    public static void botonPrestarEnter(java.awt.event.ActionEvent evt){
        //
    }
    
    public static void clickEstudianteBoton(){
        ventana.getEstudianteComboBox().setVisible(true);
        ventana.getDocenteComboBox().setVisible(false);
    }
    
    public static void clickDocenteBoton(){
        ventana.getEstudianteComboBox().setVisible(false);
        ventana.getDocenteComboBox().setVisible(true);
    }
    
    public static void rellenarComboBoxSocios(){
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
    
    public static void rellenarComboBoxLibro(){
        for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
            if(libro.prestado() == false){
                String tituloLibro = libro.getTitulo();
                ventana.getLibroComboBox().addItem(tituloLibro);
            }
        }
    }
    
    public static void vaciarComboBox(){
        ventana.getEstudianteComboBox().removeAllItems();
        ventana.getDocenteComboBox().removeAllItems();
        ventana.getLibroComboBox().removeAllItems();
    }
    
}
