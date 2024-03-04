package org.example.design_patterns.behavioual_patterns.factory_pattern;

import org.example.design_patterns.behavioual_patterns.factory_pattern.factory.VehicleFactory;

public class FactoryMain {
    public static void main(String[] args) {
        VehicleFactory suzuki = new VehicleFactory("SUZUKI");
        Vehicle vehicle = suzuki.getVehicle();
        System.out.println("Vehicle name= "+ vehicle.brandName());
        System.out.println("Vehicle price= "+ vehicle.price());
    }
}
