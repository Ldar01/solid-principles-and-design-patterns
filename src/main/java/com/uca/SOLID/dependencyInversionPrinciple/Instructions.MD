
# D - Dependency Inversion Principle

Es mejor depender de interfaces o clases abstractas que depender de clases concretas.

Las clases concretas son más volátiles. Y mientras menos dependes de cosas volátiles menores serán tus probabilidades de disparar recompilaciones masivas.

Esto se traduce a que los módulos de alto nivel no deben depender de módulos de bajo nivel.




## Escenario

En este escenario nuestra aplicacion tiene un servicio de notificaciones.

En los proximos codigos encontraran un escenario bueno y otro malo, el cual reflejaran el uso de este principio.

### Malo
Clase que envía correos electrónicos. Esta clase depende directamente de la implementación concreta de EmailSender, lo que viola el Principio de Inversión de Dependencias.
#### EmailSender.class
```java
public class EmailSender {
    public void sendEmail(String message) {
        // Lógica para enviar un correo electrónico
        System.out.println("Sending email with message: " + message);
    }
}
```
Servicio de notificaciones que depende directamente de la implementación concreta de EmailSender. Esto viola el Principio de Inversión de Dependencias, ya que NotificationService debería depender de una abstracción en lugar de una implementación concreta.

#### NotificationService.class
```java
public class NotificationService {
    private EmailSender emailSender = new EmailSender();

    public void notifyUser(String message) {
        emailSender.sendEmail(message);
    }
}
```

### Bueno
Interfaz que define la funcionalidad de envío de mensajes. Esta interfaz permite a las clases que la implementan definir su propio metodo de envío, cumpliendo con el Principio de Inversión de Dependencias.

#### MessageSender.java
```java
public interface MessageSender {
    void send(String message, String recipient);
}
```
Clase que implementa el envío de mensajes por correo electrónico. Esta clase depende de la abstracción MessageSender cumpliendo con el Principio de Inversión de Dependencias.

De igual manera el envio de SMS.

#### EmailSender.java
```java
public class EmailSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending email to " + recipient + " with message: " + message);
    }
}
```
#### SmsSender.java
```java
public class SmsSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
```
Servicio de notificaciones que depende de la abstracción MessageSender en lugar de una implementación concreta. Esto cumple con el Principio de Inversión de Dependencias, ya que NotificationServiceGood no depende directamente de clases concretas como EmailSender o SmsSender.

#### NotificationServiceGood.java
```java
public class NotificationServiceGood {
    // Dependencia de la abstracción MessageSender
    private MessageSender messageSender;

    // Inyección de la dependencia a través del constructor
    public NotificationServiceGood(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    // Metodo para notificar al usuario utilizando el MessageSender inyectado
    public void notifyUser(String message, String recipient) {
        messageSender.send(message, recipient);
    }
}
```