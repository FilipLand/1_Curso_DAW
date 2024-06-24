package Programar_Examen.JoseCSV;

import java.util.ArrayList;

public class PruebaAnimalCSV {
    public static void main(String[] args) {
        String nombreFicheroCSVleer = "C:\\Users\\filip\\OneDrive\\Escritorio\\1_Curso_DAW\\3_Trimestre\\src\\Programacion\\Programar_Examen\\JoseCSV\\Animal1.csv ";
        String nombreFicheroCSVescribir = "C:\\Users\\filip\\OneDrive\\Escritorio\\1_Curso_DAW\\3_Trimestre\\src\\Programacion\\Programar_Examen\\JoseCSV\\Animal2.csv ";
        
        ArrayList<Animal> animales = new ArrayList<>();
        FicheroAnimalCSV f = new FicheroAnimalCSV(animales, nombreFicheroCSVescribir, nombreFicheroCSVleer);
        
        f.leerFicheroAnimalCSV();
        f.mostrarAnimales();

        Animal b = new Animal("a7", "serpiente", "paco", 2);
        Animal c = new Animal("a8", "caballo", "sergio", 7);
        f.getAnimales().add(b);
        f.getAnimales().add(c);
        f.escribirFicheroAnimalesCSV();
    }
}
