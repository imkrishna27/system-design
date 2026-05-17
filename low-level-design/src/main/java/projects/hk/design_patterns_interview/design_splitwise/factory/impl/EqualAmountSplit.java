package projects.hk.design_patterns_interview.design_splitwise.factory.impl;

import projects.hk.design_patterns_interview.design_splitwise.factory.SplitAmount;
import projects.hk.design_patterns_interview.design_splitwise.model.SplitData;
import projects.hk.design_patterns_interview.design_splitwise.model.User;

import java.util.ArrayList;
import java.util.List;

public class EqualAmountSplit implements SplitAmount {
    final User paidBy;
    final double expenseAmount;
    double splitAmountPerUser;
    final List<User> listOfAllUsersForSplittingAmount; // user list of people in which we have to split these amount

    public EqualAmountSplit(User paidBy, double expenseAmount, List<User> userList) {
        this.paidBy = paidBy;
        this.expenseAmount = expenseAmount;
        this.listOfAllUsersForSplittingAmount = userList;
    }

    @Override
    public List<SplitData> calculate() {
        ArrayList<SplitData> splitDataArrayList = new ArrayList<>();
        splitAmountPerUser =expenseAmount/listOfAllUsersForSplittingAmount.size();
        listOfAllUsersForSplittingAmount.forEach(user -> {
            splitDataArrayList.add(new SplitData(user,splitAmountPerUser));
        });
        return splitDataArrayList;
    }
}
