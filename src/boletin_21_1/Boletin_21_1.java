package boletin_21_1;
import Libreria.Librería;
import Libreria.Libro;



public class Boletin_21_1 {
    public static void main(String[] args) {
        Librería libreria = new Librería();
        Libro libro1 = new Libro("Libro 1", "Autor nº 1", "367423487", 3.50f, 3);
        Libro libro2 = new Libro("Libro 2", "Autor nº 2", "867394185", 3.50f, 5);
        Libro libro3 = new Libro("Libro 3", "Autor nº 3", "197463775", 3.50f, 1);
        libreria.agregarLibro(libro1, libro2, libro3);

        while (true) {
            libreria.menuActions(libreria.mostrarMenu());
        }
    }
}