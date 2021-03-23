package pl.zzpj2021.solid.dip.weathertracker.violation;


public class Emailer {
    private final WeatherTracker weatherTracker;

    public Emailer() {
        weatherTracker = new WeatherTracker();
    }

    public void generateWeatherAlert() {
        String weatherDescription = weatherTracker.getCurrentConditions();
        if (weatherDescription.equals("rainy") || weatherDescription.equals("sunny")) {
            String alert = weatherTracker.getCurrentConditions();
            System.out.print(alert);
        }
    }
}
