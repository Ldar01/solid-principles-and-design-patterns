
# I - Interface Segregation Principle

Una interfaz específica de cliente para cada tipo particular de clientes.

En otras palabras, es mejor contar con muchas interfaces para clientes específicos que una sola interfaz general para muchos tipos de clientes.

Se recomienda evitar las interfaces generales.

Ojo: Puede ser que se vea que una interfaz específica para cada cliente requiere de más trabajo. Pero, a largo plazo, será muchísimo más fácil de manejar, corregir y extender.




## Escenario

En este escenario nuestra aplicacion desarrollara la implementacion de uso de diferentes maquinas.

En los proximos codigos encontraran un escenario bueno y otro malo, el cual reflejaran el uso de este principio.

### Malo

Interfaz que define múltiples funcionalidades para un dispositivo multifuncional.

Esta interfaz es demasiado amplia y obliga a las clases que la implementan a definir métodos que no siempre necesitan, violando el Principio de Segregación de Interfaces.
#### MultifunctionDevice.class
```java
public interface MultifunctionDevice {
    void print();
    void scan();
    void fax();
}

```

Clase que implementa una impresora básica.

Esta clase se ve obligada a implementar métodos que no utiliza, lo que viola el Principio de Segregación de Interfaces.

#### BasicPrinter.class
```java
public class BasicPrinter implements MultifunctionDevice{
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan operation not supported.");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax operation not supported.");
    }
}
```

### Bueno
Interfaz que define la funcionalidad de impresión. Esta interfaz es específica y permite a las clases que la implementan definir solo el metodo que realmente necesitan, cumpliendo con el Principio de Segregación de Interfaces.

De igual manera el del scanner se enfoca solamente en el metodo que necesita

#### Printer.java
```java
public interface Printer {
    void print();
}
```
#### Scanner.java
```java
public interface Scanner {
    void scan();
}
```
Clase que implementa la interfaz Printer. Esta clase solo implementa el metodo de impresión, cumpliendo con el Principio de Segregación de Interfaces.

#### SimplePrinter.java
```java
public class SimplePrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
```
Clase que implementa las interfaces Printer y Scanner. Esta clase solo implementa los métodos que realmente necesita, cumpliendo con el Principio de Segregación de Interfaces.

#### OfficePrinter.java
```java
public class OfficePrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document from Office Printer...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document from Office Printer...");
    }
}
```