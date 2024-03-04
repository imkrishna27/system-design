package org.example.design_patterns.behavioual_patterns.template_design_pattern.payment_gateway_implementation;

public abstract class PaymentGateway {
    public abstract void validateRequest();
    public abstract void debitMoney();
    public abstract void deductPlatformCharges();
    public abstract void creditMoney();

    public final void sendMoney() {
        validateRequest();
        debitMoney();
        deductPlatformCharges();
        creditMoney();
    }
}
