public class AlarmaTemperatura implements Observador {

    private SensorTemperatura sensor;

    public AlarmaTemperatura(SensorTemperatura sensor) {
        this.sensor = sensor;
    }

    @Override
    public void actualizar() {
        int t = sensor.getTemperatura();
        if (t >= 30) {
            System.out.println("(ALERTA) Temperatura crítica: " + t + "°C");
        } else {
            System.out.println("(Alarma) Temperatura normal: " + t + "°C");
        }
    }
}
