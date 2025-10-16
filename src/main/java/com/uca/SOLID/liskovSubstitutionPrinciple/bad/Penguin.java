package com.uca.SOLID.liskovSubstitutionPrinciple.bad;

/**
 * Clase que representa un pingüino.
 * Este diseño viola el Principio de Sustitución de Liskov
 * porque los pingüinos no pueden volar, pero heredan el metodo fly() de la clase Bird.
 */
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
