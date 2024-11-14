public class Gato extends Mascota{
    double peso;
    int edad;
    //constructr vacio
    public Gato(){}
    //padre he hijo
    public Gato(String nombre,String color, double peso, int edad) {
        super(nombre, color);
        this.peso = peso;
        this.edad = edad;
    }
    //hijo
    public Gato(double peso, int edad) {
        this.peso = peso;
        this.edad = edad;
    }
    // padre
    public Gato(String nombre, String  color) {
        super(nombre, color);
}
//setter y getter

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //personalizado
    public void mostrarGato(){
        System.out.println("el gato es: "+ edad+color);
    }
}
