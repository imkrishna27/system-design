package org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl;

import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.Vehicle;

public class KiaVehicle implements Vehicle {
    @Override
    public String getBrandName() {
        return "this is kia vehicle";
    }

    @Override
    public Double getPrice() {
        return 16.0;
    }
}
