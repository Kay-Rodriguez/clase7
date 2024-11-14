public class Tortuga extends Mascota {
    int edad;
    String tipoCaparazon;
//CONTRUCTOR

    public Tortuga(int edad, String tipoCaparazon) {
        this.edad = edad;
        this.tipoCaparazon = tipoCaparazon;
    }

    public Tortuga(String nombre, String color, int edad, String tipoCaparazon) {
        super(nombre, color);
        this.edad = edad;
        this.tipoCaparazon = tipoCaparazon;
    }

    public Tortuga() {}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoCaparazon() {
        return tipoCaparazon;
    }

    //METODO
        public void setTipoCaparazon(String tipoCaparazon) {
            this.tipoCaparazon = tipoCaparazon;
        }
}
