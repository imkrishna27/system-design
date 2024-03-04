package org.example.design_patterns.behavioual_patterns.observer_pattern;

import org.example.design_patterns.behavioual_patterns.observer_pattern.observable.WeatherStationObservable;
import org.example.design_patterns.behavioual_patterns.observer_pattern.observer.UpdateTemperatureOnLaptopObserver;
import org.example.design_patterns.behavioual_patterns.observer_pattern.observer.UpdateTemperatureOnMobileObserver;

public class ObserveTemperatureChangeMain {
    public static void main(String[] args) {
        WeatherStationObservable weatherStationObservable = new WeatherStationObservable();
        UpdateTemperatureOnMobileObserver updateTemperatureOnMobileObserver = new UpdateTemperatureOnMobileObserver(weatherStationObservable);
        UpdateTemperatureOnLaptopObserver updateTemperatureOnLaptopObserver = new UpdateTemperatureOnLaptopObserver(weatherStationObservable);
        weatherStationObservable.add(updateTemperatureOnLaptopObserver);
        weatherStationObservable.add(updateTemperatureOnMobileObserver);
        weatherStationObservable.setData(40.00f);
        // let's check temp of both the Observable
        System.out.println("laptop temp => "+ updateTemperatureOnLaptopObserver.laptopTemp);
        System.out.println("mobile temp => "+ updateTemperatureOnMobileObserver.mobileTemp);
        // lets change temperature again
        weatherStationObservable.setData(90.011f);
        // let's check temp of both the Observable
        System.out.println("laptop temp => "+ updateTemperatureOnLaptopObserver.laptopTemp);
        System.out.println("mobile temp => "+ updateTemperatureOnMobileObserver.mobileTemp);

    }
}
