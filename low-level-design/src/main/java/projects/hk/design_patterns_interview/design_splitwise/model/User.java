package projects.hk.design_patterns_interview.design_splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long userId;
    private String userName;
    private BalanceSheet balanceSheet;
}
