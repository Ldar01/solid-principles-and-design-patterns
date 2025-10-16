package com.uca.SOLID.openClosedPrinciple.good;

/**
 * Implementación de PaymentMethod para PayPal.
 * Permite pagar usando PayPal. Cumple con el principio de abierto/cerrado.
 */
public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
