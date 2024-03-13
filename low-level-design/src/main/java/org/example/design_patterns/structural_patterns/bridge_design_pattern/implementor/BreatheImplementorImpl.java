package org.example.design_patterns.structural_patterns.bridge_design_pattern.implementor;

import org.example.design_patterns.structural_patterns.bridge_design_pattern.BreathingTechnique;

public class BreatheImplementorImpl extends BreatheImplementor{

    public BreatheImplementorImpl(BreathingTechnique breathingTechnique) {
        super(breathingTechnique);
    }

    @Override
    public void breathe() {
        breathingTechnique.implementBreathingTechnique();
    }
}
