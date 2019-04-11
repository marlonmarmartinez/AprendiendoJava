
package mitocode1;

import java.util.Comparator;


public class NombreComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona p, Persona p1) {
        /*Persona p=(Persona)o1;
        Persona p1=(Persona)o2;*/
        
        return(p.getNom().compareTo(p1.getNom()));
            
        
    }
    
}
