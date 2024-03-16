package org.example.design_patterns_interview.design_splitwise.controller;

import org.example.design_patterns_interview.design_splitwise.constant.SplitType;
import org.example.design_patterns_interview.design_splitwise.factory.SplitFactory;
import org.example.design_patterns_interview.design_splitwise.model.*;
import org.example.design_patterns_interview.design_splitwise.service.BalanceSheetService;
import org.example.design_patterns_interview.design_splitwise.service.ExpenseService;
import org.example.design_patterns_interview.design_splitwise.service.GroupService;
import org.example.design_patterns_interview.design_splitwise.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWiseController {

    final UserService userService;
    final GroupService groupService;

    final ExpenseService expenseService;
    final BalanceSheetService balanceSheetService;


    public SplitWiseController(UserService userService, GroupService groupService, ExpenseService expenseService, BalanceSheetService balanceSheetService) {
        this.userService = userService;
        this.groupService = groupService;
        this.expenseService = expenseService;
        this.balanceSheetService = balanceSheetService;
    }

    void demoSplitWise() {
        // we will add up the users in our system
        addUsers();
        // add groups if any
        addGroup();
        // now let's try to add an expense without group;
        addExpenseWithoutGroup(1,"Movie Tickets",1000,userService.getUser(1),SplitType.EQUAL,userService.getAllUsers());
        // let's see our general group after adding expense
        System.out.println(this.groupService.getGroup(1).toString());
        // debug here to see the data
        System.out.println(this.userService.getAllUsers());

    }

    private void addExpenseWithoutGroup(long id,String expenseDescription,double expenseAmount,User paidBy,SplitType splitType,List<User> listOfAllUsersForSplittingAmount) {
        //create a new expense
        Expense expense = this.expenseService.createExpense(id,expenseDescription,expenseAmount,paidBy,splitType,listOfAllUsersForSplittingAmount);
        // add expense to general group
        this.groupService.getGroup(1).getExpenseList().add(expense);
        this.balanceSheetService.updateBalanceSheet(paidBy,expenseAmount,expense);
    }



    private void addGroup() {
        User user1 = this.userService.getUser(1);
        User user2 = this.userService.getUser(2);
        User user3 = this.userService.getUser(3);
        List<User> userListForThisGroup = List.of(user1,user2,user3);
        // add a general group
        this.groupService.addGroup(new Group(1,"General",userService.getAllUsers(),new ArrayList<>()));
        // add a personal group
        this.groupService.addGroup(new Group(2,"Lucknow Expenses",userListForThisGroup,new ArrayList<>()));
    }

    private void addUsers() {
        this.userService.addUser(new User(1,"Hari",new BalanceSheet(new HashMap<>(),0,0)));
        this.userService.addUser(new User(2,"Rohan",new BalanceSheet(new HashMap<>(),0,0)));
        this.userService.addUser(new User(3,"Rahul",new BalanceSheet(new HashMap<>(),0,0)));
        this.userService.addUser(new User(4,"Ajay",new BalanceSheet(new HashMap<>(),0,0)));
        // create balance sheet of all users
        this.balanceSheetService.createBalanceSheet();
    }
}
