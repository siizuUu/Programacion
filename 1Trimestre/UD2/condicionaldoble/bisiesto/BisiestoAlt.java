package bisiesto;

import java.time.LocalDate;
import java.util.Scanner;

public class BisiestoAlt {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Año a comprobar:");
        int anhoBisiesto = input.nextInt();

        LocalDate fechaActual = LocalDate.now();
        int anhoActual = fechaActual.getYear();

        if ((anhoBisiesto % 4 == 0) && 
            (anhoBisiesto % 100 != 0) || 
            (anhoBisiesto % 400 == 0)) {

                System.out.println(anhoActual <= anhoBisiesto ? 
                                    anhoBisiesto + " va a ser bisiesto" : anhoBisiesto + " fué bisiesto");
            } else {

                System.out.println(anhoActual <= anhoBisiesto ? 
                                    anhoBisiesto + " no va a ser bisiesto" : anhoBisiesto + " no fué bisiesto");
    }
    input.close();
    }
}
