/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Juanca
 */
public class classlogin {
    public static String verificarUsuario(String usuario, String clave) {
        
        String rol = null;
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conexionsql conn = new conexionsql();
            conexion = conn.obtenerconexion();

            String consulta = "SELECT rol FROM Usuario WHERE usuario = ? AND clave = ?";
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, clave);

            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("rol");
            } else {
                return null;   
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return rol;
    } 
    
}
