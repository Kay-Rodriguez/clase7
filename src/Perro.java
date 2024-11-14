public class Perro  extends Mascota{
    String raza;
    String tamaño;

    //constructores
    // vacio
    public Perro() {}
    //hijo


//padre he hijo
    public Perro(String nombre, String color, String raza, String tamaño) {
        super(nombre, color);
        this.raza = raza;
        this.tamaño = tamaño;
    }
    //padre
    public Perro(String nombre, String color) {
        super(nombre, color);
    }


    // get y set

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    //personalizadp
    public void mostrarPerro (){
        System.out.println("Raza: " + this.raza);
    }
}
