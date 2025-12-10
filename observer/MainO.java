public class MainO {
    public static void main(String[] args) {

        SensorTemperatura sensor = new SensorTemperatura();

        PantallaPrincipal pantalla = new PantallaPrincipal(sensor);
        AlarmaTemperatura alarma = new AlarmaTemperatura(sensor);
        RegistroHistorico registro = new RegistroHistorico(sensor);

        /* Registrar observadores */
        sensor.agregarObservador(pantalla);
        sensor.agregarObservador(alarma);
        sensor.agregarObservador(registro);

        /* Simular cambios */
        sensor.setTemperatura(22);
        System.out.println("---");
        sensor.setTemperatura(30);
        System.out.println("---");
        sensor.setTemperatura(18);
    }
}
