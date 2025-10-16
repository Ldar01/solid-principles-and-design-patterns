package com.uca.SOLID.interfaceSegregationPrinciple.bad;

/**
 * Clase que implementa una impresora básica.
 * Esta clase se ve obligada a implementar métodos que no utiliza,
 * lo que viola el Principio de Segregación de Interfaces.
 */
public class BasicPrinter implements MultifunctionDevice{
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan operation not supported.");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax operation not supported.");
    }
}
