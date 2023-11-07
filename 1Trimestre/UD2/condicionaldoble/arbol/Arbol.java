package arbol;

import java.util.Scanner;

public class Arbol {
    public static void main(String[] args) {
        
        // Run del scanner
        Scanner input = new Scanner(System.in);

        // Inputs y Variables
        System.out.println("Introduce 3 numeros: (Pulsa enter despues de cada uno)");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();

        if (numero1 > numero2) {
            if (numero1 > numero2) {
                if (numero2 > numero3) {
                    System.out.println(numero1 + "" + numero2 + "" + numero3);
                } else {
                    System.out.println(numero1 + "" + numero3 + "" + numero2);
                }
            } else {
                System.out.println(numero3 + "" + numero1 + "" + numero2);
            }
        } else {
            if (numero2 > numero3) {
                System.out.println(numero2 + "" + numero1 + "" + numero3);
            } else {
                System.out.println(numero2 + "" + numero3 + "" + numero1);
            } if (numero3 > numero2) {
            System.out.println(numero3 + "" + numero2 + "" + numero1);
        }
    }
    }
}
