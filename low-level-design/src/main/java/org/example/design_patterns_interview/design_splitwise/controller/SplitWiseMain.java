package org.example.design_patterns_interview.design_splitwise.controller;

import org.example.design_patterns_interview.design_splitwise.service.*;

public class SplitWiseMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        SplitWiseController splitWiseController = new SplitWiseController(userService, new GroupService(), new ExpenseService(new GroupService(),new SplitService()),new BalanceSheetService(userService));
        splitWiseController.demoSplitWise();
    }
}
