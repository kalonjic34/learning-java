
# Java Basics Learning


This repository demonstrates key Java concepts through various examples. Below are the details of each topic covered:

## Strings

- **Basic String Declaration**: Learn how to declare and print strings in Java.
  
  ```java
  String name = "Chris";
  System.out.println(name);
  ```

  *Explanation*: This example shows how to create a string variable and print it to the console.

## Joining Strings

- **String Concatenation**: Understand how to join strings using the `+` operator.

  ```java
  String name = "Chris";
  System.out.println("My name is " + name);
  ```

  *Explanation*: Concatenate strings to form complete sentences and print the result.

## Control Characters

- **Using Control Characters**: Explore how to format text using special characters like tabs and newlines.

  ```java
  String text = "\tTo be or not to be.\n\tThat is the question";
  System.out.println(text);
  ```

  *Explanation*: This demonstrates formatting text output with tabs (`\t`) and new lines (`\n`).

## Menu Creation

- **Building a Simple Menu**: Learn to construct a text-based menu using string concatenation.

  ```java
  String menu = "\tSelect an option:\n";
  menu += "\t\t1. Add an entry\n";
  menu += "\t\t2. View the database\n";
  menu += "\t\t3. Exit\n";
  System.out.println(menu);
  ```

  *Explanation*: This example shows how to create a user-friendly menu interface in a Java console application.

## Format Specifiers

- **Formatted Output with `printf`**: Use format specifiers to control the display of variables.

  ```java
  double value = 1.253563;
  System.out.printf("Hello %.2f\n", value);
  System.out.printf("Hello %d\n", 123);
  ```

  *Explanation*: Learn to format decimal numbers and integers for more readable output.

- **Temperature Conversion Example**: Apply formatted output in a practical scenario.

  ```java
  double fahrenheit = 91;
  double celsius = (fahrenheit - 32) * 5.0 / 9.0;
  System.out.printf("%.1f degrees Fahrenheit is %.1f degrees celsius.\n", fahrenheit, celsius);
  ```

  *Explanation*: Convert Fahrenheit to Celsius and display the result using formatted strings.

## User Input

- **Reading User Input**: Discover how to capture user input via the `Scanner` class.

  ```java
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter value in Fahrenheit to convert > ");
  double fahrenheit = scan.nextFloat();
  scan.close();
  double celsius = (fahrenheit - 32) * 5.0 / 9.0;
  System.out.printf("%.1f degrees Fahrenheit is %.1f degrees celsius.\n", fahrenheit, celsius);
  ```

  *Explanation*: This example illustrates how to prompt the user for input, process it, and display the result.

These examples provide a foundation for understanding basic string operations, formatted output, and user interaction in Java applications.
