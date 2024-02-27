package org.example.design_patterns.abstract_factory_pattern.factory;

import org.example.design_patterns.abstract_factory_pattern.Vehicle;
import org.example.design_patterns.abstract_factory_pattern.abstract_factory.VehicleAbstractFactory;

public class VehicleFactory {
    private VehicleAbstractFactory vehicleAbstractFactory;
    public VehicleFactory(VehicleAbstractFactory vehicleAbstractFactory) {
        this.vehicleAbstractFactory = vehicleAbstractFactory;
    }
    public Vehicle getVehicle() {
        return this.vehicleAbstractFactory.getVehicle();
    }
}
