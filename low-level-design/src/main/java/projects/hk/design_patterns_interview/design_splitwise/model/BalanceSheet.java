package projects.hk.design_patterns_interview.design_splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BalanceSheet {
    Map<Long,Balance> balanceMap;
    double totalOwed;
    double totalExpensesByMe;
}
