package ProgramacionJava.Tema8.Collections.map.ContadorPalabras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Palabras {
    public static void main(String[] args) {

        final String fil = "Filip";
        final String lil = "Lili";
        final String jai = "Jaime";
        final String edu = "Eduardo";
        final String mat = "Mateo";
        final String fra = "Franek";
        final String ros = "Rosa";
        final String eva = "Eva";
        final String mar = "Maria";

        List<String> lista = Arrays.asList(fil, lil, eva, ros, fil, fil, ros, jai, edu, mat, fil,
                lil, mat, lil, fil, ros, edu, fra, fra, fra, fil, fra, edu, lil, mar, eva, mat);
        Map<String, Integer> mapaCantidadAparece = new HashMap<>();

        for (String palabra : lista) {
            Integer contar = mapaCantidadAparece.get(palabra);
            if (contar == null) {
                contar = 0;
            }
            mapaCantidadAparece.put(palabra, contar + 1);
        }
        System.out.println(mapaCantidadAparece);
    }
}
