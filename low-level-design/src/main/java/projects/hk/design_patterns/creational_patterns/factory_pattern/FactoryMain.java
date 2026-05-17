package projects.hk.design_patterns.creational_patterns.factory_pattern;

import projects.hk.design_patterns.creational_patterns.factory_pattern.factory.VehicleFactory;

public class FactoryMain {
    public static void main(String[] args) {
        VehicleFactory suzuki = new VehicleFactory("SUZUKI");
        Vehicle vehicle = suzuki.getVehicle();
        System.out.println("Vehicle name= "+ vehicle.brandName());
        System.out.println("Vehicle price= "+ vehicle.price());
    }
}
