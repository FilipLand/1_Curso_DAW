package ProgramacionJava.Bingo.Ejercicio;

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
                    listaPersonas(jugadores);
                }
            }
            // Todos los Catch
        } catch (IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        } catch (InputMismatchException e2) {
            e2.printStackTrace();
            System.out.println("Debe ser un número, no otro carácter");
            // Finally
        } finally {
            System.out.println("Programa acaba");
        }
    }

    // Lista de personas
    public static void listaPersonas(List<Jugador> jugadores) {
        System.out.println("Hola");

    }
}
