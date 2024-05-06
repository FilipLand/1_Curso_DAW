package ProgramacionJava.Bingo.Ejercicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bingo {
    static int personas;
    public static final int MAXIMOPERSONAS = 100;

    public static void main(String[] args) {
        // Try con Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("🔞 Bienvenido al BINGO 🔞");
            System.out.println("¿Cuántos jugadores quieres jugar al bingo? 👤👤");
            System.out.println("Máximo 100 personas");
            personas = sc.nextInt();
            List<Jugador> jugadores = new ArrayList<>();
            if (personas > MAXIMOPERSONAS) {
                throw new IllegalArgumentException("Debe ser máximo de 100 jugadores");
            } else {
                System.out.println("Habrá un total de " + personas + " personas en la partida");
                for (int i = 0; i < personas; i++) {
                    listaPersonas(jugadores, sc, i);
                }
                System.out.println(jugadores);
            }
            // Todos los Catch
        } catch (IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        } catch (InputMismatchException e2) {
            System.out.println("Debe ser un número, no otro carácter");
            // Finally
        } finally {
            System.out.println("Programa acaba");
        }
    }

    // Lista de personas
    public static void listaPersonas(List<Jugador> jugadores, Scanner sc, int i) {
        String nombreL;
        String cuidadL;
        String fecha;
        int numeroJugador = i + 1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/y");
        sc.nextLine();
        System.out.println("Introduce el nombre del jugador: " + numeroJugador);
        nombreL = sc.nextLine();

        System.out.println("Introduce la cuidad del jugador: " + numeroJugador);
        cuidadL = sc.nextLine();

        System.out.println("La fecha tiene que ser dd/MM/yyyy ejemplo 01/01/2001");
        System.out.println("Introduce la fecha del jugador: " + numeroJugador);
        fecha = sc.nextLine();
        LocalDateTime fechaL = LocalDateTime.parse(fecha, formatter);
        String fechaDefiniva = fechaL.toString();

        jugadores.add(new Jugador(nombreL, cuidadL, fechaDefiniva));
    }
}
