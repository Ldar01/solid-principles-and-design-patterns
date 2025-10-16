package com.uca.DesignPatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        // Ejemplo de uso malo del patrón Iterator
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Luis");
        names.add("Marta");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // Acceso manual
        }

        // Ejemplo de uso bueno del patrón Iterator
        System.out.println("=== Good Example ===");
        List<String> names_iterator = new ArrayList<>();
        names_iterator.add("Ana");
        names_iterator.add("Luis");
        names_iterator.add("Marta");

        // Usando el iterador proporcionado por la colección
        java.util.Iterator<String> iterator = names_iterator.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Sin exponer estructura interna
        }
    }
}
