package projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory;

import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Audi;
import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Bmw;
import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Tesla;
import projects.hk.design_patterns.creational_patterns.abstract_factory_pattern.Vehicle;

public class ImportedVehicleAbstractFactory extends VehicleAbstractFactory{
    private String vehicleBrand;
    public ImportedVehicleAbstractFactory(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
    @Override
    public Vehicle getVehicle() {
        switch (this.vehicleBrand) {
            case "BMW":
                return new Bmw();
            case "AUDI":
                return new Audi();
            case "TESLA":
                return new Tesla();
            default:
                return null;
        }
    }
}
