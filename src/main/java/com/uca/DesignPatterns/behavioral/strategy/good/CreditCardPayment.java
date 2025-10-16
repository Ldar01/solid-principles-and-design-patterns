package com.uca.DesignPatterns.behavioral.strategy.good;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Procesando pago con tarjeta de crédito: " + amount);
    }
}
