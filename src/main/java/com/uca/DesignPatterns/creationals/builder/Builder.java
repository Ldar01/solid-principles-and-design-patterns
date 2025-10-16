package com.uca.DesignPatterns.creationals.builder;

import com.uca.DesignPatterns.creationals.builder.bad.Pizza;
import com.uca.DesignPatterns.creationals.builder.good.Burger;

public class Builder {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene: ===");
        // Creación de una pizza con muchos parámetros en el constructor
        Pizza pizza = new Pizza("large", true, true, false);
    }

    public static void goodScene(){
        System.out.println("=== Good Scene: ===");
        Burger burger = new Burger.BurgerBuilder()
                .bread("Whole Wheat")
                .meat("Beef")
                .sauce("BBQ")
                .build();
    }
}
