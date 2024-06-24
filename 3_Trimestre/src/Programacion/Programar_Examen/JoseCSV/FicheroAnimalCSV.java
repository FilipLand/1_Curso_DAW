package Programar_Examen.JoseCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
            String linea;
            try (BufferedReader br = new BufferedReader(fr)) {
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
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e1){
            e1.getMessage();
        } 
    } 
    public void escribirFicheroAnimalesCSV(){
        FileWriter fw;
         try {
            fw = new FileWriter(this.nombreFicheroCSVescribir);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                String lineaTexto;
                for (Animal a: this.animales){
                    String textoId = a.getIdAnimal();
                    String textoRaza = a.getRaza();
                    String textoNombre = a.getNombre();
                    String textoEdad = Integer.toString(a.getEdad());
                    lineaTexto = textoId + ";" + textoRaza + ";" + textoNombre + ";" + textoEdad + "\n";
                    bw.write(lineaTexto);
                }
                bw.flush();
            }
            fw.close();
        } catch (IOException e2) {
            e2.getMessage();
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
