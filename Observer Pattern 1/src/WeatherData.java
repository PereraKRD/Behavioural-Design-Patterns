import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private List<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setTemperature(float temp,float humidity){
        this.temperature = temp;
        this.humidity = humidity;
        notifyAllObservers(temp,humidity);

    }

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void notifyAllObservers(float temp, float humidity){
        for (Observer Obs : observers) {
            Obs.update(temp,humidity);
        }
    }
}
