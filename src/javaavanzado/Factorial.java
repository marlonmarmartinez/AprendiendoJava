
package javaavanzado;


public class Factorial {
    
    public int factorial(int parametro){
        if(parametro>0){
            int valorcalculado=parametro*factorial(parametro-1);
            return valorcalculado;
        }
        return 1;
    }
}
