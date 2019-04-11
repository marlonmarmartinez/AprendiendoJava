
package javaavanzado;

import java.util.Scanner;


public class PrincipalFctorial {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("introduce el numero para calcular su factorial : ");
        int valor=entrada.nextInt();
        Factorial f=new Factorial();
       
        int fac=f.factorial(valor);
        System.out.println("el factorial de "+valor+" es "+fac );
    }
}
