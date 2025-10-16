package com.uca.DesignPatterns.behavioral.strategy;

import com.uca.DesignPatterns.behavioral.strategy.bad.PaymentProcessor;
import com.uca.DesignPatterns.behavioral.strategy.good.CreditCardPayment;
import com.uca.DesignPatterns.behavioral.strategy.good.PaymentProcessorGood;

public class Strategy {
    public static void main(String[] args) {

    }

    public static void badExample() {
        System.out.println("=== Bad Example: ===");
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CREDIT_CARD", 100.0);
        paymentProcessor.processPayment("PAYPAL", 200.0);
    }

    public static void goodExample() {
        System.out.println("=== Good Example: ===");
        PaymentProcessorGood paymentProcessorGood = new PaymentProcessorGood(new CreditCardPayment());
        paymentProcessorGood.processPayment(200.0);
    }
}
