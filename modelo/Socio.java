
package modelo;

import java.io.Serializable;

/**
 * Clase Abstracta Socio.
 * 
 * @author: candia jose
 * Date: 
 */

import java.util.*;

public abstract class Socio implements Serializable {
    private static final long serialVersionUID = 1L; //Versionado de la clase al serializar
    
    //atributos
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList <Prestamo> prestamos;
    
    
    //constructores sobrecargados
    /**
     * Constructor de la clase que permite crear objetos de este tipo
     * @param dni del socio, nombre del socio, dias de prestamo
     */
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo) {
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList <Prestamo>());
    }
    
    /**
     * Constructor de la clase que permite crear objetos de este tipo
     * @param dni del socio, nombre del socio, dias de prestamo, arrayList de prestamos
     */
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo, ArrayList <Prestamo> p_prestamos) {
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(p_prestamos);
    }
    
    //getters
    public int getDniSocio() {
        return this.dniSocio;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getDiasPrestamo() {
        return this.diasPrestamo;
    }
    
    public ArrayList <Prestamo> getPrestamos() {
        return this.prestamos;
    }
    
    //setters
    private void setDniSocio(int p_dniSocio) {
        this.dniSocio = p_dniSocio;
    }
    
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    public void setDiasPrestamo(int p_diasPrestamo) {
        this.diasPrestamo = p_diasPrestamo;
    }
    
    private void setPrestamos(ArrayList <Prestamo> p_prestamos) {
        this.prestamos = p_prestamos;
    }
    
    //metodos
    /**
     * Metodo que permite agregar un prestamo al arrayList
     * @param objeto de tipo Prestamo
     */
    public void addPrestamo(Prestamo p_prestamo) {
        this.getPrestamos().add(p_prestamo);
    }
    
    /**
     * Metodo que permite quitar un prestamo del arrayList
     * @param objeto de tipo Prestamo
     */
    public void removePrestamo(Prestamo p_prestamo) {
        this.getPrestamos().remove(p_prestamo);
    }
    
    
    /**
     * Metodo que retorna la cantidad de prestamos
     * @return cantidad de prestamos
     */
    public int cantLibrosPrestados() {
        int cant=0;
        for(Prestamo prestamo : this.getPrestamos()){
            if(prestamo.getFechaDevolucion() == null){
                cant++;
            }
        }
        return cant;
    }
    
    /**
     * Metodo que retorna un string concatenado los datos del socio
     * @return datos del socio
     */
    public String toString() {
        return "D.N.I: " + this.getDniSocio() + " || " + this.getNombre() + " (" + this.soyDeLaClase() + ") " + " || " + " Libros Prestados: " + this.cantLibrosPrestados();
    }
    
    /**
     * Metodo que retorna true si el socio no tiene ningun prestamo vencido
     * @return true o false
     */
    public boolean puedePedir() {
        boolean puedePedir = true;
        Calendar fechaHoy = new GregorianCalendar();
        
        for(Prestamo prestamo : this.getPrestamos()) {
            if(prestamo.vencido(fechaHoy)) {
                puedePedir = false;
            }
        }
        return puedePedir;
    }
    
    /**
     * Metodo abstracto
     * @return  String
     */
    public abstract String soyDeLaClase();
}
