package com.uca.DesignPatterns.structurals.decorator.good;

/**
 * Esta clase es un decorador concreto que añade leche al café.
 * Implementa la interfaz CoffeeImpl y contiene una referencia a un objeto CoffeeImpl.
 * Llama al metodo make() del objeto CoffeeImpl referenciado
 * y añade la funcionalidad de leche.
 */
public class MilkDecorator implements CoffeeImpl {
    private final CoffeeImpl coffeeImpl;

    public MilkDecorator(CoffeeImpl coffeeImpl) {
        this.coffeeImpl = coffeeImpl;
    }

    @Override
    public String make() {
        return coffeeImpl.make() + " + Milk";
    }

}
