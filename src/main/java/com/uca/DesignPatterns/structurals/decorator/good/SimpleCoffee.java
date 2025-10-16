package com.uca.DesignPatterns.structurals.decorator.good;

/**
 * Esta clase representa un café simple sin ningún aditivo.
 * Implementa la interfaz CoffeeImpl y proporciona la funcionalidad básica de hacer café.
 * El metodo make() devuelve una cadena que indica que se ha hecho un café simple.
 */
public class SimpleCoffee implements CoffeeImpl {
    @Override
    public String make() {
        return "Simple Coffee";
    }
}
