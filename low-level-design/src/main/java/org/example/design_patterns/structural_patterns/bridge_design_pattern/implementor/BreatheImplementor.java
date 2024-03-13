package org.example.design_patterns.structural_patterns.bridge_design_pattern.implementor;

import org.example.design_patterns.structural_patterns.bridge_design_pattern.BreathingTechnique;

public abstract class BreatheImplementor {
    BreathingTechnique breathingTechnique;
    BreatheImplementor(BreathingTechnique breathingTechnique) {
        this.breathingTechnique = breathingTechnique;
    }

    public abstract void breathe();
}
