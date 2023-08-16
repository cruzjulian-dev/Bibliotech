
package modelo;

import java.io.Serializable;

/**
 * Clase Biblioteca.
 * 
 * @author Integrantes del subgrupo:
 *                                  -Jose Luis Corrales
 *                                  -Matias Bournisent
 *                                  -Juan Leonardo Aguirre 
 * @version 1.0 07/11/2022
 */

import java.util.*;

public class Biblioteca implements Serializable {
    private static final long serialVersionUID = 1L; //Versionado de la clase al serializar
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;

    /**
     * Constructor de la clase Biblioteca
     * @param p_nombre asigna el nombre de la biblioteca
     */
    public Biblioteca(String p_nombre){
        this.setNombre(p_nombre);
        this.setLibros(new ArrayList<Libro>());
        this.setSocios(new ArrayList<Socio>());
    }

    /**
     * Constructor de la clase Biblioteca
     * @param p_nombre asigna el nombre de la biblioteca
     * @param p_libros asigna un arreglo de Objetos Libro
     * @param p_socios asigna un arreglo de Objetos Socio
     */
    public Biblioteca(String p_nombre, ArrayList<Libro> p_libros, ArrayList<Socio> p_socios) {
        this.setNombre(p_nombre);
        this.setLibros(p_libros);
        this.setSocios(p_socios);
    }

    // Accesors
    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    public ArrayList<Socio> getSocios() {
        return this.socios;
    }

    // Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setLibros(ArrayList<Libro> p_libros) {
        this.libros = p_libros;
    }

    private void setSocios(ArrayList<Socio> p_socios) {
        this.socios = p_socios;
    }

    /**
     * Metodo que agrega un Objeto Socio al arreglo socios
     * @param p_socio asigna un Objeto Socio
     */
    public void addSocio(Socio p_socio) {
        this.getSocios().add(p_socio);
    }

    /**
     * Metodo que remueve un Objeto Socio al arreglo socios
     * @param p_socio asigna un Objeto Socio
     */
    public void removeSocio(Socio p_socio) {
        this.getSocios().remove(p_socio);
    }

    /**
     * Metodo que agrega un Objeto Libro al arreglo libros
     * @param p_libro asigna un Objeto Libro
     */
    public void addLibro(Libro p_libro) {
        this.getLibros().add(p_libro);
    }

    /**
     * Metodo que remueve un Objeto Libro al arreglo libros
     * @param p_libro asigna un Objeto Libro
     */
    public void removeLibro(Libro p_libro) {
        this.getLibros().remove(p_libro);
    }

    /**
     * Agrega un nuevo libro a la biblioteca
     * 
     * @param p_titulo
     * @param p_edicion
     * @param p_editorial
     * @param p_anio
     */
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio) {
        this.addLibro(new Libro(p_titulo, p_edicion, p_editorial, p_anio));
    }

    /**
     * Agrega a la biblioteca un socio de tipo Estudiante
     * 
     * @param p_dniSocio
     * @param p_nombre
     * @param p_carrera
     */
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera) {
        this.addSocio(new Estudiante(p_dniSocio, p_nombre, p_carrera));
    }

    /**
     * Agrega a la biblioteca un socio de tipo Estudiante
     * 
     * @param p_dniSocio
     * @param p_nombre
     * @param p_carrera
     */
    public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area) {
        this.addSocio(new Docente(p_dniSocio, p_nombre, p_area));
    }

    /**
     * Devuelve la cantidad de socios de un tipo especificado
     * 
     * @param p_objeto Tipo de socio a buscar
     * @return Cantidad de socios de ese tipo
     */
    public int cantidadSociosPorTipo(String p_objeto) {
        int cantidad = 0;
        for (Socio socio : this.getSocios()) {
            if (socio.soyDeLaClase().equals(p_objeto)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * Crea un préstamo y lo asigna al socio y al libro
     * @param p_fechaRetiro
     * @param p_socio
     * @param p_libro
     * @return
     */
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro) {
        if (p_socio.puedePedir()) {
            Prestamo prestamo = new Prestamo(p_fechaRetiro, p_socio, p_libro);
            p_socio.addPrestamo(prestamo);
            return p_libro.addPrestamo(prestamo);
        } else {
            return false;
        }
    }

    /**
     * Método devolverLibro. Busca un libro en el arreglo de libros y actualiza la
     * fecha de devolución con la fecha actual.
     * 
     * @param p_libro Dato de tipo de libro a buscar
     */
    public void devolverLibro(Libro p_libro){
        Calendar fechaHoy = new GregorianCalendar();

        for(Libro unLibro : this.getLibros()){
            if(unLibro == p_libro && unLibro.prestado()){ 
                    unLibro.getPrestamo().registrarFechaDevolucion(fechaHoy);
            }
        }
        
        
        
    }

    /**
     * Método prestamosVencidos. Busca en el arreglo contenedor de libros los libros
     * vencidos y retorna un arreglo que los contiene.
     * 
     * @return un arreglo contenedor de libros con prestamos vencidos.
     */
    public ArrayList <Prestamo> prestamosVencidos(){
        Calendar fechaHoy = Calendar.getInstance();
        ArrayList<Prestamo> vencidos = new ArrayList<Prestamo>();

        for (Libro unLibro : this.getLibros()) {
            if (unLibro.prestado() && unLibro.getPrestamo().vencido(fechaHoy)) {
                vencidos.add(unLibro.getPrestamo());
            }
        }
        return vencidos;
    }

    /**
     * Método docentesResponsables. Busca en el arreglo contenedor de socios los
     * objetos de la clase Docente y a partir de estos
     * filtra los Docentes Responsables.
     * 
     * @return un arreglo contenedor de objetos de la clase Docente.
     */
    public ArrayList<Docente> docentesResponsables() {
        ArrayList<Docente> docenteResp = new ArrayList<Docente>();
        for (Socio unSocio : this.getSocios()) {
            // Filtra socios Docente
            if (unSocio.soyDeLaClase().equals("Docente")) {
                Docente unDocente = (Docente) unSocio;
                if (unDocente.esResponsable()) {
                    docenteResp.add(unDocente);
                }
            }
        }
        return docenteResp;
    }

    /**
     * Método quienTieneElLibro. Busca un libro que es recibido por parámetro en el
     * arreglo contenedor de objetos de la clase Libro,
     * consulta si está prestado o no y retorna una cadena de caracteres según el
     * resultado obtenido.
     * 
     * @return un dato de tipo String.
     */
    public String quienTieneElLibro(Libro p_libro) {
        for (Libro unLibro : this.getLibros()) {
            if (unLibro == p_libro) {
                if (p_libro.prestado()) {
                    return p_libro.getPrestamo().getSocio().getNombre();
                }
                return "El libro se encuentra en la biblioteca";
            }
        }
        return "El libro no pertenece a esta biblioteca";
    }

    /**
     * Metodo que retorna una cadena con la lista de socios
     * 
     * @return lista de socios formato cadena
     */
    public String listaDeSocios() {
        String retorno = "Lista de socios:\n";
        int cantEstudiantes = 0;
        int cantDocentes = 0;
        int i = 1;

        for (Socio socio : this.getSocios()) {
            retorno += String.format("%n%d) %s ", i++, socio.toString());

            if (socio.soyDeLaClase().equals("Estudiante")) {
                cantEstudiantes++;
            } else {
                cantDocentes++;
            }
        }
        retorno += String.format(
                "%n%n**************************************%nCant. Socios tipo Estudiante: %d%nCant. Socios tipo Docente: %d%n**************************************",
                cantEstudiantes, cantDocentes);
        return retorno;
    }

    /**
     * Metodo ue retorna una cadena con la lista de libros
     * 
     * @return lista de libros formato cadena
     */
    public String listaDeLibros() {
        String retorno = "Lista de libros\n";
        int i = 1;

        for (Libro libro : this.getLibros()) {
            retorno += String.format("%n%d) %s || Prestado: (%s)", i++, libro.toString(),
                    libro.prestado() ? "Si" : "No");
        }
        return retorno;
    }

    /**
     * Metodo que retorna una cadena con la lista de docentes responsables
     * 
     * @return lista de docentes responsables formato cadena
     */
    public String listaDeDocentesResponsables() {
        String retorno = "Lista de Docentes Responsables:\n";

        for (Docente docente : this.docentesResponsables()) {
            retorno += String.format("%n* %s", docente.toString());
        }
        return retorno;
    }

    /**
     * Metodo que busca un socio por su DNI y lo retorna
     * 
     * @param p_dni asigna el DNI del socio
     * @return Objeto Socio
     */
    public Socio buscarSocio(int p_dni) {
        Socio socio = null;

        for (Socio unSocio : this.getSocios()) {
            if (unSocio.getDniSocio() == p_dni) {
                socio = unSocio;
            }
        }
        return socio;
    }

}