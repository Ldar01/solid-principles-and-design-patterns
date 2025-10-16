
# S - Single Responsibility Principle

El principio de la responsabilidad unica, se refiere a que toda clase debería tener una sola responsabilidad: esta debería tener un solo propósito en el sistema, y solo debería haber una razón para cambiarla.

Al empezar a trabajar en una empresa o proyecto que ya esta en desarrollo solemos heredar el codigo realizado por el equipo de desarrollo de dicho lugar y nosotros en algun momento podemos ir modificando ese codigo y alterar algunas clases que pueden afectar a otras y asi sucesivamente lo cual podria a llevar a diferentes errores o complicar el codigo de manera que ya no sea compatible.

La responsabilidad unica previene estos problemas de fusion y compatibilidad




## Escenario

Necesitamos generar reportes en nuestra aplicacion.

En los proximos codigos encontraran un escenario bueno y otro malo, el cual reflejaran el uso de este principio.

### Malo
Clase que viola el principio de responsabilidad única (SRP) esta clase tiene múltiples responsabilidades: generar un reporte, formatear el reporte y enviarlo por correo electrónico. Si alguna de estas responsabilidades cambia, se verá afectada toda la clase esto hace que la clase sea difícil de mantener y propensa a errores.

#### Report.class
```java
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
```
### Bueno
Esta clase cumple con el principio de responsabilidad única (SRP) ya que solo tiene una responsabilidad. Si en el futuro se necesita cambiar la forma en que se generan los reportes, solo se verá afectada esta clase.

Esto hace que la clase sea fácil de mantener y menos propensa a errores.

De igual manera la clase de ReportSaver.

#### ReportGenerator.class
```java
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
```
#### ReportSaver.class
```java
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
```