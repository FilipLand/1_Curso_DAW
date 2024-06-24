package Programar_Examen.JoseCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroAnimalCSV {

    private String nombreFicheroCSVleer;
    private String nombreFicheroCSVescribir;
    private ArrayList<Animal>animales; 

    public FicheroAnimalCSV(ArrayList<Animal> animales, String nombreFicheroCSVescribir, String nombreFicheroCSVleer) {
        this.nombreFicheroCSVescribir = nombreFicheroCSVescribir;
        this.nombreFicheroCSVleer = nombreFicheroCSVleer;
        if(animales == null) {
            this.animales = new ArrayList<>();
        }
        else {
            this.animales = animales;
        }
    }

    public void mostrarAnimales(){
        for(Animal a: this.animales){
            System.out.print(a.toString()+"\n");
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
                this.animales.add(ani);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        } 
    } 

    public String getNombreFicheroCSVleer() {
        return nombreFicheroCSVleer;
    }

    public void setNombreFicheroCSVleer(String nombreFicheroCSVleer) {
        this.nombreFicheroCSVleer = nombreFicheroCSVleer;
    }

    public String getNombreFicheroCSVescribir() {
        return nombreFicheroCSVescribir;
    }

    public void setNombreFicheroCSVescribir(String nombreFicheroCSVescribir) {
        this.nombreFicheroCSVescribir = nombreFicheroCSVescribir;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
}
