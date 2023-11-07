package fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // run del input
        Scanner scanner = new Scanner(System.in);

        // variables para calculo
        int a = 0, b = 1, suma = 1;

        // input
        System.out.println("Numero maximo a calcular:");
        String entrada = scanner.nextLine();
        int max = Integer.parseInt(entrada);

        //Bucle while para calculo de la secuencia de fibonacci.
        while (suma < max) {

            System.out.println(a);
            suma = a + b;
            a = b;
            b = suma;
        }
        
        //runout del input
        scanner.close();
    }
}
