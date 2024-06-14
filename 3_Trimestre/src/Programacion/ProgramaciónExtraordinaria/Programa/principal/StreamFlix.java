package principal;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import objetos.*;

public class StreamFlix {

    private static final String FICHERO_PELICULAS = "Peliculas.csv";
    private static final String FICHERO_SERIES = "Series.csv";

    public void entrar() {
        leerDatosSeries();
        leerDatosPeliculas();
        int opcion = seleccionarOpcionMenu();

        switch (opcion) {
            case 1:
                recomendar();
                break;
            case 2:
                mostrarRecomendacioneAnteriores();
                break;
            case 3:
                System.out.println("Gracias por elegirnos. Hasta la próxima.");
                break;
            default:
                System.out.println("Opción no válida. El programa se cerrará.");
        }
    }

    private int seleccionarOpcionMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBienvenido a **STREAMFLIX**");
        System.out.println("1. Recomendar");
        System.out.println("2. Ver recomendaciones anteriores");
        System.out.println("3. Salir");
        System.out.print("\nSeleccione una opción: ");
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            /* no pongo el Logger.warn por el vsc que no se hacer para que funciona */
            System.out.println("El usuario ha introducido un valor no numérico.");
            System.out.println("La opción debía ser indicada mediante un número.");
        }
        return 0;
    }

    public static void recomendar() {
        File series = new File(FICHERO_SERIES);
        File peliculas = new File(FICHERO_PELICULAS);

    }

    public static void mostrarRecomendacioneAnteriores() {

    }

    public static void leerDatosPeliculas() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID");
        sb.append("ID");

    }

    public static void leerDatosSeries() {

    }
}
