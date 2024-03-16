package org.example.design_patterns_interview.design_splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BalanceSheet {
    Map<Long,Balance> balanceMap;
    double totalOwed;
    double totalExpensesByMe;
}
