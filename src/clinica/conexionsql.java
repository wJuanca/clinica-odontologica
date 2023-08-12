/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanca
 */
public class conexionsql {
    Connection conexion = null;
    
    String usuario = "clinica";
    String clave = "12345";
    String db = "Clinica Odontologica";
    String puerto = "1433";
    
    public Connection obtenerconexion()
    {
        try
        {                   //esto es el jar
            String cadena = "jdbc:sqlserver://localhost:"+puerto+" ; "+"databaseName="+db;
            conexion = DriverManager.getConnection(cadena, usuario, clave);
            
            //JOptionPane.showMessageDialog(null, "Coneccion Exitosa");
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error:"+ex.toString());
        }
        
        return conexion;    
    }   
}
