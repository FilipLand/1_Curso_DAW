package Programacion.SecuenciaDigna;

public class Secuencia {
    static java.util.Scanner in;

    public static void casoDePrueba() {
        int cantNum = in.nextInt();
        int[] cadena = new int[cantNum];
        for (int i = 0; i < cadena.length; i++) {
            String numCad = in.nextLine();

            cadena[i] = 1;

        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
