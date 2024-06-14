package objetos;

import java.time.LocalDate;
import java.util.Set;
/* Creo el objeto con sus caracteristicas */

public final class Usuario {
    private String nombre;
    private String apellidos;
    private String email;
    private LocalDate fechaNaciemiento;

    /* pongo el set por que el la unica forma que me funcione lo demas */
    public Usuario(String nombre, String apellidos, String email, LocalDate fechaNacimiento,
            Set<Contenido> visualizaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNaciemiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getTiempo() {
        return fechaNaciemiento;
    }

    public void setTiempo(LocalDate tiempo) {
        this.fechaNaciemiento = tiempo;
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', apellidos='" + apellidos + "', email='" + email
                + "', fecha de Nacimiento='" + fechaNaciemiento + "}";

    }
}
