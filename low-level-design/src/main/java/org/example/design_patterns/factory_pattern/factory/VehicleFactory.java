package org.example.design_patterns.factory_pattern.factory;

import org.example.design_patterns.factory_pattern.Maruti;
import org.example.design_patterns.factory_pattern.Suzuki;
import org.example.design_patterns.factory_pattern.Vehicle;

public class VehicleFactory {
    private String vehicleBrand;
    public VehicleFactory(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public Vehicle getVehicle() {
        switch (this.vehicleBrand) {
            case "MARUTI":
                return new Maruti();
            case "SUZUKI":
                return new Suzuki();
            default:
                return null;
        }
    }
}
