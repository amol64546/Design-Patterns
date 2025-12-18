package com.example.patterns.observer.observer;

import com.example.patterns.observer.subject.WeatherData;

public class StatisticsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }



    @Override
    public void display() {
        System.out.printf("Statistics display: temp:%s, humidity:%s, pressure:%s%n",
                temperature, humidity, pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
