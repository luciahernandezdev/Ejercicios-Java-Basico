package RepasoPOO;

public class Verdura {
    private int id;
    private String nombre;
    private String Color;
    private int calorias;
    private boolean debeCocinarse;

    public Verdura(int id, String color, String nombre, int calorias, boolean debeCocinarse) {
        this.id = id;
        this.Color = color;
        this.nombre = nombre;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int getCalorias() {
        return this.calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean isDebeCocinarse() {
        return this.debeCocinarse;
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre + ", Color: " + this.Color + ", Debe Cocinarse: " + this.debeCocinarse + ", Calorías: " + this.calorias);
    }
}
