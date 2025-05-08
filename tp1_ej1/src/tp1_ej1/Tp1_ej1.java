
package tp1_ej1;

import java.util.Scanner;


/*1. Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
notas se debe mostrar la nota más alta y el promedio de notas.
*/
public class Tp1_ej1 {

   
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
       
       float notaMayor=0,promedio=0;
        for(int i=0; i<cantidad;i++){
           if(notas[i]>notaMayor){
               notaMayor=notas[i];
               promedio=promedio+i;
           }
       }
        
       System.out.println("NOTA MAS ALTA "+notaMayor); 
       System.out.println("PROMEDIO "+promedio); 
       
       
    }
    
}
