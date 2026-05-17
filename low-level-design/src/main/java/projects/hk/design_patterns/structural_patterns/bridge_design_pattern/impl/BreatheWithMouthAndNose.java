package projects.hk.design_patterns.structural_patterns.bridge_design_pattern.impl;

import projects.hk.design_patterns.structural_patterns.bridge_design_pattern.BreathingTechnique;

public class BreatheWithMouthAndNose implements BreathingTechnique {
    @Override
    public void implementBreathingTechnique() {
        System.out.println("breathing with mouth and nose");

    }
}
