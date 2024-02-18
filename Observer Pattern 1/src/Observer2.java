public class Observer2 extends Observer{
    public Observer2(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity){
        this.temp = temp;
        this.humidity = humidity;
        System.out.println("I'm Observer2");
        System.out.println(temp);
        System.out.println(humidity);
    }
}
