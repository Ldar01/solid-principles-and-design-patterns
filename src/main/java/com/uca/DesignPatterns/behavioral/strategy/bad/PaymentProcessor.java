package com.uca.DesignPatterns.behavioral.strategy.bad;

/**
 * Clase que maneja el procesamiento de pagos.
 * Este enfoque no es ideal, ya que no usa estrategia clara y es difícil de extender.
 * Si se agregan más métodos de pago, esta clase crecerá en complejidad.
 */
public class PaymentProcessor {
    public void processPayment(String method, double amount) {
        if (method.equals("CREDIT_CARD")) {
            System.out.println("Procesando pago con tarjeta de crédito: " + amount);
        } else if (method.equals("PAYPAL")) {
            System.out.println("Procesando pago con PayPal: " + amount);
        } else {
            System.out.println("Método de pago no soportado.");
        }
    }
}
