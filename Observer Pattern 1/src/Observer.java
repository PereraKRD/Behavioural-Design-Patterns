public abstract class Observer {
    protected WeatherData weatherData;
    public float temp;
    public float humidity;
    public abstract void update (float temp, float humidity);
}
