package ProgramacionJava.Bingo.Ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bingo {
    static int personas;
    public static final int MAXIMOPERSONAS = 90;

    public static void main(String[] args) {
        // Try con Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("🔞Bienvenido al BINGO🔞");
            System.out.println("¿Cuantos jugadores quieres jugar al bingo?👤👤");
            System.out.println("Maximo 100 personas");
            personas = sc.nextInt();
            if (personas > MAXIMOPERSONAS) {
                throw new IllegalArgumentException("Debe de ser maximo de 100 jugadores");
            } else {
                System.out.println("hOLA");
            }
        }
        // Todos los Catch
        catch (IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        } catch (InputMismatchException e2) {
            e2.printStackTrace();
            System.out.println("Debe de ser numero no otro caracter");
            // Finaly
        } finally {
            System.out.println("Programa acaba");
        }
    }
}
