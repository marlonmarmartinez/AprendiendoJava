
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class GraficasDeMarcas {
    
    String HP = "select count(marca)as numero from equipos where marca='HP'";
    String ACER = "select count(marca)as numero from equipos where marca='ACER'";
    String LENOVO = "select count(marca)as numero from equipos where marca='LENOVO'";
    String DELL = "select count(marca)as numero from equipos where marca='DELL'";
    String ASUS = "select count(marca)as numero from equipos where marca='ASUS'";
    String APPLE = "select count(marca)as numero from equipos where marca='APPLE'";
    String TOSHIBA = "select count(marca)as numero from equipos where marca='TOSHIBA'";
    String SAMSUMG = "select count(marca)as numero from equipos where marca='SAMSUMG'";
    String VAIO = "select count(marca)as numero from equipos where marca='VAIO'";
    String SONY = "select count(marca)as numero from equipos where marca='SONY'";
    String LG = "select count(marca)as numero from equipos where marca='LG'";
    String COMPAQ = "select count(marca)as numero from equipos where marca='COMPAQ'";
    String EPSON = "select count(marca)as numero from equipos where marca='EPSON'";
    String IBM = "select count(marca)as numero from equipos where marca='IBM'";
    String CANON = "select count(marca)as numero from equipos where marca='CANON'";
    String otro = "select count(marca)as numero from equipos where marca='OTROS'";
    Statement st;
   
      public int HP(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(HP);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
      public int ACER(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(ACER);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      }
      public int LENOVO(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(LENOVO);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
      public int DELL(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(DELL);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      }
      public int ASUS(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(ASUS);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
       public int APPLE(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(APPLE);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
        public int TOSHIBA(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(TOSHIBA);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
         public int SAMSUMG(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(SAMSUMG);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
          public int VAIO(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(VAIO);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
           public int SONY(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(SONY);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
            public int LG(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(LG);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
             public int COMPAQ(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(COMPAQ);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
              public int EPSON(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(EPSON);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
               public int IBM(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(IBM);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
                public int CANON(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(CANON);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
      public int otro(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(otro);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
}
