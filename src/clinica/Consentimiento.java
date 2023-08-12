/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

/**
 *
 * @author crist
 */
public class Consentimiento extends javax.swing.JFrame {
    mantenimiento man = new mantenimiento();
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    /**
     * Creates new form Concentimiento
     */
    public Consentimiento() {
        initComponents();
        txtobser.setLineWrap(true);
        txteta.setLineWrap(true);
        txtobser.setWrapStyleWord(true);
        txteta.setWrapStyleWord(true);
        
        this.setLocationRelativeTo(null);
        for (int i = 1; i < 96; i++) 
        {
            cbedad.addItem(String.valueOf(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbedad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtmp = new javax.swing.JTextField();
        txtlugar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtobser = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txteta = new javax.swing.JTextArea();
        txtdni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdomi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmenu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btnmenu.setText("menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/concentimiento formulario.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Consentimiento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del Dr. / Dra");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Lugar y fecha");

        txtmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmpKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("M.P");

        txtcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcliKeyTyped(evt);
            }
        });

        txtobser.setColumns(20);
        txtobser.setRows(5);
        jScrollPane2.setViewportView(txtobser);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Nombre Completo del Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edad");

        txteta.setColumns(20);
        txteta.setRows(5);
        jScrollPane3.setViewportView(txteta);

        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Especificación de tratamiento alternativo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("(riesgos, beneficios y perjuicios):");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Domicilio");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Observaciones");

