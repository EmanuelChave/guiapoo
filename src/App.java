public class App {

    public static void main(String[] args) throws Exception {
        // crear instancias de cada tipo de vehiculo
        auto auto = new auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        camion camion = new camion("Volvo", "Fh", 2019, 75000, 2000, 4);

        // Mostrar la informacion de cada vehiculo
        System.out.println("\nInformacion del Auto: ");
        auto.mostrarInfo();

        System.out.println("\nInformacion del Camion: ");
        camion.mostrarInfo();
        camion.RealizarMantenimiento();
        auto.RealizarMantenimiento();

        System.out.println("El costo total del mantenimiento: ");
        auto.CostoMantenimiento(10, 12);
    }
}