package org.example.design_patterns.abstract_factory_pattern.abstract_factory;

import org.example.design_patterns.abstract_factory_pattern.*;

public class NormalVehicleAbstractFactory extends VehicleAbstractFactory{
    private String vehicleBrand;

    public NormalVehicleAbstractFactory(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
    @Override
    public Vehicle getVehicle() {
        switch (this.vehicleBrand) {
            case "NANO":
                return new Nano();
            case "MARUTI":
                return new Maruti();
            default:
                return null;
        }
    }
}
