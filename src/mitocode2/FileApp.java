
package mitocode2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileApp {
    
    public static void main(String[] args) {
        try {
            File f1 = new File("Archivos");
            
            File f2 = new File("Archivos","SubArchivos");
            
            File f3 = new File(f1, "mitocode.txt");
            
            //System.out.println(f2.mkdir());
            System.out.println(f3.createNewFile());
        } catch (IOException ex) {
            Logger.getLogger(FileApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
