package EjerciciosDia2;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        /*
        Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas
        de la última semana, calcule la temperatura máxima promedio que hubo.
        Para ello, deberá manejar un vector donde en cada posición se almacene la
        correspondiente temperatura máxima de cada día. Una vez almacenadas las temperaturas,
        deberá calcular el promedio de las mismas recorriendo el vector y
        mostrando el resultado por pantalla.
         */

        Double temperaturas[] = new Double [7];
        Scanner teclado = new Scanner(System.in);
        Double sumaTemp=0.0;
        Double promedioTemp;

        for (int i=0;i<temperaturas.length;i++) {
            System.out.println("Ingrese la temperatura del día Nº " + i);
            temperaturas [i] = teclado.nextDouble();
        }

        System.out.println("-----Calculando promedio de temperaturas-----");

        for (int i=0;i<temperaturas.length;i++) {
            sumaTemp = sumaTemp + temperaturas [i];
        }

        promedioTemp = sumaTemp / temperaturas.length;

        System.out.println("El promedio de temperaturas es: " + promedioTemp);
    }

}
