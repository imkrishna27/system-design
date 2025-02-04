package org.example.design_patterns_interview.design_atm.atm_states.impl;

import org.example.design_patterns_interview.design_atm.atm_states.abstract_class.AtmState;
import org.example.design_patterns_interview.design_atm.atm_withdrawal.FiveHundredNotesWithdrawalProcessor;
import org.example.design_patterns_interview.design_atm.atm_withdrawal.HundredNotesWithdrawalProcessor;
import org.example.design_patterns_interview.design_atm.atm_withdrawal.ThousandNotesWithdrawalProcessor;
import org.example.design_patterns_interview.design_atm.model.Atm;
import org.example.design_patterns_interview.design_atm.model.OperationType;
import org.example.design_patterns_interview.design_atm.model.User;

import java.math.BigDecimal;
import java.util.Scanner;

public class SelectOperationState extends AtmState {
    @Override
    public void selectOperation(Atm atm, User user, OperationType operationType) {
        switch (operationType) {
            case FETCH_BALANCE -> displayBalance(atm,user);
            case WITHDRAW_MONEY -> {
                System.out.println("Select amount to withdraw ...... ");
                Scanner scanner = new Scanner(System.in);
                String amountToWithdraw = scanner.next();
                cashWithdrawal(atm,user,Integer.parseInt(amountToWithdraw));
            }
        }
    }

    @Override
    public void displayBalance(Atm atm, User user) {
        System.out.println("Balance in you bank account is : " + user.getBankAccount().getBankBalance());
        System.out.println("----------------------------------------------------------------------");
    }

    @Override
    public void exit(Atm atm) {
        atm.setAtmState(new AtmAtIdleState());
    }

    @Override
    public void cashWithdrawal(Atm atm, User user, int amountToWithdraw) {
        if(atm.getAtmBal()<amountToWithdraw) {
            System.out.println("Insufficient bal in atm .......");
            System.out.println("----------------------------------------------------------------------");
            exit(atm);
        } else if(user.getBankAccount().getBankBalance().intValue() < amountToWithdraw) {
            System.out.println("Insufficient bal in your bank balance ........");
            System.out.println("----------------------------------------------------------------------");
            exit(atm);
        } else {
            BigDecimal bankBalance = user.getBankAccount().getBankBalance();
            user.getBankAccount().setBankBalance(new BigDecimal(bankBalance.intValue()-amountToWithdraw));
            atm.setAtmBal(atm.getAtmBal()-amountToWithdraw);
            // use chain of responsibility
            ThousandNotesWithdrawalProcessor withdrawalProcessor = new ThousandNotesWithdrawalProcessor(new FiveHundredNotesWithdrawalProcessor(new HundredNotesWithdrawalProcessor(null)));
            // atm status
            atm.atmStatus();
            withdrawalProcessor.withdrawCash(atm,amountToWithdraw);
            System.out.println("----------------------------------------------------------");
            // atm status
            atm.atmStatus();
            System.out.println("----------------------------------------------------------");

        }
    }
}
