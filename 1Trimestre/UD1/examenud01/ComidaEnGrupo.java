// Óscar Perdiz Barros.

package examenud01;

import java.util.Scanner;

public class ComidaEnGrupo {
    public static void main(String[] args) {
        // Run del scanner
        Scanner input = new Scanner(System.in);

        // Numero de comensales
        System.out.print("Numero de comensales: ");
        int personas = input.nextInt();

        // Importe total
        System.out.print("Importe total de la comida: ");
        double importe = input.nextDouble();

        // Pago por persona
        double pagoPorPersona = importe / personas;
        System.out.print("Cantidad a pagar por comensal: " + String.format("%.2f", pagoPorPersona));


    }
}
