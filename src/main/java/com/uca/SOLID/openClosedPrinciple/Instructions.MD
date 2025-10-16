
# O - Open/Closed Principle (Principio de abierto/cerrado)

El código debería estar abierto a la extensión pero cerrado a la modificación

En otras palabras, en lugar de cambiar el código de una clase existente, se debe agregar una nueva funcionalidad para evitar posibles errores, asi como lo es la incompatibilidad.

Al no modificar el código, puedes preservar el código probado, evitar errores y facilitar tanto el mantenimiento como la evolución del software.

Y en el caso de que una de las extensiones no funcione, puedes eliminarla sin dañar el código original.

## Escenario

En nuestra aplicación existe el metodo de pago

En los proximos codigos encontraran un escenario bueno y otro malo, el cual reflejaran el uso de este principio.

### Malo
Clase que viola el principio de abierto/cerrado.

Cada vez que se agrega un nuevo tipo de pago, se debe modificar esta clase. Esto hace que la clase sea difícil de mantener y propensa a errores.

#### Report.class
```java
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
```
### Bueno
Interfaz para metodos de pago

#### PaymentMethod.java
```java
public interface PaymentMethod {
    void pay(double amount);
}
```
#### CreditCardPayment.java
```java
public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
```
#### PaypalPayment.java
```java
public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
```
Esta clase procesa pagos utilizando el principio de abierto/cerrado.
Puede trabajar con cualquier metodo de pago que implemente la interfaz PaymentMethod.

Si se necesita agregar un nuevo metodo de pago, solo se debe crear una nueva clase que implemente PaymentMethod, sin necesidad de modificar esta clase. Esto hace que la clase sea fácil de mantener y menos propensa a errores.
#### PaymentProcessorGood.java
```java
public class PaymentProcessorGood {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
```