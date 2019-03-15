package org.woodworks.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Forecast implements Observer {
    public Forecast(Observable observable)
    {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof WeatherData){
            System.out.println(((WeatherData)o).getTemp());
        }

    }
}
