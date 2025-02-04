package org.example.design_patterns_interview.design_atm.atm_withdrawal;

import org.example.design_patterns_interview.design_atm.model.Atm;

public class FiveHundredNotesWithdrawalProcessor extends CashWithdrawalProcessor{
    public FiveHundredNotesWithdrawalProcessor(CashWithdrawalProcessor nextWithdrawalProcessor) {
        super(nextWithdrawalProcessor);
    }

    @Override
    public void withdrawCash(Atm atm, int remainingCashToWithdraw) {
        int notesRequired = remainingCashToWithdraw/500;
        int remainingAmount;

        int atmFiveHundredNotes = atm.getFiveHundredNotes();
        if(atmFiveHundredNotes>=notesRequired) {
            int remainingFiveHundredNotes =  atmFiveHundredNotes - notesRequired;
            atm.setFiveHundredNotes(remainingFiveHundredNotes);
            remainingAmount = remainingCashToWithdraw - (notesRequired * 500);
        } else {
            int atMostFiveHundredNotesInAtm = atm.getFiveHundredNotes();
            remainingAmount = remainingCashToWithdraw - (atMostFiveHundredNotesInAtm * 500);
            atm.setFiveHundredNotes(0);
        }

        if(remainingAmount!=0) {
            super.withdrawCash(atm,remainingAmount);
        }
    }
}
