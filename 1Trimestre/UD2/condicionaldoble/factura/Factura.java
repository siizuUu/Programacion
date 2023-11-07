/*
Factura (Factura.java). Escribe un programa para emitir la factura de compra de un producto, 
introduciendo el precio del producto y el número de unidades compradas. 
La factura deberá añadir al total un IVA (Impuesto del Valor Añadido) del 21%. 
Si el precio final con IVA es superior a 100 euros se aplicará un descuento del 5%.

Ejemplos para pruebas:
Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €

 */

package factura;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double IVA = 0.21;
        final double DESCUENTO = 0.05;
        final double MINIMODESCUENTO = 100;

        System.out.println("dame el precio: ");
        double precio = input.nextDouble();
        System.out.println("dame la cantidad de unidades: ");
        int unidades = input.nextInt();

        double precioFinal = precio * unidades + (precio * unidades * IVA);
        System.out.println("El precio final es de " + precioFinal + " Euros.");
        if (precioFinal >= MINIMODESCUENTO) {
            precioFinal = precioFinal - (precioFinal * DESCUENTO);
            System.out.println("El precio final con descuento es de " + String.format("%.2f", precioFinal) + " Euros.");
        } else {
            System.out.println("No tienes derecho al descuento.");
        }

        input.close();
    }
}
