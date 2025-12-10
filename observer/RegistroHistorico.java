public class RegistroHistorico implements Observador {

    private SensorTemperatura sensor;

    public RegistroHistorico(SensorTemperatura sensor) {
        this.sensor = sensor;
    }

    @Override
    public void actualizar() {
        System.out.println("(Registro) Guardando temperatura: " + sensor.getTemperatura() + "°C");
    }
}
