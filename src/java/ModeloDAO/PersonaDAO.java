/*@author Andres Montenegro */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonaDAO implements CRUD {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    @Override
    public List listar(){
        ArrayList<Persona>list = new ArrayList<>();
        String sql = "SELECT * FROM persona";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        
            while(rs.next()){
                Persona per = new Persona();
                per.setId(rs.getInt("Id"));
                per.setDni(rs.getString("DNI"));
                per.setNomb(rs.getString("Nombres"));
                list.add(per);
            }
        }catch(SQLException e){   
        }
        return list;
    }
        
    @Override
    public Persona List(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Persona per) {
        String sql= "INSERT INTO persona (DNI, Nombres) VALUES ('"+per.getDni()+"', '"+per.getNomb()+"' )";
        
        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeQuery();
            
        } catch (Exception e) {
        }
        
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
