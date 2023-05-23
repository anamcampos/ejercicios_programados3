/* Solicitar al usuario un año y determine si es un año bisiesto o no. Un año es
bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400. */

import java.util.Scanner;

public class ejerciciocuatro {
    public static void main (String []args ){
        Scanner input= new Scanner (System.in);

        System.out.println("Ingrese un año: ");
        int año = input.nextInt();
        while (año <=0){
            System.out.println("Ingrese un año valido: ");
             año = input.nextInt();
        }

        if (año%4==0){
            System.out.println("El año es bisiesto");
        } else if (año%100!=0 || año%400 !=0){
            System.out.println("El año no es bisiesto");
        }

    }
}