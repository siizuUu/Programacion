package operadores;

import java.util.Scanner;


public class E0108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Dame tu edad");
            int edad = input.nextInt();
            boolean booleano = (edad >= 18);
            System.out.println("¿Eres mayor de edad? " + booleano);

        input.close();
    }
}
