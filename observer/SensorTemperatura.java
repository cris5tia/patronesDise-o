import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {

    private List<Observador> observadores = new ArrayList<>();
    private int temperatura;

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void eliminarObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void setTemperatura(int nuevaTemp) {
        this.temperatura = nuevaTemp;
        notificar();
    }

    public int getTemperatura() {
        return temperatura;
    }

    private void notificar() {
        for (Observador o : observadores) {
            o.actualizar();
        }
    }
}
