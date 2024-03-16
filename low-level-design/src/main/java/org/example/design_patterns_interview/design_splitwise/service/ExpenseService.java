package org.example.design_patterns_interview.design_splitwise.service;

import org.example.design_patterns_interview.design_splitwise.constant.SplitType;
import org.example.design_patterns_interview.design_splitwise.model.Expense;
import org.example.design_patterns_interview.design_splitwise.model.Group;
import org.example.design_patterns_interview.design_splitwise.model.User;

import java.util.List;

public class ExpenseService {
    final GroupService groupService;
    final SplitService splitService;
    public ExpenseService(GroupService groupService, SplitService splitService) {
        this.groupService = groupService;
        this.splitService = splitService;
    }

    public void addExpenseInGeneralGroup(Expense expense) {
        // fetch the general group
        Group generalGroup = this.groupService.getGroup(1);
        generalGroup.getExpenseList().add(expense);
    }
    public Expense createExpense(long id, String expenseDescription, double expenseAmount, User paidBy, SplitType splitType, List<User> listOfAllUsersForSplittingAmount) {
        return new Expense(id,
                expenseDescription,
                expenseAmount,
                paidBy,
                splitType,
                this.splitService.splitAmountBetweenUsers(expenseAmount, splitType, paidBy, listOfAllUsersForSplittingAmount)
        );
    }
}
