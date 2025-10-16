package com.uca.DesignPatterns.creationals.builder.good;

/**
 * Clase que representa una hamburguesa.
 * Utiliza el patrón Builder para facilitar la creación de objetos complejos.
 */
public class Burger {
    private String bread;
    private String meat;
    private String sauce;

    private Burger(BurgerBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.sauce = builder.sauce;
    }

    public static class BurgerBuilder {
        private String bread;
        private String meat;
        private String sauce;

        public BurgerBuilder bread(String b) { this.bread = b; return this; }
        public BurgerBuilder meat(String m) { this.meat = m; return this; }
        public BurgerBuilder sauce(String s) { this.sauce = s; return this; }

        public Burger build() { return new Burger(this); }
    }
}
