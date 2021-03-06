/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdedatos;
import com.itextpdf.text.BadElementException;
import java.sql.*;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lnv
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtgrupo = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Grupo");

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el codigo del alumno :");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        reporte.setText("Generar Reporte");
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnombre)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtgrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnregistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnmodificar))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbuscar)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(reporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_institucion","root","");
            PreparedStatement ps=cn.prepareStatement("insert into alumnos values(?,?,?)");
            ps.setString(1, "0");
            ps.setString(2, txtnombre.getText().trim());
            ps.setString(3, txtgrupo.getText().trim());
            ps.executeUpdate();
            
            txtnombre.setText("");
            txtgrupo.setText("");
            status.setText("registro exitoso");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_institucion","root","");
            PreparedStatement ps=cn.prepareStatement("select * from alumnos where id=?");
            ps.setString(1, txtbuscar.getText().trim());
            
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                txtnombre.setText(rs.getString("nombrealumno"));
                 txtgrupo.setText(rs.getString("grupo"));
            } else {
                JOptionPane.showMessageDialog(null, "alumno no registrado");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {
            String id=txtbuscar.getText().trim();
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_institucion","root","");
            PreparedStatement ps=cn.prepareStatement("update alumnos set nombrealumno=?, grupo=? where id="+id);
            ps.setString(1, txtnombre.getText().trim());
            ps.setString(2, txtgrupo.getText().trim());
            ps.executeUpdate();
            
            status.setText("modificacion exitosa");
            
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_institucion","root","");
            PreparedStatement ps=cn.prepareStatement("delete from alumnos where id=?");
            ps.setString(1, txtbuscar.getText().trim());
            ps.executeUpdate();
            
            txtnombre.setText("");
            txtgrupo.setText("");
            txtbuscar.setText("");
            status.setText("registro eliminado");
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        Document documento=new Document();
        
        try {
            String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_alumnos.pdf"));
            
            
                Image header=Image.getInstance("D:\\descargas\\images\\images\\DS.png");
                header.scaleToFit(1000,100);
                header.setAlignment(Chunk.ALIGN_CENTER);
                
            Paragraph parrafo=new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("formato creado por marlon ®\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.DARK_GRAY));
            parrafo.add("alumnos registrados\n\n");      
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla=new PdfPTable(3);
            tabla.addCell("Codigo");
            tabla.addCell("Nombre Del Alumno");
            tabla.addCell("Grupo");
            try {
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_institucion","root","");
                PreparedStatement ps=cn.prepareStatement("select * from alumnos");
                ResultSet rs=ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                    } while (rs.next());
                    documento.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
                JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "reporte creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(RegistroAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reporteActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton reporte;
    private javax.swing.JLabel status;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtgrupo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
