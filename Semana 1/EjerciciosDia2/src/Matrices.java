package EjerciciosDia2;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        /*
        Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java
        que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        -Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
        -Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento
        (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
        -Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
        -A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
        -Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos?
        ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
        -El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
         Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
         */

        System.out.println("- - - - Bienvenido al sistema de anfiteatros- - - -");
        char asientos [][] = new char [5][5];
        int fila,asiento,opcion;
        boolean bandera = false;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Cargando asientos....");

        for (int f= 0;f<asientos.length;f++) {
            for (int c=0; c<asientos[0].length;c++) {
                asientos[f][c]='O';
            }
        }

        dibujarMapa(asientos);

        while (bandera!=true) {

            System.out.println("Ingrese la fila. Valor entre 0 y 4");
            fila = teclado.nextInt();

            System.out.println("Ingrese el asiento. Valor entre 0 y 4");
            asiento = teclado.nextInt();

            if(fila >= 0 && fila <=4) {
                if (asiento>=0 && asiento<=4) {

                    if (asientos[fila][asiento]=='O')
                    {
                        asientos[fila][asiento]='X';
                        System.out.println("Asiento asignado correctamente");
                    }
                    else
                    {
                        System.out.println("Asiento ocupado, por favor elija otro");
                    }

                }
                else {
                    System.out.println("El asiento ingresado no es válido. Ingrese un valor entre 0 y 4");
                }
            }
            else {
                System.out.println("La fila no es valida. Ingrese un número entre 0 y 4");
            }

            System.out.println("¿Desea continuar? Ingrese 1 para cotinuar u otro número para salir");
            opcion = teclado.nextInt();

            if (opcion!=1) {
                bandera = true;
            }
            else {
                System.out.println("¿Desea ver el mapa de reservas?. Ingrese 1 para continuar u otro número para salir");
                opcion = teclado.nextInt();
                if (opcion==1) {
                    dibujarMapa(asientos);
                }
            }

        }

    }

    public static void dibujarMapa (char asientos[][]) {
        for (int f=0;f<5;f++) {
            System.out.print(f + " ");
            for (int c=0;c<5;c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }
    }
}
