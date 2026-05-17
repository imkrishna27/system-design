package projects.hk.design_patterns_interview.design_splitwise.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import projects.hk.design_patterns_interview.design_splitwise.model.Balance;
import projects.hk.design_patterns_interview.design_splitwise.model.BalanceSheet;
import projects.hk.design_patterns_interview.design_splitwise.model.Expense;
import projects.hk.design_patterns_interview.design_splitwise.model.SplitData;
import projects.hk.design_patterns_interview.design_splitwise.model.User;

public class BalanceSheetService {
    final UserService userService;

    public BalanceSheetService(UserService userService) {
        this.userService = userService;
    }

    public void createBalanceSheet() {
        List<User> allUsers = this.userService.getAllUsers();
        allUsers.forEach(user -> {
            //List<User> allUsersExpectCurrentUser = this.userService.getAllUsersExpect(user.getUserId());
            user.getBalanceSheet().setBalanceMap(createBalanceHashMapOfUsersExpectCurrentUser(allUsers));

        });
    }

    private Map<Long, Balance> createBalanceHashMapOfUsersExpectCurrentUser(List<User> allUsers) {
        Map<Long,Balance> balanceMap = new HashMap<>();
        allUsers.forEach(user -> {
            balanceMap.put(user.getUserId(), new Balance(0,0));
        });
        return balanceMap;
    }


    public void updateBalanceSheet(User paidBy, double expenseAmount, Expense expense) {
        BalanceSheet balanceSheetOfUserWhoPaid = paidBy.getBalanceSheet();
        balanceSheetOfUserWhoPaid.setTotalExpensesByMe(balanceSheetOfUserWhoPaid.getTotalExpensesByMe()+expenseAmount);
        // now update other user's balance sheet
        List<SplitData> splitDataList = expense.getSplitDataList();
        for(SplitData splitData: splitDataList) {
            double amountSplit = splitData.getAmount();
                Map<Long, Balance> balanceMap = splitData.getUser().getBalanceSheet().getBalanceMap();
                for(Map.Entry<Long,Balance> entry: balanceMap.entrySet()) {
                    if(entry.getKey()!=paidBy.getUserId()) {
                        entry.getValue().setOwed(amountSplit);
                    } else {
                        entry.getValue().setGetBack(((splitDataList.size()-1)*amountSplit));
                    }
                }

        }

    }
}
