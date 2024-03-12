package org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl;

import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.Vehicle;

/**
 * we can implement null behaviour as well as default behavior
 */
public class NullVehicle implements Vehicle {
    @Override
    public String getBrandName() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
