package Programar_Examen.JoseCSV;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable{

    private static final long serialVersionUID = 46515656565956165L;
    private String idAnimal;
    private String raza;
    private String nombre;
    private int edad;

    public Animal(String idAnimal, String raza , String nombre, int edad ) {
        this.idAnimal = idAnimal;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idAnimal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.idAnimal, other.idAnimal);
    }

    @Override
    public String toString() {
      return "Animal [idanimal=" + idAnimal + ", raza=" + raza + ", nombre= " + nombre + ", edad= " + edad +")"; 
        
    }
}
