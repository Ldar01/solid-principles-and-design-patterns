package com.uca.SOLID.interfaceSegregationPrinciple.good;

/**
 * Clase que implementa las interfaces Printer y Scanner.
 * Esta clase solo implementa los métodos que realmente necesita,
 * cumpliendo con el Principio de Segregación de Interfaces.
 */
public class OfficePrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document from Office Printer...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document from Office Printer...");
    }
}
