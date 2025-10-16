package com.uca.DesignPatterns.behavioral.observer.good;

/**
 * Esta interfaz define el contrato para los observadores que desean recibir actualizaciones
 * de la estación meteorológica. Cualquier clase que implemente esta interfaz debe definir
 * el metodo update para manejar las actualizaciones de temperatura.
 */
public interface Observer {
    void update(int temp);
}
