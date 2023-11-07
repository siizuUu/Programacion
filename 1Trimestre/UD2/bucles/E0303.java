/*
E0303. Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 
(generado aleatoriamente). Para ello se introduce por teclado una serie de números, 
para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto. 
El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1). 
*/

package bucles;

import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {  
        
        // Run del scanner
        Scanner input = new Scanner(System.in);

        // "embellecedor" para terminal
        System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");


        // Generacion del numero
        final int numeroMaximo = 100;
        double genNumero = Math.random() * numeroMaximo + 1;
        int randomNum = (int) genNumero;

        System.out.println(randomNum);
        System.out.println("Introduce un numero del 1 al 100 (-1 para rendirse) ");

        // Bucle Validador
        int numEntrada = 0;
        while (numEntrada != -1 && numEntrada != randomNum) {
            numEntrada = input.nextInt();
            if (numEntrada == -1) {
                
                System.out.println("Saliendo...");

                } else if (randomNum > numEntrada){

                    System.out.println("Mayor...");

                    } else if (randomNum < numEntrada){

                        System.out.println("Menor...");

                        } else if (randomNum == numEntrada) {

                            System.out.println("Acertaste!");
                            }
            }
        input.close();
    }
}
