package org.example.design_patterns.observer_pattern;

import org.example.design_patterns.observer_pattern.observable.WeatherStationObservable;
import org.example.design_patterns.observer_pattern.observer.UpdateTemperatureOnLaptopObserver;
import org.example.design_patterns.observer_pattern.observer.UpdateTemperatureOnMobileObserver;

public class ObserveTemperatureChangeMain {
    public static void main(String[] args) {
        WeatherStationObservable weatherStationObservable = new WeatherStationObservable();
        UpdateTemperatureOnMobileObserver updateTemperatureOnMobileObserver = new UpdateTemperatureOnMobileObserver(weatherStationObservable);
        UpdateTemperatureOnLaptopObserver updateTemperatureOnLaptopObserver = new UpdateTemperatureOnLaptopObserver(weatherStationObservable);
        weatherStationObservable.add(updateTemperatureOnLaptopObserver);
        weatherStationObservable.add(updateTemperatureOnMobileObserver);
        weatherStationObservable.setData(40.00f);
        // this must have notified everyone about change in temperature
        weatherStationObservable.notifyEveryOne();
        // let's check temp of both the Observable
        System.out.println(updateTemperatureOnLaptopObserver.laptopTemp);
        System.out.println(updateTemperatureOnMobileObserver.mobileTemp);
        // lets change temperature again
        weatherStationObservable.setData(90.011f);
        // notify
        weatherStationObservable.notifyEveryOne();
        // let's check temp of both the Observable
        System.out.println(updateTemperatureOnLaptopObserver.laptopTemp);
        System.out.println(updateTemperatureOnMobileObserver.mobileTemp);

    }
}
