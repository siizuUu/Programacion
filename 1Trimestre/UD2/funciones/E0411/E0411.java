/*
E0411. Escribir una función que calcule de forma recursiva el máximo común divisor 
de dos números. Para ello sabemos:

mcd(a,b) = 
	mcd(a - b, b)	si a >= b
	mcd(a, b - a)	si b > a
	a	        	si b = 0
	b			    si a = 0

 */

package E0411;

import java.util.Scanner;

public class E0411 {
    public static void main(String[] args) {
        //run del Scanner 
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("introduce DOS numeros.");
        int bNumero = input.nextInt();
        int aNumero = input.nextInt();

        int mcd;

        maximoComunDivisor( aNumero, bNumero);

    }
    
    static void maximoComunDivisor(int aNumero, int bNumero, int mcd){

        if (aNumero == 0) {

            System.out.println(bNumero);
            
        } else if (bNumero == 0) {

            System.out.println(aNumero);

        } else if (aNumero >= bNumero) {

            mcd = maximoComunDivisor( aNumero - bNumero, bNumero);
            System.out.println(mcd);

        } else if (aNumero < bNumero) {

            mcd = maximoComunDivisor(aNumero, bNumero - aNumero);
            System.out.println(mcd); 

        }
    }
}
