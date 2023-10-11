package operadores;

import java.util.Scanner;


public class E0109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Dame un numero.");
            int numero = input.nextInt();
            boolean booleano = (numero % 2 == 0);
            System.out.println("este numero es par? " + booleano);

        input.close();
    }
}
