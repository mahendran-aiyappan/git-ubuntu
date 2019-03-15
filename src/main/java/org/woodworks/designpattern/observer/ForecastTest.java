package org.woodworks.designpattern.observer;

public class ForecastTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Forecast forecast = new Forecast(weatherData);
        weatherData.setTemp(10);
        weatherData.setTemp(11);

    }
}
