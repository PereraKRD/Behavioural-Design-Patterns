public class ForecastDisplay implements Observer,DisplayElement{
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);

    }

    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast: Pressure is " + pressure);
    }
}
