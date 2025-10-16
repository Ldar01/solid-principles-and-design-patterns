package com.uca.DesignPatterns.creationals.builder.bad;

/**
 * Clase que representa una pizza.
 * Este diseño no utiliza el patrón Builder, lo que puede llevar a constructores con muchos parámetros
 * y a un código difícil de mantener.
 */
public class Pizza {
    private String size; // small, medium, large
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(String size, boolean cheese, boolean pepperoni, boolean bacon) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }
}
