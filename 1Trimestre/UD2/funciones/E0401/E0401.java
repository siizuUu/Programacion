package E0401;

import java.util.Scanner;

public class E0401 {
    public static void main(String[] args) {

        peticion();

    }

    static void peticion() {

        //run del Scanner 
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Cuantas repeticiones quieres hacer?");
        int numRepeticiones = input.nextInt();

        eco(numRepeticiones);
    }

    static void eco(int numRepeticiones) {
        for (int i = 1; i <= numRepeticiones; i++) {
            System.out.println("ECO");
        }
    }
}
