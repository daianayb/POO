
package tp1_ej2;

import java.util.Scanner;

/*2. Cargar un vector con “n” notas e indicar la cantidad de aprobados (Notas mayores o
iguales a 6), la cantidad de desaprobados (Notas menores a 6).
*/


public class Tp1_ej2 {

    
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
       int cantidad;
       
       System.out.println("Ingrese la cantidad de notas ");
       cantidad=entrada.nextInt();
       
       float[] notas=new float[cantidad];
       
       for(int i=0; i<cantidad;i++){
           System.out.println("Ingrese la nota "+(i+1));
           notas[i]=entrada.nextFloat();
       }
       
       System.out.println("Las notas son:");
       for(int i=0; i<cantidad;i++){
          System.out.println(i);
        }
       
       float cantAprobados=0,cantDesaprobados=0;
        for(int i=0; i<cantidad;i++){
           if(notas[i]>= 6){
               cantAprobados++;
           }
           if(notas[i]<=5){
               cantDesaprobados++;
           }
       }
        
       System.out.println("CANTIDAD DE APROBADOS: "+cantAprobados); 
       System.out.println("CANTIDAD DE DESAPROBADOS: "+cantDesaprobados); 
       
    }
    
}
