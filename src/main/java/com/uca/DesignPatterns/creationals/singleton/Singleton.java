package com.uca.DesignPatterns.creationals.singleton;

import com.uca.DesignPatterns.creationals.singleton.bad.Logger;
import com.uca.DesignPatterns.creationals.singleton.good.UniqueLogger;

public class Singleton {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene: ===");
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
    }

    public static void goodScene(){
        System.out.println("=== Good Scene: ===");
        UniqueLogger logger1 = UniqueLogger.getInstance();
        UniqueLogger logger2 = UniqueLogger.getInstance();
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
    }
}
