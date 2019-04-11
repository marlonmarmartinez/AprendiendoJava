
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class GraficasEstatus {
  String nuevoingreso="select count(estatus)as numero from equipos where estatus='Nuevo ingreso'";
   String noreparado="select count(estatus)as numero from equipos where estatus='No reparado'";
    String enrevision="select count(estatus)as numero from equipos where estatus='En revision'";
     String reparado="select count(estatus)as numero from equipos where estatus='Reparado'";
      String entregado="select count(estatus)as numero from equipos where estatus='Entregado'";
       String otro="select count(estatus)as numero from equipos where estatus='Otro'";
       Statement st;
   
      public int nuevoIngreso(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(nuevoingreso);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
      public int noReparado(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(noreparado);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      }
      public int enRevision(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(enrevision);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      } 
      public int reparado(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(reparado);
              while(rs.next()){
                 cantidad=Integer.parseInt(rs.getString("numero"));
                
                }
              
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
          }
          return cantidad;
      }
      public int entregado(){
          ResultSet rs=null;
          int cantidad=0;
          try {
              Connection cn=Conexion.conectar();
              st=cn.createStatement();
              rs=st.executeQuery(entregado);
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
