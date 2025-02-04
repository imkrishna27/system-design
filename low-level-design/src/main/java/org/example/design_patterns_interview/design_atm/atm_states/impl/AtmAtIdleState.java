package org.example.design_patterns_interview.design_atm.atm_states.impl;

import org.example.design_patterns_interview.design_atm.atm_states.abstract_class.AtmState;
import org.example.design_patterns_interview.design_atm.model.Atm;
import org.example.design_patterns_interview.design_atm.model.User;

public class AtmAtIdleState extends AtmState {
    @Override
    public void insertCard(Atm atm, User user) {
        System.out.println("card inserted...");
        System.out.println("card details are ----- ");
        System.out.println("card no: " +user.getBankAccount().getAtmCard().getCardNo());
        System.out.println("card owner: " +user.getName());
        System.out.println("----------------------------------------------");
        atm.setAtmState(new CardInsertedState());

    }
}
