package org.example.design_patterns_interview.design_atm.atm_withdrawal;

import lombok.NoArgsConstructor;
import org.example.design_patterns_interview.design_atm.model.Atm;

public class HundredNotesWithdrawalProcessor extends CashWithdrawalProcessor{
    public HundredNotesWithdrawalProcessor(CashWithdrawalProcessor nextWithdrawalProcessor) {
        super(nextWithdrawalProcessor);
    }

    @Override
    public void withdrawCash(Atm atm, int remainingCashToWithdraw) {
        int notesRequired = remainingCashToWithdraw/100;
        int remainingAmount;

        int hundredNotesInAtm = atm.getHundredNotes();
        if(hundredNotesInAtm>=notesRequired) {
            int remainingHundredNotes =  hundredNotesInAtm - notesRequired;
            atm.setHundredNotes(remainingHundredNotes);
            remainingAmount = remainingCashToWithdraw - (notesRequired * 100);
        } else {
            int atMostHundredNotesInAtm = atm.getHundredNotes();
            remainingAmount = remainingCashToWithdraw - (atMostHundredNotesInAtm * 100);
            atm.setHundredNotes(0);
        }

        if(remainingAmount!=0) {
            System.out.println("Unable to withdraw cash... something went wrong");
        }
    }

}
