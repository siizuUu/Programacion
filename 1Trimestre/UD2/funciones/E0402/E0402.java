package E0402;

import java.util.Scanner;

public class E0402 {
    public static void main(String[] args) {
        
        peticion();

    }

    static void peticion() {

        //run del Scanner 
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Introduce numero minimo:");
        int minimoNum = input.nextInt();
        
        System.out.println("Introduce numero maximo:");
        int maximoNum = input.nextInt();

        System.out.println("estos son los numeros comprendidos entre " + minimoNum + " y " + maximoNum + ":");
        impresion(minimoNum, maximoNum);

    }

    static void impresion(int minimoNum, int maximoNum) {
        for (int i = minimoNum + 1; i < maximoNum; i++) {
            System.out.println(i);
        }
    }
}
