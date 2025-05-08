
package tp1_ej5;

import java.util.Scanner;

/*5. Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del
cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio
cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El
servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder
calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e
informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio
con el que cuenta.
*/

public class Tp1_ej5 {

  
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
       
       String[][] clientes= new String[5][3];
       int servicio;
       
       for(int i=0;i<5;i++){
        System.out.println("Ingrese el DNI del cliente");
        clientes[i][0]= entrada.next();
        System.out.println("Ingrese el numero segun el servicio que posee");
        System.out.println("1)Internet 30 megas  2)Internet 50 megas  3)Internet 100 megas ");
        servicio=entrada.nextInt();
         switch (servicio) {
                        case 1:
                            clientes[i][1]="1";
                            clientes[i][2]= "$750";
                            break;
                        case 2:
                            clientes[i][1]="2";
                            clientes[i][2]= "$1.100";
                            break;
                        case 3:
                            clientes[i][1]="3";
                            clientes[i][2]= "$1.425";
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }  
       }
       
       
       for(int i=0;i<5;i++){
            System.out.println("Cliente #" + (i + 1));
            System.out.println("DNI: " + clientes[i][0]);
            System.out.println("Servicio: " + clientes[i][1]);
            System.out.println("Monto a pagar: " + clientes[i][2]);
            System.out.println("------------------------------");
       }
        
    }
    
}
