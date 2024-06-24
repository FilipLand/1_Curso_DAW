package Programar_Examen.JoseCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FicreoAnimalCSV {

    private String nombreFicheroCSVleer;
    private String nombreFicheroCSVescribir;
    private ArrayList<Animal>animales; 

    public FicreoAnimalCSV(ArrayList<Animal> animales, String nombreFicheroCSVescribir, String nombreFicheroCSVleer) {
        this.nombreFicheroCSVescribir = nombreFicheroCSVescribir;
        this.nombreFicheroCSVleer = nombreFicheroCSVleer;
        if(animales == null) {
            this.animales = new ArrayList<Animal>();
        }
        else {
            this.animales = animales;
        }
    }
    public void leerFicheroAnimalCSV(){
        FileReader fr;
        try {
            fr = new FileReader(this.nombreFicheroCSVleer);
            String linea = "";
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null)
            {
                String[] datosLinea = linea.split(";");
                String idAnimal = datosLinea[0].trim();
                String raza = datosLinea[1].trim();
                String nombre = datosLinea[2].trim();
                int edad = Integer.parseInt(datosLinea[3].trim());
                Animal ani = new Animal( idAnimal, raza , nombre, edad);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        } 
    } 
}
