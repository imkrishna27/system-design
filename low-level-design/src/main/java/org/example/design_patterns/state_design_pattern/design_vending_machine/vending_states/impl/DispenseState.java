package org.example.design_patterns.state_design_pattern.design_vending_machine.vending_states.impl;

import org.example.design_patterns.state_design_pattern.design_vending_machine.Coin;
import org.example.design_patterns.state_design_pattern.design_vending_machine.Item;
import org.example.design_patterns.state_design_pattern.design_vending_machine.VendingMachine;
import org.example.design_patterns.state_design_pattern.design_vending_machine.vending_states.State;

import java.util.List;

public class DispenseState implements State {
    DispenseState(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception{
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }
}
