/*
E0403. Realizar una función que calcule y muestre el área o el volumen de un cilindro,
según se especifique. Para distinguir un caso de otro se le pasará como opción un
número: 1 (para el área) o 2 (para el volumen). Además, hay que pasarle a la función el
radio de la base y la altura.

área = 2pi * radio * (altura + radio)
volumen = pi * radio2 * altura

 */

package E0403;

import java.util.Scanner;

public class E0403 {
    public static void main(String[] args) {
    
        peticiones();
    }

    static void peticiones() {
        
        //run del Scanner 
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");
        System.out.println("Que quieres calcular del cilindro?:");
        System.out.println("1 (para el área) o 2 (para el volumen)");
        int eleccionNum = 0;

        while (eleccionNum != 1 && eleccionNum != 2) {

            System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");

            eleccionNum = input.nextInt();

        }
        
        System.out.println("dime el radio del cilindro");
        int radioCilindro = input.nextInt();
        
        System.out.println("dime la altura del cilindro");
        int alturaCilindro = input.nextInt();
        
        if (eleccionNum == 1) {
            
            System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");
            System.out.println("has elegido calcular el area");
            areaDelCilindro( radioCilindro, alturaCilindro);

        } else {
    
            System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");
            System.out.println("has elegido calcular el volumen");
            volumenDelCilindro( radioCilindro, alturaCilindro);

        }

        System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n");

    }

    static void areaDelCilindro(int radioCilindro, int alturaCilindro) {

        double areacilindro = 2 * Math.PI * radioCilindro * (alturaCilindro + radioCilindro);
        System.out.println("El area del cilindro es " + areacilindro);

    }

    static void volumenDelCilindro(int radioCilindro, int alturaCilindro) {
    
        double volumenCilindro = Math.PI * (radioCilindro * radioCilindro) * alturaCilindro;
        System.out.println("El volumen del cilindro es " + volumenCilindro);

    }
}
