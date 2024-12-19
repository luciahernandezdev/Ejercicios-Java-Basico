package Ejercicio1;

// Clase Camioneta que hereda de Vehiculo e implementa la interfaz Combustion
public class Camioneta extends Vehiculo implements Combustion {
    /*d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente
     la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión,
     como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase
     abstracta y los de la interfaz. */
    private int capacidadTanque;    // Capacidad del tanque de combustible en litros
    private double consumoCombustible;  // Consumo de combustible en km/litro

    public Camioneta(){

    }
    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);  // Llama al constructor de la clase Vehiculo
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    // Implementación del método abstracto calcularAntiguedad() de la clase Vehiculo
    @Override
    public int calcularAntiguedad() {
        int anioActual = 2024;
        return anioActual - getAnio();  // Calcula la antigüedad del vehículo (Año actual - Año de fabricación)
    }

    // Implementación del método recargarCombustible() de la interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("La camioneta está recargando combustible.");
    }

    // Método para mostrar la información de la Camioneta, incluyendo atributos específicos de Camioneta
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método mostrarInformacion() de la clase Vehiculo
        System.out.println("Capacidad del tanque: " + capacidadTanque + " litros");
        System.out.println("Consumo de combustible: " + consumoCombustible + " km/litro");
        recargarCombustible();  // Muestra el mensaje de recarga de combustible
    }
}
