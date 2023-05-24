/*Solicitar al usuario una cantidad de millas y calcule su equivalente en
Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las
millas.1 Milla equivale a 1.6093 Kilómetros.
 */

 import java.util.Scanner;

 public class ejerciciocinco {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int repetir = 1;

        while (repetir !=0){
            System.out.println("Ingrese un valor en millas o bien, 0 para salir");
            double millas = input.nextInt();
            if (millas<=0){
                System.out.println(" ingrese un valor positivo");
                millas = input.nextInt();
            } else if (millas==0){
                repetir = 0;
            } else {
            double km = millas * 1.6093;
            System.out.println("El valor en kilometros es: "+km);
            }
            }
           
        }
    }