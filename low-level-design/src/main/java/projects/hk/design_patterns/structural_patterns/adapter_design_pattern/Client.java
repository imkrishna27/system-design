package projects.hk.design_patterns.structural_patterns.adapter_design_pattern;

import projects.hk.design_patterns.structural_patterns.adapter_design_pattern.adaptee.AdultWeightMachine;
import projects.hk.design_patterns.structural_patterns.adapter_design_pattern.adapter.WeightMachineAdapter;
import projects.hk.design_patterns.structural_patterns.adapter_design_pattern.adapter.WeightMachineKilogram;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineKilogram = new WeightMachineKilogram(new AdultWeightMachine());
        System.out.println(weightMachineKilogram.convertWeight());
    }
}
