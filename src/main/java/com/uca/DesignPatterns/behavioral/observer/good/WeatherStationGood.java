package com.uca.DesignPatterns.behavioral.observer.good;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una estación meteorológica que notifica a sus observadores
 * cuando la temperatura cambia. Utiliza el patrón Observer para permitir que múltiples
 * displays se registren y reciban actualizaciones de temperatura sin acoplarse
 * directamente a ellos.
 */
public class WeatherStationGood {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) { observers.add(o); }

    public void setTemperature(int temp) {
        this.temperature = temp;
        for (Observer o : observers) o.update(temp);
    }
}
