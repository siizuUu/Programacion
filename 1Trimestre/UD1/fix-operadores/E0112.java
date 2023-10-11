package operadores;

import java.util.Scanner;


public class E0112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dame un numero.");
        int numero = input.nextInt();
        System.out.println("El valor absoluto de " + numero + " es " + Math.abs(numero));


        input.close();
    }
}

/*  Escribe un programa que pida un número entero al usuario y muestre su valor absoluto.  */