
package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import controlador.*;

public class GestionBiblioteca {

    private static Biblioteca biblioteca;

    public static void main(String[] args) {
        Biblioteca biblioteca = cargarBibliotecaDeArchivo("datosBiblioteca.dat");

        if (biblioteca == null) {
            System.out.println("Inicializando biblioteca...");
            biblioteca = new Biblioteca("BIBLIOTECH");
        }

        setBiblioteca(biblioteca);
        
        //Comentar para evitar seguir agregando datos
        //cargarDatosAleatorios(biblioteca);


        GestionBibliotecaController.mostrar();
        GestionBibliotecaController.botonActualizar();
    }

    public static void guardarBibliotecaAArchivo(String p_rutaArchivo) {
        try {
            System.out.println("Guardando biblioteca en archivo " + p_rutaArchivo);
            FileOutputStream f = new FileOutputStream(new File(p_rutaArchivo));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(GestionBiblioteca.getBiblioteca());

            o.close();
            f.close();
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static Biblioteca cargarBibliotecaDeArchivo(String p_rutaArchivo) {

        try {
            System.out.println("Cargando biblioteca desde archivo " + p_rutaArchivo);
            FileInputStream fi = new FileInputStream(new File(p_rutaArchivo));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Biblioteca bib = (Biblioteca) oi.readObject();

            System.out.printf("Biblioteca cargada: %s", bib.getNombre());
            oi.close();
            fi.close();
            return bib;
        } catch (Exception e) {
            System.out.println("Error al cargar archivo: " + e.getMessage());
            return null;
        }

    }

    public static Biblioteca getBiblioteca() {
        return GestionBiblioteca.biblioteca;
    }

    public static void setBiblioteca(Biblioteca biblioteca) {
        GestionBiblioteca.biblioteca = biblioteca;
    }

    /////////////////////////////////
    // Array de 20 nombres
    private static String[] nombres = { "Juan", "Pedro", "Jose", "Maria", "Luis", "Ana", "Lorena", "Sofia", "Lucas",
            "Miguel", "Javier", "Jorge", "Carlos", "Ricardo", "Fernando", "Mariana", "Daniela", "Sandra", "Marta",
            "Luisa" };

    // Array de 20 apellidos
    private static String[] apellidos = { "Gonzalez", "Perez", "Gomez", "Fernandez", "Rodriguez", "Lopez", "Martinez",
            "Gutierrez", "Sanchez", "Ramirez", "Torres", "Diaz", "Romero", "Alvarez", "Suarez", "Gimenez", "Acosta",
            "Garcia", "Pereyra", "Gallardo" };

    // Array de 20 carreras universitarias distintas
    private static String[] carreras = { "Licenciatura en Sistemas", "Ingenieria Electronica", "Medicina", "Bioquimica",
            "Ingenieria en Agrimensura", "Licenciatura en Criminalistica" };

    private static String[] areas = { "Informática", "Matemática", "Física", "Álgebra", "Cálculo" };

    private static String[] prefijos = { "Ing.", "Lic.", "Dr.", "Arq.", "Prof." };
    // Editoriales aleatorias

    private static String[] editoriales = { "Siglo XXI", "Editorial 100cia", "Editorial del Sud" };

    private static String[] titulosDeLibros = { "Sistemas operativos 1", "Calculo II", "Quimica I", "Logica y Matematica Computacional", "Sistemas y Organizaciones", "Administracion de empresas", "Algoritmos y estructuras de datos I", "Introduccion a Java", "Java Intermedio", "Paradigmas y Lenguajes" ,"Física universitaria 2", "Algebra 1",
            "Calculo I", "Estadistica Universitaria", "Algebra Rojo", "Tecnicas Criminalisticas", "El arte de la programación"};

    public static String nombreAleatorio() {
        return nombres[(int) (Math.random() * nombres.length)] + " "
                + apellidos[(int) (Math.random() * apellidos.length)];
    }

    public static int dniAleatorio() {
        return (int) (Math.random() * 100000000);
    }

    public static String carreraAleatoria() {
        return carreras[(int) (Math.random() * carreras.length)];
    }

    public static String areaAleatoria() {
        return areas[(int) (Math.random() * areas.length)];
    }

    public static String prefijoAleatorio() {
        return prefijos[(int) (Math.random() * prefijos.length)];
    }

    public static String editorialAleatoria() {
        return editoriales[(int) (Math.random() * editoriales.length)];
    }

    public static int anioAleatorio() {
        return (int) (Math.random() * 30) + 1990;
    }

    public static void cargarDatosAleatorios(Biblioteca p_bibliotecaDestino) {
        // carga 20 estudiantes
        for (int i = 0; i < 20; i++) {
            p_bibliotecaDestino.addSocio(new Estudiante(dniAleatorio(), nombreAleatorio(), carreraAleatoria()));
        }
        // Carga 10 profesores
        for (int i = 0; i < 10; i++) {
            p_bibliotecaDestino.addSocio(
                    new Docente(dniAleatorio(), prefijoAleatorio() + " " + nombreAleatorio(), areaAleatoria()));
        }

        // Carga libros
        
        for (int i = 0; i < titulosDeLibros.length; i++) {
            
                p_bibliotecaDestino.addLibro(new Libro(titulosDeLibros[i], (int) (Math.random() * 7),
                        editorialAleatoria(), anioAleatorio()));

        }
        
        //for (int i = 0; i < titulosDeLibros.length; i++) {
            // Genera hasta 10 copias de cada libro
        //    for (int cantidad = 0; cantidad < (int) (Math.random() * 10); cantidad++) {
         //       p_bibliotecaDestino.addLibro(new Libro(titulosDeLibros[i], (int) (Math.random() * 7),
          //              editorialAleatoria(), anioAleatorio()));
    }

}
