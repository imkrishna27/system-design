package org.example.design_patterns.structural_patterns.adapter_design_pattern.adaptee;

public class AdultWeightMachine implements WeightMachine{
    @Override
    public int findWeightInPounds() {
        return 40;
    }
}
