public class Sintaxis {
    public static void main(String[] args) {
        //a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida
        //a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
        System.out.println("Hola, bienvenido al sistema");

        //b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario
        //en una variable y se muestre el mismo en el mensaje. Por ejemplo:
        //“Hola Eduardo, bienvenido al sistema”.
        String nombre = "Eduardo";
        System.out.println("Hola," + nombre +  "bienvenido al sistema");
    }
}
