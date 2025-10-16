package com.uca.DesignPatterns.behavioral.strategy.good;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Procesando pago con PayPal: " + amount);
    }
}
