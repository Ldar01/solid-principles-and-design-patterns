package com.uca.SOLID.dependencyInversionPrinciple.bad;

/**
 * Clase que envía correos electrónicos.
 * Esta clase depende directamente de la implementación concreta de EmailSender,
 * lo que viola el Principio de Inversión de Dependencias.
 */
public class EmailSender {
    public void sendEmail(String message) {
        // Lógica para enviar un correo electrónico
        System.out.println("Sending email with message: " + message);
    }
}
