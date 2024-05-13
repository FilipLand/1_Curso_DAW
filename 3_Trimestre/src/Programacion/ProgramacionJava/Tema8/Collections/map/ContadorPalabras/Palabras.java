package ProgramacionJava.Tema8.Collections.map.ContadorPalabras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Palabras {
    public static void main(String[] args) {

        final String fi = "Filip";
        final String li = "Lista";
        final String ja = "Jaime";
        final String ed = "Eduardo";
        final String ma = "Mateo";
        final String fr = "Franek";

        List<String> lista = Arrays.asList(fi, li, fi, fi, ja, ed, ma, fi, li, fi, ed, fr, fr);

        Map<String, Integer> mapaCantidadAparece = new HashMap<>();

        for (int i = 0; i < lista.size(); i++) {
            if (mapaCantidadAparece.containsKey(lista)) {

            }
        }
    }
}
