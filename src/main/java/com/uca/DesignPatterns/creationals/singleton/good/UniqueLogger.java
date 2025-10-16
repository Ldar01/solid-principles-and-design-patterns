package com.uca.DesignPatterns.creationals.singleton.good;

public class UniqueLogger {
    private static UniqueLogger uniqueLogger;
    private UniqueLogger() {}

    public static UniqueLogger getInstance() {
        if (uniqueLogger == null) {
            uniqueLogger = new UniqueLogger();
        }
        return uniqueLogger;
    }

}
