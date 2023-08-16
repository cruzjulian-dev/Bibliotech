
package modelo;

/**
 * Clase Prestamo
 * 
 * @author candia jose
 * @version 
 */

import java.util.*;
import java.io.Serializable;
import java.text.*;

public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L; //Versionado de la clase al serializar
    // atributos
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Libro libro;
    private Socio socio;

    /**
     * Constructor de la clase que permite crear objetos de este tipo
     * 
     * @param fecha de retiro, socio, libro
     */
    public Prestamo(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro) {
        this.setFechaRetiro(p_fechaRetiro);
        this.setFechaDevolucion(null);
        this.setLibro(p_libro);
        this.setSocio(p_socio);
    }

    // getters
    public Calendar getFechaRetiro() {
        return this.fechaRetiro;
    }

    public Calendar getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public Socio getSocio() {
        return this.socio;
    }

    // setters
    private void setFechaRetiro(Calendar p_fechaRetiro) {
        this.fechaRetiro = p_fechaRetiro;
    }

    private void setFechaDevolucion(Calendar p_fechaDevolucion) {
        this.fechaDevolucion = p_fechaDevolucion;
    }

    private void setSocio(Socio p_socio) {
        this.socio = p_socio;
    }

    private void setLibro(Libro p_libro) {
        this.libro = p_libro;
    }

    // metodos
    /**
     * Metodo que permite registrar una fecha de devolucion
     * 
     * @param fecha de devolucion
     */
    public void registrarFechaDevolucion(Calendar p_fechaDevolucion) {
        this.setFechaDevolucion(p_fechaDevolucion);
    }

    /**
     * Metodo que retorna un string concatenado los datos del prestamo, socio y
     * libro
     * 
     * @return string datos del prestamo
     */
    public String toString() {
        // formato fecha retiro
        SimpleDateFormat formatRetiro = new SimpleDateFormat("yyyy/MM/dd");
        String fechaRetiroStr = formatRetiro.format(this.getFechaRetiro().getTime());

        // formato fecha devolucion
        SimpleDateFormat formatDev = new SimpleDateFormat("yyyy/MM/dd");
        Calendar fechaDevolucion = this.getFechaDevolucion();

        //Da formato a la fecha de devolucion, o si no hay fecha de devolucion, devuelve "No devuelto"
        String fechaDevolucionStr = fechaDevolucion != null ? formatDev.format(fechaDevolucion.getTime())
                : "No devuelto";

        return "Retiro: " + fechaRetiroStr + " - " + "Devolucion: " + fechaDevolucionStr + "\nLibro: "
                + this.getLibro().getTitulo() + "\nSocio: " + this.getSocio().getNombre();
    }

    /**
     * Metodo que comprueba si la fecha pasada como parametro es mayor a la fecha de
     * vencimiento
     * 
     * @param objeto de tipo Calendar
     * @return true o false
     */
    public boolean vencido(Calendar p_fecha) {
    
        //create copy of this.getFechaRetiro()
         // Calendar fechaVencimiento = this.getFechaRetiro(); //tomar una copia aca
        Calendar fechaVencimiento = Calendar.getInstance();
        fechaVencimiento.setTime(this.getFechaRetiro().getTime());
        fechaVencimiento.add(Calendar.DATE, this.getSocio().getDiasPrestamo());
        return p_fecha.after(fechaVencimiento);
    }

}
