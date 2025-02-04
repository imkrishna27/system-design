package org.example.design_patterns_interview.design_atm;

import org.example.design_patterns_interview.design_atm.atm_states.impl.AtmAtIdleState;
import org.example.design_patterns_interview.design_atm.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        // create atm
        Atm atm = Atm.builder()
                .atmBal(10000)
                .atmState(new AtmAtIdleState())
                .hundredNotes(10)
                .fiveHundredNotes(10)
                .thousandNotes(2)
                .twoThousandNotes(1)
                .build();
        System.out.println("Entering in atm............");
        System.out.println("Amount available in atm : " + atm.getAtmBal());
        System.out.println("--------------------------");
        // creating user
        User user = User.builder()
                .name("krishna")
                .build();
        // bank account for the user
        BankAccount bankAccount = BankAccount
                .builder()
                .bankBalance(new BigDecimal(9000))
                .user(user)
                .atmCard(AtmCard.
                        builder()
                        .pin(1234)
                        .cvv(458)
                        .cardNo(98766789L)
                        .expiryDate(LocalDate.now().plusYears(10))
                        .user(user)
                        .build())
                .build();
        // setting bank account to the user
        user.setBankAccount(bankAccount);
        // insert card
        atm.getAtmState().insertCard(atm,user);
        // authenticate
        atm.getAtmState().authenticateUser(atm,user);
        // select operation
        System.out.println("Select operation you want to perform : Type 1 for Fetch Balance and Type 2 for Cash Withdrawal");
        Scanner scanner = new Scanner(System.in);
        String operationType = scanner.next();
        OperationType opType = getOperationTypeFromNumber(operationType);
        if(Objects.isNull(opType)) {
            System.out.println("Operation typee is not right.. exiting");
            System.out.println("________________________________________");
            System.exit(1);
        }
        atm.getAtmState().selectOperation(atm,user,opType);
    }

    private static OperationType getOperationTypeFromNumber(String operationType) {
        switch (operationType) {
            case "1" -> {
                return OperationType.FETCH_BALANCE;
            }
            case "2" -> {
                return OperationType.WITHDRAW_MONEY;
            }
            default -> {
                return null;
            }
        }
    }
}
