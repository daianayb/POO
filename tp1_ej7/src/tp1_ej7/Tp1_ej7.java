
package tp1_ej7;

import java.util.Scanner;

/*7. Se realizó un censo provincial y se desea procesar la información obtenida en dicho
censo. De cada una de las personas censadas se tiene la siguiente información: número de
documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona
censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e
informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres,
porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones,
mostrar datos de la persona que registra la mayor edad.*/

public class Tp1_ej7 {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       int nDoc=1,edad=0,totalPersonas=0,cantVarones=0,cantMujeres=0,edadMayor=0,nDocPM=0,cantVaronesE16y65=0;
       String genero,generoPM = null;
       float porcentajeVarones=0;

      System.out.println("Ingrese el numero de Documento: ");
       nDoc=entrada.nextInt(); 
       while(nDoc!=0){
           
           System.out.println("Ingrese la edad: ");
           edad=entrada.nextInt();
           System.out.println("Ingrese F o M :");
           genero=entrada.next();
           
           totalPersonas++;
           if(genero.equalsIgnoreCase("F")){
               cantMujeres++;
           }
           
           if(genero.equalsIgnoreCase("M")){
               cantVarones++;
               if(edad>=16 && edad <=65){
                   cantVaronesE16y65++;
               }
           }
           
           if (edad>edadMayor){
               edadMayor=edad;
               nDocPM=nDoc;
               generoPM=genero;
               
           }
           System.out.println("Ingrese el numero de Documento ---- Ingrese 0 para salir");
           nDoc=entrada.nextInt();
       }
       
       if (cantVarones > 0) {
            porcentajeVarones = (cantVaronesE16y65 * 100) / cantVarones;
        }
        System.out.println("****** CENSO  ******");
        System.out.println("Personas censadas: "+totalPersonas);
        System.out.println("Cantidad varones: "+cantVarones);
        System.out.println("Cantidad mujeres: "+cantMujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: "+porcentajeVarones);
        System.out.println("********************");
        System.out.println("");
        System.out.println("***** PERSONA MAYOR REGISRADA *****");
        System.out.println("Documento: "+nDocPM);
        System.out.println("Edad: "+edadMayor);
        System.out.println("Genero: "+generoPM);
        
    }
    
}
