package org.example.design_patterns.state_design_pattern.design_vending_machine.vending_states;

import org.example.design_patterns.state_design_pattern.design_vending_machine.Coin;
import org.example.design_patterns.state_design_pattern.design_vending_machine.Item;
import org.example.design_patterns.state_design_pattern.design_vending_machine.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

}
