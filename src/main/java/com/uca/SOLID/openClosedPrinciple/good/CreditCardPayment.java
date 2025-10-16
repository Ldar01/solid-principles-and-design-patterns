package com.uca.SOLID.openClosedPrinciple.good;

/**
 * Implementación de PaymentMethod para pagos con tarjeta de crédito.
 * Esta clase cumple con el principio de abierto/cerrado al permitir
 * agregar nuevos métodos de pago sin modificar las existentes.
 */
public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
