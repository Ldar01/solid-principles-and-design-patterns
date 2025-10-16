package com.uca.DesignPatterns.behavioral.observer;

import com.uca.DesignPatterns.behavioral.observer.bad.Display;
import com.uca.DesignPatterns.behavioral.observer.bad.WeatherStation;
import com.uca.DesignPatterns.behavioral.observer.good.DisplayGood;
import com.uca.DesignPatterns.behavioral.observer.good.WeatherStationGood;

public class Observer {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Example ===");
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addDisplay(new Display());
        weatherStation.setTemperature(25); // Notifica a todas las pantallas
    }

    public static void goodScene(){
        System.out.println("=== Good Example ===");
        // Aquí iría la implementación del patrón Observer correctamente aplicado
        WeatherStationGood weatherStationGood = new WeatherStationGood();
        weatherStationGood.addObserver(new DisplayGood());
        weatherStationGood.setTemperature(25); // Notifica a todos los observadores
    }
}
