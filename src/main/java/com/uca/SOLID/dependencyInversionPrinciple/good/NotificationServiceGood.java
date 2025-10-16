package com.uca.SOLID.dependencyInversionPrinciple.good;

/**
 * Servicio de notificaciones que depende de la abstracción MessageSender
 * en lugar de una implementación concreta. Esto cumple con el Principio de
 * Inversión de Dependencias, ya que NotificationServiceGood no depende
 * directamente de clases concretas como EmailSender o SmsSender.
 */
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
