package EjerciciosDia2;

import java.util.Scanner;

public class EstructurasRepetitivas {
    public static void main(String[] args) {
        /*
        a. Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios
         productos comprados por un cliente. Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios
         hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
         Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador (cuando sabemos un número exacto de productos
         por ejemplo) u por centinela (cuando no sabemos cuántos productos va a comprar el cliente).
         En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
         */
        boolean bandera = false;
        double total = 0;
        double precioProducto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***Bienvenido***  Recuerde ingresar 0 o algún número negativo para finalizar la compra");

        while (bandera != true) {
            System.out.println("Ingrese el precio del producto a sumar");
            precioProducto = teclado.nextDouble();

            //Con esto validamos que no haya ingresado una condición de salida
            if (precioProducto > 0) {
                total = total + precioProducto;
            } else {
                //en caso que haya puesto un 0 o algún número negativo, activamos la bandera
                //para salir del bucle
                bandera = true;
            }

        }

        System.out.println("El total de la compra es: " + total);
    }
}
