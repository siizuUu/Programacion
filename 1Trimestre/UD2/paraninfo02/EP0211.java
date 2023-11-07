package paraninfo02;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {

        comprobarNumero();

    }

    static void comprobarNumero() {

        //run del Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Dame un numero:");
        int numeroOriginal = input.nextInt();

        // cierre del input
        input.close();

        int numeroInvertido = invertirNumero(numeroOriginal);

        if (numeroOriginal == numeroInvertido) {

            System.out.println(numeroOriginal + " es capicua");

        } else {

            System.out.println(numeroOriginal + " no es capicua");

        }

    }

    static int invertirNumero(int numero) {

        int numeroInvertido = 0;

        while (numero != 0) {

            // Obtiene el último dígito
            int digito = numero % 10;

            // Añade el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            
            // Elimina el último dígito del número original
            numero /= 10;
        }

        return numeroInvertido;
    }
}
