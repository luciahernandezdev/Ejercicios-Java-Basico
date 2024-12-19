package EjerciciosDia2;
import java.util.Scanner;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        /*
        a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
         a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede
         o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
         */
        Scanner teclado= new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }

    }
}
