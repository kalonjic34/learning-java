# Java Inheritance and Polymorphism

This repository contains exercises focused on Java inheritance, polymorphism, method overriding, and access modifiers.

## Key Concepts Learned

### Inheritance

- **Base and Derived Classes**: Created a hierarchy with `Animals`, `Cat`, `HouseCat`, `Tiger`, and `Lion`.
- **Code Reusability**: Shared common methods across derived classes.

### Method Overriding

- **Purpose**: Customize behavior in derived classes.
- **Annotation**: Used `@Override` to indicate overridden methods.

### Polymorphism

- **Subtype Polymorphism**: Enabled dynamic method calls using a base class reference (`Cat[] cats`).
- **Casting**: Demonstrated type casting and potential runtime errors.

### Access Modifiers

- **Protected**: Allowed derived classes to access fields in the parent class (`Fruit`).

## Program Structure


### Inheritance Example

#### App Class

```java
package application;

public class App {
    /*
     * Inheritance 
     */
    public static void main(String[] args) {
        Animals animal1 = new Animals();
        animal1.eat();

        Bird bird1 = new Bird();
        bird1.eat();
        bird1.latEgg();
    }
}
```

- **Purpose**: Demonstrates basic inheritance.
- **Animals Class**: Base class with a method `eat()`.
- **Bird Class**: Inherits from `Animals` and adds `latEgg()` method.

#### Animals Class

```java
package application;

public class Animals {
    public void eat() {
        System.out.println("Eating ...");
    }
}
```

- **Method**: `eat()` prints a message indicating eating behavior.

#### Bird Class

```java
package application;

public class Bird extends Animals {
    public void latEgg() {
        System.out.println("Laying an egg ...");
    }
}
```

- **Inheritance**: Inherits `eat()` from `Animals`.
- **Specific Method**: `latEgg()` for bird-specific behavior.

### Overriding Methods

#### App Class

```java
package application;

public class App {
    /*
     * Overriding Methods
     */
    public static void main(String[] args) {
        HouseCat cat1 = new HouseCat();
        cat1.vocalize();
        cat1.hunt();

        Tiger cat2 = new Tiger();
        cat2.vocalize();
        cat2.hunt();
    }
}
```

- **Objective**: Demonstrates method overriding.
- **HouseCat and Tiger**: Derived from `Cat`, with `HouseCat` overriding `vocalize()`.

#### Cat Class

```java
package application;

public class Cat {
    public void vocalize() {
        System.out.println("Roar!!");
    }

    public void hunt() {
        System.out.println("Hunting!!");
    }
}
```

- **Default Behavior**: `vocalize()` and `hunt()` methods.

#### HouseCat Class

```java
package application;

public class HouseCat extends Cat {
    @Override
    public void vocalize() {
        System.out.println("Meow!!");
    }
}
```

- **Override**: Changes `vocalize()` to "Meow!!".

#### Tiger Class

```java
package application;

public class Tiger extends Cat {
    // Inherits default behavior from Cat
}
```

- **No Override**: Uses default methods from `Cat`.

### Subtype Polymorphism

#### App Class

```java
package application;

public class App {
    /*
     * Subtype Polymorphism
     */
    public static void main(String[] args) {
        Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};

        for(Cat cat : cats) {
            cat.vocalize();
            cat.hunt();
        }
    }
}
```

- **Polymorphism**: Uses a `Cat` array to call overridden methods dynamically.

### Casting and Runtime Errors

#### App Class

```java
package application;

public class App {
    /*
     * Casting and Runtime Errors
     */
    public static void main(String[] args) {
        Cat cat1 = new HouseCat();
        cat1.hunt();
        cat1.vocalize();
        
        // Correct casting to access HouseCat-specific method
        ((HouseCat)cat1).purr();

        HouseCat cat2 = new HouseCat();
        cat2.hunt();
        cat2.vocalize();
        cat2.purr();
    }
}
```

- **Casting**: Demonstrates downcasting to call `purr()` in `HouseCat`.

#### HouseCat Class

```java
package application;

public class HouseCat extends Cat {
    @Override
    public void vocalize() {
        System.out.println("Meow!!");
    }

    public void purr() {
        System.out.println("Purr!!");
    }
}
```

- **New Method**: Adds `purr()` to `HouseCat`.

### Protected Access

#### App Class

```java
package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {
    /*
     * Protected
     */
    public static void main(String[] args) {
        Fruit fruit1 = new Apple();
        System.out.println(fruit1);

        Fruit fruit2 = new Banana();
        System.out.println(fruit2);
    }
}
```

- **Protected Access**: Demonstrates protection level in inheritance.

#### Fruit Class

```java
package entities;

public class Fruit {
    protected int id;

    @Override
    public String toString() {
        return "Fruit {" + " id='" + id + "'" + "}";
    }
}
```

- **Protected Field**: Allows derived classes to access `id`.

#### Apple Class

```java
package entities;

public class Apple extends Fruit {
    public Apple() {
        id = 0;
    }
}
```

- **Initialization**: Sets `id` to `0`.

#### Banana Class

```java
package entities;

public class Banana extends Fruit {
    public Banana() {
        id = 1;
    }
}
```

- **Initialization**: Sets `id` to `1`.
