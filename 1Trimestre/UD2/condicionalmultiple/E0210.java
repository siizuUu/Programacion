package condicionalmultiple;

import java.io.IOException;
import java.util.Scanner;

public class E0210 {

    public static void main(String[] args) {
        
        // Run del input
        Scanner input = new Scanner(System.in);

        // Sout y declaracion de variable.
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");
        System.out.println("Introduce una nota ( 0 a 10 ) ");
        int nota = input.nextInt();

        // run out del input 
        input.close();

        switch (nota) {

            case 0, 1, 2, 3, 4 :
                System.out.println("Insuficiente");
                break;

            case 5 :
                System.out.println("Suficiente");
                break;

            case 6 :
                System.out.println("Bien");
                break;

            case 7, 8 :
                System.out.println("notable");
                break;
            
            case 9, 10 : 
                System.out.println("Sobresaliente");
                break;

            default:
                System.out.println("Entre 0 y 10 por favor...");
                break;
        }

    }
}