package ProgramacionJava.Bingo.Ejercicio;

import java.time.LocalDateTime;

public class Jugador {
    public String nombre;
    public String cuidad;
    public LocalDateTime edad;

    public Jugador(String nombre, String cuidad, LocalDateTime edad) {
        this.nombre = nombre;
        this.cuidad = cuidad;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", cuidad=" + cuidad + ", edad=" + edad + "]";
    }
}
