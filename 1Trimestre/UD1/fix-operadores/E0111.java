package operadores;

import java.util.Scanner;


public class E0111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
            double kMan = 2.35;
            double kPer = 1.95;

            System.out.println("Cuales son los kilos vendidos de manzanas el primer semestre?");
            double sem1Man = input.nextDouble();

            System.out.println("Cuales son los kilos vendidos de manzanas el segundo semestre?");
            double sem2Man = input.nextDouble();

            double benMan = (sem1Man + sem2Man) * kMan;

            System.out.println("Cuales son los kilos vendidos de peras el primer semestre?");
            double sem1Per = input.nextDouble();

            System.out.println("Cuales son los kilos vendidos de peras el segundo semestre?");
            double sem2Per = input.nextDouble();

            double benPer = (sem1Per + sem2Per) * kPer;

            System.out.println(" Los kilos de manzanas vendidos este año fueron " + (sem1Man + sem2Man) + " y los beneficios fueron de " + benMan + " Euros." );
            System.out.println(" Los kilos de peras vendidos este año fueron " + (sem1Per + sem2Per) + " y los beneficios fueron de " + benPer + " Euros." );
            System.out.println(" Los beneficios brutos totales fueron de " + (benMan + benPer) + " Euros.");

        input.close();
    }
}

/*
Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
Escribe una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta y 
que muestre el importe total siendo 2,35 € el precio del kilo de manzanas y 1,95 el del kilo de peras.
*/