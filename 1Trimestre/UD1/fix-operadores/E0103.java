package operadores;

import java.util.Scanner;

public class E0103 {
    
    public static void main(String[] args) {
        // run del input
        Scanner input = new Scanner(System.in);
        
        System.out.println("que edad tienes?");
        byte edad = input.nextByte();
        edad++;
        System.out.println("El anho que viene tendrás " + edad + " anhos.");
        
        input.close();
    }
}
