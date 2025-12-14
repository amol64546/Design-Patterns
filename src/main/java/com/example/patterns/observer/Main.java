package com.example.patterns.observer;

import com.example.patterns.observer.observer.CurrentConditionsDisplay;
import com.example.patterns.observer.observer.DisplayElement;
import com.example.patterns.observer.observer.StatisticsDisplay;
import com.example.patterns.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        DisplayElement statisticsDisplay =
                new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
