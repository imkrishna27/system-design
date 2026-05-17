package projects.hk.design_patterns_interview.design_splitwise.controller;

import projects.hk.design_patterns_interview.design_splitwise.service.BalanceSheetService;
import projects.hk.design_patterns_interview.design_splitwise.service.ExpenseService;
import projects.hk.design_patterns_interview.design_splitwise.service.GroupService;
import projects.hk.design_patterns_interview.design_splitwise.service.SplitService;
import projects.hk.design_patterns_interview.design_splitwise.service.UserService;

public class SplitWiseMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        SplitWiseController splitWiseController = new SplitWiseController(userService, new GroupService(), new ExpenseService(new GroupService(),new SplitService()),new BalanceSheetService(userService));
        splitWiseController.demoSplitWise();
    }
}
