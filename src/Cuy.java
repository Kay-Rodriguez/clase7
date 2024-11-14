public class Cuy extends Mascota{
    int cantidad;
    int raza;

    //constructor
    //hijo
    public Cuy(int cantidad, int raza) {
        this.cantidad = cantidad;
        this.raza = raza;
    }
//padre he hijo
    public Cuy(String nombre, String color, int cantidad, int raza) {
        super(nombre, color);
        this.cantidad = cantidad;
        this.raza = raza;
    }
    // vacio
    public Cuy(){}
    //padre
    public Cuy(String nombre, String  color) {
        this.nombre = nombre;
        this.color = color;
    }

    //getter y setter

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
    //metodo
    public void mostrarCuy(){
        System.out.println("El cuy es: ");
    }
}
