/*
piloto: Óscar Perdiz
copiloto Diego Pazos 
 */

package parejas;

import java.util.Scanner;

public class Hectareas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double HECTAREA = 100 * 100;
        final double CAMPOFUTBOL = 105 * 70;
        final double CANCHABALONCESTO = 28 * 15;
        final double PISTATENIS = 23.77 * 10.97;
        final double RETIRO = 125;
        final double PAELLERA =  2 * Math.PI * 1 ;

        System.out.println("Introduce un número de hectareas:");
        double entrada = input.nextDouble();

        double pasarCampo = entrada * (HECTAREA / CAMPOFUTBOL);
        System.out.println(entrada + " hectareas, equivale a " + String.format("%.2f", pasarCampo) + " Campos de futbol.");
        
        double pasarCancha = entrada * (HECTAREA / CANCHABALONCESTO);
        System.out.println(entrada + " hectareas, equivale a " + String.format("%.2f", pasarCancha) + " Canchas de Baloncesto.");

        double pasarPista = entrada * (HECTAREA / PISTATENIS);
        System.out.println(entrada + " hectareas, equivale a " + String.format("%.2f", pasarPista) + " Pistas de tenis.");

        double pasarRetiro = entrada * (RETIRO);
        System.out.println(entrada + " hectareas, equivale a " + String.format("%.2f", pasarRetiro) + " Parques del Retiro.");

        double pasarPaellas = entrada * (HECTAREA / PAELLERA);
        System.out.println(entrada + " hectareas, equivale a " + String.format("%.2f", pasarPaellas) + " Paellas.");

        input.close();
        }
}
