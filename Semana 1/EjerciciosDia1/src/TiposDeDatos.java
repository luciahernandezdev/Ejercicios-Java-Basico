public class TiposDeDatos {
    public static void main(String[] args) {
        //a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos:
        // int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.

        // Declarar variables
        int numeroEntero = 42;
        double numeroDouble = 3.14;
        boolean esVerdadero = true;
        String cadena = "Hola, mundo!";

        // Mostrar contenido de las variables
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Cadena: " + cadena);

        //b) Ahora, asigna valores que no correspondan al tipo de dato.
        // Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa?
        // ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justifica el por qué de cada caso.
        // Debatir con otros compañeros.

        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Cadena: " + cadena);
    }
}
