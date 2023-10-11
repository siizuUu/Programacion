import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        
        // Run del scanner
        Scanner input = new Scanner(System.in);

        // Inputs y Variables
        System.out.println("Introduce 3 numeros: (Pulsa enter despues de cada uno)");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        // Strings 
        String nada = "";
        String menor = "Ordenados de menor a mayor";
        String mayor = "Ordenados de mayor a menor";
        String desorden = "Desordenados";

        //Expresion comparadora de menor a mayor
        System.out.println("");
        System.out.println((n1 < n2) && (n1 < n3) && (n2 < n3) ? menor : nada );
        System.out.println((n1 > n2) && (n1 > n3) && (n2 > n3) ? mayor : nada );
        System.out.println((n1 > n2) && (n1 > n3) || (n2 > n3) ? desorden : nada );

        /* System.out.println((n1 < n2) && (n1 < n3) ? n1 : nada);
        System.out.println((n2 < n1) && (n2 < n3) || (n2 > n1) ? n2 : nada);
        System.out.println((n3 < n1) && (n3 < n2) || (n1 > n3) && (n2 > n3) ? n3 : nada);
        */ 
        input.close();
    }
}
