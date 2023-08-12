/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.sun.glass.events.KeyEvent;
/**
 *
 * @author Juanca
 */
public class classcitas {
    conexionsql cone = new conexionsql();
    
    public DefaultComboBoxModel llenarpac(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
       
        
        return modelo;
    } 
    
    //--------
    
    public DefaultComboBoxModel llenarpacienteproc(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        
        try{
            Connection con = cone.obtenerconexion();
            CallableStatement cmd = con.prepareCall("{CALL sp_Paciente}");
            ResultSet rs = cmd.executeQuery();
            
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return modelo;
    }
    
    //------

    //--------
    
    /* public void cargartabla(JTable tabla,int id_cita, int Espacio_disponible, String Fecha_cita, String Hora_agenda, int Cod_paciente, String Observaciones_cita, String Descripcion_Cita_seguimiento, String Proxima_cita, String Tx, String Accion) {
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel(); 
        modelotabla.setRowCount(0);
        
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try {
            Connection con = cone.obtenerconexion();
            CallableStatement cmd = con.prepareCall("{CALL sp_MantenimientoCitas(?,?,?,?,?,?,?,?,?,?)}"); //Posíblemente los primeros paréntesis sean llaves
            cmd.setInt(1, id_cita);
            cmd.setInt(2, Espacio_disponible);
            cmd.setString(3, Fecha_cita);
            cmd.setString(4, Hora_agenda);
            cmd.setInt(5, Cod_paciente);
            cmd.setString(6, Observaciones_cita);
            cmd.setString(7, Descripcion_Cita_seguimiento);
            cmd.setString(8, Proxima_cita);
            cmd.setString(9, Tx);
            cmd.setString(10, Accion);
            

            rs = cmd.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for (int i = 0; i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
               modelotabla.addRow(fila); 
            }
            //cmd.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se agregó estudiante");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido cargar la tabla");
        }
        }*/
     
     
     public void mantenimientocita(int Id_cita, int Espacio_disponible, String Fecha_cita, String Hora_agenda, int Cod_paciente, String Observaciones_cita, String Descripcion_Cita_seguimiento, String Proxima_cita, String Tx, String Accion){
        try{
            Connection con = cone.obtenerconexion();
            CallableStatement cmd = con.prepareCall("{CALL sp_MantenimientoCitas(?,?,?,?,?,?,?,?,?,?)}");
            cmd.setInt(1, Id_cita);
            cmd.setInt(2, Espacio_disponible);
            cmd.setString(3, Fecha_cita);
            cmd.setString(4, Hora_agenda);
            cmd.setInt(5, Cod_paciente);
            cmd.setString(6, Observaciones_cita);
            cmd.setString(7, Descripcion_Cita_seguimiento);
            cmd.setString(8, Proxima_cita);
            cmd.setString(9, Tx);
            cmd.setString(10, Accion);
            
            cmd.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    
    } 
     
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
    
}
