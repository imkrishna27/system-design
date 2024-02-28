package org.example.design_patterns.state_design_pattern.design_vending_machine;

import lombok.Data;
import org.example.design_patterns.state_design_pattern.design_vending_machine.vending_states.State;
import org.example.design_patterns.state_design_pattern.design_vending_machine.vending_states.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

@Data
public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;
    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }


}
