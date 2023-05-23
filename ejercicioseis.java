/* Solicitar al usuario tres números enteros H, M, S correspondientes a hora,
minutos y segundos respectivamente, y comprueba si la hora que indican es una
hora válida. */

import java.util.Scanner;
public class ejercicioseis{

    public static void main(String[]args){
        Scanner input = new Scanner (System.in);

        System.out.print("Ingrese una hora en formato de 24h: ");
        int h = input.nextInt();
        while (h<0){
            System.out.print("Ingrese una hora en formato de 24h: ");
             h = input.nextInt();
        }
        System.out.print("Ingrese los minutos: ");
        int m = input.nextInt();
        while (m<0){
            System.out.print("Ingrese los minutos: ");
             m = input.nextInt();
        }

        System.out.print("Ingrese segundos: ");
        int s = input.nextInt();
        while (s<0){
            System.out.print("Ingrese segundos: ");
             s = input.nextInt();
        }

        if (h>24 || m>60 || s>60){
            System.out.println("Hora incorrecta");
        } else {
            System.out.println("Hora correcta: "+h+ ":"+m+":"+s);
        }

    }
}