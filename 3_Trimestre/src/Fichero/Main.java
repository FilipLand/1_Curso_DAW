package Fichero;

import java.io.File;

public class Main {
    static String linea = "==============================================================";
    public static void main(String[]args){

    System.out.println(linea);
    String archivoRelativo = "Fichero.txt";
    File ficheroRel = new File(archivoRelativo);
    System.out.println("Relativo " + ficheroRel);
    System.out.println(linea);
    
    System.out.println(linea);
    String archivoAbsoluto = "Programacion\\3_Trimestre\\src\\Fichero\\Fichero.txt";
    File ficheroAbs = new File(archivoAbsoluto);
    System.out.println("Absoluto " + ficheroAbs);
    System.out.println(linea);

    System.out.println(linea);
    String otroArchivo = "C:\\Users\\alumno";
    File ficheroOtro = new File(otroArchivo);
    System.out.println("Otro " + ficheroOtro);
    System.out.println(linea);
    
    }
}
