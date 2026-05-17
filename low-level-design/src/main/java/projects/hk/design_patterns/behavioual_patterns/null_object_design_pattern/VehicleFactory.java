package projects.hk.design_patterns.behavioual_patterns.null_object_design_pattern;

import projects.hk.design_patterns.behavioual_patterns.null_object_design_pattern.impl.KiaVehicle;
import projects.hk.design_patterns.behavioual_patterns.null_object_design_pattern.impl.MahindraVehicle;
import projects.hk.design_patterns.behavioual_patterns.null_object_design_pattern.impl.NullVehicle;
import projects.hk.design_patterns.behavioual_patterns.null_object_design_pattern.impl.TataVehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String brandName) {
        switch (brandName) {
            case "TATA":
                return new TataVehicle();
            case "KIA":
                return new KiaVehicle();
            case "MAHINDRA":
                return new MahindraVehicle();
            default:
                return new NullVehicle();

        }
    }
}
