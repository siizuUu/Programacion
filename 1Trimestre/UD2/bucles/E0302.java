/*E0302. Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos 
de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: 
la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad. */

package bucles;

import java.util.Scanner;

public class E0302 {
    public static void main(String[] args) {
      
        // Run del scanner
        Scanner input = new Scanner(System.in);

        // "embellecedor" para terminal
        System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");

        //variables 
        int edadAlumnos = 0, sumaEdades = 0, numAlumnos = 0, mayorEdad = 0, mediaEdades = 0;

        while (edadAlumnos >= 0) {

            System.out.println("Dame la edad del alumno a introducir: ");
            edadAlumnos = input.nextInt();

            // comprobacion de si es negativo y si has salido sin ningun valor valido
            if (edadAlumnos < 0 && numAlumnos == 0) {
                System.out.println("No ha habido ningun valor valido, saliendo...");
                System.exit(0);
            }

            // comprobacion de que no es negativo
            if (edadAlumnos > 0) {

                // Suma de edades
                sumaEdades = sumaEdades + edadAlumnos;

                // Alumnos totales
                numAlumnos++;
            }

            // Comprobacion para mayoria de edad
            if (edadAlumnos >= 18) {
                mayorEdad++;
            }

            //Media de las edades
            mediaEdades = sumaEdades / numAlumnos;
        }

        // separador visual de inputs y outputs
        System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");

        // SOUTs
        System.out.println("la suma de las edades da un total de " + sumaEdades + " anhos\n");
        System.out.println("El numero de alumnos es de " + numAlumnos + " individuos\n");
        System.out.println("hay " + mayorEdad + " mayores de edad\n");
        System.out.println("La media de edades es de " + mediaEdades + " anhos\n");

        // run out del scanner
        input.close();
    }
}
