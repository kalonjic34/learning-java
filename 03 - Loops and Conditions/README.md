# Java Learning Summary

This repository contains a series of Java programs that explore fundamental concepts such as loops (while, do-while, for), conditionals (if, if-else, switch), booleans, user input handling with the Scanner class, password validation through loops, and case-insensitive command parsing. 

## Loops

### While Loops

- **Infinite Loop**: Demonstrates a loop that runs indefinitely, useful for cases where the condition is managed internally or based on external input.

  ```java
  while (true) {
      System.out.println("Hello");
  }
  ```

- **Controlled Loop**: Executes as long as a specified condition is true, allowing for repeated execution until a condition changes.

  ```java
  int counter = 0;
  while (counter < 10) {
      System.out.printf("Counter: %d\n", counter);
      counter += 1;
  }
  ```

### Do-While Loops

- **Execute at Least Once**: This loop guarantees execution at least once before evaluating the condition, making it ideal for scenarios where initial execution is required.

  ```java
  int count = 0;
  do {
      System.out.println("Count: " + count);
      count++;
  } while (count < 3);
  ```

### For Loops

- **Standard For Loop**: Iterates a specific number of times, providing a concise way to manage counters and conditions in one line.

  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println("i: " + i);
  }
  ```

## Conditionals

### If Statements

- **Basic If Statement**: Executes a block of code based on a condition being true, enabling decision-making in programs.

  ```java
  if (apples > bananas) {
      System.out.println("More apples than bananas");
  }
  ```

- **If-Else Statement**: Offers alternative actions depending on the condition, allowing for branching logic.

  ```java
  if (tempCelsius < 21.0) {
      System.out.println("Too cold!");
  } else {
      System.out.println("Warm enough");
  }
  ```

- **If-Else If Ladder**: Manages multiple conditions, providing a way to handle different scenarios effectively.

  ```java
  if (input == 1) {
      System.out.println("Hello");
  } else if (input == 2) {
      System.out.println("How are you?");
  } else {
      System.out.println("Invalid option.");
  }
  ```

### Switch Statements

- **Basic Switch**: Chooses code to execute based on a variable's value, simplifying the handling of multiple discrete options.

  ```java
  switch (option) {
      case 0:
          System.out.println("Option 0 selected");
          break;
      case 10:
          System.out.println("Exiting program...");
          System.exit(0);
          break;
      default:
          System.out.println("Invalid option");
  }
  ```

## Booleans

- **Boolean Variables**: Represent truth values, critical for controlling flow and conditions in programs.

  ```java
  boolean condition = true;
  System.out.println("Condition 1: " + condition);
  ```

## User Input

- **Using Scanner**: Captures input from the user, allowing for interactive applications that respond to user data.

  ```java
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter room temperature > ");
  double tempFahrenheit = scan.nextFloat();
  ```

## Password Validation

- **Password Loop**: Employs a loop to repeatedly prompt for a password until the correct one is entered, demonstrating a basic security mechanism.

  ```java
  final String USER_PASSWORD = "pass4chris";
  while (true) {
      if (USER_PASSWORD.equals(inputPassword)) {
          System.out.println("Correct password");
          break;
      }
  }
  ```

## Case Insensitivity

- **Command Parsing**: Handles user commands without case sensitivity, improving user experience by allowing flexible input formats.

  ```java
  if (START.equalsIgnoreCase(enterCommand)) {
      System.out.println("Starting ...");
  }
  ```

