package operadores;

import java.util.Scanner;


public class E0107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Dame el radio");
            double radio = input.nextDouble();
            double perimetro = 2 * Math.PI * radio;
            System.out.println("el perimetro es " + perimetro);
            double area = Math.PI * (radio * radio);
            System.out.println("el area es " + area);

        input.close();
    }
}
