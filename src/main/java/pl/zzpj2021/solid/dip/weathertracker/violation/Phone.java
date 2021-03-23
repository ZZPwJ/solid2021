package pl.zzpj2021.solid.dip.weathertracker.violation;

public class Phone {
    private final WeatherTracker weatherTracker;

    public Phone(WeatherTracker weatherTracker) {
        this.weatherTracker = weatherTracker;
    }

    public void generateWeatherAlert() {
        String weatherDescription = weatherTracker.getCurrentConditions();
        if (weatherDescription.equals("rainy") || weatherDescription.equals("sunny")) {
            String alert = weatherTracker.getCurrentConditions();
            System.out.print(alert);
        }
    }
}
