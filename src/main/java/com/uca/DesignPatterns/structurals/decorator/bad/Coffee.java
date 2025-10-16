package com.uca.DesignPatterns.structurals.decorator.bad;

public class Coffee {
    public void makeCoffee() {
        System.out.println("Basic coffee");
    }

    public void addMilk() {
        System.out.println("Coffee with milk");
    }

    public void addSugar() {
        System.out.println("Coffee with sugar");
    }
}
