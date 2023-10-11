package operadores;

import java.util.Scanner;
import java.time.LocalDate;
public class E0104b {
    
    public static void main(String[] args) {
        // run del input
        Scanner input = new Scanner(System.in);

            int actYear = LocalDate.now().getYear();

            System.out.println("En que anho naciste?");

            int year = input.nextInt();
            int edad = actYear - year;
            
            System.out.println("Tienes o tendrás " + edad + " anhos");

        input.close();
    }
}
