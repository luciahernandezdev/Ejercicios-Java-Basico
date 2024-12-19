import java.util.Scanner;

public class OperacionesDeLectura {
    public static void main(String[] args) {
        /*
        Crea un programa que pida al usuario que ingrese por teclado dos números enteros
        y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división.
        Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
        Sugerencia: Compara los resultados que obtengas con otros compañeros.
        Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.
        Extra: ¿Qué sucede si como segundo número de una división se ingresa 0?
        Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
         */
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.println("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Realizar operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        double divi = num1 / num2;

        // Mostrar los resultados con mensajes personalizados
        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de la multiplicación: " + multi);
        System.out.println("Resultado de la división: " + divi);
    }
}
