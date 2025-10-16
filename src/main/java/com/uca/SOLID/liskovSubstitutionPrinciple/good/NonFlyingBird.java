package com.uca.SOLID.liskovSubstitutionPrinciple.good;

/**
 * Clase que representa un pájaro que no puede volar.
 * Este diseño cumple con el Principio de Sustitución de Liskov
 * porque los pájaros que no pueden volar no tienen el metodo fly().
 */
public class NonFlyingBird {
    public void walk() {
        System.out.println("Walking");
    }
}
