// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new Observer1(weatherData);
        new Observer2(weatherData);
        weatherData.setTemperature(12,13);
    }
}