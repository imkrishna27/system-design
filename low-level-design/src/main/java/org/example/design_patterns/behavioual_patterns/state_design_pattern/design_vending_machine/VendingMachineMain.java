package org.example.design_patterns.behavioual_patterns.state_design_pattern.design_vending_machine;

import org.example.design_patterns.behavioual_patterns.state_design_pattern.design_vending_machine.vending_states.State;

import java.util.List;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            for (int i=0;i<20;i++) {
                vendingState.insertCoin(vendingMachine, Coin.RUPEE);
            }
            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);


        } catch(Exception e) {
            displayInventory(vendingMachine);
        }
    }
    private static void fillUpInventory(VendingMachine vendingMachine){
        List<ItemShell> slots = vendingMachine.getInventory().getItemShellList();
        for (int i = 0; i < slots.size(); i++) {
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setItemType(ItemType.BISCUIT);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setItemType(ItemType.CHIPS);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setItemType(ItemType.ICE_CREAM);
                newItem.setPrice(7);
            }
            slots.get(i).setItem(newItem);
            slots.get(i).setSold(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){

        List<ItemShell> slots = vendingMachine.getInventory().getItemShellList();
        for (int i = 0; i < slots.size(); i++) {

            System.out.println("CodeNumber: " + slots.get(i).getItemCode() +
                    " Item: " + slots.get(i).getItem().getItemType().name() +
                    " Price: " + slots.get(i).getItem().getPrice() +
                    " isAvailable: " + !slots.get(i).isSold());
        }
    }

}
