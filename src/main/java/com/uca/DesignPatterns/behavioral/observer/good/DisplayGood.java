package com.uca.DesignPatterns.behavioral.observer.good;

/**
 * Esta clase implementa el patrón Observer de manera correcta.
 * La clase DisplayGood implementa la interfaz Observer y define el método update
 * para recibir actualizaciones de temperatura. Esto permite una mayor flexibilidad
 * y desacoplamiento entre la estación meteorológica y los displays.
 */
public class DisplayGood implements Observer {
    @Override
    public void update(int temp) {
        System.out.println("Temperatura: " + temp);
    }
}
