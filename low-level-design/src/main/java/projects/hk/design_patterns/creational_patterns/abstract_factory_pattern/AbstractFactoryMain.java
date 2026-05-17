package projects.hk.design_patterns.creational_patterns.abstract_factory_pattern;

import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory.ImportedVehicleAbstractFactory;
import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.factory.VehicleFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VehicleFactory vehicle = new VehicleFactory(new ImportedVehicleAbstractFactory("AUDI"));
        System.out.println("Vehicle Name: " + vehicle.getVehicle().brandName());
        System.out.println("Vehicle price: " + vehicle.getVehicle().price());
    }
}
