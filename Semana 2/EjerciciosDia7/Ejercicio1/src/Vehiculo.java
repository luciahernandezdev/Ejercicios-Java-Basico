package Ejercicio1;

public abstract class Vehiculo {
    /*a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo
     con los siguientes atributos: id, placa, marca, modelo, año, costo.
     Establecer un método abstracto para calcular la antigüedad del vehículo.*/
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }
    // Método abstracto para calcular la antigüedad del vehículo
    public abstract int calcularAntiguedad();
    // Método para mostrar información básica
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Costo: $" + costo);
        System.out.println("Antigüedad: " + calcularAntiguedad() + " años");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    /*b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion
    con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente.
    En ambos casos, cuando se implementen en sus respectivas clases,
     deben mostrar un mensaje de qué tipo de recarga están haciendo.*/


}
