package org.example.design_patterns.structural_patterns.composite_design_pattern.implement_calculator;

public class Number implements Expression{
    int ans;
    Number(int ans) {
        this.ans = ans;
    }
    @Override
    public int evaluate() {
        return ans;
    }
}
