
package logicaprogramacion;




public class SerieNumerica {
   
    public static void main(String[] args) {
       
       solution();
        System.out.println("");
       solution1();
        System.out.println("");
        solution3();
    }
    public static void solution(){
        int numerodelaserie=1,acumulado=8,contador=0;
        
       while(contador<7){
           System.out.print(numerodelaserie+",");
           numerodelaserie=numerodelaserie+acumulado;
           acumulado+=8;
           contador++;
       }
       
    }
    public static void solution1(){
        int numero=4;
        int bandera=0;
        
        while(numero<232){
            System.out.print(numero+",");
            
            if (bandera==0) {
                numero=numero+52;
                bandera=1;
            }else{
                numero=numero+36;
                bandera=0;
            }
            
        }
        System.out.print(numero);
    }
    public static void solution3(){
        int numrestar=9,sumserie=99;
        
        while (sumserie>74) {            
            System.out.print(sumserie+",");
            sumserie=sumserie-numrestar;
            numrestar-=2;
        }
        System.out.print(sumserie);
    }
}
