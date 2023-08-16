
package controlador;
import javax.swing.JOptionPane;
import vistas.*;
import modelo.*;

public class GestionBibliotecaController {
    
    public static VentanaPrincipal ventana = new VentanaPrincipal();
    
    public static void mostrar(){
        ventana.getNombreEditLabel().setText(GestionBiblioteca.getBiblioteca().getNombre());
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void botonActualizar(){
        int cantEstudiantes = 0;
        int cantDocentes = 0;
        int cantLibros = 0;
        int cantPrestamosVencidos = 0;
        try{
            for(Socio socio : GestionBiblioteca.getBiblioteca().getSocios()){
                if(socio.soyDeLaClase().equals("Estudiante")){
                    cantEstudiantes++;
                } else {
                    cantDocentes++;
                }
            }
            for(Libro libro : GestionBiblioteca.getBiblioteca().getLibros()){
                cantLibros++;
            }

            GestionBiblioteca.guardarBibliotecaAArchivo("datosBiblioteca.dat");
        } catch (Exception e){
            System.out.println("Exepcion registrada!");
        }
        ventana.getEstuNumLabel().setText(cantEstudiantes+"");
        ventana.getSocioNumLabel().setText(cantDocentes+"");
        ventana.getLibrosNumLabel().setText(cantLibros+"");
        ventana.getPrestaNumLabel().setText(cantPrestamosVencidos+"");
    }
    
    public static void cambiarNombreBoton(){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese un nuevo nombre para la biblioteca");
        if(nombre != null){
            if(!nombre.trim().equals("")){
                //GestionBiblioteca.getBiblioteca().setNombre(nombre);
                //GestionBibliotecaController.botonActualizar();
                ventana.getNombreEditLabel().setText(nombre);
            }
        } 
    }
   
}