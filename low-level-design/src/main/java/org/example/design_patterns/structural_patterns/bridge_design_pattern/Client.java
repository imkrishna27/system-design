package org.example.design_patterns.structural_patterns.bridge_design_pattern;

import org.example.design_patterns.structural_patterns.bridge_design_pattern.impl.BreatheWithMouth;
import org.example.design_patterns.structural_patterns.bridge_design_pattern.impl.BreatheWithMouthAndNose;
import org.example.design_patterns.structural_patterns.bridge_design_pattern.implementor.BreatheImplementor;
import org.example.design_patterns.structural_patterns.bridge_design_pattern.implementor.BreatheImplementorImpl;

public class Client {
    public static void main(String[] args) {
        BreatheImplementor breatheImplementor1 = new BreatheImplementorImpl(new BreatheWithMouthAndNose());
        breatheImplementor1.breathe();
        BreatheImplementor breatheImplementor2 = new BreatheImplementorImpl(new BreatheWithMouth());
        breatheImplementor2.breathe();
    }
}
