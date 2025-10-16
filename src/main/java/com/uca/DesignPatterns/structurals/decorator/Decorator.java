package com.uca.DesignPatterns.structurals.decorator;

import com.uca.DesignPatterns.structurals.decorator.bad.Coffee;
import com.uca.DesignPatterns.structurals.decorator.good.CoffeeImpl;
import com.uca.DesignPatterns.structurals.decorator.good.MilkDecorator;
import com.uca.DesignPatterns.structurals.decorator.good.SimpleCoffee;
import com.uca.DesignPatterns.structurals.decorator.good.SugarDecorator;

public class Decorator {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene: ===");
        Coffee coffee = new Coffee();
        // Cambia el comportamiento del objeto original
        coffee.makeCoffee();
        coffee.addMilk();
    }

    public static void goodScene(){
        System.out.println("=== Good Scene: ===");
        // Crea un objeto Coffee básico
        CoffeeImpl coffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(coffee.make());
    }
}
