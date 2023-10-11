// Óscar Perdiz Barros.

package examenud01;

public class KilosALibras {
    public static void main(String[] args) {

        // VARIABLES
        int entrada1 = 0;
        int entrada2 = 1;
        int entrada3 = 5;
        int entrada4 = 60;
        double entrada5 = 70.5;
        int entrada6 = 80;

        // CONSTANTE DE CONVERSION
        final double conversion = 0.453592;

        // RESOLUCION Y SOUTs
        System.out.println(entrada1 + " Kilos, equivalen a " + String.format("%.2f", entrada1 / conversion) + " Libras.");
        System.out.println(entrada2 + " Kilos, equivalen a " + String.format("%.2f", entrada2 / conversion) + " Libras.");
        System.out.println(entrada3 + " Kilos, equivalen a " + String.format("%.2f", entrada3 / conversion) + " Libras.");
        System.out.println(entrada4 + " Kilos, equivalen a " + String.format("%.2f", entrada4 / conversion) + " Libras.");
        System.out.println(entrada5 + " Kilos, equivalen a " + String.format("%.2f", entrada5 / conversion) + " Libras.");
        System.out.println(entrada6 + " Kilos, equivalen a " + String.format("%.2f", entrada6 / conversion) + " Libras.");
        
    }
}