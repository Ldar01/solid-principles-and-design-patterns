package com.uca.SOLID.openClosedPrinciple.bad;

/**
 * Clase que viola el principio de abierto/cerrado.
 * Cada vez que se agrega un nuevo tipo de pago, se debe modificar esta clase.
 * Esto hace que la clase sea difícil de mantener y propensa a errores.
 */
public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CREDIT_CARD")) {
            // Lógica para procesar pago con tarjeta de crédito
            System.out.println("Paid " + amount + " using Credit Card.");
        } else if (paymentType.equals("PAYPAL")) {
            // Lógica para procesar pago con PayPal
            System.out.println("Paid " + amount + " using Paypal.");
        } else {
            throw new IllegalArgumentException("Payment method not supported: " + paymentType);
        }
    }
}
