/*
piloto: Óscar Perdiz
copiloto Diego Pazos 
 */

package parejas;

import java.util.Scanner;

public class Receta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Receta de compota de manzana.");
        System.out.println("la URL es: https://www.recetasderechupete.com/compota-de-manzana-casera/12509/");
        System.out.println("Receta para 6 personas y necesitamos: ");
        System.out.println("1 kg. y medio de las manzanas que más os gusten (os recomiendo Reinetas o Golden)\r\n" + //
                "330 ml. de agua\r\n" + //
                "120 g. de azúcar (blanquilla o morena)\r\n" + //
                "Una cucharadita de zumo de limón (suponiendo que una cucharadita son 6 ml)\r\n" + //
                "La piel (sin el blanco) de una naranja\r\n" + //
                "1 ramita de canela (o media cucharadita tipo postre de canela molida)");
        System.out.println("Introduce el numero de personas: ");
        int personas = input.nextInt();

        double manzanas = 1.5 / 6;
        double agua = 330 / 6;
        double azucar = 120 / 6;
        double limon = 6 / 6;

        System.out.println("Para " + personas + " personas, necesitamos:\r\n" +
                manzanas * personas + " kg de manzanas.\r\n" +
                agua * personas + " ml de agua.\r\n" +
                azucar * personas + " g de azucar.\r\n" +
                limon * personas + " ml de zumo de limón.\r\n" +
                "La piel (sin el blanco) de una naranja.\r\n" +
                "1 ramita de canela (o media cucharadita tipo postre de canela molida).");

    double precioManzanas = 1.65 * (1.5 / 6);
    double precioAgua = 0.49 * (0.330 / 6);
    double precioAzucar = 1.85 * (120 / 6);
    
    double precioFinal = personas * (precioManzanas + precioAgua + precioAzucar);

    System.out.println("Para " + personas + " personas son " + String.format("%.2f", precioFinal) + " euros en total.");

    }
}