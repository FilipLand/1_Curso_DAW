package ProgramacionJava.Tema8.Collections.map.ContadorPalabras.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Lista de palabras
        List<String> palabras = Arrays.asList("hola", "mundo", "hola", "java", "mundo", "java", "java");

        // Crear un mapa para almacenar las palabras y sus conteos
        Map<String, Integer> mapaDeFrecuencia = new HashMap<>();

        // Contar la frecuencia de cada palabra
        for (String palabra : palabras) {
            if (mapaDeFrecuencia.containsKey(palabra)) {
                mapaDeFrecuencia.put(palabra, mapaDeFrecuencia.get(palabra) + 1);
            } else {
                mapaDeFrecuencia.put(palabra, 1);
            }
        }

        // Imprimir el mapa de frecuencia
        System.out.println("Frecuencia de cada palabra: " + mapaDeFrecuencia);
    }

}
