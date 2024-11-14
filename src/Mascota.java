public class Mascota {
    String nombre;
    String color;
    public Mascota(){}

    public Mascota(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void mostrardatosMascota(){
        System.out.println("Nombre: " + nombre+ " Color: " + color);
    }
}
