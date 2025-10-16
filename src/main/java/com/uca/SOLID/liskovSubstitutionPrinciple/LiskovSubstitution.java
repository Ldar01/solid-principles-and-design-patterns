package com.uca.SOLID.liskovSubstitutionPrinciple;

import com.uca.SOLID.liskovSubstitutionPrinciple.bad.Penguin;
import com.uca.SOLID.liskovSubstitutionPrinciple.good.FlyingBird;
import com.uca.SOLID.liskovSubstitutionPrinciple.good.NonFlyingBird;

public class LiskovSubstitution {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene: ===");
        Penguin penguin = new Penguin();
        penguin.fly(); // Esto lanzará una excepción en tiempo de ejecución
    }

    public static void goodScene(){
        System.out.println("=== Good Scene: ===");
        FlyingBird parrot = new FlyingBird();
        parrot.fly(); // Esto funcionará correctamente

        NonFlyingBird penguin = new NonFlyingBird();
        penguin.walk(); // Esto funcionará correctamente
    }
}
