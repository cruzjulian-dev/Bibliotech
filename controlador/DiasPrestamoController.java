
package controlador;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;

public class DiasPrestamoController {
    
    public static VentanaDiasPrestamo ventana = new VentanaDiasPrestamo();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void rellenarComboBox(){
        for(Docente docente : GestionBiblioteca.getBiblioteca().docentesResponsables()){
            String nombreDocente = docente.getNombre();
            ventana.getComboBox().addItem(nombreDocente);
        }
    }
    
    public static void vaciarComboBox(){
        ventana.getComboBox().removeAllItems();
    }
    
    public static void limpiarFields(){
        ventana.getNumeroField().setText(null);
    }
    
    public static void botonAcceso(){
        mostrar();
        vaciarComboBox();
        limpiarFields();
        rellenarComboBox();
    }
    
    public static void botonVolver(){
        ocultar();
    }
    
    public static void botonAgregar(){
        Docente unDocente = new Docente(1, "", "");
        int dias = 0;
        try {
            if(ventana.getComboBox().getSelectedItem() != null && ventana.getNumeroField().getText() != null){
            for(Docente docente : GestionBiblioteca.getBiblioteca().docentesResponsables()){
                if(docente.getNombre().equals(ventana.getComboBox().getSelectedItem())){
                    unDocente = docente;
                }
            }
            dias = Integer.parseInt(ventana.getNumeroField().getText());
            unDocente.agregarDiasDePrestamo(dias);
            vaciarComboBox();
            limpiarFields();
            rellenarComboBox();  
            JOptionPane.showMessageDialog(null, "Se han agregado '" + dias + "' dias de prestamo al docente");
            } else {
            JOptionPane.showMessageDialog(null, "Debe completar los campos antes de continuar");
            }
        } catch(Exception e){
            System.out.println("Excepcion registrada");
        }
    }
    
    public static void numeroFieldEvent(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57; // rango de caractares numericos de la tabla ASCII
        
        if (!numeros || ventana.getNumeroField().getText().length() >= 8){
             evt.consume(); // no registra los caracteres que no sean numericos
        } 
    }
}
