package pl.zzpj2021.solid.dip.weathertracker.violation;


public class WeatherTracker {
    String currentConditions;

    public WeatherTracker() {
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public String getCurrentConditions() {
        return currentConditions;
    }
}
