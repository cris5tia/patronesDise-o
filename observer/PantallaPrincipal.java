public class PantallaPrincipal implements Observador {

    private SensorTemperatura sensor;

    public PantallaPrincipal(SensorTemperatura sensor) {
        this.sensor = sensor;
    }

    @Override
    public void actualizar() {
        System.out.println("(Pantalla Principal) Temperatura actual: " + sensor.getTemperatura() + "°C");
    }
}
