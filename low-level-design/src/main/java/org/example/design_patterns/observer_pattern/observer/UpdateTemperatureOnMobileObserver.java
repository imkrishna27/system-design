package org.example.design_patterns.observer_pattern.observer;

import org.example.design_patterns.observer_pattern.observable.Observable;
import org.example.design_patterns.observer_pattern.observable.WeatherStationObservable;

public class UpdateTemperatureOnMobileObserver implements Observer {

    public float mobileTemp;
    public Observable observable;
    public UpdateTemperatureOnMobileObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("==> hey mobile ! there has been changed in temperature");
        // set temperature to mobile
        this.mobileTemp = observable.getData();
    }
}
