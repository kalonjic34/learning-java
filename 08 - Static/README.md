# Static and Final in Java

This repository contains Java exercises focused on understanding `static` and `final` keywords, along with other related concepts.

## Key Concepts Learned

### Static Keyword

- **Static Variables**: Shared across all instances of a class. Used to keep track of the number of `Cat` objects created.
- **Static Methods**: Access static variables and can be called without creating an instance.
- **Static Initialization Blocks**: Used for initializing static variables.

### Final Keyword

- **Final Variables**: Constants that cannot be changed once initialized. Used for defining constant values like `FOOD`.

### Object-Oriented Programming

- **Classes and Objects**: Created a `Cat` class with attributes and methods.
- **Encapsulation**: Used private fields to protect data integrity.

### String Formatting

- **String.format()**: Used for creating formatted strings.

### Program Structure

### Code Explanation

#### App Class

```
package application;

public class App {
    /*
     * Static and Final
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat("Horace");
        Cat cat2 = new Cat("Jamie");

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(Cat.FOOD);
    }
}
```

- **Main Method**: 
  - Demonstrates creating `Cat` objects and using static variables/methods.
  - Prints the count of cats and their details.

#### Cat Class

```
package application;

public class Cat {
    private String name;
    public static final String FOOD = "Cat food";
    private static int count = 0;
    private int id;

    static double averageHeight;

    static {
        averageHeight = 215 / 7.0;
        System.out.println("Static block executed.");
    }

    public Cat(String name) {
        this.name = name;
        id = count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("Cat id %d, name: %s", id, name);
    }
}
```

- **Attributes**:
  - `name`: The name of the cat.
  - `FOOD`: A constant representing the food type.
  - `count`: A static variable to count the number of `Cat` instances.
  - `id`: Unique identifier for each cat instance.
  - `averageHeight`: A static variable with a static initialization block.

- **Constructor**:
  - Initializes the `name` and assigns an `id` based on the current `count`.

- **Methods**:
  - `getCount()`: Returns the number of `Cat` instances.
  - `toString()`: Provides a formatted string representation of a `Cat` object.

This project demonstrates the use of `static` and `final` keywords to manage shared data and constants in Java applications.