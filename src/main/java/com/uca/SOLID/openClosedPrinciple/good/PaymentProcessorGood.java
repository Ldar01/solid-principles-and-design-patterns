package com.uca.SOLID.openClosedPrinciple.good;

/**
 * Esta clase procesa pagos utilizando el principio de abierto/cerrado.
 * Puede trabajar con cualquier metodo de pago que implemente la interfaz PaymentMethod.
 * Si se necesita agregar un nuevo metodo de pago, solo se debe crear una nueva clase que implemente PaymentMethod,
 * sin necesidad de modificar esta clase. Esto hace que la clase sea fácil de mantener y menos propensa a errores.
 */
public class PaymentProcessorGood {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
