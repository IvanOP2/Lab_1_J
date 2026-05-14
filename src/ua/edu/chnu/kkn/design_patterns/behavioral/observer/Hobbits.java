package ua.edu.chnu.kkn.design_patterns.behavioral.observer;

public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("The hobbits are facing " + currentWeather.description + " weather now");
    }
}
