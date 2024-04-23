package Programacion.Tema8.comparador.CompararPersona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        lista(estudiantes);

    }

    public static void lista(List<Estudiante> estudiantes) {

        estudiantes.add(new Estudiante("Filip", "Mlynarczyk", "19/06/2004", 5));

    }
}
