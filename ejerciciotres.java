/* Solicitar al usuario un número entero y determinar si es múltiplo de tres y de
cinco. */

import java.util.Scanner;

public class ejerciciotres {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Ingrese un numero entero ");
        int num = input.nextInt();
        while (num<=0){
        System.out.println("Ingrese un numero entero positivo ");
        num = input.nextInt();
        }

        if (num%3==0){
            System.out.println("El numero es multiplo de 3");
        } else if (num%5==0){
            System.out.println("El numero es multiplo de 5");
        } else {
            System.out.println("El numero no es multiplo de 3 ni de 5");
        }
    }
}