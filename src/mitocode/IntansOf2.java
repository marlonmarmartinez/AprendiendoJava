
package mitocode;


import java.util.ArrayList;
import java.util.List;


public class IntansOf2 {
    private List canasta=new ArrayList();
    public static void main(String[] args) {
        /*String texto="marlon";
        if(texto instanceof String){
        System.out.println("es un string");
        }*/
        /* lumnos2 a=new lumnos2();
        if(a instanceof Persona){
        System.out.println("es una persona");
        }*/
        //se tiene una canasta donde se permite solo frutas
        System.out.println("canasta abierta por favor ingresar");
        
        Manzana m1=new Manzana("roja");
        Manzana m2=new Manzana("verde");
        Naranja n1=new Naranja("naranja sin pepa");
        Galleta g=new Galleta("chocolate");
        
        IntansOf2 i=new IntansOf2();
        i.verificar(m1);
        i.verificar(m2);
        i.verificar(n1);
        i.verificar(g);
    }
    private void verificar(Object o){
        if(o instanceof Fruta){
            canasta.add(o);
            System.out.println("fruta agregada : "+((Fruta)o).getNom());
        }else{
            System.out.println("Elemento no permitido, solo frutas por favor");
        }
    }
}
