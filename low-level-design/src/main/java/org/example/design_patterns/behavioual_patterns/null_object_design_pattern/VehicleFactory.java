package org.example.design_patterns.behavioual_patterns.null_object_design_pattern;

import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl.KiaVehicle;
import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl.MahindraVehicle;
import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl.NullVehicle;
import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl.TataVehicle;

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
