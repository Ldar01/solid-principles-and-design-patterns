package com.uca.SOLID.singleResponsabilityPrinciple;

import com.uca.SOLID.singleResponsabilityPrinciple.bad.Report;
import com.uca.SOLID.singleResponsabilityPrinciple.good.ReportGenerator;
import com.uca.SOLID.singleResponsabilityPrinciple.good.ReportSaver;

public class SingleResponsability {
    public static void main(String[] args) {
        badScene("Annual Report (Bad)", "This is the report content.");
        goodScene("Annual Report (Good)", "This is the report content.");

    }

    /** Ejemplo de mala práctica: La clase Report tiene múltiples responsabilidades
     * y es difícil de mantener.
     */
    public static void badScene(String title, String content) {
        System.out.println("=== Bad Scene: ===");
        Report report = new Report(title, content);
        report.generateReport();
        report.saveReport();
    }

    /** Ejemplo de buena práctica: Separación de responsabilidades en diferentes clases.
     * Cada clase tiene una única responsabilidad, lo que facilita el mantenimiento y la escalabilidad.
     */
    public static void goodScene(String title, String content) {
        System.out.println("=== Good Scene: ===");
        ReportGenerator reportGenerator = new ReportGenerator(title, content);
        reportGenerator.generateReport();

        ReportSaver reportSaver = new ReportSaver();
        reportSaver.saveAsPDF(reportGenerator.generateReport());
    }
}
