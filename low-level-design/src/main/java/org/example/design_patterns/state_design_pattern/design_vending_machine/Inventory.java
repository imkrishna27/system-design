package org.example.design_patterns.state_design_pattern.design_vending_machine;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;    

@Data
public class Inventory {
    List<ItemShell> itemShellList;
    public Inventory(int itemCount) {
        itemShellList = new ArrayList<>(itemCount);
        initializeEmptyInventory();
    }

    private void initializeEmptyInventory() {
        int startCode = 101;
        for(int i=0;i<10;i++) {
            ItemShell itemShell = new ItemShell();
            itemShell.setItemCode(startCode);
            itemShell.setSold(true);
            itemShellList.add(itemShell);
            startCode++;
        }
    }

    public void addItem(Item item, int code) throws Exception {
        for(ItemShell itemShell: itemShellList) {
            if(itemShell.getItemCode() == code) {
                if(itemShell.isSold()) {
                    itemShell.setItem(item);
                    itemShell.setSold(true);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for (ItemShell itemShell : itemShellList) {
            if (itemShell.getItemCode() == code) {
                if (itemShell.isSold()) {
                    throw new Exception("item already sold out");
                } else {
                    return itemShell.getItem();
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int code) {
        for(ItemShell itemShell:itemShellList) {
            if(itemShell.getItemCode()== code) {
                itemShell.setSold(true);
            }
        }
    }
}
