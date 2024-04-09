package encriptacion;

import java.io.File;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de encriptación");
        metodos();
    }
    public static void metodos(){
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
            case 1: 
                encriptar();break;
            case 2:
                desencriptar();break;
            case 3:
                salir();break;
            default: 
                System.out.println("No has introducido una opcion correcta");
                break;
        }
    }
    public static void encriptar(){


    }
    public static void desencriptar(){


    }
    public static void salir(){

    }
}
