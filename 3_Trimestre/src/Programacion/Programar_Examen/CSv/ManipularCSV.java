package Programar_Examen.CSv;

import java.io.BufferedReader;
import java.io.FileReader;

public class ManipularCSV {
    
    private BufferedReader lector; /*lee el archivo */
    private String linea; /* recibe la linea de cada fila */
    private String partes[] = null; /* almacena cada linea */
    
    public void leerArchivo(String nombreArchivo){
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
            
        }
         catch (Exception e) {
            e.getMessage();
        }
    }
    public void imprimirLinea() {
        for (String parte : partes) {
            System.out.print(parte + " // ");
        }  
    }
}
