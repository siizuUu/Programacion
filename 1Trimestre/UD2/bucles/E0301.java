/*E0301. Diseñar un programa que muestre, para cada número introducido por teclado, 
si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0. */

package bucles;

import java.util.Scanner;

public class E0301 {

    public static void main(String[] args) {
        
        // Run del scanner
        Scanner input = new Scanner(System.in);

        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");
        System.out.println("Introduce un numero (0 para salir): ");
        int numEntrada = input.nextInt();
        while (numEntrada != 0) {

            if (numEntrada % 2 == 0) {
                System.out.println(numEntrada + " es par.");
            } else {
                System.out.println(numEntrada + " es impar.");
            }

            if (numEntrada > 0) {
                System.out.println("ademas " + numEntrada + " es positivo");

            } else {
                System.out.println("ademas " + numEntrada + " es negativo");

            }
            System.out.println("Y la raiz cuadrada de "+ numEntrada + " es " + numEntrada * numEntrada);

            System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");
            System.out.println("Introduce otro numero (0 para salir): ");
            numEntrada = input.nextInt();
        }
        System.out.println("saliendo del programa...");
        input.close();
    }
}