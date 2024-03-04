package org.example.design_patterns.template_design_pattern.payment_gateway_implementation;

public class SendToBankAccountViaUPI extends PaymentGateway{
    @Override
    public void validateRequest() {
        System.out.println("we are validating this request via UPI");
    }

    @Override
    public void debitMoney() {
        System.out.println("amount debited and ready to be send to bank account via upi");
    }

    @Override
    public void deductPlatformCharges() {
        System.out.println("0 platform charges");
    }

    @Override
    public void creditMoney() {
        System.out.println("money has been credited to bank via upi");
    }
}
