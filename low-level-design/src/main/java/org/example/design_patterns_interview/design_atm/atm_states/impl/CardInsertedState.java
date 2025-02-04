package org.example.design_patterns_interview.design_atm.atm_states.impl;

import lombok.NoArgsConstructor;
import org.example.design_patterns_interview.design_atm.atm_states.abstract_class.AtmState;
import org.example.design_patterns_interview.design_atm.model.Atm;
import org.example.design_patterns_interview.design_atm.model.User;

import java.util.Scanner;

@NoArgsConstructor
public class CardInsertedState extends AtmState {
    @Override
    public void authenticateUser(Atm atm, User user) {
        System.out.print("Enter your atm pin");
        Scanner scanner = new Scanner(System.in);
        String pin = scanner.next();
        if(Integer.parseInt(pin) != user.getBankAccount().getAtmCard().getPin()) {
            System.out.println("Wrong pin entered.. try again !");
            System.out.println("------------------------------------");
            atm.setAtmState(new AtmAtIdleState());
            System.exit(1);
        }
        System.out.println("user is authenticated......");
        atm.setAtmState(new SelectOperationState());
        System.out.println("-----------------------------------------");
    }
}
