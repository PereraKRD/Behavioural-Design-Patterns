
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WhetherData weatherData = new WhetherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(78, 71, 31.2f);
        weatherData.setMeasurements(82, 70, 30.0f);
        weatherData.setMeasurements(81, 85, 28.2f);
    }
}