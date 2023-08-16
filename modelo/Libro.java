
package modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Clase que permite registrar libros para una biblioteca
 * 
 * @author (Gonzalo A.G Cristaldo)
 * @version (16.11.22)
 */
public class Libro implements Serializable {
  private static final long serialVersionUID = 1L; //Versionado de la clase al serializar

  // Atributos
  private String titulo;
  private int edicion;
  private String editorial;
  private int anio;
  private ArrayList<Prestamo> prestamos;

  /**
   * Constructor de la clase Libro
   * 
   * @param String titulo
   * @param int    edicion
   * @param String editorial
   * @param int    anio
   * @return No retorna nada.
   */
  public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio) {
    this.setTitulo(p_titulo);
    this.setEdicion(p_edicion);
    this.setEditorial(p_editorial);
    this.setAnio(p_anio);
    this.setPrestamos(new ArrayList<Prestamo>());
  }

  public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio, ArrayList<Prestamo> p_prestamos) {
    this.setTitulo(p_titulo);
    this.setEdicion(p_edicion);
    this.setEditorial(p_editorial);
    this.setAnio(p_anio);
    this.setPrestamos(p_prestamos);
  }

  // Accesors y obs

  // Setters
  private void setTitulo(String p_titulo) {
    this.titulo = p_titulo;
  }

  private void setEdicion(int p_edicion) {
    this.edicion = p_edicion;
  }

  private void setEditorial(String p_editorial) {
    this.editorial = p_editorial;
  }

  private void setAnio(int p_anio) {
    this.anio = p_anio;
  }

  private void setPrestamos(ArrayList<Prestamo> p_prestamos) {
    this.prestamos = p_prestamos;
  }

  // Getters
  /**
   * Se devuelve el titulo del libro - String
   * 
   * @return String que es el Titulo
   */
  public String getTitulo() {
    return this.titulo;
  }

  /**
   * Se devuelve el numero de edicion
   * 
   * @return int que es la Edicion
   */
  public int getEdicion() {
    return this.edicion;
  }

  /**
   * Se devuelve el nombre de la editorial del libro
   * 
   * @return String que es la Editorial
   */
  public String getEditorial() {
    return this.editorial;
  }

  public ArrayList<Prestamo> getPrestamos() {
    return this.prestamos;
  }

  /**
   * Se devuelve el año de publicacion del libro
   * 
   * @return int que es el Año
   */
  public int getAnio() {
    return this.anio;
  }

  /**
   * Se devuelve el ultimo Prestamo del arrayList
   * 
   * @return el ultimo prestamo
   */
  public Prestamo getPrestamo() {

    // Busco tamaño arrayList del prestamo
    int cantidadPrestamos = this.getPrestamos().size();
    // Si no esta vacio significa que hay un prestamo,
    // y lo retorno
    if (this.getPrestamos().isEmpty()) {
      // Si esta vacio, significa que el libro no esta prestado
      // y lo retorno.
      return null;
    } else {
      
      return this.getPrestamos().get(cantidadPrestamos - 1);
    }
  }

  // Metodos
  /**
   * Se permite agregar un prestamo al arrayList
   * 
   * @param p_prestamo de tipo Prestamo
   * @return true/false segun se pudo agregar o no un prestamo.
   */
  public boolean addPrestamo(Prestamo p_prestamo) {
    return this.getPrestamos().add(p_prestamo);
  }

  /**
   * Se permite eliminar un prestamo del arrayList
   * 
   * @param p_prestamo de tipo Prestamo
   * @return true/false segun se remover o no un prestamo.
   */
  public boolean removePrestamo(Prestamo p_prestamo) {
    return this.getPrestamos().remove(p_prestamo);
  }

  /**
   * Este metodo controla el estado del prestamo.
   * 
   * @return true/false indicando el estado del prestamo
   */
  public boolean prestado() {
    if (this.getPrestamos().isEmpty()) {
      return false;
    } else {
      return this.getPrestamo().getFechaDevolucion() == null;
    }
  }

  /**
   * retorna una leyenda en String con el Titulo del libro
   * 
   * @return String que es el Titulo
   */
  public String toString() {
    return "Titulo: " + this.getTitulo();
  }
}