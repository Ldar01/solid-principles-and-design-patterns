package com.uca.SOLID.openClosedPrinciple;

import com.uca.SOLID.openClosedPrinciple.bad.PaymentProcessor;
import com.uca.SOLID.openClosedPrinciple.good.CreditCardPayment;
import com.uca.SOLID.openClosedPrinciple.good.PaymentProcessorGood;
import com.uca.SOLID.openClosedPrinciple.good.PaypalPayment;

public class OpenClosed {
    public static void main(String[] args) {
        badScene(100.0);
        goodScene(200.0);
    }

    public static void badScene(double amount) {
        System.out.println("=== Bad Scene: ===");
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CREDIT_CARD", amount);
        paymentProcessor.processPayment("PAYPAL", amount);
    }

    public static void goodScene(double amount) {
        System.out.println("=== Good Scene: ===");
        PaymentProcessorGood paymentProcessor = new PaymentProcessorGood();
        paymentProcessor.processPayment(new CreditCardPayment(), amount);
        paymentProcessor.processPayment(new PaypalPayment(), amount);
    }
}
