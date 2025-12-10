public class FabricaMoto implements AbstractFactory {

    @Override
    public Vehiculo crearVehiculo(String marca, String color, double precio) {
        return new Moto(marca, color, precio);
    }
}
