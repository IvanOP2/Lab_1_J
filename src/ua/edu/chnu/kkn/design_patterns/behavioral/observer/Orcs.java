package ua.edu.chnu.kkn.design_patterns.behavioral.observer;

public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("The orcs are facing " + currentWeather.description + " weather now");
    }
}
