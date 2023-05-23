/*Solicitar al usuario un numero entero, muestre en pantalla el doble
 y el triple de ese numeros*/

import java.util.Scanner;

public class ejerciciodos{

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

    System.out.println("Ingrese un numero entero: ");
    int num = input.nextInt();

    
    System.out.println("El doble del numero es: "+ num*2);
    System.out.println("El triple del numero es "+num*3);

    }

}