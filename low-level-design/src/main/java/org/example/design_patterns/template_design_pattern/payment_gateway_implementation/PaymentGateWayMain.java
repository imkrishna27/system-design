package org.example.design_patterns.template_design_pattern.payment_gateway_implementation;

public class PaymentGateWayMain {
    public static void main(String[] args) {
        PaymentGateway sendToBankAccountViaMerchant = new SendToBankAccountViaMerchant();
        PaymentGateway sendToBankAccountViaUPI = new SendToBankAccountViaUPI();
        sendToBankAccountViaUPI.sendMoney();
        System.out.println("-----------------------------------");
        sendToBankAccountViaMerchant.sendMoney();
    }
}
