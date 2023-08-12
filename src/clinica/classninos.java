/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
/**
 *
 * @author Juanca
 */
public class classninos {
    conexionsql cone = new conexionsql();
    
    public void cargartablanino(JTable tabla){
        
       DefaultTableModel modelotabla = (DefaultTableModel) tabla.getModel();
       
       modelotabla.setRowCount(0);
       
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       try{
           Connection con = cone.obtenerconexion();
           CallableStatement cmd = con.prepareCall("{call mostrarninos()}");
           rs = cmd.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while(rs.next()){
               Object[] fila = new Object[columnas];
               for (int i = 0; i < columnas; i++) {
                   fila[i] = rs.getObject(i + 1);
               }
               
               modelotabla.addRow(fila);
           }

       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.toString());
       }
       
   }
    
    
    public void  mantenimientopacientenino(int codigo, String fechacreacion, String nombrecompleto,String fechanac ,String nacionalidad,
            String numerodoctor, String telefono, String domicilio, String peso, String talla, int edad, String grado,
            String actitudnino, String madrepadre, String motivoconsulta, String clinica, String embarazo, String Embarazotxt,
            String procesoembarazo, String tipoparto, String lactancia, String lactanciatxt, String formula, String periodoformula,
            String desayuno, String meriendamatutina, String almuerzo, String meriendavespertina, String cena, String meriendanocturna,
            String azucar, String tipoazucar, String enfermedadesfam, String enfermedadesfamtxt, String alergias, String hospitalizado,
            String hospitalizadomotivo, String farmacos, String pediatra, String chupete, String chupeteedad, String digital,
            String digitaledad, String mamadera, String mamaderaedad, String otrosobj, String otrosobjtxt, String deglucion,
            String fonacion, String manias, String maniastxt, String expdentel, String fechaodontologica,
            String completotratamiento, String infopreventiva, String cumplimientomedidas, String medidastxt, String pasta,String pastatxt ,
            String vecesaseo, String acompaniante, String quien, String otroselem, String otrotxt, String fluor, String fluortxt, String tiempoaseo,
            String labios1, String labios2, String labios3, String frenillos, String mucosa, String gengibal, String lengua,
            String dentincion, String supernum, String agenesias, String macrodoncia, String microdoncia, String hiplopasia,
            String hiplopasiatxt, String hipocalsificacion, String hipotxt, String him, String himtxt, String fusionadostxt,
            String germinadostxt, String conides, String afotrotxt, String traumatismo,
            String traumatismotxt,  String diagnosticoexp, String derivacionexp, String presentivo, 
            String aparatologia, String revisionmedica,String accion){
       try{
           Connection con = cone.obtenerconexion();
           
           CallableStatement cmd = con.prepareCall("{call MantenimientoHistorialnino(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                   + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
           cmd.setInt(1,codigo); 
           cmd.setString(2,fechacreacion);
           cmd.setString(3,nombrecompleto);
           cmd.setString(4,fechanac);
           cmd.setString(5,nacionalidad);
           cmd.setString(6,numerodoctor);
           cmd.setString(7,telefono);
           cmd.setString(8,domicilio);
           cmd.setString(9,peso);
           cmd.setString(10,talla);
           cmd.setInt(11,edad);
           cmd.setString(12,grado);
           cmd.setString(13,actitudnino);
           cmd.setString(14,madrepadre);
           cmd.setString(15,motivoconsulta);
           cmd.setString(16,clinica);
           cmd.setString(17,embarazo);
           cmd.setString(18,Embarazotxt);
           cmd.setString(19,procesoembarazo);
           cmd.setString(20,tipoparto);
           cmd.setString(21,lactancia);
           cmd.setString(22,lactanciatxt);
           cmd.setString(23,formula);
           cmd.setString(24,periodoformula);
           cmd.setString(25,desayuno);
           cmd.setString(26,meriendamatutina);
           cmd.setString(27,almuerzo);
           cmd.setString(28,meriendavespertina);
           cmd.setString(29,cena);
           cmd.setString(30,meriendanocturna);
           cmd.setString(31,azucar);
           cmd.setString(32,tipoazucar);
           cmd.setString(33,enfermedadesfam);
           cmd.setString(34,enfermedadesfamtxt);
           cmd.setString(35,alergias);
           cmd.setString(36,hospitalizado);
           cmd.setString(37,hospitalizadomotivo);
           cmd.setString(38,farmacos);
           cmd.setString(39,pediatra);
           cmd.setString(40,chupete);
           cmd.setString(41,chupeteedad);
           cmd.setString(42,digital);
           cmd.setString(43,digitaledad);
           cmd.setString(44,mamadera);
           cmd.setString(45,mamaderaedad);
           cmd.setString(46,otrosobj);
           cmd.setString(47,otrosobjtxt);
           cmd.setString(48,deglucion);
           cmd.setString(49,fonacion); 
           cmd.setString(50,manias);
           cmd.setString(51,maniastxt);
           cmd.setString(52,expdentel);
           cmd.setString(53,fechaodontologica);
           cmd.setString(54,completotratamiento);
           cmd.setString(55,infopreventiva);
           cmd.setString(56,cumplimientomedidas);
           cmd.setString(57,medidastxt);
           cmd.setString(58,pasta);
           cmd.setString(59,pastatxt);
           cmd.setString(60,vecesaseo);
           cmd.setString(61,acompaniante);
           cmd.setString(62,quien);
           cmd.setString(63,otroselem);
           cmd.setString(64,otrotxt);
           cmd.setString(65,fluor);
           cmd.setString(66,fluortxt);
           cmd.setString(67,tiempoaseo);
           cmd.setString(68,labios1);
           cmd.setString(69,labios2);
           cmd.setString(70,labios3);
           cmd.setString(71,frenillos);
           cmd.setString(72,mucosa);
           cmd.setString(73,gengibal);
           cmd.setString(74,lengua);
           cmd.setString(75,dentincion);
           cmd.setString(76,supernum);
           cmd.setString(77,agenesias);
           cmd.setString(78,macrodoncia);
           cmd.setString(79,microdoncia);
           cmd.setString(80,hiplopasia);
           cmd.setString(81,hiplopasiatxt);
           cmd.setString(82,hipocalsificacion);
           cmd.setString(83,hipotxt);
           cmd.setString(84,him);
           cmd.setString(85,himtxt);
           //cmd.setString88,fusionados);
           cmd.setString(86,fusionadostxt);
           //cmd.setString(90,germinados);
           cmd.setString(87,germinadostxt);
           cmd.setString(88,conides);
          // cmd.setString(93,afotro);
           cmd.setString(89,afotrotxt);
           cmd.setString(90,traumatismo);
           cmd.setString(91,traumatismotxt);
           cmd.setString(92,diagnosticoexp);
           cmd.setString(93,derivacionexp);
           cmd.setString(94,presentivo);
           cmd.setString(95,aparatologia);
           cmd.setString(96,revisionmedica);
           cmd.setString(97,accion);
           
           cmd.execute();
       }catch(Exception ex){
           
       }
   
   }
    
    public void cargartablahistorial(int codigo, String fechacreacion, String nombrecompleto,String fechanac ,String nacionalidad,
            String numerodoctor, String telefono, String domicilio, String peso, String talla, int edad, String grado,
            String actitudnino, String madrepadre, String motivoconsulta, String clinica, String embarazo, String Embarazotxt,
            String procesoembarazo, String tipoparto, String lactancia, String lactanciatxt, String formula, String periodoformula,
            String desayuno, String meriendamatutina, String almuerzo, String meriendavespertina, String cena, String meriendanocturna,
            String azucar, String tipoazucar, String enfermedadesfam, String enfermedadesfamtxt, String alergias, String hospitalizado,
            String hospitalizadomotivo, String farmacos, String pediatra, String chupete, String chupeteedad, String digital,
            String digitaledad, String mamadera, String mamaderaedad, String otrosobj, String otrosobjtxt, String deglucion,
            String fonacion, String manias, String maniastxt, String expdentel, String fechaodontologica,
            String completotratamiento, String infopreventiva, String cumplimientomedidas, String medidastxt, String pasta,String pastatxt ,
            String vecesaseo, String acompaniante, String quien, String otroselem, String otrotxt, String fluor, String fluortxt, String tiempoaseo,
            String labios1, String labios2, String labios3, String frenillos, String mucosa, String gengibal, String lengua,
            String dentincion, String supernum, String agenesias, String macrodoncia, String microdoncia, String hiplopasia,
            String hiplopasiatxt, String hipocalsificacion, String hipotxt, String him, String himtxt, String fusionadostxt,
            String germinadostxt, String conides, String afotrotxt, String traumatismo,
            String traumatismotxt,  String diagnosticoexp, String derivacionexp, String presentivo, 
            String aparatologia, String revisionmedica,String accion,JTable tablanino){
         
        DefaultTableModel modelotabla = (DefaultTableModel) tablanino.getModel();
       
       modelotabla.setRowCount(0);
       
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
    
    try{
           Connection con = cone.obtenerconexion();
           
           CallableStatement cmd = con.prepareCall("{call MantenimientoHistorialnino(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                   + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
           cmd.setInt(1,codigo); 
           cmd.setString(2,fechacreacion);
           cmd.setString(3,nombrecompleto);
           cmd.setString(4,fechanac);
           cmd.setString(5,nacionalidad);
           cmd.setString(6,numerodoctor);
           cmd.setString(7,telefono);
           cmd.setString(8,domicilio);
           cmd.setString(9,peso);
           cmd.setString(10,talla);
           cmd.setInt(11,edad);
           cmd.setString(12,grado);
           cmd.setString(13,actitudnino);
           cmd.setString(14,madrepadre);
           cmd.setString(15,motivoconsulta);
           cmd.setString(16,clinica);
           cmd.setString(17,embarazo);
           cmd.setString(18,Embarazotxt);
           cmd.setString(19,procesoembarazo);
           cmd.setString(20,tipoparto);
           cmd.setString(21,lactancia);
           cmd.setString(22,lactanciatxt);
           cmd.setString(23,formula);
           cmd.setString(24,periodoformula);
           cmd.setString(25,desayuno);
           cmd.setString(26,meriendamatutina);
           cmd.setString(27,almuerzo);
           cmd.setString(28,meriendavespertina);
           cmd.setString(29,cena);
           cmd.setString(30,meriendanocturna);
           cmd.setString(31,azucar);
           cmd.setString(32,tipoazucar);
           cmd.setString(33,enfermedadesfam);
           cmd.setString(34,enfermedadesfamtxt);
           cmd.setString(35,alergias);
           cmd.setString(36,hospitalizado);
           cmd.setString(37,hospitalizadomotivo);
           cmd.setString(38,farmacos);
           cmd.setString(39,pediatra);
           cmd.setString(40,chupete);
           cmd.setString(41,chupeteedad);
           cmd.setString(42,digital);
           cmd.setString(43,digitaledad);
           cmd.setString(44,mamadera);
           cmd.setString(45,mamaderaedad);
           cmd.setString(46,otrosobj);
           cmd.setString(47,otrosobjtxt);
           cmd.setString(48,deglucion);
           cmd.setString(49,fonacion); 
           cmd.setString(50,manias);
           cmd.setString(51,maniastxt);
           cmd.setString(52,expdentel);
           cmd.setString(53,fechaodontologica);
           cmd.setString(54,completotratamiento);
           cmd.setString(55,infopreventiva);
           cmd.setString(56,cumplimientomedidas);
           cmd.setString(57,medidastxt);
           cmd.setString(58,pasta);
           cmd.setString(59,pastatxt);
           cmd.setString(60,vecesaseo);
           cmd.setString(61,acompaniante);
           cmd.setString(62,quien);
           cmd.setString(63,otroselem);
           cmd.setString(64,otrotxt);
           cmd.setString(65,fluor);
           cmd.setString(66,fluortxt);
           cmd.setString(67,tiempoaseo);
           cmd.setString(68,labios1);
           cmd.setString(69,labios2);
           cmd.setString(70,labios3);
           cmd.setString(71,frenillos);
           cmd.setString(72,mucosa);
           cmd.setString(73,gengibal);
           cmd.setString(74,lengua);
           cmd.setString(75,dentincion);
           cmd.setString(76,supernum);
           cmd.setString(77,agenesias);
           cmd.setString(78,macrodoncia);
           cmd.setString(79,microdoncia);
           cmd.setString(80,hiplopasia);
           cmd.setString(81,hiplopasiatxt);
           cmd.setString(82,hipocalsificacion);
           cmd.setString(83,hipotxt);
           cmd.setString(84,him);
           cmd.setString(85,himtxt);
           //cmd.setString88,fusionados);
           cmd.setString(86,fusionadostxt);
           //cmd.setString(90,germinados);
           cmd.setString(87,germinadostxt);
           cmd.setString(88,conides);
          // cmd.setString(93,afotro);
           cmd.setString(89,afotrotxt);
           cmd.setString(90,traumatismo);
           cmd.setString(91,traumatismotxt);
           cmd.setString(92,diagnosticoexp);
           cmd.setString(93,derivacionexp);
           cmd.setString(94,presentivo);
           cmd.setString(95,aparatologia);
           cmd.setString(96,revisionmedica);
           cmd.setString(97,accion);
           //cmd.execute();
           rs = cmd.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while(rs.next()){
               Object[] fila = new Object[columnas];
               for (int i = 0; i < columnas; i++) {
                   fila[i] = rs.getObject(i + 1);
               }
               
               modelotabla.addRow(fila);
           }

           
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.toString());
       }
    
    }
    
}
