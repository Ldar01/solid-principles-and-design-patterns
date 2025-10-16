package com.uca.SOLID.singleResponsabilityPrinciple.good;

/**
 * Clase que se encarga de generar reportes.
 * Esta clase cumple con el principio de responsabilidad única (SRP) ya que solo tiene una responsabilidad.
 * Si en el futuro se necesita cambiar la forma en que se generan los reportes, solo se verá afectada esta clase.
 * Esto hace que la clase sea fácil de mantener y menos propensa a errores.
 */
public class ReportGenerator {
    private String title;
    private String content;

    public ReportGenerator(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Genera el reporte
    public String generateReport() {
        return "Title: " + title + "\nContent: " + content;
    }
}
