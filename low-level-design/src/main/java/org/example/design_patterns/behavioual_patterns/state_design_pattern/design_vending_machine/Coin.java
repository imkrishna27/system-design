package org.example.design_patterns.behavioual_patterns.state_design_pattern.design_vending_machine;

public enum Coin {
    RUPEE(1);

    public Integer amount;

    Coin(Integer amount) {
        this.amount = amount;
    }
}
