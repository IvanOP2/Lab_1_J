package ua.edu.chnu.kkn.design_patterns.behavioral.observer;

public enum WeatherType {
    SUNNY("sunny"),
    WINDY("windy"),
    RAINY("rainy");

    public final String description;

    WeatherType(String description) {
        this.description = description;
    }
}
