/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.FondoSwing;
import clases.GraficasDeMarcas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Lnv
 */
public class GraficaDeMarcas extends javax.swing.JFrame {
    boolean bandera;
    /**
     * Creates new form GraficaDeMarcas
     */
    public GraficaDeMarcas() {
        initComponents();
    }
     public GraficaDeMarcas(String username,boolean bandera) {
        initComponents();
        this.bandera=bandera;
        setLocationRelativeTo(null);  
        setResizable(false);
        setTitle("Tecnico - Sesion de "+username);
        setLocationRelativeTo(null);
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
          try {
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("src/images/wallpaperPrincipal.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
      
    }
     @Override
    public void paint(Graphics g){
        super.paint(g);
         GraficasDeMarcas cantidad=new GraficasDeMarcas();
        if(bandera==true){
           
            int hp=cantidad.HP();
            int acer=cantidad.ACER();
            int lenovo=cantidad.LENOVO();
            int dell=cantidad.DELL();
            int asus=cantidad.ASUS();
            int apple=cantidad.APPLE();
            int toshiba=cantidad.TOSHIBA();
            int samsumg=cantidad.SAMSUMG();
            int vaio=cantidad.VAIO();
            int sony=cantidad.SONY();
            int lg=cantidad.LG();
            int compaq=cantidad.COMPAQ();
            int epson=cantidad.EPSON();
            int ibm=cantidad.IBM();
            int canon=cantidad.CANON();
            int otro=cantidad.otro();       
            
            int totalcantidad=hp+acer+lenovo+dell+asus+apple+toshiba+samsumg+vaio+sony+lg+compaq+epson+ibm+canon+otro;
            
            int hp1=hp*360/totalcantidad;
            int acer1=acer*360/totalcantidad;
            int lenovo1=lenovo*360/totalcantidad;
            int dell1=dell*360/totalcantidad;
            int asus1=asus*360/totalcantidad;
            int apple1=apple*360/totalcantidad;
            int toshiba1=toshiba*360/totalcantidad;
            int samsumg1=samsumg*360/totalcantidad;
            int vaio1=vaio*360/totalcantidad;
            int sony1=sony*360/totalcantidad;
            int lg1=lg*360/totalcantidad;
            int compaq1=compaq*360/totalcantidad;
            int epson1=epson*360/totalcantidad;
            int ibm1=ibm*360/totalcantidad;
            int canon1=canon*360/totalcantidad;
            int otro1=otro*360/totalcantidad; 
            
            g.setColor(new Color(255,0,0));
            g.fillArc(25, 133, 200, 200, 0, hp1);
            g.fillRect(250, 120, 20, 20);
            g.drawString("HP "+hp, 275, 135);
            
            g.setColor(new Color(0,130,0));
            g.fillArc(25, 133, 200, 200, hp1, acer1);
            g.fillRect(250, 150, 20, 20);
            g.drawString("ACER "+acer, 275, 165);
            
            g.setColor(new Color(0,0,255));
            g.fillArc(25, 133, 200, 200, hp1+acer1, lenovo1);
            g.fillRect(250, 180, 20, 20);
            g.drawString("LENOVO "+lenovo, 275, 195);
            
            g.setColor(new Color(255,255,255));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1,dell1);
            g.fillRect(250, 210, 20, 20);
            g.drawString("DELL "+dell, 275, 225);
            
            g.setColor(new Color(200,130,100));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1, asus1);
            g.fillRect(250, 240, 20, 20);
            g.drawString("ASUS "+asus, 275, 255);
            
            g.setColor(new Color(180,100,255));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1, apple1);
            g.fillRect(250, 270, 20, 20);
            g.drawString("APPLE "+apple, 275, 285);
            
            g.setColor(new Color(255,0,100));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1+apple1, toshiba1);
            g.fillRect(250, 300, 20, 20);
            g.drawString("TOSHIBA "+toshiba, 275, 315);
            
            g.setColor(new Color(0,130,130));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1, samsumg1);
            g.fillRect(250, 330, 20, 20);
            g.drawString("SAMSUMG "+samsumg, 275, 345);
            
            g.setColor(new Color(255,0,255));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1, vaio1);
            g.fillRect(375, 120, 20, 20);
            g.drawString("VAIO "+vaio, 400, 135);
            
            g.setColor(new Color(255,210,10));
            g.fillArc(25, 133, 200, 200,hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1, sony1);
            g.fillRect(375, 150, 20, 20);
            g.drawString("SONY "+sony, 400, 165);
            
            g.setColor(new Color(100,130,100));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1+sony1, lg1);
            g.fillRect(375, 180, 20, 20);
            g.drawString("LG "+lg, 400, 195);
            
            g.setColor(new Color(90,190,255));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1+sony1+lg1, compaq1);
            g.fillRect(375, 210, 20, 20);
            g.drawString("COMPAQ "+compaq,400, 225);
            
            g.setColor(new Color(255,90,90));
            g.fillArc(25, 133, 200, 200, hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1+sony1+lg1+compaq1, epson1);
            g.fillRect(375, 240, 20, 20);
            g.drawString("EPSON "+epson, 400, 255);
            
            g.setColor(new Color(210,130,10));
            g.fillArc(25, 133, 200, 200,hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1+sony1+lg1+compaq1+epson1, ibm1);
            g.fillRect(375, 270, 20, 20);
            g.drawString("IBM "+ibm, 400, 285);
            
            g.setColor(new Color(150,120,90));
            g.fillArc(25, 133, 200, 200,hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1+sony1+lg1+compaq1+epson1+ibm1, canon1);
            g.fillRect(375, 300, 20, 20);
            g.drawString("CANON "+canon, 400, 315);
            
            g.setColor(new Color(0,120,255));
            g.fillArc(25, 133, 200, 200,hp1+acer1+lenovo1+dell1+asus1+apple1+toshiba1+samsumg1+vaio1+sony1+lg1+compaq1+epson1+ibm1+canon1, otro1);
            g.fillRect(375, 330, 20, 20);
            g.drawString("OTROS "+otro, 400, 345);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grafica de Marcas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Creado por Marlon ®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GraficaDeMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaDeMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaDeMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaDeMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaDeMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
