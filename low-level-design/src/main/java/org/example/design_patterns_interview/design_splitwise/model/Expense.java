package org.example.design_patterns_interview.design_splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.design_patterns_interview.design_splitwise.constant.SplitType;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {
    long expenseId;
    String expenseDescription;
    double expenseAmount;
    User paidBy;
    SplitType splitType;
    List<SplitData> splitDataList;
}
