/*
 * Driver: Rodrigo Pazos
 * Copilotos: Diego Pazos y Oscar Perdiz
 */
package parejas;

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        
        final int horasProgramacion = 240 * 60;
        double sesionesProgramacion = horasProgramacion / 50;
        System.out.println("Hay " + sesionesProgramacion + " sesiones de programación");
        double apercibimientoProgramacion = sesionesProgramacion * 0.06;
        System.out.println("Con " + apercibimientoProgramacion + " sesiones tienes un apercibimiento en programación");
        double perdidaProgramacion = sesionesProgramacion * 0.1;
        System.out.println("Con " + perdidaProgramacion + " sesiones tienes pérdida de evaluación en programación");
        
        System.out.println("Introduce un número de faltas: ");
        Scanner input = new Scanner(System.in);
        int numeroFaltas = input.nextInt();
    
        String texto = (numeroFaltas < apercibimientoProgramacion )?"No hay problemas con las faltas":(numeroFaltas < perdidaProgramacion)?"Tines un aviso":"Pérdida de la evaluación";
        System.out.println(texto);
    }
    
}
