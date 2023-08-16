
package modelo;

import java.io.Serializable;
import java.util.*;

/**
 * Clase que representa a un Docente que hereda de la clase Socio
 * 
 * @author (Julian Luis Cruz) 
 * @version (1.0)
 */
public class Docente extends Socio implements Serializable {
    private static final long serialVersionUID = 1L; //Versionado de la clase al serializar
    
    private String area;
    
    /**
     * Constructor que recibe Dni, Nombre y Area para instanciar un Docente
     * @param p_dniSocio de tipo int
     * @param p_nombre de tipo String
     * @param p_area de tipo String
     */
    public Docente(int p_dniSocio, String p_nombre, String p_area){
        super(p_dniSocio, p_nombre, 5);
        this.setArea(p_area);
    }
    
    public Docente(int p_dniSocio, String p_nombre, ArrayList <Prestamo> p_prestamos, String p_area){
        super(p_dniSocio, p_nombre, 5, p_prestamos);
        this.setArea(p_area);
    }

    // Setters
    private void setArea(String p_area){
        this.area = p_area;
    }
    // Fin Setters
    
    // Getters
    public String getArea(){
        return this.area;
    }
    // Fin Getters
    
    // Métodos
    /**
     * Metodo que retorna true si el docente cumple con los requisitos para ser considerado Responsable
     * @return boolean
     */
   
    public boolean esResponsable(){
        boolean esResponsable =  super.puedePedir();

        for(Prestamo prestamo : this.getPrestamos()){
            Calendar fechaDevuelto = prestamo.getFechaDevolucion();
            if(fechaDevuelto != null && prestamo.vencido(fechaDevuelto)) {
                esResponsable = false;
            }
        }

        return esResponsable;
    }
    
    /**
     * Metodo que permite agregar dias de prestamo pasado por parámetro si el docente es Responsable
     * @param p_dias de tipo int
     */
    public void agregarDiasDePrestamo(int p_dias){
        if(this.esResponsable() == true){
            super.setDiasPrestamo(p_dias);
        }
    }
    
    /**
     * Retorna un String indicando a la clase a la cuál pertenece
     * @return String
     */
    @Override
    public String soyDeLaClase(){
        return "Docente";
    }
    // Fin Métodos
}