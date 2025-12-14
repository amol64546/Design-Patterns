package com.example.patterns.observer.observer;

import com.example.patterns.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }



    @Override
    public void display() {
        System.out.printf("Current conditions: temp:%s, humidity:%s%n", temperature, humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
