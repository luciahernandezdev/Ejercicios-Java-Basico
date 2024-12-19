package Ejercicio1;

// Clase Auto que hereda de Vehiculo e implementa la interfaz Electrico
public class Auto extends Vehiculo implements Electrico {
    /*c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente
    la interfaz Electrico. Agrega atributos específicos para los autos eléctricos,
    como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos
     de la clase abstracta Vehiculo y los de la interfaz Electrico.*/
    private int capacidadBateria;
    private int autonomia;

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);  // Llama al constructor de la clase Vehiculo
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    // Implementación del método abstracto calcularAntiguedad() de la clase Vehiculo
    @Override
    public int calcularAntiguedad() {
        int anioActual = 2024;
        return anioActual - getAnio();  // Calcula la antigüedad del vehículo (Año actual - Año de fabricación)
    }

    // Implementación del método cargarEnergia() de la interfaz Electrico
    @Override
    public void cargarEnergia() {
        System.out.println("El vehículo eléctrico está cargando energía.");
    }

    // Método para mostrar la información del Auto, incluyendo atributos específicos de Auto
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método mostrarInformacion() de la clase Vehiculo
        System.out.println("Capacidad de batería: " + capacidadBateria + " mAh");
        System.out.println("Autonomía: " + autonomia + " horas");
        cargarEnergia();  // Muestra el mensaje de carga de energía
    }
}
