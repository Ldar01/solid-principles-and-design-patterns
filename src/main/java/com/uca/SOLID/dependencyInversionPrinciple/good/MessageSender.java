package com.uca.SOLID.dependencyInversionPrinciple.good;

/**
 * Interfaz que define la funcionalidad de envío de mensajes.
 * Esta interfaz permite a las clases que la implementan definir
 * su propio metodo de envío, cumpliendo con el Principio de
 * Inversión de Dependencias.
 */
public interface MessageSender {
    void send(String message, String recipient);
}
