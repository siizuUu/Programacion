package cifras;

import java.util.Scanner;

public class E0209 {
    public static void main(String[] args) {

        //run del Scanner 
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("introduce un numero entre 0 y 99999.");
        int numEntrada = input.nextInt();

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
        } else if (numEntrada > 0) {
            cifra = 1;
        } else {
            System.out.println("ERROR");
        }

        System.out.println("El número " + numEntrada + " Tiene " + cifra + " cifras.");

        //Run out del Scanner.
        input.close();
    }
}