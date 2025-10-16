package com.uca.SOLID.interfaceSegregationPrinciple.bad;

/**
 * Interfaz que define múltiples funcionalidades para un dispositivo multifuncional.
 * Esta interfaz es demasiado amplia y obliga a las clases que la implementan
 * a definir métodos que no siempre necesitan, violando el Principio de Segregación de Interfaces.
 */
public interface MultifunctionDevice {
    void print();
    void scan();
    void fax();
}
