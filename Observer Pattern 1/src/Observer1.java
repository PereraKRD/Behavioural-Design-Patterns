public class Observer1 extends Observer {

    public Observer1(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity){
        this.temp = temp;
        this.humidity = humidity;
        System.out.println("I'm Observer1");
        System.out.println(temp);
        System.out.println(humidity);
        System.out.println();
    }
}
