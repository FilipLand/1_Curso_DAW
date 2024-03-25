package Fichero;

import java.io.File;

public class Main {
    public static void main(String[]args){

    String archivoRelativo = "Fichero.txt";
    File ficheroRel = new File(archivoRelativo);
    System.out.println(ficheroRel);
    
    String archivoAbsoluto = "Programacion//3_Trimestre//src/Fichero/Fichero.txt";
    File ficheroAbs = new File(archivoAbsoluto);
    System.out.println(ficheroAbs);
    
    }
}
