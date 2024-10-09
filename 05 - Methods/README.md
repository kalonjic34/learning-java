
# Java Object-Oriented Programming Summary

This repository contains Java programs that explore object-oriented programming concepts. Each program serves as a learning exercise to understand these principles.

## Classes and Objects

- **Basic Classes**: Learn to create classes and instantiate objects.

  ```java
  class Person {
      String name;
  }

  Person person1 = new Person();
  person1.name = "Chris";
  ```

## Instance Variables and Methods

- **Instance Variables**: Define and access instance variables.

  ```java
  person1.name = "Chris";
  ```

- **Methods**: Create methods to perform actions.

  ```java
  void sayHello() {
      System.out.println("Hello");
  }

  person1.sayHello();
  ```

## Encapsulation and Access Modifiers

- **Getters and Setters**: Use getters and setters to encapsulate data and control access.

  ```java
  public void setName(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }
  ```

- **Access Modifiers**: Understand `public` and `private` to control visibility.

  ```java
  private int age;

  public int getAge() {
      return age;
  }
  ```

## Constructors

- **Basic Constructors**: Implement constructors to initialize objects.

  ```java
  public Person(String name, double height) {
      this.name = name;
      this.height = height;
  }

  Person person2 = new Person("Sam", 160.5);
  ```

## Overloading and `toString`

- **Overloading Constructors**: Create multiple constructors for flexibility.

  ```java
  public Person() {
      this.name = "?";
      this.height = 0.0;
  }
  ```

- **`toString` Method**: Override `toString` for meaningful object representation.

  ```java
  public String toString() {
      return "Name: " + name + ", height: " + height;
  }

  System.out.println(person1.toString());
  ```

## Practical Applications

- **Menu Systems**: Build simple menu systems to practice string manipulation and method returns.

  ```java
  String getMenu() {
      String menuText = "Choose an option:\n";
      for (int i = 0; i < options.length; i++) {
          menuText += " " + i + ". " + options[i] + "\n";
      }
      return menuText;
  }

  System.out.println(menu1.getMenu());
  ```

- **Calculator**: Create a calculator class to practice method parameters and return values.

  ```java
  int add(int a, int b) {
      return a + b;
  }

  int result = calc.add(7, 5);
  System.out.println("7 + 5 is: " + result);
  ```

- **Method Parameters**: Understand passing parameters to methods.

  ```java
  int square(int value) {
      return value * value;
  }

  int squaredValue = calc.square(8);
  System.out.println("Square of 8 is: " + squaredValue);
  ```

This overview captures the application of object-oriented principles to create well-structured and functional Java applications.
