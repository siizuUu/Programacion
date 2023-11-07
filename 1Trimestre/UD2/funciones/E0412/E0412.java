/*

E0412. Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci. 
En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie, es decir:

fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 1

*/

package E0412;

import java.util.Scanner;

public class E0412 {
    public static void main(String[] args) {
        
        // ejecución de la funcion de fibonacci
        fibonacci();

    }

    static void fibonacci() {

        // total de numeros de la secuencia de fibonacci
        int enesimoNumero = numeroEnesimo();

        // funcion del bucle que calcula la secuencia
        bucleFibonacci(enesimoNumero);

    }

    static int numeroEnesimo() {
        
        // run del input
        Scanner input = new Scanner(System.in);

        // peticion
        System.out.println("Cuantos numeros de la secuencia de fibonacci quieres mostrar? ");
        int enesimoNumero = input.nextInt();

        //runout del input
        input.close();

        // devolucion de la variable
        return enesimoNumero;

    }

    static void bucleFibonacci(int enesimoNumero) 
    {

        // variables para calculo
        int aNumero = 0, bNumero = 1, suma = 1;

        // calculo de la secuencia mediante bucle for
        System.out.println("Aqui van los primeros " + enesimoNumero + " numeros de la secuencia de fibonacci ");
        for(int i = 0; i < enesimoNumero; i++) {

            System.out.println(bNumero);
            suma = aNumero + bNumero;
            aNumero = bNumero;
            bNumero = suma;

        }

    }

}
