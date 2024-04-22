/*Crea un programa que genere una lista de números aleatorios y
 los imprima por pantalla. A continuación, recorre esa lista 
 con un iterador, imprimiendo los números, uno a uno por pantalla. */

package Programacion.Tema8.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class recorrerIterable {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        for (int i = 0; i >= (Math.random() * 100 + 1); i++) {
            numeros.add((Math.random() * 100 + 1));
        }
        Iterator<Double> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
