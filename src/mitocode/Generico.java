
package mitocode;

import java.util.ArrayList;
import java.util.List;


public class Generico {
    
    public static void main(String[] args) {
    
        Genericos<String> c=new Genericos<>("marlon");
        c.mostrarTipo();
        /*List<String>lista=new ArrayList<>();
        lista.add("m");
        //lista.add(25);*/
        //Genericos<String,Integer,String,String>
        //List<Genericos<String,Integer,String,String>>lista=new ArrayList<>();
        //lista.add(new Genericos<String,Integer,String,String>("m",8,"m","m"));
        
        //for(Genericos<String,Integer,String,String>cl:lista){
        //c.mostrarTipo();}
    }
}
