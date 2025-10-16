package com.uca.SOLID.singleResponsabilityPrinciple.good;

/**
 * Clase encargada de guardar reportes en diferentes formatos
 * Esta clase cumple con el principio de responsabilidad única (SRP) ya que solo tiene una responsabilidad: guardar reportes.
 * Si en el futuro se necesita cambiar la forma en que se guardan los reportes, solo se verá afectada esta clase.
 * Esto hace que la clase sea fácil de mantener y menos propensa a errores.
 */
public class ReportSaver {
    // Guarda el reporte en formato PDF (simulado aquí con un print)
    public void saveAsPDF(String reportContent) {
        System.out.println("Saving report as PDF:\n" + reportContent);
    }

    // Guarda el reporte en formato TXT (simulado aquí con un print)
    public void saveAsTXT(String reportContent) {
        System.out.println("Saving report as TXT:\n" + reportContent);
    }
}
