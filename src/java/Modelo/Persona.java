/*@author Andres Montenegro*/
package Modelo;

public class Persona {
    int id;
    String dni;
    String nomb;

    public Persona() {
    }

    public Persona(String dni, String nomb) {
        this.dni = dni;
        this.nomb = nomb;
    }

    public Persona(int id, String dni, String nomb) {
        this.id = id;
        this.dni = dni;
        this.nomb = nomb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
}
