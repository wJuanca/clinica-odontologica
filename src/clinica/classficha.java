/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

/**
 *
 * @author Juanca
 */
public class classficha {
    conexionsql cone = new conexionsql();
    
    
    
    
    public void cargartablaadulto(JTable tabla){
        
        DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
        
        modelotabla.setRowCount(0);
        
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        
        try{
            Connection con = cone.obtenerconexion();
            CallableStatement cmd = con.prepareCall("{call mostraradultos}");
            rs = cmd.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++){
                    fila[i] = rs.getObject(i + 1);
                }
                
                modelotabla.addRow(fila);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        
        
    }
}
