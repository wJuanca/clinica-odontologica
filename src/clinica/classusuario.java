/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juanca
 */
public class classusuario {
    // Método para obtener los datos ingresados en el formulario
    public static Object[] obtenerDatos(String nombre, String apellido, String correo,
            Date fecha, String identidad, String rol,
            String usuario, String clave) {

        // Obtenemos la fecha y la formateamos en formato "dd/MM/yyyy"
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fecha);

        return new Object[]{nombre, apellido, correo, fechaFormateada, identidad, rol, usuario, clave};
    }

    // Método para insertar los datos en la base de datos
    public static void insertarDatosEnBD(String nombre, String apellido, String correo, String fecha, String identidad, String usuario, String clave, String rol) {
    conexionsql conexionBD = new conexionsql();
    Connection conexion = conexionBD.obtenerconexion();

    if (conexion != null) {
        try {
            // Query para la inserción en la tabla de la base de datos
            String sql = "INSERT INTO Usuario (nombre, apellido, correo, fecha_nacimiento, numero_identidad, usuario, clave, rol) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conexion.prepareStatement(sql);

            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, correo);
            pstmt.setString(4, fecha);
            pstmt.setString(5, identidad);
            pstmt.setString(6, usuario);
            pstmt.setString(7, clave);
            pstmt.setString(8, rol);

            pstmt.executeUpdate();
            pstmt.close();
            conexion.close();

        } catch (SQLException ex) {
            // Manejo de errores (por ejemplo, imprimir el mensaje o realizar un registro de errores)
            ex.printStackTrace();
        }
    }
}
    
     // Método para modificar un usuario en la base de datos
    
     public static void modificarUsuario(String nombre, String apellido, String correo, Date fecha,
                                        String identidad, String usuario, String clave, String rol) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = dateFormat.format(fecha);

        conexionsql conexionBD = new conexionsql();
        Connection conexion = conexionBD.obtenerconexion();
        if (conexion != null) {
            try {
                // Query para la actualización en la tabla de la base de datos
                String sql = "UPDATE Usuario SET nombre=?, apellido=?, correo=?, fecha_nacimiento=?, "
                        + "usuario=?, clave=?, rol=? WHERE numero_identidad=?";

                PreparedStatement pstmt = conexion.prepareStatement(sql);
                pstmt.setString(1, nombre);   
                pstmt.setString(2, apellido);
                pstmt.setString(3, correo);
                pstmt.setString(4, fechaFormateada);
                pstmt.setString(5, usuario);
                pstmt.setString(6, clave);
                pstmt.setString(7, rol);
                pstmt.setString(8, identidad);
                pstmt.executeUpdate();
                pstmt.close();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al modificar el usuario en la base de datos: " + ex.toString());
            }
        }}
    
    
    
    public static void eliminarUsuario(String usuario) {
        conexionsql conexionBD = new conexionsql();
        Connection conexion = conexionBD.obtenerconexion();
        if (conexion != null) {
            try {
                // Query para eliminar al usuario de la tabla de la base de datos
                String sql = "DELETE FROM Usuario WHERE nombre=?";

                PreparedStatement pstmt = conexion.prepareStatement(sql);
                pstmt.setString(1, usuario);
                pstmt.executeUpdate();
                pstmt.close();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al eliminar el usuario de la base de datos: " + ex.toString());
            }
        }
    }   
}
