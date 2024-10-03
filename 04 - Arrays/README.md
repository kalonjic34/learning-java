# Java Arrays Learning Summary

## Basic Arrays

- **Definition**: An array is a collection of elements of the same type.
- **Accessing Elements**: Array indices are zero-based.
  
  ```java
  int[] numbers = {2, 4, 6, 8};
  System.out.println(numbers[0]); // Output: 2
  ```

## Arrays of Strings

- **Initialization**: Arrays can store strings.
  
  ```java
  String[] foods = {"Potatoes", "Rice", "Pasta", "Bread"};
  ```

- **Modifying Elements**: Change elements by assigning a new value.

  ```java
  foods[1] = "Tomatoes";
  ```

## Iterating Over Arrays

- **For Loop**: Use a loop to iterate through array elements.

  ```java
  for(int i = 0; i < animals.length; i++) {
      System.out.println(animals[i]);
  }
  ```

## Primitive Arrays

- **Declaration and Initialization**: Define the size and assign values later.

  ```java
  int[] numbers = new int[3];
  numbers[0] = 5;
  ```

## User Input with Arrays

- **Scanner Class**: Collect input from users and store in an array.

  ```java
  Scanner scan = new Scanner(System.in);
  int[] numbers = new int[3];
  ```

## For-Each Loop

- **Simplified Iteration**: Use for-each for cleaner syntax when iterating.

  ```java
  for(String fruit : fruits) {
      System.out.println(fruit);
  }
  ```

## Streams and For-Each

- **Java Streams**: Use streams for functional-style operations.

  ```java
  Arrays.stream(animals).forEach(animal -> System.out.println(animal));
  ```

## Non-Primitive Arrays

- **String Arrays**: Handle arrays of objects like Strings.

  ```java
  String[] texts = new String[3];
  texts[0] = "Hi!";
  ```

## Multidimensional Arrays

- **Matrix-Like Structures**: Arrays can have multiple dimensions.

  ```java
  String[][] texts = {
      {"one", "two", "three"},
      {"four", "five", "six"}
  };
  ```

## Additional Exercises

- **Multiplication Tables**: Create and display multiplication tables using multidimensional arrays.

  ```java
  int[][] table = new int[12][12];
  ```

This journey through arrays in Java covers initialization, modification, iteration, user input, and multidimensional arrays, providing a solid foundation in array manipulation.