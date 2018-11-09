package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static Connection con;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost/registro";
    
    public Conexion(){
        con = null;
        try{
            Class.forName(DRIVER);
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            if(con != null){
            }
        }catch (ClassNotFoundException e){
            System.out.println("Error al conectar" + e);      
        }catch (SQLException e){
            System.out.println("Error al conectar" + e);
        }
        
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public void deconectar(){
        con = null;
        if(con == null){
            System.out.println("Conexion terminada...");
        }
    }
}