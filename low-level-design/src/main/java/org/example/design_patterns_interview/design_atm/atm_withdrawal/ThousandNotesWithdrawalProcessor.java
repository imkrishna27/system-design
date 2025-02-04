package org.example.design_patterns_interview.design_atm.atm_withdrawal;

import org.example.design_patterns_interview.design_atm.model.Atm;

import static java.lang.Math.abs;

public class ThousandNotesWithdrawalProcessor extends CashWithdrawalProcessor{
    public ThousandNotesWithdrawalProcessor(CashWithdrawalProcessor nextWithdrawalProcessor) {
        super(nextWithdrawalProcessor);
    }

    @Override
    public void withdrawCash(Atm atm, int remainingCashToWithdraw) {
        int notesRequired = remainingCashToWithdraw/1000;
        int remainingAmount;

        int atmThousandNotes = atm.getThousandNotes();
        if(atmThousandNotes>=notesRequired) {
           int remainThousandNotes =  atmThousandNotes - notesRequired;
           atm.setHundredNotes(remainThousandNotes);
           remainingAmount = remainingCashToWithdraw - (notesRequired * 1000);
        } else {
            int atMostThousandNotesInAtm = atm.getThousandNotes();
            remainingAmount = remainingCashToWithdraw - (atMostThousandNotesInAtm * 1000);
            atm.setThousandNotes(0);
        }

        if(remainingAmount!=0) {
            super.withdrawCash(atm,remainingAmount);
        }
    }
}
