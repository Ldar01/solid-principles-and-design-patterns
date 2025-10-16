package com.uca.SOLID.liskovSubstitutionPrinciple.bad;

/**
 * Clase base que representa un pájaro.
 * Este diseño viola el Principio de Sustitución de Liskov
 * porque no todos los pájaros pueden volar (por ejemplo, los pingüinos).
 */
public class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}
