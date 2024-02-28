package org.example.design_patterns.state_design_pattern.design_vending_machine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemShell {
    private Integer itemCode;
    private Item item;
    private boolean isSold;
}
