//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cuy cuy = new Cuy();
        cuy.mostrarCuy();
        cuy.mostrardatosMascota();

        Gato gato = new Gato("Whiskers", "amarillo");
        gato.mostrarGato();
        cuy.mostrardatosMascota();

        Loro loro = new Loro( 2, "semillas");
        loro.mostrarLoro();
        loro.mostrardatosMascota();

        Perro perro = new Perro("Max",  "negro","labrador","grande");
        perro.mostrarPerro();
        perro.mostrardatosMascota();

        Tortuga tortuga = new Tortuga();
        tortuga.setTipoCaparazon("Duro");
        tortuga.mostrardatosMascota();


    }
}
