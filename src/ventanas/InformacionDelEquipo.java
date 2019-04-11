/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import clases.FondoSwing;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lnv
 */
public class InformacionDelEquipo extends javax.swing.JFrame {
        int idequipo;
        String nomcli,username,tecnico="";
    /**
     * Creates new form RegistrarEquipos
     */
    public InformacionDelEquipo() {
        initComponents();
    }
    public InformacionDelEquipo(String nomcli,int idequipo,String username) {
        initComponents();
        this.idequipo=idequipo;
        this.nomcli=nomcli;
        this.username=username;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Equipo del cliente "+nomcli+"-sesion de "+username);
        txtncliente.setText(nomcli);
        String validarusername="";
        try {
                
                Connection cn=Conexion.conectar();
                Statement ps=cn.createStatement();
                ResultSet rs=ps.executeQuery("select username from usuarios where tipo_nivel='Tecnico'");
                while(rs.next()){
                    validarusername=rs.getString("username");
                    tecnico=validarusername;
                    if(username.equals(validarusername)){
                        comotipoequipo.setEnabled(false);
                        combomarca.setEnabled(false);
                        txtmodelo.setEditable(false);
                        txtnumserie.setEditable(false);
                        txtareaobservaciones.setEditable(false);
                        txtareacomentariostecnicos.setEditable(true);
                        }
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        if(username.equals(validarAdmi())){
            txtareacomentariostecnicos.setEditable(true);
            try {
                
                Connection cn=Conexion.conectar();
                Statement ps=cn.createStatement();
                ResultSet rs=ps.executeQuery("select nombre_clientes from clientes inner join equipos on clientes.id_clientes=equipos.id_equipos where equipos.id_equipos="+idequipo);
                while(rs.next()){
                   txtncliente.setText(rs.getString("nombre_clientes"));
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        }
       
        mostrarInfoequipo();
        
         try {
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("src/images/wallpaperPrincipal.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static String validarAdmi(){
        String  validarusername=""; 
        try {
                
                Connection cn=Conexion.conectar();
                Statement ps=cn.createStatement();
                ResultSet rs=ps.executeQuery("select username from usuarios where tipo_nivel='Administrador'");
                while(rs.next()){
                  validarusername=rs.getString("username");
                    
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
         return validarusername;
    }
    
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
       
    }
    public final void mostrarInfoequipo(){
        try {
                Connection cn=Conexion.conectar();
                PreparedStatement ps=cn.prepareStatement("select tipo_equipo,marca,modelo,num_serie,dia_ingreso,mes_ingreso,anio_ingreso,observaciones,estatus,ultima_modificacion,comentarios_tecnicos from equipos where id_equipos='"+idequipo+"'");
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    String dia=rs.getString("dia_ingreso");
                    String mes=rs.getString("mes_ingreso");
                    String anio=rs.getString("anio_ingreso");
                    String fecha=dia+" de "+mes+" del "+anio;
                   comotipoequipo.setSelectedItem(rs.getString("tipo_equipo"));
                   combomarca.setSelectedItem(rs.getString("marca"));
                   txtmodelo.setText(rs.getString("modelo"));
                   txtnumserie.setText(rs.getString("num_serie"));
                   txtfechaingreso.setText(fecha);
                   txtareaobservaciones.append(rs.getString("observaciones"));
                   comboestatus.setSelectedItem(rs.getString("estatus"));
                   txtultimamodificaion.setText(rs.getString("ultima_modificacion"));
                   txtareacomentariostecnicos.setText(rs.getString("comentarios_tecnicos"));
                   
                }
                rs.close();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtncliente = new javax.swing.JTextField();
        comotipoequipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combomarca = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnumserie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtultimamodificaion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfechaingreso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboestatus = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaobservaciones = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareacomentariostecnicos = new javax.swing.JTextArea();
        btnactualizarequipo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informacion del Equipo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente :");

        txtncliente.setEditable(false);
        txtncliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnclienteActionPerformed(evt);
            }
        });

        comotipoequipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapton", "Desktop", "Impresora", "Multifuncional", "Otros" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Equipo");

        combomarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP", "ACER", "LENOVO", "DELL", "ASUS", "APPLE", "TOSHIBA", "SAMSUMG", "VAIO", "SONY", "LG", "COMPAQ", "IBM", "EPSON", "CANON", "OTROS" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo");

        txtmodelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de serie ");

        txtnumserie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ultima modificacion por ");

        txtultimamodificaion.setEditable(false);
        txtultimamodificaion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de ingreso");

        txtfechaingreso.setEditable(false);
        txtfechaingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estatus");

        comboestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo ingreso", "No reparado", "En revision", "Reparado", "Entregado", "Otro" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Daño reportado y observaciones");

        txtareaobservaciones.setColumns(20);
        txtareaobservaciones.setRows(5);
        jScrollPane1.setViewportView(txtareaobservaciones);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Comentarios y actualizacion de tecnicos");

        txtareacomentariostecnicos.setEditable(false);
        txtareacomentariostecnicos.setColumns(20);
        txtareacomentariostecnicos.setRows(5);
        jScrollPane2.setViewportView(txtareacomentariostecnicos);

        btnactualizarequipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnactualizarequipo.setText("Actualizar Equipo");
        btnactualizarequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarequipoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Creado por Marlon ®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)
                                .addComponent(txtncliente)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(combomarca, 0, 191, Short.MAX_VALUE)
                                .addComponent(comotipoequipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(txtnumserie)
                                .addComponent(txtultimamodificaion, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(comboestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel11)
                            .addComponent(btnactualizarequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comotipoequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtultimamodificaion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizarequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnclienteActionPerformed

    private void btnactualizarequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarequipoActionPerformed
        if(!tecnico.equals("")){
            this.username=txtultimamodificaion.getText().trim();
        }
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

        if(confirmar == JOptionPane.YES_OPTION){
        try {
                Connection cn=Conexion.conectar();
                 PreparedStatement ps=cn.prepareStatement("update equipos set tipo_equipo=?, marca=?, modelo=?,num_serie=?,observaciones=?,estatus=?,ultima_modificacion=?,comentarios_tecnicos=?,revision_tecnica_de=? where id_equipos='"+idequipo+"'");
                ps.setString(1, (String)comotipoequipo.getSelectedItem());
                ps.setString(2, (String)combomarca.getSelectedItem());
                ps.setString(3, txtmodelo.getText().trim());
                ps.setString(4, txtnumserie.getText().trim());
                ps.setString(5, txtareaobservaciones.getText().trim());
                ps.setString(6, (String) comboestatus.getSelectedItem());
                ps.setString(7, username);
                ps.setString(8, txtareacomentariostecnicos.getText().trim());
                ps.setString(9, tecnico);
                
                int cambios=ps.executeUpdate();
            if(cambios>0){
             JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
            dispose();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        }else{
            mostrarInfoequipo();
        }
    }//GEN-LAST:event_btnactualizarequipoActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionDelEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizarequipo;
    private javax.swing.JComboBox<String> comboestatus;
    private javax.swing.JComboBox<String> combomarca;
    private javax.swing.JComboBox<String> comotipoequipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtareacomentariostecnicos;
    private javax.swing.JTextArea txtareaobservaciones;
    private javax.swing.JTextField txtfechaingreso;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtncliente;
    private javax.swing.JTextField txtnumserie;
    private javax.swing.JTextField txtultimamodificaion;
    // End of variables declaration//GEN-END:variables
}
