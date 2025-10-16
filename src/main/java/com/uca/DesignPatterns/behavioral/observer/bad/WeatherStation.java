package com.uca.DesignPatterns.behavioral.observer.bad;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int temperature;
    private List<Display> displays = new ArrayList<>();

    public void setTemperature(int temp) {
        this.temperature = temp;
        for (Display d : displays) {
            d.updateTemperature(temp); // Acoplamiento fuerte
        }
    }

    public void addDisplay(Display d) {
        displays.add(d);
    }
}
