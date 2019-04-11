
package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static Connection conectar(){
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_institucion","root","");
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar : "+e.getMessage());
        }
        return (null);
    }
    
}
