package com.uca.SOLID.singleResponsabilityPrinciple.bad;
/**
 * Clase que viola el principio de responsabilidad única (SRP)
 * Esta clase tiene múltiples responsabilidades: generar un reporte, formatear el reporte y enviarlo por correo electrónico.
 * Si alguna de estas responsabilidades cambia, se verá afectada toda la clase.
 * Esto hace que la clase sea difícil de mantener y propensa a errores.
 */

public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Genera el reporte
    public String generateReport() {
        return "Title: " + title + "\nContent: " + content;
    }

    // Formatea el reporte
    public String formatReport() {
        return "*****\n" + generateReport() + "\n*****";
    }

    // Guarda el reporte (simulado aquí con un print)
    public void saveReport() {
        System.out.println("Saving report:\n" + formatReport());
    }
}
