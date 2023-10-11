package api;

import java.time.LocalTime;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) {

        System.out.println(
            "La hora local actual (UTC+1 / UTC+2) es " +
            LocalTime.now()         
        );
        // run del input
        Scanner input = new Scanner(System.in);

        // peticion de numero
        System.out.println("Dame un numero");
        String numero = input.nextLine();
        System.out.println("El numero que has escrito es el " + numero);

        // Calculadora de raices cuadradas
        System.out.println("Calculadora de raiz cuadrada:");
        String entrada = input.nextLine();
        int raiz = Integer.parseInt(entrada);
        double raizCuadrada = (double) raiz;
        raizCuadrada = Math.sqrt(raiz);
        System.out.println("La raiz cuadrada de "+ raiz + " es " + raizCuadrada);
        
        // Precision decimal de 2 digitos.
        System.out.println("Con string.format");
        String precision = String.format("%.2f", raizCuadrada);
        System.out.println(
            "La raiz cuadrada de " + raiz + " con precision de 2 decimales es " + precision);
        
        System.out.println("Con printf");
        System.out.printf("La raiz cuadrada de " + raiz + " con precision de 2 decimales es: %.2f%n", raizCuadrada);

        // Input del usuario
        System.out.print("Introduce un valor de cadena: ");
        String varString = input.nextLine();

        System.out.print("Introduce un valor byte: ");
        byte varByte = input.nextByte();
 
        System.out.print("Introduce un valor short: ");
        short varShort = input.nextShort();
 
        System.out.print("Introduce un valor int: ");
        int varInt = input.nextInt();
 
        System.out.print("Introduce un valor long: ");
        long varLong = input.nextLong();
 
        System.out.print("Introduce un valor float: ");
        float varFloat = input.nextFloat();
 
        System.out.print("Introduce un valor double: ");
        double varDouble = input.nextDouble();
 
        System.out.print("Introduce un valor char: ");
        char varChar = input.next().charAt(0);
 
        System.out.print("Introduce un valor booleano (true o false): ");
        boolean varBoolean = input.nextBoolean();
 
        // Imprimir los valores
        System.out.println("Valor byte: " + varByte);
        System.out.println("Valor short: " + varShort);
        System.out.println("Valor int: " + varInt);
        System.out.println("Valor long: " + varLong);
        System.out.println("Valor float: " + varFloat);
        System.out.println("Valor double: " + varDouble);
        System.out.println("Valor char: " + varChar);
        System.out.println("Valor booleano: " + varBoolean);

        input.close();
    }
}
