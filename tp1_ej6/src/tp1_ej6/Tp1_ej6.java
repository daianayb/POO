
package tp1_ej6;

import java.util.Scanner;

/*6. En una carrera automovilística se desea calcular cuál es el menor tiempo realizado entre
cada uno de sus 12 competidores. Para ello, se pide un algoritmo que sea capaz de permitir
el ingreso por teclado del número de vehículo y el tiempo (en segundos) de cada
participante. Una vez encontrado el que realizó el mejor tiempo, se debe informar por
pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.
*/

public class Tp1_ej6 {

    public static void main(String[] args) {
        int numVehiculo,tiempoSeg,mayorTiempo=10000,numPosF=0;
       Scanner entrada= new Scanner(System.in);
       int vehiculos[][]= new int [12][2];
       
        System.out.println("----- CARRERA DE VEHICULOS -----");
       for (int i=0;i<12;i++){
           System.out.println("Ingrese el numero de vehiculo ");
           numVehiculo=entrada.nextInt();
           vehiculos[i][0]=numVehiculo;
           System.out.println("Ingrese el tiempo en SEGUNDOS ");
           tiempoSeg=entrada.nextInt();
           vehiculos[i][1]=tiempoSeg;
           if(tiempoSeg < mayorTiempo){
               mayorTiempo=tiempoSeg;
               numPosF=i; 
           }
           System.out.println("-----------------------------------");
       }
       
        System.out.println("---------VEHICULO GANADOR-------");
        System.out.println("Número: "+vehiculos[numPosF][0]);
        System.out.println("Tiempo en Segundos: "+mayorTiempo);
        
    }
    
}
