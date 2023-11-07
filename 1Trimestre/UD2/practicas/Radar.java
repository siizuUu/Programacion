package practicas;

import java.util.Scanner;

public class Radar {
    
    public static void main(String[] args) {
        excesoVelocidade(0, 0, 0)
    }

    static int peticiones() {
        
        //run del Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Cual fue la distancia? (KM) :");
        int distancia = input.nextInt();

        System.out.println("Cual fue el tiempo? (segundos) :");
        int tempo = input.nextInt();

        System.out.println("Cual es el limite de tramo? (KM/H) :");
        int limite = input.nextInt();

        // cierre del input
        input.close();
        
        excesoVelocidade(distancia, tempo, limite);

    }

    static int excesoVelocidade(double distancia, int tempo, int limite) {

    }

}
