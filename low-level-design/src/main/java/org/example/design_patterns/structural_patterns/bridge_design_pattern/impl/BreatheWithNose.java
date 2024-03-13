package org.example.design_patterns.structural_patterns.bridge_design_pattern.impl;

import org.example.design_patterns.structural_patterns.bridge_design_pattern.BreathingTechnique;

public class BreatheWithNose implements BreathingTechnique {
    @Override
    public void implementBreathingTechnique() {
        System.out.println("breathing with nose");

    }
}
