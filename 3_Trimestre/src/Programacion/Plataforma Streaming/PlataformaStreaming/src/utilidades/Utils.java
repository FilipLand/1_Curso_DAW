package utilidades;

import objetos.Contenido;
import objetos.Usuario;

import java.time.LocalDate;
import java.util.*;

public class Utils {

    public static List<Usuario> obtenerUsuarios(Map<Integer, Contenido> contenidos) {
        List<Usuario> usuarios = new ArrayList<>();

        LocalDate fechaNacimiento = LocalDate.of(1985, 3, 15);
        // Define aqui que tipo de Set es visualizaciones
        Set<Contenido> visualizaciones = new HashSet<>();

        visualizaciones.add(contenidos.get(129));
        visualizaciones.add(contenidos.get(276));
        visualizaciones.add(contenidos.get(317));
        visualizaciones.add(contenidos.get(404));
        visualizaciones.add(contenidos.get(238));
        visualizaciones.add(contenidos.get(361));
        visualizaciones.add(contenidos.get(342));
        visualizaciones.add(contenidos.get(491));
        usuarios.add(new Usuario("Juan", "Pérez", "juan.perez@example.com", fechaNacimiento, visualizaciones));

        fechaNacimiento = LocalDate.of(1992, 7, 22);
        // Define aqui que tipo de Set es visualizaciones
        visualizaciones = new HashSet<>();
        visualizaciones.add(contenidos.get(491));
        visualizaciones.add(contenidos.get(217));
        visualizaciones.add(contenidos.get(165));
        visualizaciones.add(contenidos.get(49));
        visualizaciones.add(contenidos.get(388));
        visualizaciones.add(contenidos.get(102));
        visualizaciones.add(contenidos.get(155));
        visualizaciones.add(contenidos.get(89));
        usuarios.add(new Usuario("María", "García", "maria.garcia@example.com", fechaNacimiento, visualizaciones));

        fechaNacimiento = LocalDate.of(1978, 11, 5);
        // Define aqui que tipo de Set es visualizaciones
        visualizaciones = new HashSet<>();
        visualizaciones.add(contenidos.get(413));
        visualizaciones.add(contenidos.get(271));
        visualizaciones.add(contenidos.get(479));
        visualizaciones.add(contenidos.get(123));
        visualizaciones.add(contenidos.get(45));
        visualizaciones.add(contenidos.get(102));
        visualizaciones.add(contenidos.get(198));
        visualizaciones.add(contenidos.get(456));
        visualizaciones.add(contenidos.get(302));
        usuarios.add(new Usuario("Luis", "Fernández", "luis.fernandez@example.com", fechaNacimiento, visualizaciones));

        fechaNacimiento = LocalDate.of(2000, 1, 12);
        // Define aqui que tipo de Set es visualizaciones
        visualizaciones = new HashSet<>();
        visualizaciones.add(contenidos.get(217));
        visualizaciones.add(contenidos.get(388));
        visualizaciones.add(contenidos.get(276));
        visualizaciones.add(contenidos.get(49));
        visualizaciones.add(contenidos.get(45));
        visualizaciones.add(contenidos.get(89));
        visualizaciones.add(contenidos.get(361));
        usuarios.add(new Usuario("Ana", "López", "ana.lopez@example.com", fechaNacimiento, visualizaciones));

        fechaNacimiento = LocalDate.of(1988, 8, 30);
        // Define aqui que tipo de Set es visualizaciones
        visualizaciones = new HashSet<>();
        visualizaciones.add(contenidos.get(276));
        visualizaciones.add(contenidos.get(413));
        visualizaciones.add(contenidos.get(405));
        usuarios.add(new Usuario("Carlos", "Sánchez", "carlos.sanchez@example.com", fechaNacimiento, visualizaciones));

        return usuarios;

    }

}
