public class FabricaCarro implements AbstractFactory {

    @Override
    public Vehiculo crearVehiculo(String marca, String color, double precio) {
        return new Carro(marca, color, precio);
    }
}
