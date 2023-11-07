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
        bucleFibonacci(enesimoNumero, 0, 1);

    }

    static int numeroEnesimo() {
                System.out.println("\u001B[31mTexto en rojo\u001B[0m");

        // run del input
        Scanner input = new Scanner(System.in);
        final char RED = '\033[91m'
        // peticion
        System.out.println(RED + "Cuantos numeros de la secuencia de fibonacci quieres mostrar? ");
        int enesimoNumero = input.nextInt();

        //runout del input
        input.close();

        // devolucion de la variable
        return enesimoNumero;

    }

    
    static void bucleFibonacci(int enesimoNumero, int aNumero, int bNumero) 
    {
        if (enesimoNumero > 0) {

            // calculo de la secuencia mediante recursión
            System.out.println(aNumero);
            
            bucleFibonacci(enesimoNumero - 1, bNumero, aNumero + bNumero);
        }
    }
}
