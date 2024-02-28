package org.example.design_patterns.state_design_pattern.design_vending_machine;

import lombok.Data;

@Data
public class Item {
 private ItemType itemType;
 private Integer price;
}
