package app;

import java.sql.*;

public class Conexion {
    //método para la conexión tipo static
    public static Connection getConexion(){
        String urlConexion = "jdbc:sqlserver://localhost:1433;" +
                "database = escuela;" +
                "user=sa;" +
                "password=1234;";
        
        try{
            //crea conexion
            Connection con = DriverManager.getConnection(urlConexion);
            //retornamos conexión
            return con;
        }catch(Exception err){
            System.out.println("Error conexión: " + err.toString());
            //si no se puede establecer conexión retorna null
            return null;
        }
    }
    
    
    
}
