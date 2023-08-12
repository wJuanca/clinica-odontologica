/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.sun.glass.events.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Juanca
 */
public class classpaciente {
    //VALIDACIONES
    public void sololetras(JTextField txt, java.awt.event.KeyEvent evt){
        Character c=evt.getKeyChar();
        
        if(!Character.isLetter(c) && c !=evt.VK_SPACE){
            evt.consume();
        
        }
    }
    
    public void solonumeros(JTextField txt, java.awt.event.KeyEvent evt){
        Character c=evt.getKeyChar();
        
        if(!Character.isDigit(c) && c !=evt.VK_MINUS){
            evt.consume();
        }
    }
    
    
      conexionsql cone = new conexionsql();
    
    public void AgregarPaciente(int codigo, String DNI, String nombre, String apellido, String telefono, Integer edad, String EtapaVida,
          String sexo, String correo, Float peso,Float talla, String tipoPaciente, String fecha, String estadocivil, 
          String nacionalidad,String ocupacion, String direccion, String accion){
         
         try {
             
             Connection con = cone.obtenerconexion();
             
             CallableStatement cmd = con.prepareCall("{CALL Procesos(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
             
             cmd.setInt(1, codigo);
             cmd.setString(2, DNI);
             cmd.setString(3, nombre);
             cmd.setString(4,apellido);
             cmd.setString(5, telefono);
             cmd.setInt(6, edad);
             cmd.setString(7, EtapaVida);
             cmd.setString(8, sexo);
             cmd.setString(9, correo);
             cmd.setFloat(10, peso);
             cmd.setFloat(11, talla);
             cmd.setString(12, tipoPaciente);
             cmd.setString(13,fecha);
             cmd.setString(14, estadocivil);
             cmd.setString(15, nacionalidad);
             cmd.setString(16, ocupacion);
             cmd.setString(17, direccion);
             cmd.setString(18, accion);
             
             cmd.execute();
             
             
         } catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
    } 
}