        txtdr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdrKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-pdf.png"))); // NOI18N
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdomi))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtlugar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcli, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbedad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdr, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtmp, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(53, 53, 53)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtcli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbedad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdomi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
       
            menu nuevoFormulario = new menu();
        nuevoFormulario.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_btnmenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(txtlugar.getText().isEmpty() || txtcli.getText().isEmpty() || txtdni.getText().isEmpty() || txtdomi.getText().isEmpty() || txtdr.getText().isEmpty() || txtmp.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Por favor no dejes Campos vacíos");
        }

        else
        {
            try
            {
                documento = new Document();
                documento.setMargins(50, 50, 30, 30);

                String downloads = System.getProperty("user.home") + "/Downloads/";
                String fileName = "Implantes Consentimiento Informado "+txtcli.getText() + ".pdf";
                String filePath = downloads + fileName;
                archivo = new FileOutputStream(filePath);
                PdfWriter.getInstance(documento, archivo);

                documento.open();

                Paragraph titulo = new Paragraph();
                titulo.setAlignment(Element.ALIGN_CENTER);
                titulo.add("1\n");
                Chunk chunk1 = new Chunk("CONSENTIMIENTO INFORMADO IMPLANTES", new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD));
                titulo.add(chunk1);
                documento.add(titulo);
                documento.add(Chunk.NEWLINE);

                String lugarFecha = "Lugar y fecha " + txtlugar.getText();
                Paragraph paragraph = new Paragraph(lugarFecha, new Font(Font.FontFamily.HELVETICA, 10));
                documento.add(paragraph);

                documento.add(Chunk.NEWLINE);
                /*
                documento.add(new Paragraph("Lugar y fecha " + txtlugar.getText()));
                documento.add(Chunk.NEWLINE);
                */
                Font font = new Font(Font.FontFamily.HELVETICA, 10);
                String contenido = "Por la presente se hace saber a Usted que tiene derecho a conocer el procedimiento al que va a ser sometido"
                + " y las complicaciones más frecuentes que ocurren. Este documento explica todas estas cuestiones, léalo"
                + " atentamente y consulte todas las dudas que se le planteen. Le recordamos que por imperativo legal, tendrá"
                + " que firmar el consentimiento informado para que pueda realizarse dicho procedimiento. A propósito declaro "
                + " haber sido informado y haber comprendido acabadamente el objetivo del tratamiento a realizar.\n"
                + " Yo, "+txtcli.getText()+" de "+cbedad.getSelectedItem()+" años de edad, DNI "+txtdni.getText()+", Domiciliado en "+txtdomi.getText()+" he sido informado/a por el Dr. / Dra. "+txtdr.getText()+" M.P "+txtmp.getText()+" de los procedimientos propios clínicos."
                + " Declaro que he sido debidamente informado y comprendo el objetivo y la naturaleza de la"
                + " cirugía con implantes. Se me ha explicado y consiento en emplear un procedimiento quirúrgico para colocar"
                + " los implantes por debajo de la encía y dentro del hueso, con el objetivo de reponer dientes con estabilidad"
                + " similar o incluso superior a la de los naturales perdidos, obtener un anclaje para las prótesis dentales móviles,"
                + " conseguir que el hueso de los maxilares mantenga su función y no pierda volumen por reabsorción, siendo de"
                + " mi absoluta responsabilidad obedecer, cumpliendo los controles indicados por el profesional.\n"
                + " Declaro que mi odontólogo ha examinado mi boca debidamente. Que se me ha explicado otras alternativas a"
                + " este tratamiento, con prótesis convencionales (fijas y removibles), incluso de menor costo, y que se ha"
                + " estudiado y considerado estos métodos que se me informaron, siendo mi voluntad que me coloquen"
                + " implantes para reemplazar las piezas que he perdido o deseo sustituir.\n"
                + " Declaro, además, que he sido informado de los riesgos y complicaciones posibles involucradas con el"
                + " procedimiento quirúrgico, medicación y anestesia. Tales complicaciones incluyen: dolor, inflamación,"
                + " infección y decoloraciones. Que puedo sufrir una insensibilidad de: labios, lengua, barbilla, mejillas y dientes."
                + " Que no existe tiempo exacto que durará esta sensación en caso de complicación, que no puede ser"
                + " determinado y quizás sea irreversible según los casos y seriedad del problema. Que puede surgir también,"
                + " inflamación o daño del tejido de la zona (diente, hueso, mucosa), fractura ósea, penetración en el seno"
                + " maxilar y piso de fosas nasales, cicatrización retardada, reacciones alérgicas a medicación, drogas ó materiales"
                + " empleados en la técnica quirúrgica, falla en la óseo-integración del implante que obligará a un re-tratamiento."
                + " Comprendo y entiendo que si no se me realiza un tratamiento odontológico, podría sufrir cualquiera de los"
                + " siguientes problemas: enfermedad ósea, inflamación de las encías, infección, sensibilidad, movilidad de los"
                + " dientes seguida por la necesidad de realizar la extracción. También es posible que pueda sufrir problemas de"
                + " la unión témporomandibular (mandíbula), dolores de cabeza, dolores en la parte posterior del cuello y"
                + " músculos faciales y cansancio de los músculos al masticar."
                + "\n"
                + " "+txtobser.getText();

                Paragraph conte = new Paragraph(contenido, font);
                conte.setAlignment(Element.ALIGN_JUSTIFIED);
                documento.add(conte);

                documento.newPage();

                titulo = new Paragraph("2");
                titulo.setAlignment(1);
                documento.add(titulo);

                Font fontt = new Font(Font.FontFamily.HELVETICA, 10);
                String conteni2 = "Declaro que se me ha explicado que no existe un método que pueda predecir con certeza la capacidad de"
                + " cicatrización del hueso, de las encías y que es diferente en cada paciente, tras la colocación de implantes.\n"
                + " Declaro que se me ha explicado que en algunos casos los implantes pueden fallar y deben ser retirados. Que"
                + " se me ha informado y entiendo, que las prácticas odontológicas no son una ciencia exacta: por lo tanto no se"
                + " puede ofrecer garantías o seguridades sobre el resultado final del tratamiento o cirugía.\n"
                + " Declaro que se me ha informado de la inconveniencia de fumar, de beber alcohol o tomar demasiada azúcar,"
                + " para la cicatrización de las encías y tales hábitos ponen en compromiso el éxito del implante. Estoy"
                + " plenamente de acuerdo con las instrucciones que me ha dado el odontólogo sobre el cuidado que debo"
                + " realizar yo personalmente, en relación a la higiene de mi boca y he comprendido la manera de hacerlo. Me"
                + " comprometo a acudir a la consulta de mi odontólogo con el fin de ser examinado e instruido, tal como él me"
                + " lo indique."
                + "\n"
                + "\n"
                + " Estoy de acuerdo con ser sometido a anestesia local, sabiendo los riesgos que ello implica, delegando al"
                + " odontólogo la elección del tipo de anestesia.\n"
                + " Entiendo perfectamente que, durante y a continuación del procedimiento previsto, cirugía o tratamiento,"
                + " pueden surgir condiciones que, según el criterio del profesional requiera un plan de tratamiento"
                + " complementario/alternativo, relacionado directamente con el éxito del tratamiento. También apruebo"
                + " cualquier modificación en diseño, materiales o mantenimiento, si se considera que es para mi beneficio.\n"
                + "\n";

                Paragraph contee = new Paragraph(conteni2, fontt);
                contee.setAlignment(Element.ALIGN_JUSTIFIED);
                documento.add(contee);

                Phrase phrase1 = new Phrase();
                Chunk chunk2 = new Chunk("Especificación de tratamiento alternativo (riesgos, beneficios y perjuicios): ", new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD));
                Chunk chunk3 = new Chunk(txteta.getText(), new Font(Font.FontFamily.HELVETICA, 10));
                phrase1.add(chunk2);
                phrase1.add(chunk3);
                documento.add(new Paragraph(phrase1));

                documento.add(Chunk.NEWLINE);

                Font letra = new Font(Font.FontFamily.HELVETICA, 10);
                String parrafo3 = "Declaro que he sido informado que las complicaciones de oseointegración referidas a la colocación de"
                + " implantes y de los riesgos de someterlos a movilidad posterior a su inserción y que se deberán respetar los"
                + " controles odontológicos posteriores, extremándose en caso de existir prótesis.\n"
                + " Me comprometo a tomar todos los cuidados y recaudos necesarios; a cumplir con la medicación estipulada,"
                + " sin incorporar modificación alguna; asistir a los controles estipulados y a informar de inmediato al odontólogo"
                + " responsable cualquier sintomatología que aparezca, a fin de tratarla precozmente.\n"
                + " Confirmo que he leído y comprendido todo el escrito precedente y que el facultativo y su equipo me han"
                + " explicado todo el acto quirúrgico y me han permitido realizar todas las preguntas necesarias, dándome"
                + " respuestas a mis inquietudes, en un lenguaje claro y sencillo.\n"
                + "\n";

                Paragraph contenido3 = new Paragraph(parrafo3, letra);
                contenido3.setAlignment(Element.ALIGN_JUSTIFIED);
                documento.add(contenido3);

                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);
                documento.add(Chunk.NEWLINE);

                Font letra2 = new Font(Font.FontFamily.HELVETICA, 10);
                String signatures = "   __________________________________                            __________________________________\n"
                + "          Firma del paciente o representante                                              Firma y sello del profesional            ";

                Paragraph ultimo = new Paragraph(signatures, letra2);
                ultimo.setAlignment(Element.ALIGN_JUSTIFIED);
                documento.add(ultimo);

                documento.close();

                File file = new File(filePath);
                Desktop.getDesktop().open(file);

            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
            catch (DocumentException ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        // TODO add your handling code here:
        man.solonumeros(txtdni, evt);
    }//GEN-LAST:event_txtdniKeyTyped

    private void txtdrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdrKeyTyped
        // TODO add your handling code here:
        man.sololetras(txtdr, evt);
    }//GEN-LAST:event_txtdrKeyTyped

    private void txtcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcliKeyTyped
        // TODO add your handling code here:
        man.sololetras(txtcli, evt);
    }//GEN-LAST:event_txtcliKeyTyped

    private void txtmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmpKeyTyped
        // TODO add your handling code here:
        man.solonumeros(txtmp, evt);
    }//GEN-LAST:event_txtmpKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consentimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consentimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consentimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consentimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consentimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmenu;
    private javax.swing.JComboBox<String> cbedad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtcli;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtdomi;
    private javax.swing.JTextField txtdr;
    private javax.swing.JTextArea txteta;
    private javax.swing.JTextField txtlugar;
    private javax.swing.JTextField txtmp;
    private javax.swing.JTextArea txtobser;
    // End of variables declaration//GEN-END:variables
}