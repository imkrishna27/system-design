package org.example.design_patterns.behavioual_patterns.template_design_pattern.payment_gateway_implementation;

public class SendToBankAccountViaMerchant extends PaymentGateway{

    @Override
    public void validateRequest() {
        System.out.println("we are validating this request via Merchant");
    }

    @Override
    public void debitMoney() {
        System.out.println("amount debited and ready to be send to bank account via merchant");
    }

    @Override
    public void deductPlatformCharges() {
        System.out.println("10 rupee platform charges");
    }

    @Override
    public void creditMoney() {
        System.out.println("money has been credited to bank via merchant");
    }
}
