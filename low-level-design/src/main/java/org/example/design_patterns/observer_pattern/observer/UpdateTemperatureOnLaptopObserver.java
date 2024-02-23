package org.example.design_patterns.observer_pattern.observer;

import org.example.design_patterns.observer_pattern.observable.Observable;
import org.example.design_patterns.observer_pattern.observable.WeatherStationObservable;

public class UpdateTemperatureOnLaptopObserver implements Observer{

    public Observable observable;

    public float laptopTemp;

    public UpdateTemperatureOnLaptopObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        this.laptopTemp = observable.getData();
    }
}
