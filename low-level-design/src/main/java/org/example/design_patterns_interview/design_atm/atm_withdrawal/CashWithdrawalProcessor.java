package org.example.design_patterns_interview.design_atm.atm_withdrawal;

import org.example.design_patterns_interview.design_atm.model.Atm;

public abstract class CashWithdrawalProcessor {
    private final CashWithdrawalProcessor nextWithdrawalProcessor;

    protected CashWithdrawalProcessor(CashWithdrawalProcessor nextWithdrawalProcessor) {
        this.nextWithdrawalProcessor = nextWithdrawalProcessor;
    }

    public void withdrawCash(Atm atm, int remainingCashToWithdraw) {
        if(nextWithdrawalProcessor!=null) {
            nextWithdrawalProcessor.withdrawCash(atm,remainingCashToWithdraw);
        }

    }
}
