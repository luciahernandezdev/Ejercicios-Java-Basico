package Ejercicio1;

// Clase Moto que hereda de Vehiculo e implementa la interfaz Combustion
public class Moto extends Vehiculo implements Combustion {
    /*e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz
    Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada
    y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.*/
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);  // Llama al constructor de la clase Vehiculo
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // Implementación del método abstracto calcularAntiguedad() de la clase Vehiculo
    @Override
    public int calcularAntiguedad() {
        return 2023 - getAnio();  // Calcula la antigüedad del vehículo (Año actual - Año de fabricación)
    }

    // Implementación del método recargarCombustible() de la interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("La moto está recargando combustible.");
    }

    // Método para mostrar la información de la Moto, incluyendo atributos específicos de Moto
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método mostrarInformacion() de la clase Vehiculo
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo de motor: " + tipoMotor);
        recargarCombustible();  // Muestra el mensaje de recarga de combustible
    }
}
