// Solicitar al usuario dos números y comprobar si son iguales

import java.util.Scanner;

public class ejerciciouno {

    public static void main (String args []){
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = input.nextInt();
        while (num<=0){
             System.out.println("Ingrese un numero mayor a 0");
         num = input.nextInt();
        }
        System.out.println("Ingrese otro numero entero");
        int num2 = input.nextInt();
         while (num2<=0){
             System.out.println("Ingrese un numero mayor a 0");
         num2 = input.nextInt();
        }
        
        if (num==num2){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }

    }

}