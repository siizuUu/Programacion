package V2;

import java.util.Scanner;
import java.math.abs;

public class E0209_V2 {
    public static void main(String[] args) {

        //run del Scanner 
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("introduce un numero entre 0 y 99999.");
        int numEntrada = Math.abs(input.nextInt());

        //Estructura de comprobacion
        byte cifra = 0;
        if (numEntrada / 10000 > 0) {
            cifra = 5;
        } else if (numEntrada / 1000 > 0) {
            cifra = 4;
        } else if (numEntrada / 100 > 0) {
            cifra = 3;
        } else if (numEntrada / 10 > 0) {
            cifra = 2;
        }

        System.out.println("El número " + numEntrada + " Tiene " + cifra + " cifras.");

        //Run out del Scanner.
        input.close();
    }
}
