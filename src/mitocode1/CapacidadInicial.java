
package mitocode1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CapacidadInicial {//listas
   
    public static void main(String[] args) {
        List<Persona>lista=new ArrayList<>();
        lista.add(new Persona(1,"m",25));
        lista.add(new Persona(1,"c",2));
        lista.add(new Persona(1,"d",29));
        //Collections.sort(lista);
        //Collections.sort(lista,new NombreComparator());
        /*Collections.sort(lista, new Comparator<Persona>(){
			@Override
			public int compare(Persona per1, Persona per2) {
				int rpta = 0;
				if(per1.getEdad() > per2.getEdad()){
					rpta = 1;
				}else if(per1.getEdad() < per2.getEdad()){
					rpta = -1;
				}else{
					rpta = 0;
				}
				return rpta;
			}
			
		});*/
        for (Persona persona : lista) {
            System.out.println(persona.getNom());
        }
        //System.out.println(lista);
        
        
    }
}
