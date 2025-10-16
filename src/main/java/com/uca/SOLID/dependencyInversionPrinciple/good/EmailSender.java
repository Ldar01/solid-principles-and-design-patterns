package com.uca.SOLID.dependencyInversionPrinciple.good;

/**
 * Clase que implementa el envío de mensajes por correo electrónico.
 * Esta clase depende de la abstracción MessageSender,
 * cumpliendo con el Principio de Inversión de Dependencias.
 */
public class EmailSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending email to " + recipient + " with message: " + message);
    }
}
