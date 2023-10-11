package relacionales;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Año a comprobar:");
        int anhoActual = input.nextInt();

        while (anhoActual < 0 || anhoActual > 9999) {
            System.out.println("Año no valido:");
            anhoActual = input.nextInt();
        }

        if (anhoActual % 400 == 0) {
            System.out.println("Es bisiesto.");
        } else {
            if (anhoActual % 100 == 0) {
                System.out.println("No es bisiesto.");
            } else {
                if (anhoActual % 4 == 0) {
                System.out.println("Es bisiesto.");
                } else {
                    System.out.println("No es bisiesto.");
                }
            }
        }

        input.close();
    }
}