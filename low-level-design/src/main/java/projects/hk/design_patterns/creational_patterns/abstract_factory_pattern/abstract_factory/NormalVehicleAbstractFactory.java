package projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory;

import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Maruti;
import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Nano;
import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Vehicle;

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
