package operadores;

import java.util.Scanner;


public class E0113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dime las notas de los 3 trimestres.");
        double t1 = input.nextInt();            
        double t2 = input.nextInt();            
        double t3 = input.nextInt();
        double media = (t1 + t2 +t3) / 3 ;           
        System.out.println(media);
        input.close();
    }
}