package projects.hk.design_patterns.structural_patterns.decorator_pattern.pizza_types;

import projects.hk.design_patterns.structural_patterns.decorator_pattern.BasePizza;

public class VegDelightPizza extends BasePizza {
    @Override
    public float cost() {
        return 200.00f;
    }
}
