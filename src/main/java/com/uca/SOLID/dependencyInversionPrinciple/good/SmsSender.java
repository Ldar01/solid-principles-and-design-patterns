package com.uca.SOLID.dependencyInversionPrinciple.good;

/**
 * Implementación concreta de MessageSender que envía mensajes por SMS.
 * Esta clase depende de la abstracción MessageSender, cumpliendo con el Principio de
 * Inversión de Dependencias.
 */
public class SmsSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
