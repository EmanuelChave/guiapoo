public class auto extends vehiculopasajero {
    private String tipoDeCombustible;

    // Constructor
    public auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoDeCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoDeCombustible = tipoDeCombustible;

    }

    // Getter y Setter para tipoDeCombustible
    public String getTipoCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;

    }

    // sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoDeCombustible);
    }

    @Override
    public void RealizarMantenimiento() {
        super.RealizarMantenimiento();
        System.out.println("Para el mantenimiento de este auto se necesita: ");


    }

    public void CostoMantenimiento(int kmRecorridoss, int costoKMrecorrido) {
        int costoTotal = costoKMrecorrido * kmRecorridoss;
        System.out.println(costoTotal + " $ ");
        System.out.println("1. Revisar la presión de los neumáticos. ");
        System.out.println("2. Cambiar el aceite y el filtro de aceite. ");
        System.out.println("3.Chequear el líquido de frenos. ");
    }

}