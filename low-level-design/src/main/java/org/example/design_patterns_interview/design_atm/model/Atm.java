package org.example.design_patterns_interview.design_atm.model;

import lombok.*;
import org.example.design_patterns_interview.design_atm.atm_states.abstract_class.AtmState;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Atm {
    AtmState atmState;
    int atmBal;
    int hundredNotes;
    int thousandNotes;
    int fiveHundredNotes;
    int twoThousandNotes;

    public void atmStatus() {
        System.out.println("Amount in ATM : " + atmBal);
        System.out.println("Hundred Notes : " + hundredNotes);
        System.out.println("Five Hundred Notes : " + fiveHundredNotes);
        System.out.println("Thousand Notes : " + thousandNotes);
        System.out.println("Two Thousand Notes : " + twoThousandNotes);
    }
}
