package com.example.patterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card payment strategy
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(100.0);

        // Switch to PayPal payment strategy
        context.setPaymentStrategy(new PaypalPayment("user@example.com"));
        context.executePayment(200.0);

        context.setPaymentStrategy(new UpiPayment("1A2b3C4d5E6f7G8h9I0j"));
        context.executePayment(300.0);
    }
}

