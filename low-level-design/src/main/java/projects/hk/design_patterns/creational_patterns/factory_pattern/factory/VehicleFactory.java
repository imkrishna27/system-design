package projects.hk.design_patterns.creational_patterns.factory_pattern.factory;

import projects.hk.design_patterns.creational_patterns.factory_pattern.Maruti;
import projects.hk.design_patterns.creational_patterns.factory_pattern.Suzuki;
import projects.hk.design_patterns.creational_patterns.factory_pattern.Vehicle;

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
