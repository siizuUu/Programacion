package operadores;

import java.util.Scanner;

public class E0104 {
    
    public static void main(String[] args) {
        // run del input
        Scanner input = new Scanner(System.in);
        
            System.out.println("En que anho estamos?");
            int actYear = input.nextInt();
            System.out.println("En que anho naciste?");
            int year = input.nextInt();
            int edad = actYear - year;
            System.out.println("Tienes o tendrás " + edad + " anhos");

        input.close();
    }
}
