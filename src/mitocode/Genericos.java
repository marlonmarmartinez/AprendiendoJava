
package mitocode;


public class Genericos<T> {
    private T objeto;
    
    public Genericos(T o){
        this.objeto=o;
    }
    public void mostrarTipo(){
        System.out.println("T es un : "+objeto.getClass());
    }
}
