package com.uca.SOLID.liskovSubstitutionPrinciple.good;

/**
 * Clase que representa un pájaro que puede volar.
 * Este diseño cumple con el Principio de Sustitución de Liskov
 * porque los pájaros que pueden volar tienen el metodo fly().
 */
public class FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }
}
