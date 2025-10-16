package com.uca.SOLID.interfaceSegregationPrinciple.good;

/**
 * Interfaz que define la funcionalidad de impresión.
 * Esta interfaz es específica y permite a las clases que la implementan
 * definir solo el metodo que realmente necesitan, cumpliendo con el
 * Principio de Segregación de Interfaces.
 */
public interface Printer {
    void print();
}
