package projects.hk.design_patterns_interview.design_splitwise.factory;

import projects.hk.design_patterns_interview.design_splitwise.constant.SplitType;
import projects.hk.design_patterns_interview.design_splitwise.factory.impl.EqualAmountSplit;
import projects.hk.design_patterns_interview.design_splitwise.model.User;

import java.util.List;

public class SplitFactory {
    final SplitType splitType;
    final User paidBy;
    final double expenseAmount;

    final List<User> listOfAllUsersForSplittingAmount;

    public SplitFactory(SplitType splitType, User paidBy, double expenseAmount, List<User> listOfAllUsersForSplittingAmount) {
        this.splitType = splitType;
        this.paidBy = paidBy;
        this.expenseAmount = expenseAmount;
        this.listOfAllUsersForSplittingAmount = listOfAllUsersForSplittingAmount;
    }

    public SplitAmount getSplitData() {
        switch (splitType) {
            case EQUAL:
                return new EqualAmountSplit(paidBy,expenseAmount,listOfAllUsersForSplittingAmount);

        }
        return null;
    }
}
