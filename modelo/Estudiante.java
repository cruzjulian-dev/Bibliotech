
package modelo;

import java.io.Serializable;
import java.util.*;
/**
 * Clase que representa a un Estudiante que hereda de la clase Socio
 * 
 * @author (Julian Luis Cruz) 
 * @version (1.0)
 */
public class Estudiante extends Socio implements Serializable {
    private static final long serialVersionUID = 1L; //Versionado de la clase al serializar
    
    private String carrera;
    
    /**
     * Constructor que recibe Dni, Nombre y Carrera para instanciar un Estudiante
     * @param p_dniSocio de tipo int
     * @param p_nombre de tipo String
     * @param p_carrera de tipo String
     */
    public Estudiante(int p_dniSocio, String p_nombre, String p_carrera){
        super(p_dniSocio, p_nombre, 20);
        this.setCarrera(p_carrera);
    }
    
    public Estudiante(int p_dniSocio, String p_nombre, ArrayList <Prestamo> p_prestamos, String p_carrera){
        super(p_dniSocio, p_nombre, 20, p_prestamos);
        this.setCarrera(p_carrera);
    }
    // Setters
    private void setCarrera(String p_carrera){
        this.carrera = p_carrera;
    }
    // Fin Setters
    
    // Getters
    public String getCarrera(){
        return this.carrera;
    }
    // Fin Getters
    
    // Métodos
    /**
     * Metodo que retorna true si el Estudiante puede pedir un Prestamo
     * @return boolean
     */
    @Override
    public boolean puedePedir(){
       return super.puedePedir() && super.cantLibrosPrestados() < 3;
    }
    
    /**
     * Retorna un String indicando a la clase a la cuál pertenece
     * @return String
     */
    @Override
    public String soyDeLaClase(){
        return "Estudiante";
    }
    // Fin Métodos
}

