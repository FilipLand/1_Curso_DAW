package Programacion.encriptacion;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de encriptación");
        metodos();
    }

    public static void metodos() {
        System.out.println("Pasame un archivo de texto que quieres encriptar");
        Scanner sc = new Scanner(System.in);
        String archivo = sc.nextLine();
        File fichero1 = new File(archivo);

        System.out.println("¿Que quieres hacer con el archivo?");
        System.out.println("(1) Encriptar el archivo");
        System.out.println("(2) Descriptar el archivo");
        System.out.println("(3) Salir del programa");
        Integer opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> encriptar(fichero1, sc);
            case 2 -> desencriptar();
            case 3 -> salir();
            default -> System.out.println("No has introducido una opcion correcta");
        }
    }

    public static void encriptar(File fichero1, Scanner sc) {
        if (fichero1.exists()) {
            System.out.println("El archivo existe y se va encriptar");

        } else {
            System.out.println("No existe ningun archivo");
            System.out.println("¿Que deseas hacer?");
            System.out.println("(1) salir");
            System.out.println("(2) Empezar de zero");
            Integer opcion2 = sc.nextInt();

            switch (opcion2) {
                case 1 -> salir(); 
                case 2 -> metodos();
                default -> System.out.println("Hay un error");
            }

        }
    }
    public static void desencriptar() {

    }
    public static void salir() {

    }
}
