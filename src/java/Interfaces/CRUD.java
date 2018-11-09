/*@author Andres Montenegro */
package Interfaces;

import Modelo.Persona;
import java.util.List;

public interface CRUD {
    public List listar();
    public Persona List (int id);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(int id);
}
