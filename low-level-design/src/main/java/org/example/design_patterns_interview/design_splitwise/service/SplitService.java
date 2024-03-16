package org.example.design_patterns_interview.design_splitwise.service;

import org.example.design_patterns_interview.design_splitwise.constant.SplitType;
import org.example.design_patterns_interview.design_splitwise.factory.SplitFactory;
import org.example.design_patterns_interview.design_splitwise.model.SplitData;
import org.example.design_patterns_interview.design_splitwise.model.User;

import java.util.List;

public class SplitService {
    public SplitService(){

    }
    public List<SplitData> splitAmountBetweenUsers(double expenseAmount, SplitType splitType, User paidBy, List<User> listOfAllUsersForSplittingAmount) {
        List<SplitData> splitData = new SplitFactory(splitType,paidBy,expenseAmount,listOfAllUsersForSplittingAmount).getSplitData().calculate();
        return splitData;
    }
}
