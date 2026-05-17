package projects.hk.design_patterns.structural_patterns.bridge_design_pattern;

import projects.hk.design_patterns.structural_patterns.bridge_design_pattern.impl.BreatheWithMouth;
import projects.hk.design_patterns.structural_patterns.bridge_design_pattern.impl.BreatheWithMouthAndNose;
import projects.hk.design_patterns.structural_patterns.bridge_design_pattern.implementor.BreatheImplementor;
import projects.hk.design_patterns.structural_patterns.bridge_design_pattern.implementor.BreatheImplementorImpl;

public class Client {
    public static void main(String[] args) {
        BreatheImplementor breatheImplementor1 = new BreatheImplementorImpl(new BreatheWithMouthAndNose());
        breatheImplementor1.breathe();
        BreatheImplementor breatheImplementor2 = new BreatheImplementorImpl(new BreatheWithMouth());
        breatheImplementor2.breathe();
    }
}
