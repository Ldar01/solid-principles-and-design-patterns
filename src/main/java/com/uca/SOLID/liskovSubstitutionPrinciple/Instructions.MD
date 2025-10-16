
# L - Liskov Substitution Principle (LSP)

Los objetos de las subclases deberían ser reemplazables por objetos de sus clases superiores a lo largo del código.

Este principio garantiza la operatividad del sistema.

Además, permite que puedas reemplazar instancias de claves derivadas SIN tocar las instancias de la clase base, lo que permite extender el software sin errores en su código base.




## Escenario

En nuestra aplicación se crearan objetos de tipo ave para asimilarlo lo mas que se puede al mundo real y tener una version digital

En los proximos codigos encontraran un escenario bueno y otro malo, el cual reflejaran el uso de este principio.

### Malo
Clase base que representa un pájaro.

Este diseño viola el Principio de Sustitución de Liskov porque no todos los pájaros pueden volar (por ejemplo, los pingüinos).

#### Bird.class
```java
public class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}
```

#### Penguin.class
```java
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
```

### Bueno
Clase que representa un pájaro que puede volar.

Este diseño cumple con el Principio de Sustitución de Liskov porque las aves que pueden volar tienen el metodo fly() de igual manera se separa con los otro tipo de aves que son los que no vuelan utilizando el metodo de walk().

#### FlyingBird.java
```java
public class FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }
}
```
#### NonFlyingBird.java
```java
public class NonFlyingBird {
    public void walk() {
        System.out.println("Walking");
    }
}
```