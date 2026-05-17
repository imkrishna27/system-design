package projects.hk.design_patterns_interview.design_atm.atm_states.abstract_class;

import lombok.ToString;
import projects.hk.design_patterns_interview.design_atm.model.Atm;
import projects.hk.design_patterns_interview.design_atm.model.OperationType;
import projects.hk.design_patterns_interview.design_atm.model.User;

@ToString
public abstract class AtmState {
    public void insertCard(Atm atm, User user) {
        System.out.println("something went wrong");
    }
    public void authenticateUser(Atm atm, User user) {
        System.out.println("something went wrong");
    }
    public void selectOperation(Atm atm, User user, OperationType operationType) {
        System.out.println("something went wrong");
    }
    public void displayBalance(Atm atm,User user) {
        System.out.println("something went wrong");
    }
    public void cashWithdrawal(Atm atm,User user,int amountToWithdraw) {
        System.out.println("something went wrong");
    }
    public void exit(Atm atm) {
        System.out.println("something went wrong");
    }
}
