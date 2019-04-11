
package javaavanzado;


public class Recursividad {
    
    public void imprimir(int x){
        if(x<=5){
            System.out.print(x+" ");
            
            imprimir(x+1);
        }
    }
}
