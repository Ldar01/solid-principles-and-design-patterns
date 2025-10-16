package com.uca.SOLID.dependencyInversionPrinciple.bad;

/**
 * Servicio de notificaciones que depende directamente de la implementación concreta de EmailSender.
 * Esto viola el Principio de Inversión de Dependencias, ya que NotificationService debería depender
 * de una abstracción en lugar de una implementación concreta.
 */
public class NotificationService {
    private EmailSender emailSender = new EmailSender();

    public void notifyUser(String message) {
        emailSender.sendEmail(message);
    }
}
