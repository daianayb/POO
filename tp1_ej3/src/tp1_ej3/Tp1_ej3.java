
package tp1_ej3;
/*3. Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.*/

import java.util.Scanner;

public class Tp1_ej3 {

    
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int cantidad;
       
       System.out.println("Ingrese la cantidad de productos ");
       cantidad=entrada.nextInt();
       
       int[] productos=new int[cantidad];
       float[] precios=new float[cantidad];
       
       for(int i=0; i<cantidad;i++){
           System.out.println("Ingrese la cantidad del producto "+(i+1));
           productos[i]=entrada.nextInt();
           System.out.println("Ingrese el precio del producto "+(i+1));
           precios[i]=entrada.nextFloat();
           
       }
       
       float precioTotal;
       for(int i=0; i<cantidad;i++){
           precioTotal=precios[i]*productos[i];
           if (precioTotal >1000){
               System.out.println("El producto n° "+(i+1)+ " tiene un precio mayor a $1000");
           }
        }
      
    }
    
}
