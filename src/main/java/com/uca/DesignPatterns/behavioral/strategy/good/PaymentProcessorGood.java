package com.uca.DesignPatterns.behavioral.strategy.good;

public class PaymentProcessorGood {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessorGood(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
