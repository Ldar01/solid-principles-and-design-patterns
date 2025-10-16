package com.uca.SOLID.interfaceSegregationPrinciple.good;

/**
 * Clase que implementa la interfaz Printer.
 * Esta clase solo implementa el metodo de impresión,
 * cumpliendo con el Principio de Segregación de Interfaces.
 */
public class SimplePrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
