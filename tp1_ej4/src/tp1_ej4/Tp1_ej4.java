
package tp1_ej4;

import java.util.Scanner;

/*4. Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
usuario.
*/

public class Tp1_ej4 {

   
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       String[][] camiones =new String[30][3];
         int cantidadCarga=0; 
       for(int f=0;f<30;f++){
      
                 System.out.println("Ingrese la patente del camion n° "+(f+1));
                 camiones[f][0]=entrada.nextLine();
       
                 System.out.println("Ingrese el nombre y apellido del camionero n° "+(f+1));
                 camiones[f][1]=entrada.nextLine();
             
             
                 System.out.println("Ingrese el tipo de carga del camion n° "+(f+1));
                  System.out.println("1) madera  2) yerba  3)te");
                 camiones[f][2]=entrada.nextLine();
                    switch (camiones[f][2]) {
                        case "1":
                            camiones[f][2] = "madera";
                            cantidadCarga++; // por ejemplo, contar cuántos llevan madera
                            break;
                        case "2":
                            camiones[f][2] = "yerba";
                            break;
                        case "3":
                            camiones[f][2] = "té";
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
      
                 System.out.println("Ingrese la hora del egreso del camionero n° "+(f+1));
                 camiones[f][3]=entrada.nextLine();
             
         }
          
    
      for (int i = 0; i < 30; i++) {
            System.out.println("Camión #" + (i + 1));
            System.out.println("Patente: " + camiones[i][0]);
            System.out.println("Chofer: " + camiones[i][1]);
            System.out.println("Tipo de carga: " + camiones[i][2]);
            System.out.println("Hora de egreso: " + camiones[i][3]);
            System.out.println("------------------------------");
        }
      
        System.out.println("Cantidad de camiones que llevan Té: "+cantidadCarga);
       
    
    }
    
}
