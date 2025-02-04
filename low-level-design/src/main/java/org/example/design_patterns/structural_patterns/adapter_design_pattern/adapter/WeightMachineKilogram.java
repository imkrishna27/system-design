package org.example.design_patterns.structural_patterns.adapter_design_pattern.adapter;

import org.example.design_patterns.structural_patterns.adapter_design_pattern.adaptee.WeightMachine;

public class WeightMachineKilogram implements WeightMachineAdapter {

    public WeightMachine adultWeightMachine;
    public WeightMachineKilogram(WeightMachine weightMachine) {
        this.adultWeightMachine =weightMachine;
    }
    @Override
    public int convertWeight() {
        return this.adultWeightMachine.findWeightInPounds()*2;
    }
}
